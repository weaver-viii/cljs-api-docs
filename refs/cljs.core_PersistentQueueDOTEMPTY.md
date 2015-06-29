## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentQueue.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentQueue.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentQueue.java)
</td>
</tr>
</table>






Source code:

```clj
(set! (.-EMPTY PersistentQueue) (PersistentQueue. nil 0 nil [] empty-ordered-hash))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5277](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L5277)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueue.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentQueue.EMPTY",
 :history [["+" "0.0-927"]],
 :parent-type "PersistentQueue",
 :type "var",
 :full-name-encode "cljs.core_PersistentQueueDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentQueue) (PersistentQueue. nil 0 nil [] empty-ordered-hash))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5277]},
 :full-name "cljs.core/PersistentQueue.EMPTY",
 :clj-symbol "clojure.lang/PersistentQueue.EMPTY"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentQueueDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentQueueDOTEMPTY.cljsdoc)
</pre>

