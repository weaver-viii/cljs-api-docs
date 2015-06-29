## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map-indexed

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map-indexed)
</td>
</tr>
</table>

 <samp>
(__map-indexed__ f coll)<br>
</samp>

---

Returns a lazy sequence consisting of the result of applying `f` to 0 and the
first item of `coll`, followed by applying `f` to 1 and the second item in
`coll`, etc, until `coll` is exhausted.

Function `f` should accept 2 arguments, index and item.

---


See Also:

[`cljs.core/map`](cljs.core_map.md)<br>
[`cljs.core/keep-indexed`](cljs.core_keep-indexed.md)<br>

---

Source docstring:

```
Returns a lazy sequence consisting of the result of applying f to 0
and the first item of coll, followed by applying f to 1 and the second
item in coll, etc, until coll is exhausted. Thus function f should
accept 2 arguments, index and item.
```

Source code:

```clj
(defn map-indexed
  ([f]
    (fn [rf]
      (let [i (volatile! -1)]
        (fn
          ([] (rf))
          ([result] (rf result))
          ([result input]
            (rf result (f (vswap! i inc) input)))))))
  ([f coll]
    (letfn [(mapi [idx coll]
              (lazy-seq
                (when-let [s (seq coll)]
                  (if (chunked-seq? s)
                    (let [c (chunk-first s)
                          size (count c)
                          b (chunk-buffer size)]
                      (dotimes [i size]
                        (chunk-append b (f (+ idx i) (-nth c i))))
                      (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))
                    (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]
      (mapi 0 coll))))
```

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3714-3739](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L3714-L3739)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/map-indexed"]))
```

```clj
{:description "Returns a lazy sequence consisting of the result of applying `f` to 0 and the\nfirst item of `coll`, followed by applying `f` to 1 and the second item in\n`coll`, etc, until `coll` is exhausted.\n\nFunction `f` should accept 2 arguments, index and item.",
 :ns "cljs.core",
 :name "map-indexed",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map" "cljs.core/keep-indexed"],
 :full-name-encode "cljs.core_map-indexed",
 :source {:code "(defn map-indexed\n  ([f]\n    (fn [rf]\n      (let [i (volatile! -1)]\n        (fn\n          ([] (rf))\n          ([result] (rf result))\n          ([result input]\n            (rf result (f (vswap! i inc) input)))))))\n  ([f coll]\n    (letfn [(mapi [idx coll]\n              (lazy-seq\n                (when-let [s (seq coll)]\n                  (if (chunked-seq? s)\n                    (let [c (chunk-first s)\n                          size (count c)\n                          b (chunk-buffer size)]\n                      (dotimes [i size]\n                        (chunk-append b (f (+ idx i) (-nth c i))))\n                      (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))\n                    (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]\n      (mapi 0 coll))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3714 3739]},
 :full-name "cljs.core/map-indexed",
 :clj-symbol "clojure.core/map-indexed",
 :docstring "Returns a lazy sequence consisting of the result of applying f to 0\nand the first item of coll, followed by applying f to 1 and the second\nitem in coll, etc, until coll is exhausted. Thus function f should\naccept 2 arguments, index and item."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_map-indexed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_map-indexed.cljsdoc)
</pre>

