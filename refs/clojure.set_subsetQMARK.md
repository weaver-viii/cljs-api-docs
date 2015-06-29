## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/subset?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/subset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/subset?)
</td>
</tr>
</table>

 <samp>
(__subset?__ a b)<br>
</samp>

---

Returns true if `a` is a subset of `b`, false otherwise.

In other words, returns true if all the elements of `a` can be found in `b`.

---


See Also:

[`cljs.core/set`](cljs.core_set.md)<br>
[`cljs.core/set?`](cljs.core_setQMARK.md)<br>
[`clojure.set/superset?`](clojure.set_supersetQMARK.md)<br>

---

Source docstring:

```
Is set1 a subset of set2?
```

Source code:

```clj
(defn subset? 
  [set1 set2]
  (and (<= (count set1) (count set2))
       (every? #(contains? set2 %) set1)))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:131-135](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/set.cljs#L131-L135)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/subset?"]))
```

```clj
{:description "Returns true if `a` is a subset of `b`, false otherwise.\n\nIn other words, returns true if all the elements of `a` can be found in `b`.",
 :ns "clojure.set",
 :name "subset?",
 :signature ["[a b]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/set?" "clojure.set/superset?"],
 :full-name-encode "clojure.set_subsetQMARK",
 :source {:code "(defn subset? \n  [set1 set2]\n  (and (<= (count set1) (count set2))\n       (every? #(contains? set2 %) set1)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/clojure/set.cljs",
          :lines [131 135]},
 :full-name "clojure.set/subset?",
 :clj-symbol "clojure.set/subset?",
 :docstring "Is set1 a subset of set2?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_subsetQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_subsetQMARK.cljsdoc)
</pre>

