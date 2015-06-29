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
(set! (.-EMPTY PersistentVector)
  (PersistentVector. nil 0 5 (.-EMPTY-NODE PersistentVector) (array) empty-ordered-hash))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4765-4766](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L4765-L4766)</ins>
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
 :source {:code "(set! (.-EMPTY PersistentVector)\n  (PersistentVector. nil 0 5 (.-EMPTY-NODE PersistentVector) (array) empty-ordered-hash))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4765 4766]},
 :full-name "cljs.core/PersistentVector.EMPTY",
 :clj-symbol "clojure.lang/PersistentVector.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTEMPTY.cljsdoc)
</pre>

