## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentTreeSet.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentTreeSet.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentTreeSet.java)
</td>
</tr>
</table>






Source code:

```clj
(set! (.-EMPTY PersistentTreeSet)
  (PersistentTreeSet. nil (.-EMPTY PersistentTreeMap) empty-unordered-hash))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7575-7576](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L7575-L7576)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeSet.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentTreeSet.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentTreeSet",
 :type "var",
 :full-name-encode "cljs.core_PersistentTreeSetDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentTreeSet)\n  (PersistentTreeSet. nil (.-EMPTY PersistentTreeMap) empty-unordered-hash))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7575 7576]},
 :full-name "cljs.core/PersistentTreeSet.EMPTY",
 :clj-symbol "clojure.lang/PersistentTreeSet.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentTreeSetDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentTreeSetDOTEMPTY.cljsdoc)
</pre>

