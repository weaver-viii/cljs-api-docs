## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partition-by

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-by)
</td>
</tr>
</table>

 <samp>
(__partition-by__ f)<br>
</samp>
 <samp>
(__partition-by__ f coll)<br>
</samp>

---

Applies `f` to each value in `coll`, splitting it each time `f` returns a new
value. Returns a lazy sequence of partitions.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/partition`](cljs.core_partition.md)<br>
[`cljs.core/partition-all`](cljs.core_partition-all.md)<br>
[`cljs.core/group-by`](cljs.core_group-by.md)<br>

---

Source docstring:

```
Applies f to each value in coll, splitting it each time f returns
a new value.  Returns a lazy seq of partitions.
```

Source code:

```clj
(defn partition-by
  [f coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (let [fst (first s)
           fv (f fst)
           run (cons fst (take-while #(= fv (f %)) (next s)))]
       (cons run (partition-by f (seq (drop (count run) s))))))))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6823-6832](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L6823-L6832)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partition-by"]))
```

```clj
{:description "Applies `f` to each value in `coll`, splitting it each time `f` returns a new\nvalue. Returns a lazy sequence of partitions.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "partition-by",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition"
           "cljs.core/partition-all"
           "cljs.core/group-by"],
 :full-name-encode "cljs.core_partition-by",
 :source {:code "(defn partition-by\n  [f coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (let [fst (first s)\n           fv (f fst)\n           run (cons fst (take-while #(= fv (f %)) (next s)))]\n       (cons run (partition-by f (seq (drop (count run) s))))))))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6823 6832]},
 :full-name "cljs.core/partition-by",
 :clj-symbol "clojure.core/partition-by",
 :docstring "Applies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of partitions."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_partition-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_partition-by.cljsdoc)
</pre>

