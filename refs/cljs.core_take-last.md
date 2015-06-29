## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take-last

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-last)
</td>
</tr>
</table>

 <samp>
(__take-last__ n coll)<br>
</samp>

---

Returns a sequence of the last `n` items in `coll`.

Depending on the type of collection, `take-last` may be no faster than linear
time. For vectors, please use `subvec`.

---


See Also:

[`cljs.core/last`](cljs.core_last.md)<br>
[`cljs.core/butlast`](cljs.core_butlast.md)<br>
[`cljs.core/drop-last`](cljs.core_drop-last.md)<br>

---

Source docstring:

```
Returns a seq of the last n items in coll.  Depending on the type
of coll may be no better than linear time.  For vectors, see also subvec.
```

Source code:

```clj
(defn take-last
  [n coll]
  (loop [s (seq coll), lead (seq (drop n coll))]
    (if lead
      (recur (next s) (next lead))
      s)))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2972-2979](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L2972-L2979)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-last"]))
```

```clj
{:description "Returns a sequence of the last `n` items in `coll`.\n\nDepending on the type of collection, `take-last` may be no faster than linear\ntime. For vectors, please use `subvec`.",
 :ns "cljs.core",
 :name "take-last",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/last" "cljs.core/butlast" "cljs.core/drop-last"],
 :full-name-encode "cljs.core_take-last",
 :source {:code "(defn take-last\n  [n coll]\n  (loop [s (seq coll), lead (seq (drop n coll))]\n    (if lead\n      (recur (next s) (next lead))\n      s)))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2972 2979]},
 :full-name "cljs.core/take-last",
 :clj-symbol "clojure.core/take-last",
 :docstring "Returns a seq of the last n items in coll.  Depending on the type\nof coll may be no better than linear time.  For vectors, see also subvec."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_take-last.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_take-last.cljsdoc)
</pre>

