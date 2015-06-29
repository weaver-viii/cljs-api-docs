## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashSet.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashSet.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentHashSet.EMPTY
  (PersistentHashSet. nil cljs.core.PersistentArrayMap.EMPTY 0))
```

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6111-6112](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L6111-L6112)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashSet.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashSet",
 :type "var",
 :full-name-encode "cljs.core_PersistentHashSetDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentHashSet.EMPTY\n  (PersistentHashSet. nil cljs.core.PersistentArrayMap.EMPTY 0))",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6111 6112]},
 :full-name "cljs.core/PersistentHashSet.EMPTY",
 :clj-symbol "clojure.lang/PersistentHashSet.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashSetDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashSetDOTEMPTY.cljsdoc)
</pre>

