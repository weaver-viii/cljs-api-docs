## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/empty

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty)
</td>
</tr>
</table>

 <samp>
(__empty__ coll)<br>
</samp>

---

Returns an empty collection of the same category as `coll`.

Returns nil if `coll` is nil.

---


See Also:

[`cljs.core/not-empty`](cljs.core_not-empty.md)<br>

---

Source docstring:

```
Returns an empty collection of the same category as coll, or nil
```

Source code:

```clj
(defn empty
  [coll]
  (when-not (nil? coll)
    (-empty coll)))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:850-854](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L850-L854)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/empty"]))
```

```clj
{:description "Returns an empty collection of the same category as `coll`.\n\nReturns nil if `coll` is nil.",
 :ns "cljs.core",
 :name "empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/not-empty"],
 :full-name-encode "cljs.core_empty",
 :source {:code "(defn empty\n  [coll]\n  (when-not (nil? coll)\n    (-empty coll)))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [850 854]},
 :full-name "cljs.core/empty",
 :clj-symbol "clojure.core/empty",
 :docstring "Returns an empty collection of the same category as coll, or nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_empty.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_empty.cljsdoc)
</pre>

