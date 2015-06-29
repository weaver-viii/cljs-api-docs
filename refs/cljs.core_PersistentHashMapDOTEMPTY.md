## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashMap.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashMap.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentHashMap/EMPTY (PersistentHashMap. nil 0 nil false nil 0))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4241](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L4241)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashMap.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashMap",
 :type "var",
 :full-name-encode "cljs.core_PersistentHashMapDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentHashMap/EMPTY (PersistentHashMap. nil 0 nil false nil 0))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4241]},
 :full-name "cljs.core/PersistentHashMap.EMPTY",
 :clj-symbol "clojure.lang/PersistentHashMap.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashMapDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashMapDOTEMPTY.cljsdoc)
</pre>
