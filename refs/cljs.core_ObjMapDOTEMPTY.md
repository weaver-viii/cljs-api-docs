## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ObjMap.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! (.-EMPTY ObjMap) (ObjMap. nil (array) (js-obj) 0 empty-unordered-hash))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5474](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L5474)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ObjMap.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "ObjMap.EMPTY",
 :type "var",
 :parent-type "ObjMap",
 :source {:code "(set! (.-EMPTY ObjMap) (ObjMap. nil (array) (js-obj) 0 empty-unordered-hash))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5474]},
 :full-name "cljs.core/ObjMap.EMPTY",
 :full-name-encode "cljs.core_ObjMapDOTEMPTY",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ObjMapDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ObjMapDOTEMPTY.cljsdoc)
</pre>

