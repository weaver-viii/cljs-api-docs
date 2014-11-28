(ns core
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.java.io :as io]
    [clojure.java.shell :refer [sh]]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [clojure.string :refer [split-lines join replace trim]]
    [cljs.env :as env]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [cljs.analyzer :refer [forms-seq analyze-file]]
    [me.raynes.fs :refer [mkdir]]
    ))

;;------------------------------------------------------------
;; Form Retrieving
;;------------------------------------------------------------

;; HACK: We need to create this so the reader doesn't crash on `::ana/numeric`
;; which is used by cljs.core. (the ana namespace has to exist)
(create-ns 'ana)

(defn get-forms-from-file
  [path]
  (let [is (clojure.java.io/input-stream path)
        r1 (readers/input-stream-push-back-reader is)
        r  (readers/source-logging-push-back-reader r1 1 path)]
    (loop [forms (transient [])]
      (if-let [f (try (binding [reader/*data-readers* *cljs-data-readers*]
                        (reader/read r))
                      (catch Exception e
                        (when-not (= (.getMessage e) "EOF") (throw e))))]
        (recur (conj! forms f))
        (persistent! forms)))))

;;------------------------------------------------------------
;; Repos
;;------------------------------------------------------------

(def repo-dir "code-to-parse")

(defn get-repo-sha1
  [repo]
  (trim (:out (sh "git" "rev-parse" "HEAD" :dir (str repo-dir "/" repo)))))

(def repo-sha1
  "SHA1 hashes of the checked out commits of the language repos"
  {"clojure"       (get-repo-sha1 "clojure")
   "clojurescript" (get-repo-sha1 "clojurescript")})

(defn get-github-file-link
  [repo path [start-line end-line]]
  (let [sha1 (repo-sha1 repo)
        strip-path (subs path (inc (count repo)))]
    (str "https://github.com/clojure/" repo "/blob/" sha1 "/" strip-path
         "#L" start-line "-L" end-line)))

(def paths
  "Locations for the symbols of a given namespace"
  ; NS                REPO             FILE               FULL PATH
  {"cljs.core"      {"clojurescript" {"core.cljs"        "src/cljs/cljs/core.cljs"
                                      "core.clj"         "src/clj/cljs/core.clj"}
                     "clojure"       {"core.clj"         "src/clj/clojure/core.clj"
                                      "core_deftype.clj" "src/clj/clojure/core_deftype.clj"}}
   "clojure.set"    {"clojurescript" {"set.cljs"         "src/cljs/clojure/set.cljs"}}
   "clojure.string" {"clojurescript" {"string.cljs"      "src/cljs/clojure/string.cljs"}}})

;;------------------------------------------------------------
;; Repo Helpers
;;------------------------------------------------------------

(defn get-repo-path
  "Get path to the given repo file"
  [ns- repo file]
  (let [path (get-in paths [ns- repo file])]
    (str repo-dir "/" repo "/" path)))

(defn get-forms
  "Get forms from the given repo file"
  [ns- repo file]
  (get-forms-from-file (get-repo-path ns- repo file)))

;;------------------------------------------------------------
;; Docstring Indentation Fix
;;------------------------------------------------------------

(defn get-docstring-indent
  [docstring]
  (let [lines (split-lines docstring)]
    (if (> (count lines) 1)
      (let [[first-line & indented-lines] lines
            get-indent-length #(count (re-find #"^ *" %))
            has-content? #(pos? (count (trim %)))]
        (->> indented-lines
             (filter has-content?)
             (map get-indent-length)
             (apply min 3)))
      0)))

(defn fix-docstring
  [docstring]
  (let [indent-length (get-docstring-indent docstring)]
    (if (zero? indent-length)
      docstring
      (let [[first-line & indented-lines] (split-lines docstring)
            indent (re-pattern (str "^ {" indent-length "}"))
            remove-indent #(replace % indent "")]
        (->> indented-lines
             (map remove-indent)
             (cons first-line)
             (join "\n"))))))

;;------------------------------------------------------------
;; Form Parsing
;;------------------------------------------------------------

(defn parse-defn-or-macro
  [form]
  (let [name- (second form)
        docstring (let [ds (nth form 2)]
                    (when (string? ds)
                      (fix-docstring ds)))
        attr-map (let [m (nth form (if docstring 3 2))]
                   (when (map? m) m))
        rest-forms (drop (cond-> 2 docstring inc attr-map inc) form)
        signatures (if (vector? (first rest-forms))
                     (take 1 rest-forms)
                     (map first rest-forms))]
    {:name name-
     :docstring docstring
     :signatures signatures}))

(defn parse-def-fn
  [form]
  (let [name- (second form)
        m (meta name-)
        docstring (let [ds (:doc m)]
                    (when (string? ds)
                      (fix-docstring ds)))
        signatures (when-let [arglists (:arglists m)]
                     (when (= 'quote (first arglists))
                       (second arglists)))]
    {:name name-
     :docstring docstring
     :signatures signatures}))

(defmulti parse-form*
  (fn [form]
    (cond
      (= 'defn (first form))
      "defn"

      (= 'defmacro (first form))
      "defmacro"

      (and (= 'def (first form))
           (list? (nth form 2 nil))
           (= 'fn (first (nth form 2 nil)))
           (not (:private (meta (second form)))))
      "def fn"

      :else nil)))

(defmethod parse-form* "def fn"
  [form]
  (assoc (parse-def-fn form) :fn-or-macro "function"))

(defmethod parse-form* "defn"
  [form]
  (assoc (parse-defn-or-macro form) :fn-or-macro "function"))

(defmethod parse-form* "defmacro"
  [form]
  (assoc (parse-defn-or-macro form) :fn-or-macro "macro"))

(defmethod parse-form* nil
  [form]
  nil)

(defn parse-common
  [form ns- repo]
  (let [m (meta form)
        lines [(:line m) (:end-line m)]
        num-lines (inc (- (:end-line m) (:line m)))
        source (join "\n" (take-last num-lines (split-lines (:source m))))
        filename (subs (:file m) (inc (count repo-dir)))
        github-link (get-github-file-link repo filename lines)]
    {:ns ns-
     :source source
     :filename filename
     :lines lines
     :github-link github-link}))

(defn parse-form
  [form ns- repo]
  (when-let [specific (parse-form* form)]
    (let [common (parse-common form ns- repo)]
      (merge specific common))))

(defn parse-api
  "Parse the functions and macros from the given repo file"
  [ns- repo file]
  (keep #(parse-form % ns- repo) (get-forms ns- repo file)))

(defn get-imported-macro-api
  [ns- repo file macro-api]
  (let [forms (get-forms ns- repo file)
        macro-names (-> (filter #(= 'import-macros (first %)) forms)
                        first (nth 2) set)]
    (filter #(macro-names (:name %)) macro-api)))

;;------------------------------------------------------------
;; cljsdoc writing
;;------------------------------------------------------------

(def cljsdoc-dir "../../docs-generated")
(mkdir cljsdoc-dir)

(defn symbol->filename
  [s]
  (-> (name s)
      (replace "." "DOT")
      (replace ">" "GT")
      (replace "<" "LT")
      (replace "!" "BANG")
      (replace "?" "QMARK")
      (replace "*" "STAR")
      (replace "+" "PLUS")
      (replace "/" "SLASH")))

(defn cljsdoc-filename
  [item]
  (str cljsdoc-dir "/" (:ns item) "_" (symbol->filename (:name item)) ".cljsdoc"))

(defn cljsdoc-section
  [title content]
  (str "===== " title "\n" content "\n"))

(defn make-cljsdoc
  [item]
  (join "\n"
    [(cljsdoc-section "Name" (:name item))
     (cljsdoc-section "Type" (:fn-or-macro item))
     (cljsdoc-section "Docstring" (:docstring item))
     (cljsdoc-section "Signatures" (join "\n" (:signatures item)))
     (cljsdoc-section "Filename" (:filename item))
     (cljsdoc-section "Source" (:source item))
     (cljsdoc-section "Github Link" (:github-link item))]))

(defn write-cljsdoc
  [item]
  (let [filename (cljsdoc-filename item)
        content (make-cljsdoc item)]
    (println "Writing" filename "...")
    (spit filename content)))

;;------------------------------------------------------------
;; Symbol Retrieval
;;------------------------------------------------------------

(defmulti get-symbols (fn [ns-] ns-))

(defmethod get-symbols "cljs.core" [ns-]
  (let [clj-api       (parse-api ns- "clojure"       "core.clj")
        clj-type-api  (parse-api ns- "clojure"       "core_deftype.clj")
        clj-cljs-api  (parse-api ns- "clojurescript" "core.clj")
        cljs-cljs-api (parse-api ns- "clojurescript" "core.cljs")
        import-macro-api (get-imported-macro-api ns- "clojurescript" "core.clj" (concat clj-api clj-type-api))]
    (doseq [item (concat import-macro-api
                         clj-cljs-api
                         cljs-cljs-api)]
      (write-cljsdoc item))))

(defmethod get-symbols "clojure.set" [ns-]
  (let [api (parse-api ns- "clojurescript" "set.cljs")]
    (doseq [item api]
      (write-cljsdoc item))))

(defmethod get-symbols "clojure.string" [ns-]
  (let [api (parse-api ns- "clojurescript" "string.cljs")]
    (doseq [item api]
      (write-cljsdoc item))))

;;------------------------------------------------------------
;; Program Entry
;;------------------------------------------------------------

(defn -main
  []
  (get-symbols "cljs.core")
  (get-symbols "clojure.set")
  (get-symbols "clojure.string")

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))
