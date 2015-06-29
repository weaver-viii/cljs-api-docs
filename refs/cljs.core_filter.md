## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/filter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filter</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filter)
</td>
</tr>
</table>

 <samp>
(__filter__ f)<br>
</samp>
 <samp>
(__filter__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.

---


See Also:

[`cljs.core/remove`](cljs.core_remove.md)<br>
[`cljs.core/keep`](cljs.core_keep.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn filter
  ([pred]
    (fn [rf]
      (fn
        ([] (rf))
        ([result] (rf result))
        ([result input]
           (if (pred input)
             (rf result input)
             result)))))
  ([pred coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
              (when (pred (-nth c i))
                (chunk-append b (-nth c i))))
          (chunk-cons (chunk b) (filter pred (chunk-rest s))))
        (let [f (first s) r (rest s)]
          (if (pred f)
            (cons f (filter pred r))
            (filter pred r))))))))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4049-4076](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L4049-L4076)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/filter"]))
```

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means\nfalse return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "filter",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/remove" "cljs.core/keep"],
 :full-name-encode "cljs.core_filter",
 :source {:code "(defn filter\n  ([pred]\n    (fn [rf]\n      (fn\n        ([] (rf))\n        ([result] (rf result))\n        ([result input]\n           (if (pred input)\n             (rf result input)\n             result)))))\n  ([pred coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n              (when (pred (-nth c i))\n                (chunk-append b (-nth c i))))\n          (chunk-cons (chunk b) (filter pred (chunk-rest s))))\n        (let [f (first s) r (rest s)]\n          (if (pred f)\n            (cons f (filter pred r))\n            (filter pred r))))))))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4049 4076]},
 :full-name "cljs.core/filter",
 :clj-symbol "clojure.core/filter",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns true. pred must be free of side-effects.\nReturns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_filter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_filter.cljsdoc)
</pre>

