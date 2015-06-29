## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted?)
</td>
</tr>
</table>

 <samp>
(__sorted?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `ISorted` protocol, false otherwise.

Sorted maps and sorted sets implement `ISorted`.

---


See Also:

[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>

---

Source docstring:

```
Returns true if coll satisfies ISorted
```

Source code:

```clj
(defn ^boolean sorted?
  [x] (satisfies? ISorted x))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1766-1768](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L1766-L1768)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted?"]))
```

```clj
{:description "Returns true if `coll` implements the `ISorted` protocol, false otherwise.\n\nSorted maps and sorted sets implement `ISorted`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "sorted?",
 :signature ["[coll]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :related ["cljs.core/sorted-map" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core_sortedQMARK",
 :source {:code "(defn ^boolean sorted?\n  [x] (satisfies? ISorted x))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1766 1768]},
 :full-name "cljs.core/sorted?",
 :clj-symbol "clojure.core/sorted?",
 :docstring "Returns true if coll satisfies ISorted"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sortedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sortedQMARK.cljsdoc)
</pre>

