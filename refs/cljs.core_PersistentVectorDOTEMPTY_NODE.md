## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector.EMPTY_NODE

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3318](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L3318)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY_NODE"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY_NODE",
 :type "var",
 :parent-type "PersistentVector",
 :source {:code "(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3318]},
 :full-name "cljs.core/PersistentVector.EMPTY_NODE",
 :full-name-encode "cljs.core_PersistentVectorDOTEMPTY_NODE",
 :history [["+" "0.0-1006"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTEMPTY_NODE.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTEMPTY_NODE.cljsdoc)
</pre>

