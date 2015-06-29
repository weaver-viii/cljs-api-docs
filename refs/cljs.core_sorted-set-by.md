## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-set-by

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set-by)
</td>
</tr>
</table>

 <samp>
(__sorted-set-by__ comparator & keys)<br>
</samp>

---

Returns a new sorted set with supplied `keys`, using the supplied `comparator`.

---


See Also:

[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>
[`cljs.core/compare`](cljs.core_compare.md)<br>

---

Source docstring:

```
Returns a new sorted set with supplied keys, using the supplied comparator.
```

Source code:

```clj
(defn sorted-set-by
  ([comparator & keys]
   (reduce -conj
           (PersistentTreeSet. nil (sorted-map-by comparator) 0)
           keys)))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7608-7613](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L7608-L7613)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-set-by"]))
```

```clj
{:description "Returns a new sorted set with supplied `keys`, using the supplied `comparator`.",
 :ns "cljs.core",
 :name "sorted-set-by",
 :signature ["[comparator & keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-set"
           "cljs.core/sorted-map-by"
           "cljs.core/compare"],
 :full-name-encode "cljs.core_sorted-set-by",
 :source {:code "(defn sorted-set-by\n  ([comparator & keys]\n   (reduce -conj\n           (PersistentTreeSet. nil (sorted-map-by comparator) 0)\n           keys)))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7608 7613]},
 :full-name "cljs.core/sorted-set-by",
 :clj-symbol "clojure.core/sorted-set-by",
 :docstring "Returns a new sorted set with supplied keys, using the supplied comparator."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sorted-set-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sorted-set-by.cljsdoc)
</pre>

