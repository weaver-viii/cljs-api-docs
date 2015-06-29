## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cond

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cond</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond)
</td>
</tr>
</table>

 <samp>
(__cond__ & clauses)<br>
</samp>

---

`clauses` must be an even number of forms, ie: `(cond t1 e1, t2 e2, t3 e3)`.
Each test `t` is evaluated one at a time. If a test returns logical true, `cond`
evaluates and returns the corresponding expression `e` and does not evaluate any
of the other tests or expressions.

It is idiomatic to provide a default case as the last test pair using the
keyword `:else` (a keyword always evaluates to logical true).

`(cond)` returns nil.

---


See Also:

[`cljs.core/condp`](cljs.core_condp.md)<br>
[`cljs.core/case`](cljs.core_case.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
Takes a set of test/expr pairs. It evaluates each test one at a
time.  If a test returns logical true, cond evaluates and returns
the value of the corresponding expr and doesn't evaluate any of the
other tests or exprs. (cond) returns nil.
```

Source code:

```clj
(defmacro cond
  [& clauses]
    (when clauses
      (list 'if (first clauses)
            (if (next clauses)
                (second clauses)
                (throw (IllegalArgumentException.
                         "cond requires an even number of forms")))
            (cons 'clojure.core/cond (next (next clauses))))))
```

 <pre>
clojure @ clojure-1.7.0-RC1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:562-575](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/clj/clojure/core.clj#L562-L575)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cond"]))
```

```clj
{:description "`clauses` must be an even number of forms, ie: `(cond t1 e1, t2 e2, t3 e3)`.\nEach test `t` is evaluated one at a time. If a test returns logical true, `cond`\nevaluates and returns the corresponding expression `e` and does not evaluate any\nof the other tests or expressions.\n\nIt is idiomatic to provide a default case as the last test pair using the\nkeyword `:else` (a keyword always evaluates to logical true).\n\n`(cond)` returns nil.",
 :ns "cljs.core",
 :name "cond",
 :signature ["[& clauses]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/condp" "cljs.core/case" "special/if"],
 :full-name-encode "cljs.core_cond",
 :source {:code "(defmacro cond\n  [& clauses]\n    (when clauses\n      (list 'if (first clauses)\n            (if (next clauses)\n                (second clauses)\n                (throw (IllegalArgumentException.\n                         \"cond requires an even number of forms\")))\n            (cons 'clojure.core/cond (next (next clauses))))))",
          :repo "clojure",
          :tag "clojure-1.7.0-RC1",
          :filename "src/clj/clojure/core.clj",
          :lines [562 575]},
 :full-name "cljs.core/cond",
 :clj-symbol "clojure.core/cond",
 :docstring "Takes a set of test/expr pairs. It evaluates each test one at a\ntime.  If a test returns logical true, cond evaluates and returns\nthe value of the corresponding expr and doesn't evaluate any of the\nother tests or exprs. (cond) returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cond.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cond.cljsdoc)
</pre>

