## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector.EMPTY-NODE

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! (.-EMPTY-NODE PersistentVector) (VectorNode. nil (make-array 32)))
```

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4454](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L4454)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY-NODE"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY-NODE",
 :type "var",
 :parent-type "PersistentVector",
 :source {:code "(set! (.-EMPTY-NODE PersistentVector) (VectorNode. nil (make-array 32)))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4454]},
 :full-name "cljs.core/PersistentVector.EMPTY-NODE",
 :full-name-encode "cljs.core_PersistentVectorDOTEMPTY-NODE",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTEMPTY-NODE.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTEMPTY-NODE.cljsdoc)
</pre>

