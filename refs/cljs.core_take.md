## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take)
</td>
</tr>
</table>

 <samp>
(__take__ n)<br>
</samp>
 <samp>
(__take__ n coll)<br>
</samp>

---

Returns a lazy sequence of the first `n` items in `coll`. Returns all the items
if there are fewer than `n`.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/drop`](cljs.core_drop.md)<br>
[`cljs.core/take-while`](cljs.core_take-while.md)<br>
[`cljs.core/take-last`](cljs.core_take-last.md)<br>
[`cljs.core/take-nth`](cljs.core_take-nth.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the first n items in coll, or all items if
there are fewer than n.  Returns a stateful transducer when
no collection is provided.
```

Source code:

```clj
(defn take
  ([n]
     (fn [rf]
       (let [na (volatile! n)]
         (fn
           ([] (rf))
           ([result] (rf result))
           ([result input]
              (let [n @na
                    nn (vswap! na dec)
                    result (if (pos? n)
                             (rf result input)
                             result)]
                (if (not (pos? nn))
                  (ensure-reduced result)
                  result)))))))
  ([n coll]
     (lazy-seq
       (when (pos? n)
         (when-let [s (seq coll)]
           (cons (first s) (take (dec n) (rest s))))))))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3779-3802](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L3779-L3802)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take"]))
```

```clj
{:description "Returns a lazy sequence of the first `n` items in `coll`. Returns all the items\nif there are fewer than `n`.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "take",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/drop"
           "cljs.core/take-while"
           "cljs.core/take-last"
           "cljs.core/take-nth"],
 :full-name-encode "cljs.core_take",
 :source {:code "(defn take\n  ([n]\n     (fn [rf]\n       (let [na (volatile! n)]\n         (fn\n           ([] (rf))\n           ([result] (rf result))\n           ([result input]\n              (let [n @na\n                    nn (vswap! na dec)\n                    result (if (pos? n)\n                             (rf result input)\n                             result)]\n                (if (not (pos? nn))\n                  (ensure-reduced result)\n                  result)))))))\n  ([n coll]\n     (lazy-seq\n       (when (pos? n)\n         (when-let [s (seq coll)]\n           (cons (first s) (take (dec n) (rest s))))))))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3779 3802]},
 :full-name "cljs.core/take",
 :clj-symbol "clojure.core/take",
 :docstring "Returns a lazy sequence of the first n items in coll, or all items if\nthere are fewer than n.  Returns a stateful transducer when\nno collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_take.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_take.cljsdoc)
</pre>

