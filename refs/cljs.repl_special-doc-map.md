## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/special-doc-map

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def special-doc-map
  '{. {:forms [(.instanceMethod instance args*)
               (.-instanceField instance)]
       :doc "The instance member form works for methods and fields.
  They all expand into calls to the dot operator at macroexpansion time."}
    def {:forms [(def symbol doc-string? init?)]
         :doc "Creates and interns a global var with the name
  of symbol in the current namespace (*ns*) or locates such a var if
  it already exists.  If init is supplied, it is evaluated, and the
  root binding of the var is set to the resulting value.  If init is
  not supplied, the root binding of the var is unaffected."}
    do {:forms [(do exprs*)]
        :doc "Evaluates the expressions in order and returns the value of
  the last. If no expressions are supplied, returns nil."}
    if {:forms [(if test then else?)]
        :doc "Evaluates test. If not the singular values nil or false,
  evaluates and yields then, otherwise, evaluates and yields else. If
  else is not supplied it defaults to nil."}
    new {:forms [(Constructor. args*) (new Constructor args*)]
         :url "java_interop#new"
         :doc "The args, if any, are evaluated from left to right, and
  passed to the JavaScript constructor. The constructed object is
  returned."}
    quote {:forms [(quote form)]
           :doc "Yields the unevaluated form."}
    recur {:forms [(recur exprs*)]
           :doc "Evaluates the exprs in order, then, in parallel, rebinds
  the bindings of the recursion point to the values of the exprs.
  Execution then jumps back to the recursion point, a loop or fn method."}
    set! {:forms[(set! var-symbol expr)
                 (set! (.- instance-expr instanceFieldName-symbol) expr)]
          :url "vars#set"
          :doc "Used to set vars and JavaScript object fields"}
    throw {:forms [(throw expr)]
           :doc "The expr is evaluated and thrown."}
    try {:forms [(try expr* catch-clause* finally-clause?)]
         :doc "catch-clause => (catch classname name expr*)
  finally-clause => (finally expr*)
  Catches and handles JavaScript exceptions."}
    var {:forms [(var symbol)]
         :doc "The symbol must resolve to a var, and the Var object
itself (not its value) is returned. The reader macro #'x expands to (var x)."}})
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:904-945](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl.clj#L904-L945)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/special-doc-map"]))
```

```clj
{:ns "cljs.repl",
 :name "special-doc-map",
 :type "var",
 :source {:code "(def special-doc-map\n  '{. {:forms [(.instanceMethod instance args*)\n               (.-instanceField instance)]\n       :doc \"The instance member form works for methods and fields.\n  They all expand into calls to the dot operator at macroexpansion time.\"}\n    def {:forms [(def symbol doc-string? init?)]\n         :doc \"Creates and interns a global var with the name\n  of symbol in the current namespace (*ns*) or locates such a var if\n  it already exists.  If init is supplied, it is evaluated, and the\n  root binding of the var is set to the resulting value.  If init is\n  not supplied, the root binding of the var is unaffected.\"}\n    do {:forms [(do exprs*)]\n        :doc \"Evaluates the expressions in order and returns the value of\n  the last. If no expressions are supplied, returns nil.\"}\n    if {:forms [(if test then else?)]\n        :doc \"Evaluates test. If not the singular values nil or false,\n  evaluates and yields then, otherwise, evaluates and yields else. If\n  else is not supplied it defaults to nil.\"}\n    new {:forms [(Constructor. args*) (new Constructor args*)]\n         :url \"java_interop#new\"\n         :doc \"The args, if any, are evaluated from left to right, and\n  passed to the JavaScript constructor. The constructed object is\n  returned.\"}\n    quote {:forms [(quote form)]\n           :doc \"Yields the unevaluated form.\"}\n    recur {:forms [(recur exprs*)]\n           :doc \"Evaluates the exprs in order, then, in parallel, rebinds\n  the bindings of the recursion point to the values of the exprs.\n  Execution then jumps back to the recursion point, a loop or fn method.\"}\n    set! {:forms[(set! var-symbol expr)\n                 (set! (.- instance-expr instanceFieldName-symbol) expr)]\n          :url \"vars#set\"\n          :doc \"Used to set vars and JavaScript object fields\"}\n    throw {:forms [(throw expr)]\n           :doc \"The expr is evaluated and thrown.\"}\n    try {:forms [(try expr* catch-clause* finally-clause?)]\n         :doc \"catch-clause => (catch classname name expr*)\n  finally-clause => (finally expr*)\n  Catches and handles JavaScript exceptions.\"}\n    var {:forms [(var symbol)]\n         :doc \"The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x expands to (var x).\"}})",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl.clj",
          :lines [904 945]},
 :full-name "cljs.repl/special-doc-map",
 :full-name-encode "cljs.repl_special-doc-map",
 :history [["+" "0.0-2985"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_special-doc-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_special-doc-map.cljsdoc)
</pre>

