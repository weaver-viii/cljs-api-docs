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





Source code:

```clj
(defn ns-resolve [ns sym]
  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:26-27](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/analyzer/api.clj#L26-L27)</ins>
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
 :source {:code "(defn ns-resolve [ns sym]\n  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [26 27]},
 :full-name "cljs.analyzer.api/ns-resolve",
 :clj-symbol "clojure.core/ns-resolve"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_ns-resolve.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_ns-resolve.cljsdoc)
</pre>
