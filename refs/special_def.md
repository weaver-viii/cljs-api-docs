## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/def

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/def</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/def)
</td>
</tr>
</table>

 <samp>
(__def__ symbol)<br>
</samp>
 <samp>
(__def__ symbol init)<br>
</samp>
 <samp>
(__def__ symbol doc-string init)<br>
</samp>

---

Creates a global variable with the name of `symbol` and a namespace of the
current namespace.

If `init` is supplied, it is evaluated and the result is assigned to `symbol`.

`doc-string` is an optional documentation string.

`def` is one of ClojureScript's [special forms](http://clojure.org/special_forms)
and is used by many macros to define common elements (ie: `defn`, `defmacro`,
etc).

---

Example:

```clj
(def a)
a
;;=> nil

(def b 42)
b
;;=> 42

(def c "an optional docstring" 42)
c
;;=> 42
```

---

See Also:

[`cljs.core/defn`](cljs.core_defn.md)<br>
[`cljs.core/fn`](cljs.core_fn.md)<br>
[`cljs.core/defmacro`](cljs.core_defmacro.md)<br>
[`cljs.core/defmulti`](cljs.core_defmulti.md)<br>

---


Source code:

```clj
(defmethod parse 'def
  [op env form name]
  (let [pfn (fn
              ([_ sym] {:sym sym})
              ([_ sym init] {:sym sym :init init})
              ([_ sym doc init] {:sym sym :doc doc :init init}))
        args (apply pfn form)
        sym (:sym args)
        sym-meta (meta sym)
        tag (-> sym meta :tag)
        protocol (-> sym meta :protocol)
        dynamic (-> sym meta :dynamic)
        ns-name (-> env :ns :name)]
    (assert (not (namespace sym)) "Can't def ns-qualified name")
    (let [env (if (or (and (not= ns-name 'cljs.core)
                           (core-name? env sym))
                      (get-in @namespaces [ns-name :uses sym]))
                (let [ev (resolve-existing-var (dissoc env :locals) sym)]
                  (when (:redef *cljs-warnings*)
                    (warning env
                      (str "WARNING: " sym " already refers to: " (symbol (str (:ns ev)) (str sym))
                           " being replaced by: " (symbol (str ns-name) (str sym)))))
                  (swap! namespaces update-in [ns-name :excludes] conj sym)
                  (update-in env [:ns :excludes] conj sym))
                env)
          name (:name (resolve-var (dissoc env :locals) sym))
          var-expr (assoc (analyze (-> env (dissoc :locals)
                                       (assoc :context :expr)
                                       (assoc :def-var true))
                                   sym)
                     :op :var)
          init-expr (when (contains? args :init)
                      (disallowing-recur
                        (analyze (assoc env :context :expr) (:init args) sym)))
          fn-var? (and init-expr (= (:op init-expr) :fn))
          export-as (when-let [export-val (-> sym meta :export)]
                      (if (= true export-val) name export-val))
          doc (or (:doc args) (-> sym meta :doc))]
      (when-let [v (get-in @namespaces [ns-name :defs sym])]
        (when (and (:fn-var *cljs-warnings*)
                   (not (-> sym meta :declared))
                   (and (:fn-var v) (not fn-var?)))
          (warning env
            (str "WARNING: " (symbol (str ns-name) (str sym))
                 " no longer fn, references are stale"))))
      (swap! namespaces assoc-in [ns-name :defs sym]
                 (merge 
                   {:name name}
                   sym-meta
                   (when doc {:doc doc})
                   (when dynamic {:dynamic true})
                   (source-info name env)
                   ;; the protocol a protocol fn belongs to
                   (when protocol
                     {:protocol protocol})
                   ;; symbol for reified protocol
                   (when-let [protocol-symbol (-> sym meta :protocol-symbol)]
                     {:protocol-symbol protocol-symbol
                      :impls #{}})
                   (when fn-var?
                     {:fn-var true
                      ;; protocol implementation context
                      :protocol-impl (:protocol-impl init-expr)
                      ;; inline protocol implementation context
                      :protocol-inline (:protocol-inline init-expr)
                      :variadic (:variadic init-expr)
                      :max-fixed-arity (:max-fixed-arity init-expr)
                      :method-params (map :params (:methods init-expr))})))
      (merge {:env env :op :def :form form
              :name name :var var-expr :doc doc :init init-expr}
             (when tag {:tag tag})
             (when dynamic {:dynamic true})
             (when export-as {:export export-as})
             (when init-expr {:children [init-expr]})))))
```

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:313-386](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/analyzer.clj#L313-L386)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/def"]))
```

```clj
{:description "Creates a global variable with the name of `symbol` and a namespace of the\ncurrent namespace.\n\nIf `init` is supplied, it is evaluated and the result is assigned to `symbol`.\n\n`doc-string` is an optional documentation string.\n\n`def` is one of ClojureScript's [special forms](http://clojure.org/special_forms)\nand is used by many macros to define common elements (ie: `defn`, `defmacro`,\netc).",
 :ns "special",
 :name "def",
 :signature ["[symbol]" "[symbol init]" "[symbol doc-string init]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["cljs.core/defn"
           "cljs.core/fn"
           "cljs.core/defmacro"
           "cljs.core/defmulti"],
 :full-name-encode "special_def",
 :source {:code "(defmethod parse 'def\n  [op env form name]\n  (let [pfn (fn\n              ([_ sym] {:sym sym})\n              ([_ sym init] {:sym sym :init init})\n              ([_ sym doc init] {:sym sym :doc doc :init init}))\n        args (apply pfn form)\n        sym (:sym args)\n        sym-meta (meta sym)\n        tag (-> sym meta :tag)\n        protocol (-> sym meta :protocol)\n        dynamic (-> sym meta :dynamic)\n        ns-name (-> env :ns :name)]\n    (assert (not (namespace sym)) \"Can't def ns-qualified name\")\n    (let [env (if (or (and (not= ns-name 'cljs.core)\n                           (core-name? env sym))\n                      (get-in @namespaces [ns-name :uses sym]))\n                (let [ev (resolve-existing-var (dissoc env :locals) sym)]\n                  (when (:redef *cljs-warnings*)\n                    (warning env\n                      (str \"WARNING: \" sym \" already refers to: \" (symbol (str (:ns ev)) (str sym))\n                           \" being replaced by: \" (symbol (str ns-name) (str sym)))))\n                  (swap! namespaces update-in [ns-name :excludes] conj sym)\n                  (update-in env [:ns :excludes] conj sym))\n                env)\n          name (:name (resolve-var (dissoc env :locals) sym))\n          var-expr (assoc (analyze (-> env (dissoc :locals)\n                                       (assoc :context :expr)\n                                       (assoc :def-var true))\n                                   sym)\n                     :op :var)\n          init-expr (when (contains? args :init)\n                      (disallowing-recur\n                        (analyze (assoc env :context :expr) (:init args) sym)))\n          fn-var? (and init-expr (= (:op init-expr) :fn))\n          export-as (when-let [export-val (-> sym meta :export)]\n                      (if (= true export-val) name export-val))\n          doc (or (:doc args) (-> sym meta :doc))]\n      (when-let [v (get-in @namespaces [ns-name :defs sym])]\n        (when (and (:fn-var *cljs-warnings*)\n                   (not (-> sym meta :declared))\n                   (and (:fn-var v) (not fn-var?)))\n          (warning env\n            (str \"WARNING: \" (symbol (str ns-name) (str sym))\n                 \" no longer fn, references are stale\"))))\n      (swap! namespaces assoc-in [ns-name :defs sym]\n                 (merge \n                   {:name name}\n                   sym-meta\n                   (when doc {:doc doc})\n                   (when dynamic {:dynamic true})\n                   (source-info name env)\n                   ;; the protocol a protocol fn belongs to\n                   (when protocol\n                     {:protocol protocol})\n                   ;; symbol for reified protocol\n                   (when-let [protocol-symbol (-> sym meta :protocol-symbol)]\n                     {:protocol-symbol protocol-symbol\n                      :impls #{}})\n                   (when fn-var?\n                     {:fn-var true\n                      ;; protocol implementation context\n                      :protocol-impl (:protocol-impl init-expr)\n                      ;; inline protocol implementation context\n                      :protocol-inline (:protocol-inline init-expr)\n                      :variadic (:variadic init-expr)\n                      :max-fixed-arity (:max-fixed-arity init-expr)\n                      :method-params (map :params (:methods init-expr))})))\n      (merge {:env env :op :def :form form\n              :name name :var var-expr :doc doc :init init-expr}\n             (when tag {:tag tag})\n             (when dynamic {:dynamic true})\n             (when export-as {:export export-as})\n             (when init-expr {:children [init-expr]})))))",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [313 386]},
 :examples [{:id "a5f898",
             :content "```clj\n(def a)\na\n;;=> nil\n\n(def b 42)\nb\n;;=> 42\n\n(def c \"an optional docstring\" 42)\nc\n;;=> 42\n```"}],
 :full-name "special/def",
 :clj-symbol "clojure.core/def"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_def.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_def.cljsdoc)
</pre>

