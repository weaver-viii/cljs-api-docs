(ns cljs-api-gen.parse
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.core.match :refer [match]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [lower-case split split-lines join replace]]
    [me.raynes.fs :refer [base-name exists?]]
    [cljs-api-gen.read :refer [read-ns-forms
                               read-clj-core-forms
                               read-treader-forms]]
    [cljs-api-gen.config :refer [repos-dir]]
    [cljs-api-gen.docstring :refer [try-locate-docs
                                    fix-docstring
                                    try-remove-docs]]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag*
                                    *cljs-num*
                                    *clj-tag*
                                    *clj-version*
                                    *treader-version*
                                    *treader-tag*]]
    [cljs-api-gen.syntax :refer [syntax
                                 char-map
                                 dchar-map
                                 syntax-map
                                 clj-syntax]]
    ))

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::ana/numeric`
;; which is used by cljs.core. (the ana namespace has to exist)
(create-ns 'ana)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::env/compiler`
;; which is used by cljs.repl. (the env namespace has to exist)
(create-ns 'env)

;; current namespace and repo that we are parsing.
(def ^:dynamic *cur-ns*)
(def ^:dynamic *cur-repo*)

;; current API that we are parsing for (e.g. "library", "compiler")
(def ^:dynamic *cur-api*)

(defn cur-repo-tag
  []
  (case *cur-repo*
    "clojure" *clj-tag*
    "clojurescript" *cljs-tag*
    "tools.reader" *treader-tag*
    nil))

(def namespaces
  "api -> namespaces, and namespace -> parse type"

  {:syntax
   {"syntax"                :custom} ;; <-- pseudo-namespace for syntax forms

   :library
   {"cljs.pprint"           :normal
    "cljs.reader"           :normal
    "clojure.set"           :normal
    "clojure.string"        :normal
    "clojure.walk"          :normal
    "clojure.zip"           :normal
    "clojure.data"          :normal
    "clojure.browser.dom"   :normal
    "clojure.browser.event" :normal
    "clojure.browser.net"   :normal
    "clojure.browser.repl"  :normal
    "clojure.core.reducers" :normal
    "clojure.reflect"       :normal
    "cljs.nodejs"           :normal

    "cljs.core"             :custom
    "cljs.test"             :custom
    "cljs.repl"             :custom
    "special"               :custom ;; <-- pseudo-namespace for special forms
    "specialrepl"           :custom ;; <-- pseudo-namespace for REPL special forms
    }

   :compiler
   {"cljs.analyzer.api"     :normal
    "cljs.build.api"        :normal
    "cljs.compiler.api"     :normal
    "cljs.repl"             :normal
    "cljs.repl.browser"     :normal
    "cljs.repl.node"        :normal
    "cljs.repl.reflect"     :normal
    "cljs.repl.rhino"       :normal
    "cljs.repl.server"      :normal

    "cljs.repl.nashorn"     :custom
    }})

;;--------------------------------------------------------------------------------
;; Functions marked as macros
;;--------------------------------------------------------------------------------

(def ^:dynamic *fn-macros* #{})

(defn get-fn-macro
  "looks for a call of the form:
  (. (var %) (setMacro))"
  [form]
  (let [to-vec #(if (seq? %) (vec %) %)]
    (match (to-vec (map to-vec form))
      ['. ['var name-] ['setMacro]] name-
      :else nil)))

(defn get-fn-macros
  [forms]
  (set (keep get-fn-macro forms)))

;;--------------------------------------------------------------------------------
;; Parse defs
;;--------------------------------------------------------------------------------

(def ^:dynamic *parse-private-defs?*
  "Determines if private defs should be parsed."
  false)

(defn parse-defn-or-macro
  [form type-]
  (let [name- (second form)
        meta- (meta name-)
        args (drop 2 form)
        docstring (let [ds (first args)]
                    (when (string? ds)
                      ds))
        args (if docstring (rest args) args)
        attr-map (let [m (first args)]
                   (when (map? m) m))
        args (if attr-map (rest args) args)
        macro? (:macro attr-map)
        private? (or (#{'core/defn- 'defn-} (first form))
                     (:private meta-)
                     (:private attr-map))
        doc-forms (cond-> []
                    docstring (conj docstring)
                    attr-map (conj attr-map))
        signatures (if (vector? (first args))
                     (take 1 args)
                     (map first args))
        expected-docs (try-locate-docs
                        {:whole form
                         :head (take 2 form)
                         :doc doc-forms
                         :sig-body args})
        constructor? (some #{"@constructor"} (:jsdoc meta-))]
    (when (or *parse-private-defs?*
              (not private?))
      {:expected-docs expected-docs
       :docstring (fix-docstring docstring)
       :signature signatures
       :type (cond
               constructor? "type"
               macro? "macro"
               :else type-)})))

(defn parse-def-fn
  [form]
  (let [name- (second form)
        m (meta name-)
        private? (:private m)
        docstring (fix-docstring (:doc m))
        signatures (when-let [arglists (:arglists m)]
                     (when (= 'quote (first arglists))
                       (second arglists)))]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature signatures
       :type "function"})))

(defn parse-var
  [form]
  (let [name- (second form)
        m (meta name-)
        private? (:private m)
        docstring (fix-docstring (:doc m))
        dynamic? (:dynamic m)]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :type (if dynamic? "dynamic var" "var")})))

(defn parse-defcurried
  [form]
  (let [[_ name- docstring attr-map args] form
        private? (:private attr-map)
        cargs (vec (butlast args))
        signatures [cargs args]]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature signatures
       :type "function"})))

(defn parse-protocol-method
  [form]
  (let [name- (first form)
        form (drop 1 form)
        docstring (let [d (last form)]
                    (when (string? d) d))
        form (if docstring (butlast form) form)
        signatures (mapv str form)]
    {:name (str name-)
     :signature signatures
     :docstring docstring}))

(defn parse-defprotocol
  [form]
  (let [name- (second form)
        meta- (meta name-)
        private? (:private meta-)
        form (drop 2 form)
        docstring (let [d (first form)]
                    (when (string? d) d))
        form (if docstring (drop 1 form) form)
        method-lists form
        pmethods (mapv parse-protocol-method method-lists)]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature nil
       :methods pmethods
       :type "protocol"})))

(defn parse-deftype
  [form]
  (when (not= *cur-ns* "cljs.pprint") ;; ignore custom deftypes here
    (let [name- (second form)
          meta- (meta name-)
          private? (:private meta-)
          form (drop 2 form)
          signature (first form)]
      (when (or *parse-private-defs?*
                (not private?))
        {:signature (when signature [signature])
         :type "type"}))))

(defmulti parse-form*
  (fn [form]
    (case (first form)
      defn          "defn"
      defn-         "defn"
      core/defn     "defn"
      core/defn-    "defn"
      defmacro      "defmacro"
      core/defmacro "defmacro"
      defcurried    "defcurried"
      defprotocol   "defprotocol"
      deftype       "deftype"
      (def defonce) (if (and (list? (nth form 2 nil))
                               (= 'fn (first (nth form 2 nil)))
                               (not (:dynamic (meta (second form)))))
                        "def fn"
                        "var")
      nil)))

(defmethod parse-form* "var"         [form] (parse-var form))
(defmethod parse-form* "def fn"      [form] (parse-def-fn form))
(defmethod parse-form* "defn"        [form] (parse-defn-or-macro form "function"))
(defmethod parse-form* "defmacro"    [form] (parse-defn-or-macro form "macro"))
(defmethod parse-form* "defcurried"  [form] (parse-defcurried form))
(defmethod parse-form* "defprotocol" [form] (parse-defprotocol form))
(defmethod parse-form* "deftype"     [form] (parse-deftype form))
(defmethod parse-form* nil           [form] nil)

;;--------------------------------------------------------------------------------
;; Ignore internal defs
;;--------------------------------------------------------------------------------

(def unlabeled-internals
  "Internal symbols that are not labeled as such.
  Each symbol will be ignored in the given version range pairs [add remove add remove ...etc]"
  {"cljs.core/INIT"     [2301]
   "cljs.core/START"    [2301]
   "cljs.core/fixture1" [927]
   "cljs.core/fixture2" [927]})

(defn unlabeled-internal?
  [form]
  (when-let [version-ranges (unlabeled-internals (str (:ns form) "/" (:name form)))]
    (some
      (fn [[start end :as vrange]]
        (and
          (or (nil? start) (>= *cljs-num* start))
          (or (nil? end)   (<  *cljs-num* end))))
      (partition 2 2 [nil] version-ranges))))

(defn internal-def-only?
  [form]
  (let [[c0 c1] (split (:potential-comment form) #"\s+")
        comment-flag? (and (#{";;" ";"} c0)
                           c1
                           (= "internal" (lower-case c1)))
        [d0] (split (or (:docstring form) "") #"\s+")
        docstring-flag? (and d0 (= "internal" (lower-case d0)))]
    (or comment-flag?
        docstring-flag?
        (unlabeled-internal? form))))

;;--------------------------------------------------------------------------------
;; Parse common meta for defs
;;--------------------------------------------------------------------------------

(defn parse-location
  [form]
  (let [m (meta form)
        lines [(:line m) (:end-line m)]
        num-lines (inc (- (:end-line m) (:line m)))
        source-lines (split-lines (:source m))

        ;; the first line before the definition (potential comment)
        potential-comment (first (take-last (inc num-lines) source-lines))

        source (join "\n" (take-last num-lines source-lines))
        filename (subs (:file m) (inc (count (str repos-dir "/" *cur-repo*))))]
    {:ns *cur-ns*
     :source {:code source
              :repo *cur-repo*
              :tag (cur-repo-tag)
              :filename filename
              :lines lines}
     :potential-comment potential-comment}))

(defn parse-common-def
  [form]
  (let [name- (second form)
        name-meta (meta name-)
        return-type (:tag name-meta)
        manual-macro? (or (*fn-macros* name-)
                          (:macro name-meta))]
    (merge
      {:name (str name-)
       :return-type return-type}

      (when manual-macro?
        {:type "macro"}))))

(defn parse-form
  [form]
  (when-let [specific (parse-form* form)]
    (let [common (parse-common-def form)
          location (parse-location form)
          merged (merge specific location common)
          final (update-in merged [:source :code] try-remove-docs (:expected-docs specific))
          internal? (internal-def-only? final)]
      (when-not internal?
        (with-meta final {:form form})))))

;;--------------------------------------------------------------------------------
;; High-level namespace parsing functions
;;--------------------------------------------------------------------------------

(defn parse-forms
  "Parse given forms from a given namespace and repo."
  [ns- repo forms]
  (binding [*cur-ns* ns-
            *cur-repo* repo
            *fn-macros* (get-fn-macros forms)]
    (doall (keep parse-form forms))))

(defn parse-ns*
  "Parse namespace of the given source types, :compiler or :library or both."
  [ns- repo src-types]
  (->> (read-ns-forms ns- src-types)
       (mapcat #(parse-forms ns- repo %))))

(defn parse-clj-core
  "Parse clojure.core forms."
  ;; FIXME: this could be memoized to prevent parsing twice for
  ;;        imported macros and destructure function retrieval
  []
  (->> (read-clj-core-forms)
       (mapcat #(parse-forms "cljs.core" "clojure" %))))

(defn parse-treader-forms
  "Parse tools.reader forms."
  []
  (binding [*parse-private-defs?* true]
    (parse-forms "clojure.tools.reader" "tools.reader" (read-treader-forms))))

;;--------------------------------------------------------------------------------
;; Parse special forms
;;--------------------------------------------------------------------------------

(defn transform-special-doc
  [doc-map]
  (let [transform-form (fn [form sym]
                         (vec (if (= (first form) sym) ;; e.g. (do exprs*) => [exprs*]
                                (rest form)
                                form)))
        transform-forms (fn [forms sym]
                          (map #(transform-form % sym) forms))
        transform-val (fn [sym value]
                        (-> value
                            (rename-keys {:doc :docstring, :url :doc-url})
                            (update-in [:docstring] fix-docstring)
                            (update-in [:forms] transform-forms sym)
                            (rename-keys {:forms :signature})))
        values (map transform-val (keys doc-map) (vals doc-map))]
    (zipmap (keys doc-map) values)))

(defn parse-special-docs
  "Parse the special-doc-map."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def special-doc-map)))
    (let [[_quote doc-map] (nth form 2)]
      (transform-special-doc doc-map))))

(defn parse-special*
  "Parse cljs special forms of the form:
  (defmethod parse 'symbol ...)"
  [form]
  (when (and (list? form)
             (= (take 2 form) '(defmethod parse)))
    (let [quoted-name (nth form 2)
          name- (second quoted-name)]
      {:name (str name-)})))

(defn parse-special
  [form doc-map]
  (when-let [special (parse-special* form)]
    (let [location (parse-location form)
          extras {:type "special form"}
          docs (get doc-map (symbol (:name special)))
          final (merge special location extras docs)]
      final)))

;;--------------------------------------------------------------------------------
;; Parse REPL special forms
;;--------------------------------------------------------------------------------

(defn transform-repl-special-doc
  [doc-map]
  (let [transform-val (fn [value]
                        (-> value
                            (rename-keys {:doc :docstring, :arglists :signature})
                            (update-in [:docstring] fix-docstring)))
        values (map transform-val (vals doc-map))]
    (zipmap (keys doc-map) values)))

(defn parse-repl-special-docs
  "Parse the repl-special-doc-map."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def repl-special-doc-map)))
    (let [[_quote doc-map] (nth form 2)]
      (transform-repl-special-doc doc-map))))

(defn parse-repl-specials*
  "Parse cljs repl special forms of the form:
  (def default-special-fns (let [...] { #_keys_are_special_form_names }))"
  [form]
  (if (and (#{"r927" "r971"} *cljs-tag*)
           (list? form)
           (= (take 2 form) '(defn repl)))
    ;; old version, just manually setting when detected
    ['in-ns 'load-file 'load-namespace]

    ;; everything >= r993
    (when (and (list? form)
               (= (take 2 form) '(def default-special-fns)))
      (let [[_let _bindings form-map] (nth form 2)]
        (->> (keys form-map)
             (map second) ;; (quote x) => x
             (remove namespace)) ;; we'll ignore namespace-qualified special forms
        ))))

(defn parse-repl-specials
  [form doc-map]
  (when-let [specials (parse-repl-specials* form)]
    (let [location (parse-location form)
          make-map (fn [name-]
                     (let [attrs {:name (str name-)
                                  :type "special form (repl)"}
                           docs (get doc-map name-)]
                       (merge location attrs docs)))]
     (doall (map make-map specials)))))

;;--------------------------------------------------------------------------------
;; Parse syntax readers
;;--------------------------------------------------------------------------------

(defn base-syntax-item
  "A syntax API entry item using info from the syntax table"
  [{:keys [desc form clj-doc edn-doc] :as info}]
  {:name desc
   :syntax-form (or form " ") ;; <-- HACK: form needs to be non-empty string
                              ;;      so the result parser doesn't purge it
   :ns *cur-ns*
   :type (or (:type info) "syntax")
   :edn-doc edn-doc
   :clj-doc clj-doc})

(defn parse-syntax-treader
  "Parse syntax forms from tools.reader"
  []
  (let [parsed (parse-treader-forms)
        {:strs [macros
                dispatch-macros
                read-symbol
                read-number
                read-tagged
                wrapping-reader]
         :as items} (zipmap (map :name parsed) parsed)

        make-items
        (fn [map-def info-lookup]
          (let [[_defn- _macros _args [_case _ch & args]] (:form (meta map-def))
                {:as reader-map} (drop-last args) ;; (case ch :a 1 :b 2 :c 3 nil) => {:a 1 :b 2 :c 3}
                ]
            (for [[ch func] reader-map]
              (when-let [info (info-lookup ch)]
                (assoc (base-syntax-item info)
                       :source (:source map-def)
                       :extra-sources (if (and (list? func)
                                               (= 'wrapping-reader (first func)))
                                        [(:source wrapping-reader)]
                                        (when-let [f (get items (str func))]
                                          [(:source f)])))))))
        make-single
        (fn [info func]
          (assoc (base-syntax-item info)
                 :source (:source func)))

        ;; syntax forms identified by a leading character (e.g. "(", "[", "#{")
        ;; NOTE: presence determined by parsed char-map and dchar-map
        macro-items    (make-items macros char-map)
        dispatch-items (make-items dispatch-macros dchar-map)

        ;; syntax forms that can't be identified by a leading character
        ;; NOTE: always present
        symbol-item    (make-single (syntax-map "symbol") read-symbol)
        number-item    (make-single (syntax-map "number") read-number)

        ;; the dispatch macro that can't be identified by a leading character
        ;; NOTE: always present (since before tools.reader)
        tag-item       (make-single (syntax-map "tagged-literal") read-tagged)

        ;; special symbols (e.g. "NaN", "Infinity", "true", "false")
        ;; NOTE: assuming NaN and Infinity were available at the time cljs started
        ;;       using tools.reader.  they are not available in clojure.
        ssym-items (->> syntax
                        (filter #(= (:type %) "special symbol"))
                        (map #(make-single % read-symbol)))

        ;; special namespaces (e.g. "js", "Math")
        ;; NOTE: always present
        sns-items (->> syntax
                       (filter #(= (:type %) "special namespace"))
                       (map #(base-syntax-item %)))

        all-items (->> (concat macro-items
                               dispatch-items
                               [symbol-item number-item tag-item]
                               ssym-items
                               sns-items)
                       (keep identity))]
    all-items))

(defn parse-syntax-pre-treader
  "Get syntax forms available prior to tools.reader.
  Parse syntax forms from clojure's LispReader, using our base syntax list."
  []
  (let [;; clojure syntax forms
        ;; NOTE: presence determined by clojure version
        clojure-syntax-items
        (for [info (clj-syntax *clj-version*)]
          (assoc (base-syntax-item info)
                 ;; assuming their source is available in LispReader
                 ;; FIXME: not always true
                 :source {:repo "clojure"
                          :tag *clj-tag*
                          :filename "src/jvm/clojure/lang/LispReader.java"}))

        ;; js/ special namespace
        ;; NOTE: always present
        ;; NOTE: (the Math/ special namespace is already added since it has a clj-doc link in the syntax table)
        js-ns-item (base-syntax-item (syntax-map "js-namespace"))

        all-items (concat
                    clojure-syntax-items
                    [js-ns-item])]
    all-items))

(defn get-sub-syntax-forms
  "Get derived syntax forms from the given forms."
  [items]
  (let [make-sub-item (fn [info]
                        (when-let [parent (first (filter #(= (:syntax-form %) (:parent info)) items))]
                          (merge parent (base-syntax-item info))))
        sub-items (->> syntax
                       (filter :parent)
                       (map make-sub-item)
                       (keep identity))]
    sub-items))

(defn parse-syntax-forms
  []
  (let [forms (if *treader-version*
                (parse-syntax-treader)
                (parse-syntax-pre-treader))
        sub-forms (get-sub-syntax-forms forms)]
    (concat forms sub-forms)))

;;--------------------------------------------------------------------------------
;; Parse tagged literals
;;--------------------------------------------------------------------------------

(defn parse-tagged-literal-map
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def *cljs-data-readers*)))
    (->> (nth form 2)
         (map (fn [[k v]] [(second k) v])) ;; (quote x) -> x for keys
         (into {}))))

(defn parse-tagged-literals
  []
  ;; NOTE: tagged literals were available since clojure 1.4.0's LispReader was being
  ;; used by clojurescript 0.0-1211, but cljs.tagged-literals was added 0.0-1424.
  (let [forms (apply concat (read-ns-forms "cljs.tagged-literals" :compiler))
        reader-map (first (keep parse-tagged-literal-map forms))
        parsed (parse-ns* "cljs.tagged-literals" "clojurescript" :compiler)
        defs (zipmap (map :name parsed) parsed)
        map-form (get defs "*cljs-data-readers*")]
    (for [[name- func-name] reader-map]
      (merge (base-syntax-item (syntax-map (str name- "-literal")))
             {:type "tagged literal"
              :source (:source map-form)
              :extra-sources [(:source (get defs (str func-name)))]}))))

;;--------------------------------------------------------------------------------
;; Parse destructure reader
;;--------------------------------------------------------------------------------

(defn parse-destructure
  "Pull in the source of the destructure function and file it loosely
  as a syntax pattern."
  []
  (let [items (cond
                (>= *cljs-num* 1443) (parse-ns* "cljs.core" "clojurescript" [:compiler])
                (>= *cljs-num* 0)    (parse-clj-core)
                :else nil)
        match? #(= "destructure" (:name %))
        item (first (filter match? items))]
    (-> item
        (dissoc :signature)
        (merge (base-syntax-item (syntax-map "destructure")))
        (assoc :type "binding"))))

;;--------------------------------------------------------------------------------
;; Clojure Macros to import or exclude
;;--------------------------------------------------------------------------------

(defn get-imported-macro-api
  [forms macro-api]
  (let [get-imports #(match % (['import-macros 'clojure.core x] :seq) x :else nil)
        macro-names (->> forms (keep get-imports) first (map str) set)]
    (filter #(macro-names (:name %)) macro-api)))

(defn get-non-excluded-macro-api
  [forms macro-api]
  (let [ns-form (first (filter #(= 'ns (first %)) forms))
        get-excludes #(match % ([:refer-clojure :exclude x] :seq) x :else nil)
        macro-names (->> ns-form (drop 2) (keep get-excludes) first (map str) set)]
    (remove #(macro-names (:name %)) macro-api)))

 (defn parse-extra-macros-from-clj
  "cljs.core uses some macros from clojure.core, so find those here"
  []
  (let [clj-api (->> (parse-clj-core)
                     (filter #(= "macro" (:type %))))
        cljs-forms   (apply concat (read-ns-forms "cljs.core" :compiler))
        imports      (get-imported-macro-api     cljs-forms clj-api)
        non-excludes (get-non-excluded-macro-api cljs-forms clj-api)]
    (println "   " (count imports) "macros imported from clojure.core")
    (println "   " (count non-excludes) "macros non-excluded clojure.core")
    (concat imports non-excludes)))

;;------------------------------------------------------------
;; Type member parsing
;; (this is really messy since cljs has used a few ways to assign
;;  type attributes, and I'm just using the reader to find them.)
;;------------------------------------------------------------

(defn get-core-type-member-info
  [form type-names]
  (cond

    ;; LOOKS LIKE --->  (set! (.-EMPTY List) ...)
    (>= *cljs-num* 2301)
    (when (and (= 'set! (first form))
               (list? (second form))
               (= ".-" (subs (name (first (second form))) 0 2))
               (type-names (str (second (second form)))))
      (let [[_set! [attr parent-type] value] form
            name- (subs (name attr) 2)]
        (when-not (.contains name- "prototype")
          (let [name- (str parent-type "." name-)
                type- (if (and (list? value) (= 'fn (first value)))
                        "function" "var")
                sig (when (= type- "function")
                      [(second value)])
                result {:name name-
                        :type type-
                        :signature sig
                        :parent-type (name parent-type)}]
            result))))

    ;; LOOKS LIKE --->  (set! cljs.core.List.EMPTY ...)
    ;; (we can cover this case in the one below)
    ;;
    ;; (>= *cljs-num* 1933)
    ;; nil

    ;; LOOKS LIKE --->  (set! cljs.core.List/EMPTY ...)
    (>= *cljs-num* 0)
    (when (and (= 'set! (first form))
               (symbol? (second form))
               (.startsWith (str (second form)) "cljs.core."))
      (let [[_set! attr-sym value] form
            [_cljs _core parent-type attr & others] (split (str attr-sym) #"\.|/")]
        (when (and (type-names parent-type)
                   (not= attr "prototype")
                   (not others))
          (let [name- (str parent-type "." attr)
                type- (if (and (list? value) (= 'fn (first value)))
                        "function" "var")
                sig (when (= type- "function")
                      [(second value)])
                result {:name name-
                        :type type-
                        :signature sig
                        :parent-type (name parent-type)}]
            result
            ))))

    :else nil))

(defn parse-core-type-member
  [form type-names]
  (when-let [info (get-core-type-member-info form type-names)]
    (merge
      (binding [*cur-repo* "clojurescript"
                *cur-ns* "cljs.core"]
        (parse-location form))
      info)))

(defn get-core-type-members
  [type-names]
  (->> (apply concat (read-ns-forms "cljs.core" :library))
       (keep #(parse-core-type-member % type-names))))

;;------------------------------------------------------------
;; Top-level namespace parsing
;; (with custom corrections)
;;------------------------------------------------------------

(defmulti parse-ns
  (fn [ns- api]
    (if (= :custom (get-in namespaces [api ns-]))
      [ns- api]
      [:default api])))

(defmethod parse-ns ["cljs.core" :library] [ns- api]
  ;; NOTE: Concatenation order is important here
  ;; so previously defined macros/functions are overwritten
  ;; by subsequent ones.
  ;; Many compiler macros share same names as library functions.
  ;; The library functions are intended to be used over the macros.
  ;; And the imported macros from "clojure.core" should be overwritten
  ;; by cljs.core's macros.
  (let [com-parsed (->> (parse-ns* ns- "clojurescript" [:compiler])
                        (filter #(= "macro" (:type %))))
        lib-parsed (parse-ns* ns- "clojurescript" [:library])
        type-names (->> lib-parsed
                        (filter #(= "type" (:type %)))
                        (map (comp str :name))
                        set)]
    (concat (parse-extra-macros-from-clj)
            com-parsed
            lib-parsed
            (get-core-type-members type-names))))

;; pseudo-namespace since special forms don't have a namespace
(defmethod parse-ns ["special" :library] [ns- api]
  (let [docs (->> (read-ns-forms "cljs.repl" :compiler)
                  (apply concat)
                  (keep #(parse-special-docs %))
                  first)
        ns-with-specials (cond
                           (>= *cljs-num* 1424) "cljs.analyzer"
                           (>= *cljs-num* 0)    "cljs.compiler"
                           :else nil)
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (->> (read-ns-forms ns-with-specials :compiler)
                        (apply concat)
                        (keep #(parse-special % docs))
                        doall))]
    specials))

;; pseudo-namespace since repl special forms don't have a namespace
(defmethod parse-ns ["specialrepl" :library] [ns- api]
  (let [forms (apply concat (read-ns-forms "cljs.repl" :compiler))
        docs (first (keep parse-repl-special-docs forms))
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (first (keep #(parse-repl-specials % docs) forms)))]
    specials))

(defmethod parse-ns ["syntax" :syntax] [ns- api]
  (binding [*cur-ns* ns-]
    (let [tagged-literals (parse-tagged-literals)
          syntax-items (parse-syntax-forms)
          destructure-item (parse-destructure)]
      (doall (concat
               tagged-literals
               syntax-items
               [destructure-item])))))

(defmethod parse-ns ["cljs.test" :library] [ns- api]
  (parse-ns* ns- "clojurescript"
    (cond
      (>  *cljs-num* 3269) [:library]
      (>= *cljs-num* 0)    [:library :compiler] ;; macros mistakenly kept in compiler section before 3269
      :else nil)))

(defmethod parse-ns ["cljs.repl" :library] [ns- api]
  ;; the library file "repl.cljs" has (:require-macros cljs.repl)
  ;; so we must pull those in from the compiler and add in the
  ;; library functions.
  (let [macros (->> (parse-ns* ns- "clojurescript" [:compiler])
                    (filter #(= "macro" (:type %))))
        lib (parse-ns* ns- "clojurescript" [:library])]
    (concat macros lib)))

(defmethod parse-ns ["cljs.repl.nashorn" :compiler] [ns- api]
  (cond
    (>= *cljs-num* 3255)
    (let [forms (apply concat (read-ns-forms ns- :compiler))
          ;; get nested forms inside:
          ;;   (util/compile-if (Class/forName "jdk.nashorn.api.scripting.NashornException")
          ;;     (do ... ))
          [_compile-if _class [_do & nested-forms]] (first
                                                      (filter
                                                        #(and (list? %) (= 'util/compile-if (first %)))
                                                        forms))]
      (cond-> (parse-ns* ns- "clojurescript" :compiler)
        nested-forms (concat (parse-forms ns- "clojurescript" nested-forms))))

    (>= *cljs-num* 0)
    (parse-ns* ns- "clojurescript" :compiler)))

(defmethod parse-ns [:default :library] [ns- api]
  (parse-ns* ns- "clojurescript" :library))

(defmethod parse-ns [:default :compiler] [ns- api]
  (parse-ns* ns- "clojurescript" :compiler))

;;------------------------------------------------------------
;; Main
;;------------------------------------------------------------

(defn add-catch-finally
  "`catch` and `finally` are handled inside the `try` special form.
  We cannot parse them, so we add them manually."
  [parsed]
  (let [try-ns-name (cond
                      (>= *cljs-num* 1933) {:ns "special" :name "try"}
                      (>= *cljs-num* 0)    {:ns "cljs.core" :name "try"}
                      :else nil)
        try-form (first (filter #(= (select-keys % [:ns :name]) try-ns-name) parsed))
        get-sigs (fn [name-]
                   ;; parse docstring for signature of `catch` and `finally`:
                   ;;
                   ;;    catch-clause => (catch classname name expr*)
                   ;;    finally-clause => (finally expr*)
                   ;;
                   (when-let [docstring (:docstring try-form)]
                     (as-> (:docstring try-form) $
                       (re-find (re-pattern (str "\\(" name- " (.*)\\)")) $)
                       (second $)
                       (split $ #"\s+")
                       (mapv symbol $)
                       (vector $))))
        make (fn [name-]
               (assoc
                 (select-keys try-form
                              [:docstring :source])
                 :ns "special"
                 :type "special form"
                 :name name-
                 :signature (get-sigs name-)))
        extras (map make ["catch" "finally"])]
    (concat parsed extras)))

(defn parse-all*
  [api]
  (->> (get namespaces api)
       (keys)
       (mapcat #(parse-ns % api))
       (doall)))

(defn parse-all
  []
  {:syntax   (parse-all* :syntax)
   :library  (add-catch-finally (parse-all* :library))
   :compiler (parse-all* :compiler)})

