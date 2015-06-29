## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/List.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentList.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentList.java)
</td>
</tr>
</table>






Source code:

```clj
(set! (.-EMPTY List) (EmptyList. nil))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2230](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L2230)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/List.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "List.EMPTY",
 :history [["+" "0.0-927"]],
 :parent-type "List",
 :type "var",
 :full-name-encode "cljs.core_ListDOTEMPTY",
 :source {:code "(set! (.-EMPTY List) (EmptyList. nil))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2230]},
 :full-name "cljs.core/List.EMPTY",
 :clj-symbol "clojure.lang/PersistentList.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ListDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ListDOTEMPTY.cljsdoc)
</pre>

