## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/loop

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/loop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loop)
</td>
</tr>
</table>

 <samp>
(__loop__ \[& bindings\] & body-exprs)<br>
</samp>

---

Evaluates the `body-exprs` in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs, just like a `let` form.
Acts as a `recur` target, which will allow tail-call optimization.

---

Example:

```clj
(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (+ x 2))))
;; Prints:
;; 0
;; 2
;; 4
;; 6
;; 8
;;
;;=> nil
```

---

See Also:

[`special/recur`](special_recur.md)<br>

---

Source docstring:

```
Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein. Acts as a recur target.
```

Source code:

```clj
(defmacro loop
  [bindings & body]
    (assert-args loop
      (vector? bindings) "a vector for its binding"
      (even? (count bindings)) "an even number of forms in binding vector")
    (let [db (destructure bindings)]
      (if (= db bindings)
        `(loop* ~bindings ~@body)
        (let [vs (take-nth 2 (drop 1 bindings))
              bs (take-nth 2 bindings)
              gs (map (fn [b] (if (symbol? b) b (gensym))) bs)
              bfs (reduce1 (fn [ret [b v g]]
                            (if (symbol? b)
                              (conj ret g v)
                              (conj ret g v b g)))
                          [] (map vector bs vs gs))]
          `(let ~bfs
             (loop* ~(vec (interleave gs gs))
               (let ~(vec (interleave bs gs))
                 ~@body)))))))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4025-4048](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L4025-L4048)</ins>
</pre>


---

```clj
(def
 ^{:macro true
   :added "1.0"}
 loop (fn* loop [&form &env & decl] (cons 'loop* decl)))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:37-40](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L37-L40)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/loop"]))
```

```clj
{:description "Evaluates the `body-exprs` in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs, just like a `let` form.\nActs as a `recur` target, which will allow tail-call optimization.",
 :ns "cljs.core",
 :name "loop",
 :signature ["[[& bindings] & body-exprs]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/recur"],
 :full-name-encode "cljs.core_loop",
 :source {:code "(defmacro loop\n  [bindings & body]\n    (assert-args loop\n      (vector? bindings) \"a vector for its binding\"\n      (even? (count bindings)) \"an even number of forms in binding vector\")\n    (let [db (destructure bindings)]\n      (if (= db bindings)\n        `(loop* ~bindings ~@body)\n        (let [vs (take-nth 2 (drop 1 bindings))\n              bs (take-nth 2 bindings)\n              gs (map (fn [b] (if (symbol? b) b (gensym))) bs)\n              bfs (reduce1 (fn [ret [b v g]]\n                            (if (symbol? b)\n                              (conj ret g v)\n                              (conj ret g v b g)))\n                          [] (map vector bs vs gs))]\n          `(let ~bfs\n             (loop* ~(vec (interleave gs gs))\n               (let ~(vec (interleave bs gs))\n                 ~@body)))))))",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [4025 4048]},
 :extra-sources ({:code "(def\n ^{:macro true\n   :added \"1.0\"}\n loop (fn* loop [&form &env & decl] (cons 'loop* decl)))",
                  :repo "clojure",
                  :tag "clojure-1.3.0",
                  :filename "src/clj/clojure/core.clj",
                  :lines [37 40]}),
 :examples [{:id "60291e",
             :content "```clj\n(loop [x 0]\n  (when (< x 10)\n    (println x)\n    (recur (+ x 2))))\n;; Prints:\n;; 0\n;; 2\n;; 4\n;; 6\n;; 8\n;;\n;;=> nil\n```"}],
 :full-name "cljs.core/loop",
 :clj-symbol "clojure.core/loop",
 :docstring "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein. Acts as a recur target."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_loop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_loop.cljsdoc)
</pre>

