## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take-while

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-while)
</td>
</tr>
</table>

 <samp>
(__take-while__ pred)<br>
</samp>
 <samp>
(__take-while__ pred coll)<br>
</samp>

---

Returns a lazy sequence of successive items from `coll` while `(pred item)`
returns true. `pred` must be free of side-effects.

Returns a transducer when no collection is provided.

---


See Also:

[`cljs.core/drop-while`](cljs.core_drop-while.md)<br>
[`cljs.core/split-with`](cljs.core_split-with.md)<br>

---

Source docstring:

```
Returns a lazy sequence of successive items from coll while
(pred item) returns true. pred must be free of side-effects.
Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn take-while
  ([pred]
     (fn [rf]
       (fn
         ([] (rf))
         ([result] (rf result))
         ([result input]
            (if (pred input)
              (rf result input)
              (reduced result))))))
  ([pred coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (when (pred (first s))
           (cons (first s) (take-while pred (rest s))))))))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8047-8064](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L8047-L8064)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-while"]))
```

```clj
{:description "Returns a lazy sequence of successive items from `coll` while `(pred item)`\nreturns true. `pred` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "take-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/drop-while" "cljs.core/split-with"],
 :full-name-encode "cljs.core_take-while",
 :source {:code "(defn take-while\n  ([pred]\n     (fn [rf]\n       (fn\n         ([] (rf))\n         ([result] (rf result))\n         ([result input]\n            (if (pred input)\n              (rf result input)\n              (reduced result))))))\n  ([pred coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (when (pred (first s))\n           (cons (first s) (take-while pred (rest s))))))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8047 8064]},
 :full-name "cljs.core/take-while",
 :clj-symbol "clojure.core/take-while",
 :docstring "Returns a lazy sequence of successive items from coll while\n(pred item) returns true. pred must be free of side-effects.\nReturns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_take-while.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_take-while.cljsdoc)
</pre>

