## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/merge

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge)
</td>
</tr>
</table>

 <samp>
(__merge__ & maps)<br>
</samp>

---

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping from the rightmost map will
"win".

---


See Also:

[`cljs.core/merge-with`](cljs.core_merge-with.md)<br>
[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>

---

Source docstring:

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping from
the latter (left-to-right) will be the mapping in the result.
```

Source code:

```clj
(defn merge
  [& maps]
  (when (some identity maps)
    (reduce #(conj (or %1 {}) %2) maps)))
```

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2430-2436](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2430-L2436)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/merge"]))
```

```clj
{:description "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping from the rightmost map will\n\"win\".",
 :ns "cljs.core",
 :name "merge",
 :signature ["[& maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/merge-with" "cljs.core/hash-map"],
 :full-name-encode "cljs.core_merge",
 :source {:code "(defn merge\n  [& maps]\n  (when (some identity maps)\n    (reduce #(conj (or %1 {}) %2) maps)))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2430 2436]},
 :full-name "cljs.core/merge",
 :clj-symbol "clojure.core/merge",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping from\nthe latter (left-to-right) will be the mapping in the result."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_merge.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_merge.cljsdoc)
</pre>

