## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/array-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/array-map)
</td>
</tr>
</table>

 <samp>
(__array-map__ & keyvals)<br>
</samp>

---

Returns a new array map (a map implemented with arrays) with the supplied mappings.

`keyvals` must be an even number of forms.

---

Example:

```clj
(array-map :a 10)
;;=> {:a 10}

(array-map :a 10 :b 20)
;;=> {:a 10 :b 20}
```

---

See Also:

[`cljs.core/assoc`](cljs.core_assoc.md)<br>
[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>

---

Source docstring:

```
keyval => key val
Returns a new array map with supplied mappings.
```

Source code:

```clj
(defn array-map
  [& keyvals]
  (.fromArray cljs.core/PersistentArrayMap (apply array keyvals) true false))
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7438-7442](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L7438-L7442)</ins>
</pre>


---

```clj
(defmacro array-map
  ([] '(.-EMPTY cljs.core/PersistentArrayMap))
  ([& kvs]
     (let [keys (map first (partition 2 kvs))]
       (if (core/and (every? #(= (:op %) :constant)
                       (map #(cljs.analyzer/analyze &env %) keys))
                     (= (count (into #{} keys)) (count keys)))
         `(cljs.core/PersistentArrayMap. nil ~(clojure.core// (count kvs) 2) (array ~@kvs) nil)
         `(.fromArray cljs.core/PersistentArrayMap (array ~@kvs) true false)))))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1707-1715](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/core.clj#L1707-L1715)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-map"]))
```

```clj
{:description "Returns a new array map (a map implemented with arrays) with the supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "array-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/assoc"
           "cljs.core/hash-map"
           "cljs.core/sorted-map"],
 :full-name-encode "cljs.core_array-map",
 :source {:code "(defn array-map\n  [& keyvals]\n  (.fromArray cljs.core/PersistentArrayMap (apply array keyvals) true false))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7438 7442]},
 :extra-sources ({:code "(defmacro array-map\n  ([] '(.-EMPTY cljs.core/PersistentArrayMap))\n  ([& kvs]\n     (let [keys (map first (partition 2 kvs))]\n       (if (core/and (every? #(= (:op %) :constant)\n                       (map #(cljs.analyzer/analyze &env %) keys))\n                     (= (count (into #{} keys)) (count keys)))\n         `(cljs.core/PersistentArrayMap. nil ~(clojure.core// (count kvs) 2) (array ~@kvs) nil)\n         `(.fromArray cljs.core/PersistentArrayMap (array ~@kvs) true false)))))",
                  :repo "clojurescript",
                  :tag "r3117",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1707 1715]}),
 :examples [{:id "198026",
             :content "```clj\n(array-map :a 10)\n;;=> {:a 10}\n\n(array-map :a 10 :b 20)\n;;=> {:a 10 :b 20}\n```"}],
 :full-name "cljs.core/array-map",
 :clj-symbol "clojure.core/array-map",
 :docstring "keyval => key val\nReturns a new array map with supplied mappings."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-map.cljsdoc)
</pre>

