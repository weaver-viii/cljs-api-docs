## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/try-expr

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/try-expr</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/try-expr)
</td>
</tr>
</table>

 <samp>
(__try-expr__ msg form)<br>
</samp>

---




Source docstring:

```
Used by the 'is' macro to catch unexpected exceptions.
You don't call this.
```

Source code:

```clj
(defmacro try-expr
  [msg form]
  `(try
     ~(cljs.test/assert-expr &env msg form)
     (catch :default t#
       (cljs.test/do-report 
         {:type :error, :message ~msg,
          :expected '~form, :actual t#}))))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:134-143](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/test.clj#L134-L143)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/try-expr"]))
```

```clj
{:ns "cljs.test",
 :name "try-expr",
 :signature ["[msg form]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_try-expr",
 :source {:code "(defmacro try-expr\n  [msg form]\n  `(try\n     ~(cljs.test/assert-expr &env msg form)\n     (catch :default t#\n       (cljs.test/do-report \n         {:type :error, :message ~msg,\n          :expected '~form, :actual t#}))))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/test.clj",
          :lines [134 143]},
 :full-name "cljs.test/try-expr",
 :clj-symbol "clojure.test/try-expr",
 :docstring "Used by the 'is' macro to catch unexpected exceptions.\nYou don't call this."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_try-expr.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_try-expr.cljsdoc)
</pre>

