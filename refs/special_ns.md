## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/ns

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)
</td>
</tr>
</table>

 <samp>
(__ns__ name & references)<br>
</samp>

---

Sets the namespace of the file.

`ns` must be the first form in a `.cljs` file and there can only be one `ns`
declaration per file. Namespaces must match the file name of their respective
`.cljs` files, with the exception that dashes in namespaces become underscores
in filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file
`foo/bar_biz/baz.cljs`.

`references` can be zero or more forms used to import other namespaces, symbols,
and libraries into the current namespace.

---




Source code:

```clj
(defmethod parse 'ns
  [_ env [_ name & args :as form] _]
  (when-not (symbol? name) 
    (throw (error env "Namespaces must be named by a symbol.")))
  (let [docstring (if (string? (first args)) (first args))
        args      (if docstring (next args) args)
        metadata  (if (map? (first args)) (first args))
        args      (desugar-ns-specs (if metadata (next args) args))
        excludes  (parse-ns-excludes env args)
        deps      (atom #{})
        aliases   (atom {:fns #{} :macros #{}})
        spec-parsers {:require        (partial parse-require-spec env false deps aliases)
                      :require-macros (partial parse-require-spec env true deps aliases)
                      :use            (comp (partial parse-require-spec env false deps aliases)
                                            (partial use->require env))
                      :use-macros     (comp (partial parse-require-spec env true deps aliases)
                                            (partial use->require env))
                      :import         (partial parse-import-spec env deps)}
        valid-forms (atom #{:use :use-macros :require :require-macros :import})
        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}
        (reduce (fn [m [k & libs]]
                  (when-not (#{:use :use-macros :require :require-macros :import} k)
                    (throw (error env "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")))
                  (when-not (@valid-forms k)
                    (throw (error env (str "Only one " k " form is allowed per namespace definition"))))
                  (swap! valid-forms disj k)
                  (apply merge-with merge m (map (spec-parsers k) libs)))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (seq @deps)
      (analyze-deps name @deps))
    (when (seq uses)
      (check-uses uses env))
    (set! *cljs-ns* name)
    (load-core)
    (doseq [nsym (concat (vals require-macros) (vals use-macros))]
      (clojure.core/require nsym))
    (when (seq use-macros)
      (check-use-macros use-macros env))
    (swap! env/*compiler* update-in [::namespaces name] assoc
      :name name
      :doc docstring
      :excludes excludes
      :uses uses
      :requires requires
      :use-macros use-macros
      :require-macros require-macros
      :imports imports)
    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports
     :use-macros use-macros :require-macros require-macros :excludes excludes}))
```

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1098-1146](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/analyzer.clj#L1098-L1146)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/ns"]))
```

```clj
{:description "Sets the namespace of the file.\n\n`ns` must be the first form in a `.cljs` file and there can only be one `ns`\ndeclaration per file. Namespaces must match the file name of their respective\n`.cljs` files, with the exception that dashes in namespaces become underscores\nin filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file\n`foo/bar_biz/baz.cljs`.\n\n`references` can be zero or more forms used to import other namespaces, symbols,\nand libraries into the current namespace.",
 :ns "special",
 :name "ns",
 :signature ["[name & references]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special_ns",
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _]\n  (when-not (symbol? name) \n    (throw (error env \"Namespaces must be named by a symbol.\")))\n  (let [docstring (if (string? (first args)) (first args))\n        args      (if docstring (next args) args)\n        metadata  (if (map? (first args)) (first args))\n        args      (desugar-ns-specs (if metadata (next args) args))\n        excludes  (parse-ns-excludes env args)\n        deps      (atom #{})\n        aliases   (atom {:fns #{} :macros #{}})\n        spec-parsers {:require        (partial parse-require-spec env false deps aliases)\n                      :require-macros (partial parse-require-spec env true deps aliases)\n                      :use            (comp (partial parse-require-spec env false deps aliases)\n                                            (partial use->require env))\n                      :use-macros     (comp (partial parse-require-spec env true deps aliases)\n                                            (partial use->require env))\n                      :import         (partial parse-import-spec env deps)}\n        valid-forms (atom #{:use :use-macros :require :require-macros :import})\n        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}\n        (reduce (fn [m [k & libs]]\n                  (when-not (#{:use :use-macros :require :require-macros :import} k)\n                    (throw (error env \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")))\n                  (when-not (@valid-forms k)\n                    (throw (error env (str \"Only one \" k \" form is allowed per namespace definition\"))))\n                  (swap! valid-forms disj k)\n                  (apply merge-with merge m (map (spec-parsers k) libs)))\n                {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (when (seq @deps)\n      (analyze-deps name @deps))\n    (when (seq uses)\n      (check-uses uses env))\n    (set! *cljs-ns* name)\n    (load-core)\n    (doseq [nsym (concat (vals require-macros) (vals use-macros))]\n      (clojure.core/require nsym))\n    (when (seq use-macros)\n      (check-use-macros use-macros env))\n    (swap! env/*compiler* update-in [::namespaces name] assoc\n      :name name\n      :doc docstring\n      :excludes excludes\n      :uses uses\n      :requires requires\n      :use-macros use-macros\n      :require-macros require-macros\n      :imports imports)\n    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports\n     :use-macros use-macros :require-macros require-macros :excludes excludes}))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1098 1146]},
 :full-name "special/ns",
 :clj-symbol "clojure.core/ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_ns.cljsdoc)
</pre>

