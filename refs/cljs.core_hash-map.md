## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-map)
</td>
</tr>
</table>

 <samp>
(__hash-map__ & keyvals)<br>
</samp>

---

Returns a new hash map with supplied mappings.

`keyvals` must be an even number of forms.

---


See Also:

[`cljs.core/array-map`](cljs.core_array-map.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>

---

Source docstring:

```
keyval => key val
Returns a new hash map with supplied mappings.
```

Source code:

```clj
(defn hash-map
  [& keyvals]
  (loop [in (seq keyvals), out (transient (.-EMPTY PersistentHashMap))]
    (if in
      (recur (nnext in) (assoc! out (first in) (second in)))
      (persistent! out))))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7024-7031](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L7024-L7031)</ins>
</pre>


---

```clj
(defmacro hash-map
  ([] `(.-EMPTY cljs.core/PersistentHashMap))
  ([& kvs]
    (let [pairs (partition 2 kvs)
          ks    (map first pairs)
          vs    (map second pairs)]
      (vary-meta
        `(.fromArrays cljs.core/PersistentHashMap (array ~@ks) (array ~@vs))
        assoc :tag 'cljs.core/PersistentHashMap))))
```

 <pre>
clojurescript @ r2665
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1439-1447](https://github.com/clojure/clojurescript/blob/r2665/src/clj/cljs/core.clj#L1439-L1447)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-map"]))
```

```clj
{:description "Returns a new hash map with supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "hash-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/array-map" "cljs.core/sorted-map"],
 :full-name-encode "cljs.core_hash-map",
 :source {:code "(defn hash-map\n  [& keyvals]\n  (loop [in (seq keyvals), out (transient (.-EMPTY PersistentHashMap))]\n    (if in\n      (recur (nnext in) (assoc! out (first in) (second in)))\n      (persistent! out))))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7024 7031]},
 :extra-sources ({:code "(defmacro hash-map\n  ([] `(.-EMPTY cljs.core/PersistentHashMap))\n  ([& kvs]\n    (let [pairs (partition 2 kvs)\n          ks    (map first pairs)\n          vs    (map second pairs)]\n      (vary-meta\n        `(.fromArrays cljs.core/PersistentHashMap (array ~@ks) (array ~@vs))\n        assoc :tag 'cljs.core/PersistentHashMap))))",
                  :repo "clojurescript",
                  :tag "r2665",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1439 1447]}),
 :full-name "cljs.core/hash-map",
 :clj-symbol "clojure.core/hash-map",
 :docstring "keyval => key val\nReturns a new hash map with supplied mappings."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-map.cljsdoc)
</pre>

