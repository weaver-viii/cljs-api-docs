## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/to-array-2d

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/to-array-2d</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array-2d)
</td>
</tr>
</table>

 <samp>
(__to-array-2d__ coll)<br>
</samp>

---

Returns a (potentially-ragged) 2-dimensional JavaScript array containing the
contents of `coll`.

---


See Also:

[`cljs.core/to-array`](cljs.core_to-array.md)<br>

---

Source docstring:

```
Returns a (potentially-ragged) 2-dimensional array
containing the contents of coll.
```

Source code:

```clj
(defn to-array-2d
  [coll]
    (let [ret (make-array (count coll))]
      (loop [i 0 xs (seq coll)]
        (when xs
          (aset ret i (to-array (first xs)))
          (recur (inc i) (next xs))))
      ret))
```

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2349-2358](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L2349-L2358)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/to-array-2d"]))
```

```clj
{:description "Returns a (potentially-ragged) 2-dimensional JavaScript array containing the\ncontents of `coll`.",
 :ns "cljs.core",
 :name "to-array-2d",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/to-array"],
 :full-name-encode "cljs.core_to-array-2d",
 :source {:code "(defn to-array-2d\n  [coll]\n    (let [ret (make-array (count coll))]\n      (loop [i 0 xs (seq coll)]\n        (when xs\n          (aset ret i (to-array (first xs)))\n          (recur (inc i) (next xs))))\n      ret))",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2349 2358]},
 :full-name "cljs.core/to-array-2d",
 :clj-symbol "clojure.core/to-array-2d",
 :docstring "Returns a (potentially-ragged) 2-dimensional array\ncontaining the contents of coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_to-array-2d.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_to-array-2d.cljsdoc)
</pre>

