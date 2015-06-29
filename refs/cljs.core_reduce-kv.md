## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduce-kv

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduce-kv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduce-kv)
</td>
</tr>
</table>

 <samp>
(__reduce-kv__ f init coll)<br>
</samp>

---

Reduces an associative collection.

`f` should be a function of 3 arguments. Returns the result of applying `f` to
`init`, the first key and the first value in `coll`, then applying `f` to that
result and the 2nd key and value, etc.

If `coll` contains no entries, returns `init` and `f` is not called.

Note that `reduce-kv` is supported on vectors, where the keys will be the
ordinals.

---


See Also:

[`cljs.core/reduce`](cljs.core_reduce.md)<br>

---

Source docstring:

```
Reduces an associative collection. f should be a function of 3
arguments. Returns the result of applying f to init, the first key
and the first value in coll, then applying f to that result and the
2nd key and value, etc. If coll contains no entries, returns init
and f is not called. Note that reduce-kv is supported on vectors,
where the keys will be the ordinals.
```

Source code:

```clj
(defn reduce-kv
  ([f init coll]
    (if-not (nil? coll)
      (-kv-reduce coll f init)
      init)))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1741-1751](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L1741-L1751)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduce-kv"]))
```

```clj
{:description "Reduces an associative collection.\n\n`f` should be a function of 3 arguments. Returns the result of applying `f` to\n`init`, the first key and the first value in `coll`, then applying `f` to that\nresult and the 2nd key and value, etc.\n\nIf `coll` contains no entries, returns `init` and `f` is not called.\n\nNote that `reduce-kv` is supported on vectors, where the keys will be the\nordinals.",
 :ns "cljs.core",
 :name "reduce-kv",
 :signature ["[f init coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/reduce"],
 :full-name-encode "cljs.core_reduce-kv",
 :source {:code "(defn reduce-kv\n  ([f init coll]\n    (if-not (nil? coll)\n      (-kv-reduce coll f init)\n      init)))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1741 1751]},
 :full-name "cljs.core/reduce-kv",
 :clj-symbol "clojure.core/reduce-kv",
 :docstring "Reduces an associative collection. f should be a function of 3\narguments. Returns the result of applying f to init, the first key\nand the first value in coll, then applying f to that result and the\n2nd key and value, etc. If coll contains no entries, returns init\nand f is not called. Note that reduce-kv is supported on vectors,\nwhere the keys will be the ordinals."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reduce-kv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reduce-kv.cljsdoc)
</pre>

