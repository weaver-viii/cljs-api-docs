## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cond->>

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cond->></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond-%3E%3E)
</td>
</tr>
</table>

 <samp>
(__cond->>__ expr & clauses)<br>
</samp>

---

Takes an expression and a set of test/form pairs. Threads `expr` (via `->>`)
through each form for which the corresponding test expression is true.

Note that, unlike `cond` branching, `cond->>` threading does not short circuit
after the first true test expression.

---


See Also:

[`cljs.core/->`](cljs.core_-GT.md)<br>
[`cljs.core/->>`](cljs.core_-GTGT.md)<br>
[`cljs.core/cond->`](cljs.core_cond-GT.md)<br>
[`cljs.core/cond`](cljs.core_cond.md)<br>

---

Source docstring:

```
Takes an expression and a set of test/form pairs. Threads expr (via ->>)
through each form for which the corresponding test expression
is true.  Note that, unlike cond branching, cond->> threading does not short circuit
after the first true test expression.
```

Source code:

```clj
(defmacro cond->>
  [expr & clauses]
  (assert (even? (count clauses)))
  (let [g (gensym)
        pstep (fn [[test step]] `(if ~test (->> ~g ~step) ~g))]
    `(let [~g ~expr
           ~@(interleave (repeat g) (map pstep (partition 2 clauses)))]
       ~g)))
```

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:7243-7255](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L7243-L7255)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cond->>"]))
```

```clj
{:description "Takes an expression and a set of test/form pairs. Threads `expr` (via `->>`)\nthrough each form for which the corresponding test expression is true.\n\nNote that, unlike `cond` branching, `cond->>` threading does not short circuit\nafter the first true test expression.",
 :ns "cljs.core",
 :name "cond->>",
 :signature ["[expr & clauses]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :related ["cljs.core/->"
           "cljs.core/->>"
           "cljs.core/cond->"
           "cljs.core/cond"],
 :full-name-encode "cljs.core_cond-GTGT",
 :source {:code "(defmacro cond->>\n  [expr & clauses]\n  (assert (even? (count clauses)))\n  (let [g (gensym)\n        pstep (fn [[test step]] `(if ~test (->> ~g ~step) ~g))]\n    `(let [~g ~expr\n           ~@(interleave (repeat g) (map pstep (partition 2 clauses)))]\n       ~g)))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [7243 7255]},
 :full-name "cljs.core/cond->>",
 :clj-symbol "clojure.core/cond->>",
 :docstring "Takes an expression and a set of test/form pairs. Threads expr (via ->>)\nthrough each form for which the corresponding test expression\nis true.  Note that, unlike cond branching, cond->> threading does not short circuit\nafter the first true test expression."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cond-GTGT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cond-GTGT.cljsdoc)
</pre>

