## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set)
</td>
</tr>
</table>

 <samp>
(__sorted-set__ & keys)<br>
</samp>

---

Returns a new sorted set with supplied `keys`.

---


See Also:

[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>
[`cljs.core/subseq`](cljs.core_subseq.md)<br>
[`cljs.core/rsubseq`](cljs.core_rsubseq.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>

---

Source docstring:

```
Returns a new sorted set with supplied keys.
```

Source code:

```clj
(defn sorted-set
  ([& keys]
   (reduce -conj cljs.core.PersistentTreeSet/EMPTY keys)))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6182-6185](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L6182-L6185)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-set"]))
```

```clj
{:description "Returns a new sorted set with supplied `keys`.",
 :ns "cljs.core",
 :name "sorted-set",
 :signature ["[& keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-set-by"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-map"],
 :full-name-encode "cljs.core_sorted-set",
 :source {:code "(defn sorted-set\n  ([& keys]\n   (reduce -conj cljs.core.PersistentTreeSet/EMPTY keys)))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6182 6185]},
 :full-name "cljs.core/sorted-set",
 :clj-symbol "clojure.core/sorted-set",
 :docstring "Returns a new sorted set with supplied keys."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sorted-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sorted-set.cljsdoc)
</pre>

