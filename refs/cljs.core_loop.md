## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/loop

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/loop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loop)
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
    (assert-args
      (vector? bindings) "a vector for its binding"
      (even? (count bindings)) "an even number of forms in binding vector")
    (let [db (destructure bindings)]
      (if (= db bindings)
        `(loop* ~bindings ~@body)
        (let [vs (take-nth 2 (drop 1 bindings))
              bs (take-nth 2 bindings)
              gs (map (fn [b] (if (core/symbol? b) b (gensym))) bs)
              bfs (reduce (fn [ret [b v g]]
                            (if (core/symbol? b)
                              (conj ret g v)
                              (conj ret g v b g)))
                          [] (map vector bs vs gs))]
          `(let ~bfs
             (loop* ~(vec (interleave gs gs))
               (let ~(vec (interleave bs gs))
                 ~@body)))))))
```

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:139-161](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L139-L161)</ins>
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
 :source {:code "(defmacro loop\n  [bindings & body]\n    (assert-args\n      (vector? bindings) \"a vector for its binding\"\n      (even? (count bindings)) \"an even number of forms in binding vector\")\n    (let [db (destructure bindings)]\n      (if (= db bindings)\n        `(loop* ~bindings ~@body)\n        (let [vs (take-nth 2 (drop 1 bindings))\n              bs (take-nth 2 bindings)\n              gs (map (fn [b] (if (core/symbol? b) b (gensym))) bs)\n              bfs (reduce (fn [ret [b v g]]\n                            (if (core/symbol? b)\n                              (conj ret g v)\n                              (conj ret g v b g)))\n                          [] (map vector bs vs gs))]\n          `(let ~bfs\n             (loop* ~(vec (interleave gs gs))\n               (let ~(vec (interleave bs gs))\n                 ~@body)))))))",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/clj/cljs/core.clj",
          :lines [139 161]},
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

