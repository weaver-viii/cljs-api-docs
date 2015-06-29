## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mapcat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mapcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mapcat)
</td>
</tr>
</table>

 <samp>
(__mapcat__ f)<br>
</samp>
 <samp>
(__mapcat__ f & colls)<br>
</samp>

---

Returns the result of applying `concat` to the result of applying `map` to `f`
and `colls`.

Function `f` should return a collection.

Returns a transducer when no collections are provided.

---


See Also:

[`cljs.core/map`](cljs.core_map.md)<br>
[`cljs.core/concat`](cljs.core_concat.md)<br>

---

Source docstring:

```
Returns the result of applying concat to the result of applying map
to f and colls.  Thus function f should return a collection.
```

Source code:

```clj
(defn mapcat
  ([f coll]
    (flatten1 (map f coll)))
  ([f coll & colls]
    (flatten1 (apply map f coll colls))))
```

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2964-2970](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L2964-L2970)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mapcat"]))
```

```clj
{:description "Returns the result of applying `concat` to the result of applying `map` to `f`\nand `colls`.\n\nFunction `f` should return a collection.\n\nReturns a transducer when no collections are provided.",
 :ns "cljs.core",
 :name "mapcat",
 :signature ["[f]" "[f & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map" "cljs.core/concat"],
 :full-name-encode "cljs.core_mapcat",
 :source {:code "(defn mapcat\n  ([f coll]\n    (flatten1 (map f coll)))\n  ([f coll & colls]\n    (flatten1 (apply map f coll colls))))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2964 2970]},
 :full-name "cljs.core/mapcat",
 :clj-symbol "clojure.core/mapcat",
 :docstring "Returns the result of applying concat to the result of applying map\nto f and colls.  Thus function f should return a collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_mapcat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_mapcat.cljsdoc)
</pre>

