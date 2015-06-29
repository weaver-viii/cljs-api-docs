## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/iter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__iter__ coll)<br>
</samp>

---





Source code:

```clj
(defn iter [coll]
  (cond
    (nil? coll) (nil-iter)
    (string? coll) (string-iter coll)
    (array? coll) (array-iter coll)
    :else (seq-iter (seq coll))))
```

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2913-2918](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L2913-L2918)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iter"]))
```

```clj
{:ns "cljs.core",
 :name "iter",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn iter [coll]\n  (cond\n    (nil? coll) (nil-iter)\n    (string? coll) (string-iter coll)\n    (array? coll) (array-iter coll)\n    :else (seq-iter (seq coll))))",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2913 2918]},
 :full-name "cljs.core/iter",
 :full-name-encode "cljs.core_iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iter.cljsdoc)
</pre>

