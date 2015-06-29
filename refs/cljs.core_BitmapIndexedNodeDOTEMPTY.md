## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/BitmapIndexedNode.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/BitmapIndexedNode.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.BitmapIndexedNode/EMPTY (BitmapIndexedNode. nil 0 (make-array 0)))
```

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4232](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L4232)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/BitmapIndexedNode.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "BitmapIndexedNode.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "BitmapIndexedNode",
 :type "var",
 :full-name-encode "cljs.core_BitmapIndexedNodeDOTEMPTY",
 :source {:code "(set! cljs.core.BitmapIndexedNode/EMPTY (BitmapIndexedNode. nil 0 (make-array 0)))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4232]},
 :full-name "cljs.core/BitmapIndexedNode.EMPTY",
 :clj-symbol "clojure.lang/BitmapIndexedNode.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_BitmapIndexedNodeDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_BitmapIndexedNodeDOTEMPTY.cljsdoc)
</pre>

