## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/underive

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/underive</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/underive)
</td>
</tr>
</table>

 <samp>
(__underive__ tag parent)<br>
</samp>
 <samp>
(__underive__ h tag parent)<br>
</samp>

---




Source docstring:

```
Removes a parent/child relationship between parent and
tag. h must be a hierarchy obtained from make-hierarchy, if not
supplied defaults to, and modifies, the global hierarchy.
```

Source code:

```clj
(defn underive
  ([tag parent]
    (swap-global-hierarchy! underive tag parent)
    nil)
  ([h tag parent]
    (let [parentMap (:parents h)
          childsParents (if (parentMap tag)
                          (disj (parentMap tag) parent) #{})
          newParents (if (not-empty childsParents)
                      (assoc parentMap tag childsParents)
                      (dissoc parentMap tag))
          deriv-seq (flatten (map #(cons (first %) (interpose (first %) (second %)))
                                  (seq newParents)))]
      (if (contains? (parentMap tag) parent)
        (reduce #(apply derive %1 %2) (make-hierarchy)
                (partition 2 deriv-seq))
        h))))
```

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8425-8444](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L8425-L8444)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/underive"]))
```

```clj
{:ns "cljs.core",
 :name "underive",
 :signature ["[tag parent]" "[h tag parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_underive",
 :source {:code "(defn underive\n  ([tag parent]\n    (swap-global-hierarchy! underive tag parent)\n    nil)\n  ([h tag parent]\n    (let [parentMap (:parents h)\n          childsParents (if (parentMap tag)\n                          (disj (parentMap tag) parent) #{})\n          newParents (if (not-empty childsParents)\n                      (assoc parentMap tag childsParents)\n                      (dissoc parentMap tag))\n          deriv-seq (flatten (map #(cons (first %) (interpose (first %) (second %)))\n                                  (seq newParents)))]\n      (if (contains? (parentMap tag) parent)\n        (reduce #(apply derive %1 %2) (make-hierarchy)\n                (partition 2 deriv-seq))\n        h))))",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8425 8444]},
 :full-name "cljs.core/underive",
 :clj-symbol "clojure.core/underive",
 :docstring "Removes a parent/child relationship between parent and\ntag. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_underive.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_underive.cljsdoc)
</pre>

