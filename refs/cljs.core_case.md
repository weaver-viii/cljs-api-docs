## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/case

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/case</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/case)
</td>
</tr>
</table>

 <samp>
(__case__ e & clauses)<br>
</samp>

---

Takes an expression and a set of clauses. Each clause can take the form of
either:

`test-constant result-expr`

`(test-constant1 ... test-constantN)  result-expr`

The test-constants are not evaluated. They must be compile-time literals, and
need not be quoted. If the expression is equal to a test-constant, the
corresponding `result-expr` is returned. A single default expression can follow
the clauses, and its value will be returned if no clause matches. If no default
expression is provided and no clause matches, an Error is thrown.

Unlike `cond` and `condp`, `case` does a constant-time dispatch, the clauses are
not considered sequentially. All manner of constant expressions are acceptable
in `case`, including numbers, strings, symbols, keywords, and ClojureScript
composites thereof. Note that since lists are used to group multiple constants
that map to the same expression, a vector can be used to match a list if needed.
The test-constants need not be all of the same type.

---

Example:

```clj
(def a 1)
(def b 2)

(case a
  0 "zero"
  1 "one"
  "default")
;;=> "one"

(case b
  0 "zero"
  1 "one"
  "default")
;;=> "default"

(case b
  0 "zero"
  1 "one")
;; Error: No matching clause: 2
```

---

See Also:

[`cljs.core/cond`](cljs.core_cond.md)<br>
[`cljs.core/condp`](cljs.core_condp.md)<br>

---


Source code:

```clj
(defmacro case [e & clauses]
  (let [default (if (odd? (count clauses))
                  (last clauses)
                  `(throw (js/Error. (core/str "No matching clause: " ~e))))
        assoc-test (fn assoc-test [m test expr]
                         (if (contains? m test)
                           (throw (clojure.core/IllegalArgumentException.
                                   (core/str "Duplicate case test constant '"
                                             test "'"
                                             (when (:line &env)
                                               (core/str " on line " (:line &env) " "
                                                         cljs.analyzer/*cljs-file*)))))
                           (assoc m test expr)))
        pairs (reduce (fn [m [test expr]]
                        (cond
                         (seq? test) (reduce (fn [m test]
                                               (let [test (if (core/symbol? test)
                                                            (list 'quote test)
                                                            test)]
                                                 (assoc-test m test expr)))
                                             m test)
                         (core/symbol? test) (assoc-test m (list 'quote test) expr)
                         :else (assoc-test m test expr)))
                      {} (partition 2 clauses))
        esym (gensym)]
   `(let [~esym ~e]
      (cond
        ~@(mapcat (fn [[m c]] `((cljs.core/= ~m ~esym) ~c)) pairs)
        :else ~default))))
```

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:959-987](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L959-L987)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/case"]))
```

```clj
{:description "Takes an expression and a set of clauses. Each clause can take the form of\neither:\n\n`test-constant result-expr`\n\n`(test-constant1 ... test-constantN)  result-expr`\n\nThe test-constants are not evaluated. They must be compile-time literals, and\nneed not be quoted. If the expression is equal to a test-constant, the\ncorresponding `result-expr` is returned. A single default expression can follow\nthe clauses, and its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an Error is thrown.\n\nUnlike `cond` and `condp`, `case` does a constant-time dispatch, the clauses are\nnot considered sequentially. All manner of constant expressions are acceptable\nin `case`, including numbers, strings, symbols, keywords, and ClojureScript\ncomposites thereof. Note that since lists are used to group multiple constants\nthat map to the same expression, a vector can be used to match a list if needed.\nThe test-constants need not be all of the same type.",
 :ns "cljs.core",
 :name "case",
 :signature ["[e & clauses]"],
 :history [["+" "0.0-1211"]],
 :type "macro",
 :related ["cljs.core/cond" "cljs.core/condp"],
 :full-name-encode "cljs.core_case",
 :source {:code "(defmacro case [e & clauses]\n  (let [default (if (odd? (count clauses))\n                  (last clauses)\n                  `(throw (js/Error. (core/str \"No matching clause: \" ~e))))\n        assoc-test (fn assoc-test [m test expr]\n                         (if (contains? m test)\n                           (throw (clojure.core/IllegalArgumentException.\n                                   (core/str \"Duplicate case test constant '\"\n                                             test \"'\"\n                                             (when (:line &env)\n                                               (core/str \" on line \" (:line &env) \" \"\n                                                         cljs.analyzer/*cljs-file*)))))\n                           (assoc m test expr)))\n        pairs (reduce (fn [m [test expr]]\n                        (cond\n                         (seq? test) (reduce (fn [m test]\n                                               (let [test (if (core/symbol? test)\n                                                            (list 'quote test)\n                                                            test)]\n                                                 (assoc-test m test expr)))\n                                             m test)\n                         (core/symbol? test) (assoc-test m (list 'quote test) expr)\n                         :else (assoc-test m test expr)))\n                      {} (partition 2 clauses))\n        esym (gensym)]\n   `(let [~esym ~e]\n      (cond\n        ~@(mapcat (fn [[m c]] `((cljs.core/= ~m ~esym) ~c)) pairs)\n        :else ~default))))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/clj/cljs/core.clj",
          :lines [959 987]},
 :examples [{:id "09a90c",
             :content "```clj\n(def a 1)\n(def b 2)\n\n(case a\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"one\"\n\n(case b\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"default\"\n\n(case b\n  0 \"zero\"\n  1 \"one\")\n;; Error: No matching clause: 2\n```"}],
 :full-name "cljs.core/case",
 :clj-symbol "clojure.core/case"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_case.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_case.cljsdoc)
</pre>

