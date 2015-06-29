## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.HASHMAP-THRESHOLD

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! (.-HASHMAP-THRESHOLD PersistentArrayMap) 8)
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5792](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L5792)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.HASHMAP-THRESHOLD"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.HASHMAP-THRESHOLD",
 :type "var",
 :parent-type "PersistentArrayMap",
 :source {:code "(set! (.-HASHMAP-THRESHOLD PersistentArrayMap) 8)",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5792]},
 :full-name "cljs.core/PersistentArrayMap.HASHMAP-THRESHOLD",
 :full-name-encode "cljs.core_PersistentArrayMapDOTHASHMAP-THRESHOLD",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTHASHMAP-THRESHOLD.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTHASHMAP-THRESHOLD.cljsdoc)
</pre>

