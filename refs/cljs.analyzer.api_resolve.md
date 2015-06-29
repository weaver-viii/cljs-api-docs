## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/resolve

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/resolve</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/resolve)
</td>
</tr>
</table>

 <samp>
(__resolve__ env sym)<br>
</samp>

---




Source docstring:

```
Given an analysis environment resolve a var. Analogous to
clojure.core/resolve
```

Source code:

```clj
(defn resolve
  [env sym]
  {:pre [(map? env) (symbol? sym)]}
  (try
    (ana/resolve-var env sym
      (ana/confirm-var-exists-throw))
    (catch Exception e)))
```

 <pre>
clojurescript @ r2760
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:14-22](https://github.com/clojure/clojurescript/blob/r2760/src/clj/cljs/analyzer/api.clj#L14-L22)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/resolve"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "resolve",
 :signature ["[env sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_resolve",
 :source {:code "(defn resolve\n  [env sym]\n  {:pre [(map? env) (symbol? sym)]}\n  (try\n    (ana/resolve-var env sym\n      (ana/confirm-var-exists-throw))\n    (catch Exception e)))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [14 22]},
 :full-name "cljs.analyzer.api/resolve",
 :clj-symbol "clojure.core/resolve",
 :docstring "Given an analysis environment resolve a var. Analogous to\nclojure.core/resolve"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_resolve.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_resolve.cljsdoc)
</pre>

