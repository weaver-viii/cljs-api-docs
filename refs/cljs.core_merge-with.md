## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/merge-with

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge-with)
</td>
</tr>
</table>

 <samp>
(__merge-with__ f & maps)<br>
</samp>

---

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping(s) from the latter (left-to-
right) will be combined with the mapping in the result by calling `(f val-in-
result val-in-latter)`.

---


See Also:

[`cljs.core/merge`](cljs.core_merge.md)<br>

---

Source docstring:

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping(s)
from the latter (left-to-right) will be combined with the mapping in
the result by calling (f val-in-result val-in-latter).
```

Source code:

```clj
(defn merge-with
  [f & maps]
  (when (some identity maps)
    (let [merge-entry (fn [m e]
                        (let [k (first e) v (second e)]
                          (if (contains? m k)
                            (assoc m k (f (get m k) v))
                            (assoc m k v))))
          merge2 (fn [m1 m2]
                   (reduce merge-entry (or m1 {}) (seq m2)))]
      (reduce merge2 maps))))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7633-7647](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L7633-L7647)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/merge-with"]))
```

```clj
{:description "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping(s) from the latter (left-to-\nright) will be combined with the mapping in the result by calling `(f val-in-\nresult val-in-latter)`.",
 :ns "cljs.core",
 :name "merge-with",
 :signature ["[f & maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/merge"],
 :full-name-encode "cljs.core_merge-with",
 :source {:code "(defn merge-with\n  [f & maps]\n  (when (some identity maps)\n    (let [merge-entry (fn [m e]\n                        (let [k (first e) v (second e)]\n                          (if (contains? m k)\n                            (assoc m k (f (get m k) v))\n                            (assoc m k v))))\n          merge2 (fn [m1 m2]\n                   (reduce merge-entry (or m1 {}) (seq m2)))]\n      (reduce merge2 maps))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7633 7647]},
 :full-name "cljs.core/merge-with",
 :clj-symbol "clojure.core/merge-with",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping(s)\nfrom the latter (left-to-right) will be combined with the mapping in\nthe result by calling (f val-in-result val-in-latter)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_merge-with.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_merge-with.cljsdoc)
</pre>

