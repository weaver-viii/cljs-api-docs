## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop)
</td>
</tr>
</table>

 <samp>
(__drop__ n)<br>
</samp>
 <samp>
(__drop__ n coll)<br>
</samp>

---

Returns a lazy sequence of all but the first `n` items in `coll`.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/take`](cljs.core_take.md)<br>
[`cljs.core/drop-last`](cljs.core_drop-last.md)<br>
[`cljs.core/drop-while`](cljs.core_drop-while.md)<br>
[`cljs.core/nthnext`](cljs.core_nthnext.md)<br>
[`cljs.core/nthrest`](cljs.core_nthrest.md)<br>

---

Source docstring:

```
Returns a lazy sequence of all but the first n items in coll.
Returns a stateful transducer when no collection is provided.
```

Source code:

```clj
(defn drop
  ([n]
     (fn [rf]
       (let [na (volatile! n)]
         (fn
           ([] (rf))
           ([result] (rf result))
           ([result input]
              (let [n @na]
                (vswap! na dec)
                (if (pos? n)
                  result
                  (rf result input))))))))
  ([n coll]
     (let [step (fn [n coll]
                  (let [s (seq coll)]
                    (if (and (pos? n) s)
                      (recur (dec n) (rest s))
                      s)))]
       (lazy-seq (step n coll)))))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4092-4113](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L4092-L4113)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/drop"]))
```

```clj
{:description "Returns a lazy sequence of all but the first `n` items in `coll`.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "drop",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/take"
           "cljs.core/drop-last"
           "cljs.core/drop-while"
           "cljs.core/nthnext"
           "cljs.core/nthrest"],
 :full-name-encode "cljs.core_drop",
 :source {:code "(defn drop\n  ([n]\n     (fn [rf]\n       (let [na (volatile! n)]\n         (fn\n           ([] (rf))\n           ([result] (rf result))\n           ([result input]\n              (let [n @na]\n                (vswap! na dec)\n                (if (pos? n)\n                  result\n                  (rf result input))))))))\n  ([n coll]\n     (let [step (fn [n coll]\n                  (let [s (seq coll)]\n                    (if (and (pos? n) s)\n                      (recur (dec n) (rest s))\n                      s)))]\n       (lazy-seq (step n coll)))))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4092 4113]},
 :full-name "cljs.core/drop",
 :clj-symbol "clojure.core/drop",
 :docstring "Returns a lazy sequence of all but the first n items in coll.\nReturns a stateful transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_drop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_drop.cljsdoc)
</pre>

