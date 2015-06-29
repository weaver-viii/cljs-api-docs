## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMapIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentArrayMapIterator.__ arr i cnt)<br>
</samp>

---





Source code:

```clj
(deftype PersistentArrayMapIterator [arr ^:mutable i cnt]
  Object
  (hasNext [_]
    (< i cnt))
  (next [_]
    (let [ret [(aget arr i) (aget arr (inc i))]]
      (set! i (+ i 2))
      ret)))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5222-5229](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L5222-L5229)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMapIterator"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMapIterator",
 :type "type",
 :signature ["[arr i cnt]"],
 :source {:code "(deftype PersistentArrayMapIterator [arr ^:mutable i cnt]\n  Object\n  (hasNext [_]\n    (< i cnt))\n  (next [_]\n    (let [ret [(aget arr i) (aget arr (inc i))]]\n      (set! i (+ i 2))\n      ret)))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5222 5229]},
 :full-name "cljs.core/PersistentArrayMapIterator",
 :full-name-encode "cljs.core_PersistentArrayMapIterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapIterator.cljsdoc)
</pre>

