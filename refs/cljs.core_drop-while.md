## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop-while

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-while)
</td>
</tr>
</table>

 <samp>
(__drop-while__ pred)<br>
</samp>
 <samp>
(__drop-while__ pred coll)<br>
</samp>

---

Returns a lazy sequence of the items in `coll` starting from the first item for
which `(pred item)` returns logical false.

Returns a stateful transducer when no collection is provided.

---


See Also:

[`cljs.core/take-while`](cljs.core_take-while.md)<br>
[`cljs.core/split-with`](cljs.core_split-with.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the items in coll starting from the first
item for which (pred item) returns nil.
```

Source code:

```clj
(defn drop-while
  [pred coll]
  (let [step (fn [pred coll]
               (let [s (seq coll)]
                 (if (and s (pred (first s)))
                   (recur pred (rest s))
                   s)))]
    (lazy-seq (step pred coll))))
```

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2803-2812](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L2803-L2812)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/drop-while"]))
```

```clj
{:description "Returns a lazy sequence of the items in `coll` starting from the first item for\nwhich `(pred item)` returns logical false.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "drop-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/take-while" "cljs.core/split-with"],
 :full-name-encode "cljs.core_drop-while",
 :source {:code "(defn drop-while\n  [pred coll]\n  (let [step (fn [pred coll]\n               (let [s (seq coll)]\n                 (if (and s (pred (first s)))\n                   (recur pred (rest s))\n                   s)))]\n    (lazy-seq (step pred coll))))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2803 2812]},
 :full-name "cljs.core/drop-while",
 :clj-symbol "clojure.core/drop-while",
 :docstring "Returns a lazy sequence of the items in coll starting from the first\nitem for which (pred item) returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_drop-while.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_drop-while.cljsdoc)
</pre>

