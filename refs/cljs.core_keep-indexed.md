## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keep-indexed

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keep-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keep-indexed)
</td>
</tr>
</table>

 <samp>
(__keep-indexed__ f)<br>
</samp>
 <samp>
(__keep-indexed__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this
means false return values will be included.

`f` must be free of side-effects.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/map-indexed`](cljs.core_map-indexed.md)<br>
[`cljs.core/keep`](cljs.core_keep.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the non-nil results of (f index item). Note,
this means false return values will be included.  f must be free of
side-effects.
```

Source code:

```clj
(defn keep-indexed
  ([f coll]
     (let [keepi (fn kpi [idx coll]
                   (lazy-seq
                    (when-let [s (seq coll)]
                      (let [x (f idx (first s))]
                        (if (nil? x)
                          (kpi (inc idx) (rest s))
                          (cons x (kpi (inc idx) (rest s))))))))]
       (keepi 0 coll))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1969-1981](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1969-L1981)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keep-indexed"]))
```

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this\nmeans false return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "keep-indexed",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map-indexed" "cljs.core/keep"],
 :full-name-encode "cljs.core_keep-indexed",
 :source {:code "(defn keep-indexed\n  ([f coll]\n     (let [keepi (fn kpi [idx coll]\n                   (lazy-seq\n                    (when-let [s (seq coll)]\n                      (let [x (f idx (first s))]\n                        (if (nil? x)\n                          (kpi (inc idx) (rest s))\n                          (cons x (kpi (inc idx) (rest s))))))))]\n       (keepi 0 coll))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1969 1981]},
 :full-name "cljs.core/keep-indexed",
 :clj-symbol "clojure.core/keep-indexed",
 :docstring "Returns a lazy sequence of the non-nil results of (f index item). Note,\nthis means false return values will be included.  f must be free of\nside-effects."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keep-indexed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keep-indexed.cljsdoc)
</pre>

