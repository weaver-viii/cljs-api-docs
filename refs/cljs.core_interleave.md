## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/interleave

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/interleave</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/interleave)
</td>
</tr>
</table>

 <samp>
(__interleave__ c1 c2)<br>
</samp>
 <samp>
(__interleave__ c1 c2 & colls)<br>
</samp>

---

Returns a lazy seq of the first item in each collection, then the second items,
then the third, etc.

---


See Also:

[`cljs.core/interpose`](cljs.core_interpose.md)<br>
[`cljs.core/zipmap`](cljs.core_zipmap.md)<br>

---

Source docstring:

```
Returns a lazy seq of the first item in each coll, then the second etc.
```

Source code:

```clj
(defn interleave
  ([c1 c2]
     (lazy-seq
      (let [s1 (seq c1) s2 (seq c2)]
        (when (and s1 s2)
          (cons (first s1) (cons (first s2)
                                 (interleave (rest s1) (rest s2))))))))
  ([c1 c2 & colls]
     (lazy-seq
      (let [ss (map seq (conj colls c2 c1))]
        (when (every? identity ss)
          (concat (map first ss) (apply interleave (map rest ss))))))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2167-2179](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2167-L2179)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/interleave"]))
```

```clj
{:description "Returns a lazy seq of the first item in each collection, then the second items,\nthen the third, etc.",
 :ns "cljs.core",
 :name "interleave",
 :signature ["[c1 c2]" "[c1 c2 & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/interpose" "cljs.core/zipmap"],
 :full-name-encode "cljs.core_interleave",
 :source {:code "(defn interleave\n  ([c1 c2]\n     (lazy-seq\n      (let [s1 (seq c1) s2 (seq c2)]\n        (when (and s1 s2)\n          (cons (first s1) (cons (first s2)\n                                 (interleave (rest s1) (rest s2))))))))\n  ([c1 c2 & colls]\n     (lazy-seq\n      (let [ss (map seq (conj colls c2 c1))]\n        (when (every? identity ss)\n          (concat (map first ss) (apply interleave (map rest ss))))))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2167 2179]},
 :full-name "cljs.core/interleave",
 :clj-symbol "clojure.core/interleave",
 :docstring "Returns a lazy seq of the first item in each coll, then the second etc."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_interleave.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_interleave.cljsdoc)
</pre>

