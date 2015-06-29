## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set)
</td>
</tr>
</table>

 <samp>
(__set__ coll)<br>
</samp>

---

Returns a set of the distinct elements of `coll`.

---


See Also:

[`cljs.core/hash-set`](cljs.core_hash-set.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/conj`](cljs.core_conj.md)<br>
[`cljs.core/disj`](cljs.core_disj.md)<br>
[`cljs.core/distinct`](cljs.core_distinct.md)<br>
[`clojure.set/join`](clojure.set_join.md)<br>
[`clojure.set/select`](clojure.set_select.md)<br>
[`clojure.set/difference`](clojure.set_difference.md)<br>
[`clojure.set/intersection`](clojure.set_intersection.md)<br>
[`clojure.set/union`](clojure.set_union.md)<br>
[`clojure.set/index`](clojure.set_index.md)<br>
[`clojure.set/project`](clojure.set_project.md)<br>
[`clojure.set/rename`](clojure.set_rename.md)<br>
[`clojure.set/rename-keys`](clojure.set_rename-keys.md)<br>
[`clojure.set/map-invert`](clojure.set_map-invert.md)<br>

---

Source docstring:

```
Returns a set of the distinct elements of coll.
```

Source code:

```clj
(defn set
  [coll]
  (let [^not-native in (seq coll)]
    (cond
      (nil? in) #{}

      (and (instance? IndexedSeq in) (zero? (.-i in)))
      (set-from-indexed-seq in)

      :else
      (loop [in in
              ^not-native out (-as-transient #{})]
        (if-not (nil? in)
          (recur (-next in) (-conj! out (-first in)))
          (-persistent! out))))))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6383-6398](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L6383-L6398)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set"]))
```

```clj
{:description "Returns a set of the distinct elements of `coll`.",
 :ns "cljs.core",
 :name "set",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/hash-set"
           "cljs.core/sorted-set"
           "cljs.core/conj"
           "cljs.core/disj"
           "cljs.core/distinct"
           "clojure.set/join"
           "clojure.set/select"
           "clojure.set/difference"
           "clojure.set/intersection"
           "clojure.set/union"
           "clojure.set/index"
           "clojure.set/project"
           "clojure.set/rename"
           "clojure.set/rename-keys"
           "clojure.set/map-invert"],
 :full-name-encode "cljs.core_set",
 :source {:code "(defn set\n  [coll]\n  (let [^not-native in (seq coll)]\n    (cond\n      (nil? in) #{}\n\n      (and (instance? IndexedSeq in) (zero? (.-i in)))\n      (set-from-indexed-seq in)\n\n      :else\n      (loop [in in\n              ^not-native out (-as-transient #{})]\n        (if-not (nil? in)\n          (recur (-next in) (-conj! out (-first in)))\n          (-persistent! out))))))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6383 6398]},
 :full-name "cljs.core/set",
 :clj-symbol "clojure.core/set",
 :docstring "Returns a set of the distinct elements of coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_set.cljsdoc)
</pre>

