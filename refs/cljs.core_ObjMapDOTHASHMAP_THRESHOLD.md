## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ObjMap.HASHMAP_THRESHOLD

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! (.-HASHMAP_THRESHOLD ObjMap) 8)
```

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5011](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L5011)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ObjMap.HASHMAP_THRESHOLD"]))
```

```clj
{:ns "cljs.core",
 :name "ObjMap.HASHMAP_THRESHOLD",
 :type "var",
 :parent-type "ObjMap",
 :source {:code "(set! (.-HASHMAP_THRESHOLD ObjMap) 8)",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5011]},
 :full-name "cljs.core/ObjMap.HASHMAP_THRESHOLD",
 :full-name-encode "cljs.core_ObjMapDOTHASHMAP_THRESHOLD",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ObjMapDOTHASHMAP_THRESHOLD.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ObjMapDOTHASHMAP_THRESHOLD.cljsdoc)
</pre>

