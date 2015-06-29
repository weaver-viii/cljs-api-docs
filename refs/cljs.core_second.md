## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/second

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/second</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/second)
</td>
</tr>
</table>

 <samp>
(__second__ coll)<br>
</samp>

---

Returns the second item in `coll`.

Same as `(first (next coll))`

---


See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/nth`](cljs.core_nth.md)<br>
[`cljs.core/fnext`](cljs.core_fnext.md)<br>
[`cljs.core/next`](cljs.core_next.md)<br>

---

Source docstring:

```
Same as (first (next x))
```

Source code:

```clj
(defn second
  [coll]
  (first (next coll)))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1385-1388](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L1385-L1388)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/second"]))
```

```clj
{:description "Returns the second item in `coll`.\n\nSame as `(first (next coll))`",
 :ns "cljs.core",
 :name "second",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/nth"
           "cljs.core/fnext"
           "cljs.core/next"],
 :full-name-encode "cljs.core_second",
 :source {:code "(defn second\n  [coll]\n  (first (next coll)))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1385 1388]},
 :full-name "cljs.core/second",
 :clj-symbol "clojure.core/second",
 :docstring "Same as (first (next x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_second.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_second.cljsdoc)
</pre>

