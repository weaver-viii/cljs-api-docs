## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/difference

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/difference</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/difference)
</td>
</tr>
</table>

 <samp>
(__difference__ s1)<br>
</samp>
 <samp>
(__difference__ s1 s2)<br>
</samp>
 <samp>
(__difference__ s1 s2 & sets)<br>
</samp>

---

Return a set that is the first set without elements of the remaining sets.

---


See Also:

[`clojure.set/union`](clojure.set_union.md)<br>
[`clojure.set/intersection`](clojure.set_intersection.md)<br>
[`clojure.set/superset?`](clojure.set_supersetQMARK.md)<br>
[`clojure.set/project`](clojure.set_project.md)<br>

---

Source docstring:

```
Return a set that is the first set without elements of the remaining sets
```

Source code:

```clj
(defn difference
  ([s1] s1)
  ([s1 s2] 
     (if (< (count s1) (count s2))
       (reduce (fn [result item] 
                   (if (contains? s2 item) 
                     (disj result item) 
                     result))
               s1 s1)
       (reduce disj s1 s2)))
  ([s1 s2 & sets] 
     (reduce difference s1 (conj sets s2))))
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:46-58](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/clojure/set.cljs#L46-L58)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/difference"]))
```

```clj
{:description "Return a set that is the first set without elements of the remaining sets.",
 :ns "clojure.set",
 :name "difference",
 :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.set/union"
           "clojure.set/intersection"
           "clojure.set/superset?"
           "clojure.set/project"],
 :full-name-encode "clojure.set_difference",
 :source {:code "(defn difference\n  ([s1] s1)\n  ([s1 s2] \n     (if (< (count s1) (count s2))\n       (reduce (fn [result item] \n                   (if (contains? s2 item) \n                     (disj result item) \n                     result))\n               s1 s1)\n       (reduce disj s1 s2)))\n  ([s1 s2 & sets] \n     (reduce difference s1 (conj sets s2))))",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/clojure/set.cljs",
          :lines [46 58]},
 :full-name "clojure.set/difference",
 :clj-symbol "clojure.set/difference",
 :docstring "Return a set that is the first set without elements of the remaining sets"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_difference.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_difference.cljsdoc)
</pre>

