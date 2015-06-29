## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Vector.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.Vector/EMPTY (Vector. nil (array) 0))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2432](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2432)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Vector.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "Vector.EMPTY",
 :type "var",
 :parent-type "Vector",
 :source {:code "(set! cljs.core.Vector/EMPTY (Vector. nil (array) 0))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2432]},
 :full-name "cljs.core/Vector.EMPTY",
 :full-name-encode "cljs.core_VectorDOTEMPTY",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_VectorDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_VectorDOTEMPTY.cljsdoc)
</pre>
