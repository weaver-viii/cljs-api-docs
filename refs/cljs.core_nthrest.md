## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nthrest

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nthrest</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthrest)
</td>
</tr>
</table>

 <samp>
(__nthrest__ coll n)<br>
</samp>

---

Returns the `nth` rest of `coll`.

Returns `coll` when `n` is 0.

---


See Also:

[`cljs.core/drop`](cljs.core_drop.md)<br>
[`cljs.core/nthnext`](cljs.core_nthnext.md)<br>
[`cljs.core/nth`](cljs.core_nth.md)<br>

---

Source docstring:

```
Returns the nth rest of coll, coll when n is 0.
```

Source code:

```clj
(defn nthrest
  [coll n]
    (loop [n n xs coll]
      (if (and (pos? n) (seq xs))
        (recur (dec n) (rest xs))
        xs)))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1247-1253](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L1247-L1253)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nthrest"]))
```

```clj
{:description "Returns the `nth` rest of `coll`.\n\nReturns `coll` when `n` is 0.",
 :ns "cljs.core",
 :name "nthrest",
 :signature ["[coll n]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :related ["cljs.core/drop" "cljs.core/nthnext" "cljs.core/nth"],
 :full-name-encode "cljs.core_nthrest",
 :source {:code "(defn nthrest\n  [coll n]\n    (loop [n n xs coll]\n      (if (and (pos? n) (seq xs))\n        (recur (dec n) (rest xs))\n        xs)))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1247 1253]},
 :full-name "cljs.core/nthrest",
 :clj-symbol "clojure.core/nthrest",
 :docstring "Returns the nth rest of coll, coll when n is 0."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nthrest.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nthrest.cljsdoc)
</pre>

