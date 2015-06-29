## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/lazy-transformer

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__lazy-transformer__ stepper)<br>
</samp>

---





Source code:

```clj
(defn lazy-transformer [stepper]
  (LazyTransformer. stepper nil nil nil))
```

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3413-3414](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L3413-L3414)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/lazy-transformer"]))
```

```clj
{:ns "cljs.core",
 :name "lazy-transformer",
 :type "function",
 :signature ["[stepper]"],
 :source {:code "(defn lazy-transformer [stepper]\n  (LazyTransformer. stepper nil nil nil))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3413 3414]},
 :full-name "cljs.core/lazy-transformer",
 :full-name-encode "cljs.core_lazy-transformer",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_lazy-transformer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_lazy-transformer.cljsdoc)
</pre>

