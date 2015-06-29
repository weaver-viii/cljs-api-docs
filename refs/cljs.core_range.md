## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/range

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/range</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/range)
</td>
</tr>
</table>

 <samp>
(__range__)<br>
</samp>
 <samp>
(__range__ end)<br>
</samp>
 <samp>
(__range__ start end)<br>
</samp>
 <samp>
(__range__ start end step)<br>
</samp>

---

Returns a lazy sequence of nums from `start` (inclusive) to `end` (exclusive),
by `step`, where `start` defaults to 0, `step` to 1, and `end` to infinity.

---


See Also:

[`cljs.core/repeat`](cljs.core_repeat.md)<br>

---

Source docstring:

```
Returns a lazy seq of nums from start (inclusive) to end
(exclusive), by step, where start defaults to 0, step to 1,
and end to infinity.
```

Source code:

```clj
(defn range
  ([] (range 0 (.-MAX-VALUE js/Number) 1))
  ([end] (range 0 end 1))
  ([start end] (range start end 1))
  ([start end step] (Range. nil start end step nil)))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7900-7907](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L7900-L7907)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/range"]))
```

```clj
{:description "Returns a lazy sequence of nums from `start` (inclusive) to `end` (exclusive),\nby `step`, where `start` defaults to 0, `step` to 1, and `end` to infinity.",
 :ns "cljs.core",
 :name "range",
 :signature ["[]" "[end]" "[start end]" "[start end step]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeat"],
 :full-name-encode "cljs.core_range",
 :source {:code "(defn range\n  ([] (range 0 (.-MAX-VALUE js/Number) 1))\n  ([end] (range 0 end 1))\n  ([start end] (range start end 1))\n  ([start end step] (Range. nil start end step nil)))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7900 7907]},
 :full-name "cljs.core/range",
 :clj-symbol "clojure.core/range",
 :docstring "Returns a lazy seq of nums from start (inclusive) to end\n(exclusive), by step, where start defaults to 0, step to 1,\nand end to infinity."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_range.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_range.cljsdoc)
</pre>

