## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-set)
</td>
</tr>
</table>

 <samp>
(__hash-set__)<br>
</samp>
 <samp>
(__hash-set__ & keys)<br>
</samp>

---

Returns a new hash set with supplied `keys`.

Any equal keys are handled as if by repeated uses of `conj`.

---


See Also:

[`cljs.core/set`](cljs.core_set.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>

---


Source code:

```clj
(defn hash-set
  ([] #{})
  ([& keys] (set keys)))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6259-6261](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L6259-L6261)</ins>
</pre>


---

```clj
(defmacro hash-set
  ([] `cljs.core.PersistentHashSet.EMPTY)
  ([& xs]
    (if (core/and (every? #(= (:op %) :constant)
                    (map #(cljs.analyzer/analyze &env %) xs))
                  (= (count (into #{} xs)) (count xs)))
      `(cljs.core.PersistentHashSet. nil
         (cljs.core.PersistentArrayMap. nil ~(count xs) (array ~@(interleave xs (repeat nil))) nil)
         nil)
      (vary-meta
        `(cljs.core.PersistentHashSet.fromArray (array ~@xs) true)
        assoc :tag 'cljs.core/PersistentHashSet))))
```

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1336-1347](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L1336-L1347)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-set"]))
```

```clj
{:description "Returns a new hash set with supplied `keys`.\n\nAny equal keys are handled as if by repeated uses of `conj`.",
 :ns "cljs.core",
 :name "hash-set",
 :signature ["[]" "[& keys]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core_hash-set",
 :source {:code "(defn hash-set\n  ([] #{})\n  ([& keys] (set keys)))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6259 6261]},
 :extra-sources ({:code "(defmacro hash-set\n  ([] `cljs.core.PersistentHashSet.EMPTY)\n  ([& xs]\n    (if (core/and (every? #(= (:op %) :constant)\n                    (map #(cljs.analyzer/analyze &env %) xs))\n                  (= (count (into #{} xs)) (count xs)))\n      `(cljs.core.PersistentHashSet. nil\n         (cljs.core.PersistentArrayMap. nil ~(count xs) (array ~@(interleave xs (repeat nil))) nil)\n         nil)\n      (vary-meta\n        `(cljs.core.PersistentHashSet.fromArray (array ~@xs) true)\n        assoc :tag 'cljs.core/PersistentHashSet))))",
                  :repo "clojurescript",
                  :tag "r2067",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1336 1347]}),
 :full-name "cljs.core/hash-set",
 :clj-symbol "clojure.core/hash-set"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-set.cljsdoc)
</pre>

