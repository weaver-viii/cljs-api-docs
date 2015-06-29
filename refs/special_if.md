## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/if

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if)
</td>
</tr>
</table>

 <samp>
(__if__ test then else?)<br>
</samp>

---

If `test` is not false or nil, `then` is evaluated and returned. Otherwise,
`else?` is evaluated and returned. `else?` defaults to nil if not provided.

`if` is one of ClojureScript's [special forms](http://clojure.org/special_forms)
and is a fundamental building block of the language. All other conditionals in
ClojureScript are based on `if`s notion of truthiness (ie: anything other than
false or nil).

---

Example:

```clj
(def v [1 2])

(if (empty? v) "empty!" "filled!")
;;=> "filled!"

(str "This vector is "
  (if (empty? v) "empty!" "filled!"))
;;=> "This vector is filled!"
```

---

See Also:

[`cljs.core/cond`](cljs.core_cond.md)<br>
[`cljs.core/when`](cljs.core_when.md)<br>
[`cljs.core/if-let`](cljs.core_if-let.md)<br>
[`cljs.core/if-not`](cljs.core_if-not.md)<br>

---

Source docstring:

```
Evaluates test. If not the singular values nil or false,
evaluates and yields then, otherwise, evaluates and yields else. If
else is not supplied it defaults to nil.
```

Source code:

```clj
(defmethod parse 'if
  [op env [_ test then else :as form] name _]
  (when (< (count form) 3)
    (throw (error env "Too few arguments to if")))
  (let [test-expr (disallowing-recur (analyze (assoc env :context :expr) test))
        then-expr (allowing-redef (analyze env then))
        else-expr (allowing-redef (analyze env else))]
    {:env env :op :if :form form
     :test test-expr :then then-expr :else else-expr
     :unchecked @*unchecked-if*
     :children [test-expr then-expr else-expr]}))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:715-725](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer.cljc#L715-L725)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/if"]))
```

```clj
{:description "If `test` is not false or nil, `then` is evaluated and returned. Otherwise,\n`else?` is evaluated and returned. `else?` defaults to nil if not provided.\n\n`if` is one of ClojureScript's [special forms](http://clojure.org/special_forms)\nand is a fundamental building block of the language. All other conditionals in\nClojureScript are based on `if`s notion of truthiness (ie: anything other than\nfalse or nil).",
 :ns "special",
 :name "if",
 :signature ["[test then else?]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["cljs.core/cond"
           "cljs.core/when"
           "cljs.core/if-let"
           "cljs.core/if-not"],
 :full-name-encode "special_if",
 :source {:code "(defmethod parse 'if\n  [op env [_ test then else :as form] name _]\n  (when (< (count form) 3)\n    (throw (error env \"Too few arguments to if\")))\n  (let [test-expr (disallowing-recur (analyze (assoc env :context :expr) test))\n        then-expr (allowing-redef (analyze env then))\n        else-expr (allowing-redef (analyze env else))]\n    {:env env :op :if :form form\n     :test test-expr :then then-expr :else else-expr\n     :unchecked @*unchecked-if*\n     :children [test-expr then-expr else-expr]}))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [715 725]},
 :examples [{:id "e591ff",
             :content "```clj\n(def v [1 2])\n\n(if (empty? v) \"empty!\" \"filled!\")\n;;=> \"filled!\"\n\n(str \"This vector is \"\n  (if (empty? v) \"empty!\" \"filled!\"))\n;;=> \"This vector is filled!\"\n```"}],
 :full-name "special/if",
 :clj-symbol "clojure.core/if",
 :docstring "Evaluates test. If not the singular values nil or false,\nevaluates and yields then, otherwise, evaluates and yields else. If\nelse is not supplied it defaults to nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_if.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_if.cljsdoc)
</pre>

