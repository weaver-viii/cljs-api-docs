## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partition-all

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-all</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-all)
</td>
</tr>
</table>

 <samp>
(__partition-all__ n)<br>
</samp>
 <samp>
(__partition-all__ n coll)<br>
</samp>
 <samp>
(__partition-all__ n step coll)<br>
</samp>

---

Returns a lazy sequence of lists like `partition`, but may include partitions
with fewer than `n` items at the end.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/partition`](cljs.core_partition.md)<br>
[`cljs.core/partition-by`](cljs.core_partition-by.md)<br>

---

Source docstring:

```
Returns a lazy sequence of lists like partition, but may include
partitions with fewer than n items at the end.
```

Source code:

```clj
(defn partition-all
  ([n coll]
     (partition-all n n coll))
  ([n step coll]
     (lazy-seq
      (when-let [s (seq coll)]
        (cons (take n s) (partition-all n step (drop step s)))))))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5869-5877](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L5869-L5877)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partition-all"]))
```

```clj
{:description "Returns a lazy sequence of lists like `partition`, but may include partitions\nwith fewer than `n` items at the end.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "partition-all",
 :signature ["[n]" "[n coll]" "[n step coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition" "cljs.core/partition-by"],
 :full-name-encode "cljs.core_partition-all",
 :source {:code "(defn partition-all\n  ([n coll]\n     (partition-all n n coll))\n  ([n step coll]\n     (lazy-seq\n      (when-let [s (seq coll)]\n        (cons (take n s) (partition-all n step (drop step s)))))))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5869 5877]},
 :full-name "cljs.core/partition-all",
 :clj-symbol "clojure.core/partition-all",
 :docstring "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_partition-all.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_partition-all.cljsdoc)
</pre>

