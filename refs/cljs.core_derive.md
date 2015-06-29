## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/derive

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/derive</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/derive)
</td>
</tr>
</table>

 <samp>
(__derive__ tag parent)<br>
</samp>
 <samp>
(__derive__ h tag parent)<br>
</samp>

---




Source docstring:

```
Establishes a parent/child relationship between parent and
tag. Parent must be a namespace-qualified symbol or keyword and
child can be either a namespace-qualified symbol or keyword or a
class. h must be a hierarchy obtained from make-hierarchy, if not
supplied defaults to, and modifies, the global hierarchy.
```

Source code:

```clj
(defn derive
  ([tag parent]
   (assert (namespace parent))
   ;; (assert (or (class? tag) (and (instance? cljs.core.Named tag) (namespace tag))))
   (swap! global-hierarchy derive tag parent) nil)
  ([h tag parent]
   (assert (not= tag parent))
   ;; (assert (or (class? tag) (instance? clojure.lang.Named tag)))
   ;; (assert (instance? clojure.lang.INamed tag))
   ;; (assert (instance? clojure.lang.INamed parent))
   (let [tp (:parents h)
         td (:descendants h)
         ta (:ancestors h)
         tf (fn [m source sources target targets]
              (reduce (fn [ret k]
                        (assoc ret k
                               (reduce conj (get targets k #{}) (cons target (targets target)))))
                      m (cons source (sources source))))]
     (or
      (when-not (contains? (tp tag) parent)
        (when (contains? (ta tag) parent)
          (throw (js/Error. (str tag "already has" parent "as ancestor"))))
        (when (contains? (ta parent) tag)
          (throw (js/Error. (str "Cyclic derivation:" parent "has" tag "as ancestor"))))
        {:parents (assoc (:parents h) tag (conj (get tp tag #{}) parent))
         :ancestors (tf (:ancestors h) tag td parent ta)
         :descendants (tf (:descendants h) parent ta tag td)})
      h))))
```

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7076-7108](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L7076-L7108)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/derive"]))
```

```clj
{:ns "cljs.core",
 :name "derive",
 :signature ["[tag parent]" "[h tag parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_derive",
 :source {:code "(defn derive\n  ([tag parent]\n   (assert (namespace parent))\n   ;; (assert (or (class? tag) (and (instance? cljs.core.Named tag) (namespace tag))))\n   (swap! global-hierarchy derive tag parent) nil)\n  ([h tag parent]\n   (assert (not= tag parent))\n   ;; (assert (or (class? tag) (instance? clojure.lang.Named tag)))\n   ;; (assert (instance? clojure.lang.INamed tag))\n   ;; (assert (instance? clojure.lang.INamed parent))\n   (let [tp (:parents h)\n         td (:descendants h)\n         ta (:ancestors h)\n         tf (fn [m source sources target targets]\n              (reduce (fn [ret k]\n                        (assoc ret k\n                               (reduce conj (get targets k #{}) (cons target (targets target)))))\n                      m (cons source (sources source))))]\n     (or\n      (when-not (contains? (tp tag) parent)\n        (when (contains? (ta tag) parent)\n          (throw (js/Error. (str tag \"already has\" parent \"as ancestor\"))))\n        (when (contains? (ta parent) tag)\n          (throw (js/Error. (str \"Cyclic derivation:\" parent \"has\" tag \"as ancestor\"))))\n        {:parents (assoc (:parents h) tag (conj (get tp tag #{}) parent))\n         :ancestors (tf (:ancestors h) tag td parent ta)\n         :descendants (tf (:descendants h) parent ta tag td)})\n      h))))",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7076 7108]},
 :full-name "cljs.core/derive",
 :clj-symbol "clojure.core/derive",
 :docstring "Establishes a parent/child relationship between parent and\ntag. Parent must be a namespace-qualified symbol or keyword and\nchild can be either a namespace-qualified symbol or keyword or a\nclass. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_derive.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_derive.cljsdoc)
</pre>

