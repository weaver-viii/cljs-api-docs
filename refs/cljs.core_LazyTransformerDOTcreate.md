## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/LazyTransformer.create

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__LazyTransformer.create__ xform coll)<br>
</samp>

---





Source code:

```clj
(set! (.-create LazyTransformer)
  (fn [xform coll]
    (LazyTransformer. (stepper xform (iter coll)) nil nil nil)))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3548-3550](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L3548-L3550)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazyTransformer.create"]))
```

```clj
{:ns "cljs.core",
 :name "LazyTransformer.create",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2301"]],
 :parent-type "LazyTransformer",
 :type "function",
 :full-name-encode "cljs.core_LazyTransformerDOTcreate",
 :source {:code "(set! (.-create LazyTransformer)\n  (fn [xform coll]\n    (LazyTransformer. (stepper xform (iter coll)) nil nil nil)))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3548 3550]},
 :full-name "cljs.core/LazyTransformer.create"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_LazyTransformerDOTcreate.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_LazyTransformerDOTcreate.cljsdoc)
</pre>

