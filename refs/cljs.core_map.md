## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map)
</td>
</tr>
</table>

 <samp>
(__map__ f)<br>
</samp>
 <samp>
(__map__ f coll)<br>
</samp>
 <samp>
(__map__ f c1 c2)<br>
</samp>
 <samp>
(__map__ f c1 c2 c3)<br>
</samp>
 <samp>
(__map__ f c1 c2 c3 & colls)<br>
</samp>

---

Returns a lazy sequence of applying function `f` to every element of `coll`.

When more than one collection is provided, returns a lazy sequence consisting of
the result of applying `f` to the set of first items of each `c`, followed by
applying `f` to the set of second items in each `c`, until any one of the `c`s
is exhausted. Any remaining items in other `c`s are ignored. Function `f` should
accept number-of-`c`s arguments.

Returns a transducer when no collection is provided.

---


See Also:

[`cljs.core/map-indexed`](cljs.core_map-indexed.md)<br>
[`cljs.core/amap`](cljs.core_amap.md)<br>
[`cljs.core/mapcat`](cljs.core_mapcat.md)<br>
[`cljs.core/keep`](cljs.core_keep.md)<br>
[`cljs.core/juxt`](cljs.core_juxt.md)<br>

---

Source docstring:

```
Returns a lazy sequence consisting of the result of applying f to
the set of first items of each coll, followed by applying f to the
set of second items in each coll, until any one of the colls is
exhausted.  Any remaining items in other colls are ignored. Function
f should accept number-of-colls arguments. Returns a transducer when
no collection is provided.
```

Source code:

```clj
(defn map
  ([f]
    (fn [rf]
      (fn
        ([] (rf))
        ([result] (rf result))
        ([result input]
           (rf result (f input)))
        ([result input & inputs]
           (rf result (apply f input inputs))))))
  ([f coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
              (chunk-append b (f (-nth c i))))
          (chunk-cons (chunk b) (map f (chunk-rest s))))
        (cons (f (first s)) (map f (rest s)))))))
  ([f c1 c2]
   (lazy-seq
    (let [s1 (seq c1) s2 (seq c2)]
      (when (and s1 s2)
        (cons (f (first s1) (first s2))
              (map f (rest s1) (rest s2)))))))
  ([f c1 c2 c3]
   (lazy-seq
    (let [s1 (seq c1) s2 (seq c2) s3 (seq c3)]
      (when (and  s1 s2 s3)
        (cons (f (first s1) (first s2) (first s3))
              (map f (rest s1) (rest s2) (rest s3)))))))
  ([f c1 c2 c3 & colls]
   (let [step (fn step [cs]
                 (lazy-seq
                  (let [ss (map seq cs)]
                    (when (every? identity ss)
                      (cons (map first ss) (step (map rest ss)))))))]
     (map #(apply f %) (step (conj colls c3 c2 c1))))))
```

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4020-4065](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L4020-L4065)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/map"]))
```

```clj
{:description "Returns a lazy sequence of applying function `f` to every element of `coll`.\n\nWhen more than one collection is provided, returns a lazy sequence consisting of\nthe result of applying `f` to the set of first items of each `c`, followed by\napplying `f` to the set of second items in each `c`, until any one of the `c`s\nis exhausted. Any remaining items in other `c`s are ignored. Function `f` should\naccept number-of-`c`s arguments.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "map",
 :signature ["[f]"
             "[f coll]"
             "[f c1 c2]"
             "[f c1 c2 c3]"
             "[f c1 c2 c3 & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map-indexed"
           "cljs.core/amap"
           "cljs.core/mapcat"
           "cljs.core/keep"
           "cljs.core/juxt"],
 :full-name-encode "cljs.core_map",
 :source {:code "(defn map\n  ([f]\n    (fn [rf]\n      (fn\n        ([] (rf))\n        ([result] (rf result))\n        ([result input]\n           (rf result (f input)))\n        ([result input & inputs]\n           (rf result (apply f input inputs))))))\n  ([f coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n              (chunk-append b (f (-nth c i))))\n          (chunk-cons (chunk b) (map f (chunk-rest s))))\n        (cons (f (first s)) (map f (rest s)))))))\n  ([f c1 c2]\n   (lazy-seq\n    (let [s1 (seq c1) s2 (seq c2)]\n      (when (and s1 s2)\n        (cons (f (first s1) (first s2))\n              (map f (rest s1) (rest s2)))))))\n  ([f c1 c2 c3]\n   (lazy-seq\n    (let [s1 (seq c1) s2 (seq c2) s3 (seq c3)]\n      (when (and  s1 s2 s3)\n        (cons (f (first s1) (first s2) (first s3))\n              (map f (rest s1) (rest s2) (rest s3)))))))\n  ([f c1 c2 c3 & colls]\n   (let [step (fn step [cs]\n                 (lazy-seq\n                  (let [ss (map seq cs)]\n                    (when (every? identity ss)\n                      (cons (map first ss) (step (map rest ss)))))))]\n     (map #(apply f %) (step (conj colls c3 c2 c1))))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4020 4065]},
 :full-name "cljs.core/map",
 :clj-symbol "clojure.core/map",
 :docstring "Returns a lazy sequence consisting of the result of applying f to\nthe set of first items of each coll, followed by applying f to the\nset of second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments. Returns a transducer when\nno collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_map.cljsdoc)
</pre>

