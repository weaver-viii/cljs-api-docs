## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-ordered-coll

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-ordered-coll</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-ordered-coll)
</td>
</tr>
</table>

 <samp>
(__hash-ordered-coll__ coll)<br>
</samp>

---




Source docstring:

```
Returns the hash code, consistent with =, for an external ordered
collection implementing Iterable.
See http://clojure.org/data_structures#hash for full algorithms.
```

Source code:

```clj
(defn ^number hash-ordered-coll
  [coll]
  (loop [n 0 hash-code 1 coll (seq coll)]
    (if-not (nil? coll)
      (recur (inc n) (bit-or (+ (imul 31 hash-code) (hash (first coll))) 0)
        (next coll))
      (mix-collection-hash hash-code n))))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:762-771](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L762-L771)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-ordered-coll"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "hash-ordered-coll",
 :signature ["[coll]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_hash-ordered-coll",
 :source {:code "(defn ^number hash-ordered-coll\n  [coll]\n  (loop [n 0 hash-code 1 coll (seq coll)]\n    (if-not (nil? coll)\n      (recur (inc n) (bit-or (+ (imul 31 hash-code) (hash (first coll))) 0)\n        (next coll))\n      (mix-collection-hash hash-code n))))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [762 771]},
 :full-name "cljs.core/hash-ordered-coll",
 :clj-symbol "clojure.core/hash-ordered-coll",
 :docstring "Returns the hash code, consistent with =, for an external ordered\ncollection implementing Iterable.\nSee http://clojure.org/data_structures#hash for full algorithms."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-ordered-coll.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-ordered-coll.cljsdoc)
</pre>

