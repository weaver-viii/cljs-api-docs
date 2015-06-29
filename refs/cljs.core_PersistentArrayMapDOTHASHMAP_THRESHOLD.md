## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.HASHMAP_THRESHOLD

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD 16)
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3436](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L3436)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.HASHMAP_THRESHOLD"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.HASHMAP_THRESHOLD",
 :type "var",
 :parent-type "PersistentArrayMap",
 :source {:code "(set! cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD 16)",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3436]},
 :full-name "cljs.core/PersistentArrayMap.HASHMAP_THRESHOLD",
 :full-name-encode "cljs.core_PersistentArrayMapDOTHASHMAP_THRESHOLD",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTHASHMAP_THRESHOLD.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTHASHMAP_THRESHOLD.cljsdoc)
</pre>

