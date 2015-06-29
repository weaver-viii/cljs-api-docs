## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/ns-resolve

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-resolve</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-resolve)
</td>
</tr>
</table>

 <samp>
(__ns-resolve__ ns sym)<br>
</samp>

---




Source docstring:

```
Given a namespace and a symbol return the corresponding var analysis map.
Analagous to clojure.core/ns-resolve but returns var analysis map not Var.
```

Source code:

```clj
(defn ns-resolve
  [ns sym]
  {:pre [(symbol? ns) (symbol? sym)]}
  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))
```

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:59-64](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/analyzer/api.clj#L59-L64)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-resolve"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "ns-resolve",
 :signature ["[ns sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_ns-resolve",
 :source {:code "(defn ns-resolve\n  [ns sym]\n  {:pre [(symbol? ns) (symbol? sym)]}\n  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [59 64]},
 :full-name "cljs.analyzer.api/ns-resolve",
 :clj-symbol "clojure.core/ns-resolve",
 :docstring "Given a namespace and a symbol return the corresponding var analysis map.\nAnalagous to clojure.core/ns-resolve but returns var analysis map not Var."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_ns-resolve.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_ns-resolve.cljsdoc)
</pre>

