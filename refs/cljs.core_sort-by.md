## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sort-by

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort-by)
</td>
</tr>
</table>

 <samp>
(__sort-by__ keyfn coll)<br>
</samp>
 <samp>
(__sort-by__ keyfn comp coll)<br>
</samp>

---

Returns a sorted sequence of the items in `coll`, where the sort order is
determined by comparing `(keyfn item)`.

`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.

`comp` defaults to `compare`.

---


See Also:

[`cljs.core/sort`](cljs.core_sort.md)<br>
[`cljs.core/compare`](cljs.core_compare.md)<br>

---

Source docstring:

```
Returns a sorted sequence of the items in coll, where the sort
order is determined by comparing (keyfn item).  Comp can be
boolean-valued comparison funcion, or a -/0/+ valued comparator.
Comp defaults to compare.
```

Source code:

```clj
(defn sort-by
  ([keyfn coll]
   (sort-by keyfn compare coll))
  ([keyfn comp coll]
     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))
```

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1588-1596](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L1588-L1596)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sort-by"]))
```

```clj
{:description "Returns a sorted sequence of the items in `coll`, where the sort order is\ndetermined by comparing `(keyfn item)`.\n\n`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
 :ns "cljs.core",
 :name "sort-by",
 :signature ["[keyfn coll]" "[keyfn comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort" "cljs.core/compare"],
 :full-name-encode "cljs.core_sort-by",
 :source {:code "(defn sort-by\n  ([keyfn coll]\n   (sort-by keyfn compare coll))\n  ([keyfn comp coll]\n     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1588 1596]},
 :full-name "cljs.core/sort-by",
 :clj-symbol "clojure.core/sort-by",
 :docstring "Returns a sorted sequence of the items in coll, where the sort\norder is determined by comparing (keyfn item).  Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sort-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sort-by.cljsdoc)
</pre>

