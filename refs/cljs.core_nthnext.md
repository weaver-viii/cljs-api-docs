## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nthnext

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nthnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthnext)
</td>
</tr>
</table>

 <samp>
(__nthnext__ coll n)<br>
</samp>

---

Returns the `n`th `next` of `coll`.

Returns `(seq coll)` when `n` is 0.

---


See Also:

[`cljs.core/nth`](cljs.core_nth.md)<br>
[`cljs.core/drop`](cljs.core_drop.md)<br>
[`cljs.core/nthrest`](cljs.core_nthrest.md)<br>

---

Source docstring:

```
Returns the nth next of coll, (seq coll) when n is 0.
```

Source code:

```clj
(defn nthnext
  [coll n]
  (loop [n n xs (seq coll)]
    (if (and xs (pos? n))
      (recur (dec n) (next xs))
      xs)))
```

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1769-1775](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L1769-L1775)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nthnext"]))
```

```clj
{:description "Returns the `n`th `next` of `coll`.\n\nReturns `(seq coll)` when `n` is 0.",
 :ns "cljs.core",
 :name "nthnext",
 :signature ["[coll n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/nth" "cljs.core/drop" "cljs.core/nthrest"],
 :full-name-encode "cljs.core_nthnext",
 :source {:code "(defn nthnext\n  [coll n]\n  (loop [n n xs (seq coll)]\n    (if (and xs (pos? n))\n      (recur (dec n) (next xs))\n      xs)))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1769 1775]},
 :full-name "cljs.core/nthnext",
 :clj-symbol "clojure.core/nthnext",
 :docstring "Returns the nth next of coll, (seq coll) when n is 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nthnext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nthnext.cljsdoc)
</pre>

