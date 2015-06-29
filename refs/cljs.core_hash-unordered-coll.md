## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-unordered-coll

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-unordered-coll</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-unordered-coll)
</td>
</tr>
</table>

 <samp>
(__hash-unordered-coll__ coll)<br>
</samp>

---




Source docstring:

```
Returns the hash code, consistent with =, for an external unordered
collection implementing Iterable. For maps, the iterator should
return map entries whose hash is computed as
  (hash-ordered-coll [k v]).
See http://clojure.org/data_structures#hash for full algorithms.
```

Source code:

```clj
(defn ^number hash-unordered-coll
  [coll]
  (loop [n 0 hash-code 0 coll (seq coll)]
    (if-not (nil? coll)
      (recur (inc n) (bit-or (+ hash-code (hash (first coll))) 0) (next coll))
      (mix-collection-hash hash-code n))))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1072-1082](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L1072-L1082)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-unordered-coll"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "hash-unordered-coll",
 :signature ["[coll]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_hash-unordered-coll",
 :source {:code "(defn ^number hash-unordered-coll\n  [coll]\n  (loop [n 0 hash-code 0 coll (seq coll)]\n    (if-not (nil? coll)\n      (recur (inc n) (bit-or (+ hash-code (hash (first coll))) 0) (next coll))\n      (mix-collection-hash hash-code n))))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1072 1082]},
 :full-name "cljs.core/hash-unordered-coll",
 :clj-symbol "clojure.core/hash-unordered-coll",
 :docstring "Returns the hash code, consistent with =, for an external unordered\ncollection implementing Iterable. For maps, the iterator should\nreturn map entries whose hash is computed as\n  (hash-ordered-coll [k v]).\nSee http://clojure.org/data_structures#hash for full algorithms."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-unordered-coll.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-unordered-coll.cljsdoc)
</pre>

