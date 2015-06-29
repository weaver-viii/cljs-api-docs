## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/all-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/all-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/all-ns)
</td>
</tr>
</table>

 <samp>
(__all-ns__)<br>
</samp>

---





Source code:

```clj
(defn all-ns []
  (keys (get @env/*compiler* ::ana/namespaces)))
```

 <pre>
clojurescript @ r2511
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:17-18](https://github.com/clojure/clojurescript/blob/r2511/src/clj/cljs/analyzer/api.clj#L17-L18)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/all-ns"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "all-ns",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_all-ns",
 :source {:code "(defn all-ns []\n  (keys (get @env/*compiler* ::ana/namespaces)))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [17 18]},
 :full-name "cljs.analyzer.api/all-ns",
 :clj-symbol "clojure.core/all-ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_all-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_all-ns.cljsdoc)
</pre>

