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
  [_ env [_ name & args :as form] _ opts]
  (when-not (symbol? name) 
    (throw (error env "Namespaces must be named by a symbol.")))
  (when (= 1 (count (string/split (clojure.core/name name) #"\.")))
    (warning :single-segment-namespace env {:name name}))
  (let [docstring (if (string? (first args)) (first args))
        mdocstr   (-> name meta :doc)
        args      (if docstring (next args) args)
        metadata  (if (map? (first args)) (first args))
        form-meta (meta form)
        args      (desugar-ns-specs (if metadata (next args) args))
        name      (vary-meta name merge metadata)
        excludes  (parse-ns-excludes env args)
        deps      (atom #{})
        aliases   (atom {:fns {} :macros {}})
        spec-parsers {:require        (partial parse-require-spec env false deps aliases)
                      :require-macros (partial parse-require-spec env true deps aliases)
                      :use            (comp (partial parse-require-spec env false deps aliases)
                                            (partial use->require env))
                      :use-macros     (comp (partial parse-require-spec env true deps aliases)
                                            (partial use->require env))
                      :import         (partial parse-import-spec env deps)}
        valid-forms (atom #{:use :use-macros :require :require-macros :import})
        reload (atom {:use nil :require nil :use-macros nil :require-macros nil})
        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}
        (reduce
          (fn [m [k & libs]]
            (when-not (#{:use :use-macros :require :require-macros :import} k)
              (throw (error env "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")))
            (when-not (@valid-forms k)
              (throw (error env (str "Only one " k " form is allowed per namespace definition"))))
            (swap! valid-forms disj k)
            (when-not (= :import k)
              (when (some #{:reload} libs)
                (swap! reload assoc k :reload))
              (when (some #{:reload-all} libs)
                (swap! reload assoc k :reload-all)))
            (apply merge-with merge m
              (map (spec-parsers k)
                (remove #{:reload :reload-all} libs))))
          {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (and *analyze-deps* (seq @deps))
      (analyze-deps name @deps env opts))
    (when (and *analyze-deps* (seq uses))
      (check-uses uses env))
    (set! *cljs-ns* name)
    (when *load-macros*
      (load-core)
      (doseq [nsym (vals use-macros)]
        (let [k (:use-macros @reload)]
          (if k
            (clojure.core/require nsym k)
            (clojure.core/require nsym))
          (intern-macros nsym k)))
      (doseq [nsym (vals require-macros)]
        (let [k (:require-macros @reload)]
          (if k
            (clojure.core/require nsym k)
            (clojure.core/require nsym))
          (intern-macros nsym k)))
      (when (seq use-macros)
        (check-use-macros use-macros env)))
    (let [ns-info
          {:name name
           :doc (or docstring mdocstr)
           :excludes excludes
           :use-macros use-macros
           :require-macros require-macros
           :uses uses
           :requires requires
           :imports imports}
          ns-info
          (if (:merge form-meta)
            ;; for merging information in via require usage in REPLs
            (let [ns-info' (get-in @env/*compiler* [::namespaces name])]
              (if (pos? (count ns-info'))
                (let [merge-keys
                      [:use-macros :require-macros :uses :requires :imports]]
                  (merge
                    ns-info'
                    (merge-with merge
                      (select-keys ns-info' merge-keys)
                      (select-keys ns-info merge-keys))))
                ns-info))
            ns-info)]
      (swap! env/*compiler* update-in [::namespaces name] merge ns-info)
      (merge {:env env :op :ns :form form}
        (cond-> ns-info
          (@reload :use)
          (update-in [:uses]
            (fn [m] (with-meta m {(@reload :use) true})))
          (@reload :require)
          (update-in [:requires]
            (fn [m] (with-meta m {(@reload :require) true}))))))))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1386-1480](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/analyzer.clj#L1386-L1480)</ins>
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
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _ opts]\n  (when-not (symbol? name) \n    (throw (error env \"Namespaces must be named by a symbol.\")))\n  (when (= 1 (count (string/split (clojure.core/name name) #\"\\.\")))\n    (warning :single-segment-namespace env {:name name}))\n  (let [docstring (if (string? (first args)) (first args))\n        mdocstr   (-> name meta :doc)\n        args      (if docstring (next args) args)\n        metadata  (if (map? (first args)) (first args))\n        form-meta (meta form)\n        args      (desugar-ns-specs (if metadata (next args) args))\n        name      (vary-meta name merge metadata)\n        excludes  (parse-ns-excludes env args)\n        deps      (atom #{})\n        aliases   (atom {:fns {} :macros {}})\n        spec-parsers {:require        (partial parse-require-spec env false deps aliases)\n                      :require-macros (partial parse-require-spec env true deps aliases)\n                      :use            (comp (partial parse-require-spec env false deps aliases)\n                                            (partial use->require env))\n                      :use-macros     (comp (partial parse-require-spec env true deps aliases)\n                                            (partial use->require env))\n                      :import         (partial parse-import-spec env deps)}\n        valid-forms (atom #{:use :use-macros :require :require-macros :import})\n        reload (atom {:use nil :require nil :use-macros nil :require-macros nil})\n        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}\n        (reduce\n          (fn [m [k & libs]]\n            (when-not (#{:use :use-macros :require :require-macros :import} k)\n              (throw (error env \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")))\n            (when-not (@valid-forms k)\n              (throw (error env (str \"Only one \" k \" form is allowed per namespace definition\"))))\n            (swap! valid-forms disj k)\n            (when-not (= :import k)\n              (when (some #{:reload} libs)\n                (swap! reload assoc k :reload))\n              (when (some #{:reload-all} libs)\n                (swap! reload assoc k :reload-all)))\n            (apply merge-with merge m\n              (map (spec-parsers k)\n                (remove #{:reload :reload-all} libs))))\n          {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (when (and *analyze-deps* (seq @deps))\n      (analyze-deps name @deps env opts))\n    (when (and *analyze-deps* (seq uses))\n      (check-uses uses env))\n    (set! *cljs-ns* name)\n    (when *load-macros*\n      (load-core)\n      (doseq [nsym (vals use-macros)]\n        (let [k (:use-macros @reload)]\n          (if k\n            (clojure.core/require nsym k)\n            (clojure.core/require nsym))\n          (intern-macros nsym k)))\n      (doseq [nsym (vals require-macros)]\n        (let [k (:require-macros @reload)]\n          (if k\n            (clojure.core/require nsym k)\n            (clojure.core/require nsym))\n          (intern-macros nsym k)))\n      (when (seq use-macros)\n        (check-use-macros use-macros env)))\n    (let [ns-info\n          {:name name\n           :doc (or docstring mdocstr)\n           :excludes excludes\n           :use-macros use-macros\n           :require-macros require-macros\n           :uses uses\n           :requires requires\n           :imports imports}\n          ns-info\n          (if (:merge form-meta)\n            ;; for merging information in via require usage in REPLs\n            (let [ns-info' (get-in @env/*compiler* [::namespaces name])]\n              (if (pos? (count ns-info'))\n                (let [merge-keys\n                      [:use-macros :require-macros :uses :requires :imports]]\n                  (merge\n                    ns-info'\n                    (merge-with merge\n                      (select-keys ns-info' merge-keys)\n                      (select-keys ns-info merge-keys))))\n                ns-info))\n            ns-info)]\n      (swap! env/*compiler* update-in [::namespaces name] merge ns-info)\n      (merge {:env env :op :ns :form form}\n        (cond-> ns-info\n          (@reload :use)\n          (update-in [:uses]\n            (fn [m] (with-meta m {(@reload :use) true})))\n          (@reload :require)\n          (update-in [:requires]\n            (fn [m] (with-meta m {(@reload :require) true}))))))))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1386 1480]},
 :full-name "special/ns",
 :clj-symbol "clojure.core/ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_ns.cljsdoc)
</pre>

