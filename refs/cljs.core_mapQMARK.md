## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map?)
</td>
</tr>
</table>

 <samp>
(__map?__ x)<br>
</samp>

---

Returns true if `x` is a map, false otherwise.

---


See Also:

[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>

---

Source docstring:

```
Return true if x satisfies IMap
```

Source code:

```clj
(defn ^boolean map?
  [x]
  (if (nil? x)
    false
    (satisfies? IMap x)))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1338-1343](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L1338-L1343)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/map?"]))
```

```clj
{:description "Returns true if `x` is a map, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "map?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/hash-map" "cljs.core/sorted-map"],
 :full-name-encode "cljs.core_mapQMARK",
 :source {:code "(defn ^boolean map?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? IMap x)))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1338 1343]},
 :full-name "cljs.core/map?",
 :clj-symbol "clojure.core/map?",
 :docstring "Return true if x satisfies IMap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_mapQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_mapQMARK.cljsdoc)
</pre>

