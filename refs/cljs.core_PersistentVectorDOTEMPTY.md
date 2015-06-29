## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentVector.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentVector.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentVector.EMPTY
  (PersistentVector. nil 0 5 cljs.core.PersistentVector.EMPTY_NODE (array) 0))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3412-3413](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/cljs/core.cljs#L3412-L3413)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY",
 :history [["+" "0.0-1006"]],
 :parent-type "PersistentVector",
 :type "var",
 :full-name-encode "cljs.core_PersistentVectorDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentVector.EMPTY\n  (PersistentVector. nil 0 5 cljs.core.PersistentVector.EMPTY_NODE (array) 0))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3412 3413]},
 :full-name "cljs.core/PersistentVector.EMPTY",
 :clj-symbol "clojure.lang/PersistentVector.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTEMPTY.cljsdoc)
</pre>

