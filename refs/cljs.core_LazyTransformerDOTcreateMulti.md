## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/LazyTransformer.createMulti

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__LazyTransformer.createMulti__ xform colls)<br>
</samp>

---





Source code:

```clj
(set! (.-createMulti LazyTransformer)
  (fn [xform colls]
    (let [iters (array)]
      (doseq [coll colls]
        (.push iters (iter coll)))
      (LazyTransformer.
        (multi-stepper xform iters (make-array (alength iters)))
        nil nil nil))))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3552-3559](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L3552-L3559)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazyTransformer.createMulti"]))
```

```clj
{:ns "cljs.core",
 :name "LazyTransformer.createMulti",
 :signature ["[xform colls]"],
 :history [["+" "0.0-2301"]],
 :parent-type "LazyTransformer",
 :type "function",
 :full-name-encode "cljs.core_LazyTransformerDOTcreateMulti",
 :source {:code "(set! (.-createMulti LazyTransformer)\n  (fn [xform colls]\n    (let [iters (array)]\n      (doseq [coll colls]\n        (.push iters (iter coll)))\n      (LazyTransformer.\n        (multi-stepper xform iters (make-array (alength iters)))\n        nil nil nil))))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3552 3559]},
 :full-name "cljs.core/LazyTransformer.createMulti"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_LazyTransformerDOTcreateMulti.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_LazyTransformerDOTcreateMulti.cljsdoc)
</pre>

