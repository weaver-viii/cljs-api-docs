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
Applies f to each value in coll, splitting it each time f returns a
new value.  Returns a lazy seq of partitions.  Returns a stateful
transducer when no collection is provided.
```

Source code:

```clj
(defn partition-by
  ([f]
     (fn [rf]
       (let [a (array-list)
             pa (volatile! ::none)]
         (fn
           ([] (rf))
           ([result]
              (let [result (if (.isEmpty a)
                             result
                             (let [v (vec (.toArray a))]
                               ;;clear first!
                               (.clear a)
                               (unreduced (rf result v))))]
                (rf result)))
           ([result input]
              (let [pval @pa
                    val (f input)]
                (vreset! pa val)
                (if (or (keyword-identical? pval ::none)
                        (= val pval))
                  (do
                    (.add a input)
                    result)
                  (let [v (vec (.toArray a))]
                    (.clear a)
                    (let [ret (rf result v)]
                      (when-not (reduced? ret)
                        (.add a input))
                      ret)))))))))
  ([f coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (let [fst (first s)
               fv (f fst)
               run (cons fst (take-while #(= fv (f %)) (next s)))]
           (cons run (partition-by f (seq (drop (count run) s)))))))))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7808-7847](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L7808-L7847)</ins>
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
 :source {:code "(defn partition-by\n  ([f]\n     (fn [rf]\n       (let [a (array-list)\n             pa (volatile! ::none)]\n         (fn\n           ([] (rf))\n           ([result]\n              (let [result (if (.isEmpty a)\n                             result\n                             (let [v (vec (.toArray a))]\n                               ;;clear first!\n                               (.clear a)\n                               (unreduced (rf result v))))]\n                (rf result)))\n           ([result input]\n              (let [pval @pa\n                    val (f input)]\n                (vreset! pa val)\n                (if (or (keyword-identical? pval ::none)\n                        (= val pval))\n                  (do\n                    (.add a input)\n                    result)\n                  (let [v (vec (.toArray a))]\n                    (.clear a)\n                    (let [ret (rf result v)]\n                      (when-not (reduced? ret)\n                        (.add a input))\n                      ret)))))))))\n  ([f coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (let [fst (first s)\n               fv (f fst)\n               run (cons fst (take-while #(= fv (f %)) (next s)))]\n           (cons run (partition-by f (seq (drop (count run) s)))))))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7808 7847]},
 :full-name "cljs.core/partition-by",
 :clj-symbol "clojure.core/partition-by",
 :docstring "Applies f to each value in coll, splitting it each time f returns a\nnew value.  Returns a lazy seq of partitions.  Returns a stateful\ntransducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_partition-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_partition-by.cljsdoc)
</pre>

