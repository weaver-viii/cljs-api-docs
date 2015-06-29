## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sort

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort)
</td>
</tr>
</table>

 <samp>
(__sort__ coll)<br>
</samp>
 <samp>
(__sort__ comp coll)<br>
</samp>

---

Returns a sorted sequence of the items in `coll`.

`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.

`comp` defaults to `compare`.

---


See Also:

[`cljs.core/sort-by`](cljs.core_sort-by.md)<br>

---

Source docstring:

```
Returns a sorted sequence of the items in coll. Comp can be
boolean-valued comparison funcion, or a -/0/+ valued comparator.
Comp defaults to compare.
```

Source code:

```clj
(defn sort
  ([coll]
   (sort compare coll))
  ([comp coll]
   (if (seq coll)
     (let [a (to-array coll)]
       ;; matching Clojure's stable sort, though docs don't promise it
       (garray/stableSort a (fn->comparator comp))
       (seq a))
     ())))
```

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1281-1293](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L1281-L1293)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sort"]))
```

```clj
{:description "Returns a sorted sequence of the items in `coll`.\n\n`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
 :ns "cljs.core",
 :name "sort",
 :signature ["[coll]" "[comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort-by"],
 :full-name-encode "cljs.core_sort",
 :source {:code "(defn sort\n  ([coll]\n   (sort compare coll))\n  ([comp coll]\n   (if (seq coll)\n     (let [a (to-array coll)]\n       ;; matching Clojure's stable sort, though docs don't promise it\n       (garray/stableSort a (fn->comparator comp))\n       (seq a))\n     ())))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1281 1293]},
 :full-name "cljs.core/sort",
 :clj-symbol "clojure.core/sort",
 :docstring "Returns a sorted sequence of the items in coll. Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sort.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sort.cljsdoc)
</pre>

