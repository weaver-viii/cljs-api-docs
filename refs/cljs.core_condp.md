## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/condp

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/condp</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/condp)
</td>
</tr>
</table>

 <samp>
(__condp__ pred expr & clauses)<br>
</samp>

---

Takes a binary predicate, an expression, and a set of clauses. There are two
kinds of clauses:

Binary clause: `test-expr` `result-expr`

Ternary clause: `test-expr` `:>>` `result-fn`<br />
(Note: `:>>` is an ordinary keyword)

For each clause, `(pred test-expr expr)` is evaluated. If it returns logical
true, the clause is a match.

If a binary clause matches, its `result-expr` is returned.

If a ternary clause matches, its `result-fn` is called with the result of the
predicate and returned by `condp`. `result-fn` should take one argument.

A single default expression can follow the clauses, and its value will be
returned if no clause matches.

If no default expression is provided and no clause matches, an Error is thrown.

---


See Also:

[`cljs.core/cond`](cljs.core_cond.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
Takes a binary predicate, an expression, and a set of clauses.
Each clause can take the form of either:

test-expr result-expr

test-expr :>> result-fn

Note :>> is an ordinary keyword.

For each clause, (pred test-expr expr) is evaluated. If it returns
logical true, the clause is a match. If a binary clause matches, the
result-expr is returned, if a ternary clause matches, its result-fn,
which must be a unary function, is called with the result of the
predicate as its argument, the result of that call being the return
value of condp. A single default expression can follow the clauses,
and its value will be returned if no clause matches. If no default
expression is provided and no clause matches, an
IllegalArgumentException is thrown.
```

Source code:

```clj
(defmacro condp
  [pred expr & clauses]
  (let [gpred (gensym "pred__")
        gexpr (gensym "expr__")
        emit (fn emit [pred expr args]
               (let [[[a b c :as clause] more]
                       (split-at (if (= :>> (second args)) 3 2) args)
                       n (count clause)]
                 (core/cond
                  (= 0 n) `(throw (js/Error. (core/str "No matching clause: " ~expr)))
                  (= 1 n) a
                  (= 2 n) `(if (~pred ~a ~expr)
                             ~b
                             ~(emit pred expr more))
                  :else `(if-let [p# (~pred ~a ~expr)]
                           (~c p#)
                           ~(emit pred expr more)))))
        gres (gensym "res__")]
    `(let [~gpred ~pred
           ~gexpr ~expr]
       ~(emit gpred gexpr clauses))))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1138-1178](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/core.clj#L1138-L1178)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/condp"]))
```

```clj
{:description "Takes a binary predicate, an expression, and a set of clauses. There are two\nkinds of clauses:\n\nBinary clause: `test-expr` `result-expr`\n\nTernary clause: `test-expr` `:>>` `result-fn`<br />\n(Note: `:>>` is an ordinary keyword)\n\nFor each clause, `(pred test-expr expr)` is evaluated. If it returns logical\ntrue, the clause is a match.\n\nIf a binary clause matches, its `result-expr` is returned.\n\nIf a ternary clause matches, its `result-fn` is called with the result of the\npredicate and returned by `condp`. `result-fn` should take one argument.\n\nA single default expression can follow the clauses, and its value will be\nreturned if no clause matches.\n\nIf no default expression is provided and no clause matches, an Error is thrown.",
 :ns "cljs.core",
 :name "condp",
 :signature ["[pred expr & clauses]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/cond" "special/if"],
 :full-name-encode "cljs.core_condp",
 :source {:code "(defmacro condp\n  [pred expr & clauses]\n  (let [gpred (gensym \"pred__\")\n        gexpr (gensym \"expr__\")\n        emit (fn emit [pred expr args]\n               (let [[[a b c :as clause] more]\n                       (split-at (if (= :>> (second args)) 3 2) args)\n                       n (count clause)]\n                 (core/cond\n                  (= 0 n) `(throw (js/Error. (core/str \"No matching clause: \" ~expr)))\n                  (= 1 n) a\n                  (= 2 n) `(if (~pred ~a ~expr)\n                             ~b\n                             ~(emit pred expr more))\n                  :else `(if-let [p# (~pred ~a ~expr)]\n                           (~c p#)\n                           ~(emit pred expr more)))))\n        gres (gensym \"res__\")]\n    `(let [~gpred ~pred\n           ~gexpr ~expr]\n       ~(emit gpred gexpr clauses))))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/core.clj",
          :lines [1138 1178]},
 :full-name "cljs.core/condp",
 :clj-symbol "clojure.core/condp",
 :docstring "Takes a binary predicate, an expression, and a set of clauses.\nEach clause can take the form of either:\n\ntest-expr result-expr\n\ntest-expr :>> result-fn\n\nNote :>> is an ordinary keyword.\n\nFor each clause, (pred test-expr expr) is evaluated. If it returns\nlogical true, the clause is a match. If a binary clause matches, the\nresult-expr is returned, if a ternary clause matches, its result-fn,\nwhich must be a unary function, is called with the result of the\npredicate as its argument, the result of that call being the return\nvalue of condp. A single default expression can follow the clauses,\nand its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an\nIllegalArgumentException is thrown."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_condp.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_condp.cljsdoc)
</pre>

