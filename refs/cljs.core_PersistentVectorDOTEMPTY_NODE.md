## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/PersistentVector.EMPTY_NODE~~

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[×] 0.0-2301" src="https://img.shields.io/badge/×-0.0--2301-red.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3667](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L3667)</ins>
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
 :history [["+" "0.0-1006"] ["-" "0.0-2301"]],
 :parent-type "PersistentVector",
 :type "var",
 :full-name-encode "cljs.core_PersistentVectorDOTEMPTY_NODE",
 :source {:code "(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3667]},
 :full-name "cljs.core/PersistentVector.EMPTY_NODE",
 :removed {:in "0.0-2301", :last-seen "0.0-2280"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTEMPTY_NODE.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTEMPTY_NODE.cljsdoc)
</pre>

