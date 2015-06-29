## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/group-by

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/group-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/group-by)
</td>
</tr>
</table>

 <samp>
(__group-by__ f coll)<br>
</samp>

---

Returns a map of the elements of `coll` keyed by the result of running `f` on
each element.

The value at each key will be a vector of the corresponding elements in the
order they appeared in `coll`.

---


See Also:

[`cljs.core/partition-by`](cljs.core_partition-by.md)<br>
[`cljs.core/frequencies`](cljs.core_frequencies.md)<br>

---

Source docstring:

```
Returns a map of the elements of coll keyed by the result of
f on each element. The value at each key will be a vector of the
corresponding elements, in the order they appeared in coll.
```

Source code:

```clj
(defn group-by
  [f coll]
  (persistent!
    (reduce
      (fn [ret x]
        (let [k (f x)]
          (assoc! ret k (conj (get ret k []) x))))
      (transient {}) coll)))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9072-9082](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L9072-L9082)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/group-by"]))
```

```clj
{:description "Returns a map of the elements of `coll` keyed by the result of running `f` on\neach element.\n\nThe value at each key will be a vector of the corresponding elements in the\norder they appeared in `coll`.",
 :ns "cljs.core",
 :name "group-by",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition-by" "cljs.core/frequencies"],
 :full-name-encode "cljs.core_group-by",
 :source {:code "(defn group-by\n  [f coll]\n  (persistent!\n    (reduce\n      (fn [ret x]\n        (let [k (f x)]\n          (assoc! ret k (conj (get ret k []) x))))\n      (transient {}) coll)))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9072 9082]},
 :full-name "cljs.core/group-by",
 :clj-symbol "clojure.core/group-by",
 :docstring "Returns a map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_group-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_group-by.cljsdoc)
</pre>

