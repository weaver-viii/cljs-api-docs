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
    :else (seq-iter coll)))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2940-2945](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L2940-L2945)</ins>
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
 :source {:code "(defn iter [coll]\n  (cond\n    (nil? coll) (nil-iter)\n    (string? coll) (string-iter coll)\n    (array? coll) (array-iter coll)\n    :else (seq-iter coll)))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2940 2945]},
 :full-name "cljs.core/iter",
 :full-name-encode "cljs.core_iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_iter.cljsdoc)
</pre>

