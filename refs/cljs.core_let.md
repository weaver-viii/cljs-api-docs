## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/let

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/let)
</td>
</tr>
</table>

 <samp>
(__let__ bindings & body)<br>
</samp>

---

Binds expressions to symbols and makes those symbols available only within
`body`.

`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,
a3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned
the evaluation of the second item (the `b`s). These symbols (the `a`s) are then
available within `body` (and not outside of `body`).

Another way to think about this is that the binding symbols in `let` are like
local `def`s that are only available within `let`'s scope.

In addition to direct symbol binding, `let` supports a destructuring syntax to
"break apart" collections into multiple symbols. This destructuring syntax is
like it's own [mini-language] and allows for succinct code.

`let` is a wrapper over one of ClojureScript's [special forms] and is a
fundamental building block of the language. Many macros rely on `let`s binding
syntax and scope rules.

[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html
[special forms]:http://clojure.org/special_forms

---


See Also:

[`cljs.core/letfn`](cljs.core_letfn.md)<br>
[`cljs.core/if-let`](cljs.core_if-let.md)<br>

---

Source docstring:

```
binding => binding-form init-expr

Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein.
```

Source code:

```clj
(defmacro let
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (even? (count bindings)) "an even number of forms in binding vector")
  `(let* ~(destructure bindings) ~@body))
```

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:131-141](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/core.clj#L131-L141)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/let"]))
```

```clj
{:description "Binds expressions to symbols and makes those symbols available only within\n`body`.\n\n`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,\na3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned\nthe evaluation of the second item (the `b`s). These symbols (the `a`s) are then\navailable within `body` (and not outside of `body`).\n\nAnother way to think about this is that the binding symbols in `let` are like\nlocal `def`s that are only available within `let`'s scope.\n\nIn addition to direct symbol binding, `let` supports a destructuring syntax to\n\"break apart\" collections into multiple symbols. This destructuring syntax is\nlike it's own [mini-language] and allows for succinct code.\n\n`let` is a wrapper over one of ClojureScript's [special forms] and is a\nfundamental building block of the language. Many macros rely on `let`s binding\nsyntax and scope rules.\n\n[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html\n[special forms]:http://clojure.org/special_forms",
 :ns "cljs.core",
 :name "let",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/letfn" "cljs.core/if-let"],
 :full-name-encode "cljs.core_let",
 :source {:code "(defmacro let\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (even? (count bindings)) \"an even number of forms in binding vector\")\n  `(let* ~(destructure bindings) ~@body))",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/clj/cljs/core.clj",
          :lines [131 141]},
 :full-name "cljs.core/let",
 :clj-symbol "clojure.core/let",
 :docstring "binding => binding-form init-expr\n\nEvaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_let.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_let.cljsdoc)
</pre>

