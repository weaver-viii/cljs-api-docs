## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/intersection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/intersection</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/intersection)
</td>
</tr>
</table>

 <samp>
(__intersection__ s1)<br>
</samp>
 <samp>
(__intersection__ s1 s2)<br>
</samp>
 <samp>
(__intersection__ s1 s2 & sets)<br>
</samp>

---

Return a set that is the intersection of the input sets.

---


See Also:

[`clojure.set/union`](clojure.set_union.md)<br>
[`clojure.set/difference`](clojure.set_difference.md)<br>
[`clojure.set/superset?`](clojure.set_supersetQMARK.md)<br>
[`clojure.set/project`](clojure.set_project.md)<br>

---

Source docstring:

```
Return a set that is the intersection of the input sets
```

Source code:

```clj
(defn intersection
  ([s1] s1)
  ([s1 s2]
     (if (< (count s2) (count s1))
       (recur s2 s1)
       (reduce (fn [result item]
                   (if (contains? s2 item)
		     result
                     (disj result item)))
	       s1 s1)))
  ([s1 s2 & sets] 
     (let [bubbled-sets (bubble-max-key #(- (count %)) (conj sets s2 s1))]
       (reduce intersection (first bubbled-sets) (rest bubbled-sets)))))
```

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:31-44](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/clojure/set.cljs#L31-L44)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/intersection"]))
```

```clj
{:description "Return a set that is the intersection of the input sets.",
 :ns "clojure.set",
 :name "intersection",
 :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.set/union"
           "clojure.set/difference"
           "clojure.set/superset?"
           "clojure.set/project"],
 :full-name-encode "clojure.set_intersection",
 :source {:code "(defn intersection\n  ([s1] s1)\n  ([s1 s2]\n     (if (< (count s2) (count s1))\n       (recur s2 s1)\n       (reduce (fn [result item]\n                   (if (contains? s2 item)\n\t\t     result\n                     (disj result item)))\n\t       s1 s1)))\n  ([s1 s2 & sets] \n     (let [bubbled-sets (bubble-max-key #(- (count %)) (conj sets s2 s1))]\n       (reduce intersection (first bubbled-sets) (rest bubbled-sets)))))",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/clojure/set.cljs",
          :lines [31 44]},
 :full-name "clojure.set/intersection",
 :clj-symbol "clojure.set/intersection",
 :docstring "Return a set that is the intersection of the input sets"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_intersection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_intersection.cljsdoc)
</pre>

