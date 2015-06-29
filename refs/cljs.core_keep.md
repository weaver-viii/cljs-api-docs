## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keep

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keep</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keep)
</td>
</tr>
</table>

 <samp>
(__keep__ f)<br>
</samp>
 <samp>
(__keep__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.

---


See Also:

[`cljs.core/keep-indexed`](cljs.core_keep-indexed.md)<br>
[`cljs.core/map`](cljs.core_map.md)<br>
[`cljs.core/filter`](cljs.core_filter.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the non-nil results of (f item). Note,
this means false return values will be included.  f must be free of
side-effects.  Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn keep
  ([f]
   (fn [rf]
     (fn
       ([] (rf))
       ([result] (rf result))
       ([result input]
          (let [v (f input)]
            (if (nil? v)
              result
              (rf result v)))))))
  ([f coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
            (let [x (f (-nth c i))]
              (when-not (nil? x)
                (chunk-append b x))))
          (chunk-cons (chunk b) (keep f (chunk-rest s))))
        (let [x (f (first s))]
          (if (nil? x)
            (keep f (rest s))
            (cons x (keep f (rest s))))))))))
```

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3370-3399](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L3370-L3399)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keep"]))
```

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means\nfalse return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "keep",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keep-indexed"
           "cljs.core/map"
           "cljs.core/filter"],
 :full-name-encode "cljs.core_keep",
 :source {:code "(defn keep\n  ([f]\n   (fn [rf]\n     (fn\n       ([] (rf))\n       ([result] (rf result))\n       ([result input]\n          (let [v (f input)]\n            (if (nil? v)\n              result\n              (rf result v)))))))\n  ([f coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n            (let [x (f (-nth c i))]\n              (when-not (nil? x)\n                (chunk-append b x))))\n          (chunk-cons (chunk b) (keep f (chunk-rest s))))\n        (let [x (f (first s))]\n          (if (nil? x)\n            (keep f (rest s))\n            (cons x (keep f (rest s))))))))))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3370 3399]},
 :full-name "cljs.core/keep",
 :clj-symbol "clojure.core/keep",
 :docstring "Returns a lazy sequence of the non-nil results of (f item). Note,\nthis means false return values will be included.  f must be free of\nside-effects.  Returns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keep.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keep.cljsdoc)
</pre>

