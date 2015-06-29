## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentTreeMap.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentTreeMap.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentTreeMap.java)
</td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.PersistentTreeMap.EMPTY (PersistentTreeMap. compare nil 0 nil 0))
```

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5832](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L5832)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeMap.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentTreeMap.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentTreeMap",
 :type "var",
 :full-name-encode "cljs.core_PersistentTreeMapDOTEMPTY",
 :source {:code "(set! cljs.core.PersistentTreeMap.EMPTY (PersistentTreeMap. compare nil 0 nil 0))",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5832]},
 :full-name "cljs.core/PersistentTreeMap.EMPTY",
 :clj-symbol "clojure.lang/PersistentTreeMap.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentTreeMapDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentTreeMapDOTEMPTY.cljsdoc)
</pre>

