## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/concat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/concat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/concat)
</td>
</tr>
</table>

 <samp>
(__concat__)<br>
</samp>
 <samp>
(__concat__ x)<br>
</samp>
 <samp>
(__concat__ x y)<br>
</samp>
 <samp>
(__concat__ x y & zs)<br>
</samp>

---

Returns a lazy sequence representing the concatenation of the elements in the
supplied collections.

---


See Also:

[`cljs.core/conj`](cljs.core_conj.md)<br>
[`cljs.core/into`](cljs.core_into.md)<br>

---

Source docstring:

```
Returns a lazy seq representing the concatenation of the elements in the supplied colls.
```

Source code:

```clj
(defn concat
  ([] (lazy-seq nil))
  ([x] (lazy-seq x))
  ([x y]
    (lazy-seq
      (let [s (seq x)]
        (if s
          (cons (first s) (concat (rest s) y))
          y))))
  ([x y & zs]
     (let [cat (fn cat [xys zs]
                 (lazy-seq
                   (let [xys (seq xys)]
                     (if xys
                       (cons (first xys) (cat (rest xys) zs))
                       (when zs
                         (cat (first zs) (next zs)))))))]
       (cat (concat x y) zs))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1700-1718](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1700-L1718)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/concat"]))
```

```clj
{:description "Returns a lazy sequence representing the concatenation of the elements in the\nsupplied collections.",
 :ns "cljs.core",
 :name "concat",
 :signature ["[]" "[x]" "[x y]" "[x y & zs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj" "cljs.core/into"],
 :full-name-encode "cljs.core_concat",
 :source {:code "(defn concat\n  ([] (lazy-seq nil))\n  ([x] (lazy-seq x))\n  ([x y]\n    (lazy-seq\n      (let [s (seq x)]\n        (if s\n          (cons (first s) (concat (rest s) y))\n          y))))\n  ([x y & zs]\n     (let [cat (fn cat [xys zs]\n                 (lazy-seq\n                   (let [xys (seq xys)]\n                     (if xys\n                       (cons (first xys) (cat (rest xys) zs))\n                       (when zs\n                         (cat (first zs) (next zs)))))))]\n       (cat (concat x y) zs))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1700 1718]},
 :full-name "cljs.core/concat",
 :clj-symbol "clojure.core/concat",
 :docstring "Returns a lazy seq representing the concatenation of the elements in the supplied colls."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_concat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_concat.cljsdoc)
</pre>

