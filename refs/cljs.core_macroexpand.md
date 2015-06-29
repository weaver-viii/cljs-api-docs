## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/macroexpand

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/macroexpand</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand)
</td>
</tr>
</table>

 <samp>
(__macroexpand__ quoted)<br>
</samp>

---




Source docstring:

```
Repeatedly calls macroexpand-1 on form until it no longer
represents a macro form, then returns it.  Note neither
macroexpand-1 nor macroexpand expand macros in subforms.
```

Source code:

```clj
(defmacro macroexpand
  [quoted]
  (core/assert (core/= (core/first quoted) 'quote)
    "Argument to macroexpand must be quoted")
  (core/let [form (second quoted)
             env &env]
    (core/loop [form form form' (ana/macroexpand-1 env form)]
      (core/if-not (core/identical? form form')
        (recur form' (ana/macroexpand-1 env form'))
        `(quote ~form')))))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:2043-2055](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/core.clj#L2043-L2055)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/macroexpand"]))
```

```clj
{:ns "cljs.core",
 :name "macroexpand",
 :signature ["[quoted]"],
 :history [["+" "0.0-3165"]],
 :type "macro",
 :full-name-encode "cljs.core_macroexpand",
 :source {:code "(defmacro macroexpand\n  [quoted]\n  (core/assert (core/= (core/first quoted) 'quote)\n    \"Argument to macroexpand must be quoted\")\n  (core/let [form (second quoted)\n             env &env]\n    (core/loop [form form form' (ana/macroexpand-1 env form)]\n      (core/if-not (core/identical? form form')\n        (recur form' (ana/macroexpand-1 env form'))\n        `(quote ~form')))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/core.clj",
          :lines [2043 2055]},
 :full-name "cljs.core/macroexpand",
 :clj-symbol "clojure.core/macroexpand",
 :docstring "Repeatedly calls macroexpand-1 on form until it no longer\nrepresents a macro form, then returns it.  Note neither\nmacroexpand-1 nor macroexpand expand macros in subforms."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_macroexpand.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_macroexpand.cljsdoc)
</pre>

