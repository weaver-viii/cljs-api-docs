## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentArrayMap.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentArrayMap.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentArrayMap.EMPTY (PersistentArrayMap. nil 0 (array) nil))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4409](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L4409)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentArrayMap",
 :type "var",
 :full-name-encode "cljs.core_PersistentArrayMapDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentArrayMap.EMPTY (PersistentArrayMap. nil 0 (array) nil))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4409]},
 :full-name "cljs.core/PersistentArrayMap.EMPTY",
 :clj-symbol "clojure.lang/PersistentArrayMap.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTEMPTY.cljsdoc)
</pre>

