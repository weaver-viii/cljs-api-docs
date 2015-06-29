## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/repeat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeat)
</td>
</tr>
</table>

 <samp>
(__repeat__ x)<br>
</samp>
 <samp>
(__repeat__ n x)<br>
</samp>

---

Returns a lazy sequence of `x`s.

The length of the sequence is infinite, or `n` if provided.

---


See Also:

[`cljs.core/repeatedly`](cljs.core_repeatedly.md)<br>
[`cljs.core/cycle`](cljs.core_cycle.md)<br>
[`cljs.core/constantly`](cljs.core_constantly.md)<br>
[`cljs.core/dotimes`](cljs.core_dotimes.md)<br>

---

Source docstring:

```
Returns a lazy (infinite!, or length n if supplied) sequence of xs.
```

Source code:

```clj
(defn repeat
  ([x] (lazy-seq (cons x (repeat x))))
  ([n x] (take n (repeat x))))
```

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2909-2912](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L2909-L2912)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/repeat"]))
```

```clj
{:description "Returns a lazy sequence of `x`s.\n\nThe length of the sequence is infinite, or `n` if provided.",
 :ns "cljs.core",
 :name "repeat",
 :signature ["[x]" "[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeatedly"
           "cljs.core/cycle"
           "cljs.core/constantly"
           "cljs.core/dotimes"],
 :full-name-encode "cljs.core_repeat",
 :source {:code "(defn repeat\n  ([x] (lazy-seq (cons x (repeat x))))\n  ([n x] (take n (repeat x))))",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2909 2912]},
 :full-name "cljs.core/repeat",
 :clj-symbol "clojure.core/repeat",
 :docstring "Returns a lazy (infinite!, or length n if supplied) sequence of xs."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_repeat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_repeat.cljsdoc)
</pre>

