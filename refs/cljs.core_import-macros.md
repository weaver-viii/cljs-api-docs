## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/import-macros

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__import-macros__ ns \[& vars\])<br>
</samp>

---





Source code:

```clj
(defmacro import-macros [ns [& vars]]
  (core/let [ns (find-ns ns)
             vars (map #(ns-resolve ns %) vars)
             syms (map (core/fn [^clojure.lang.Var v] (core/-> v .sym (with-meta {:macro true}))) vars)
             defs (map (core/fn [sym var]
                                `(do (def ~sym (deref ~var))
                                     ;for AOT compilation
                                     (alter-meta! (var ~sym) assoc :macro true)))
                       syms vars)]
            `(do ~@defs
                 :imported)))
```

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:46-56](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/core.clj#L46-L56)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/import-macros"]))
```

```clj
{:ns "cljs.core",
 :name "import-macros",
 :type "macro",
 :signature ["[ns [& vars]]"],
 :source {:code "(defmacro import-macros [ns [& vars]]\n  (core/let [ns (find-ns ns)\n             vars (map #(ns-resolve ns %) vars)\n             syms (map (core/fn [^clojure.lang.Var v] (core/-> v .sym (with-meta {:macro true}))) vars)\n             defs (map (core/fn [sym var]\n                                `(do (def ~sym (deref ~var))\n                                     ;for AOT compilation\n                                     (alter-meta! (var ~sym) assoc :macro true)))\n                       syms vars)]\n            `(do ~@defs\n                 :imported)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/clj/cljs/core.clj",
          :lines [46 56]},
 :full-name "cljs.core/import-macros",
 :full-name-encode "cljs.core_import-macros",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_import-macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_import-macros.cljsdoc)
</pre>

