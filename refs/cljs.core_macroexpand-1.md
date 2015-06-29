## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/macroexpand-1

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/macroexpand-1</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand-1)
</td>
</tr>
</table>

 <samp>
(__macroexpand-1__ quoted)<br>
</samp>

---




Source docstring:

```
If form represents a macro form, returns its expansion,
else returns form.
```

Source code:

```clj
(defmacro macroexpand-1
  [quoted]
  (core/assert (core/= (core/first quoted) 'quote)
    "Argument to macroexpand-1 must be quoted")
  (core/let [form (second quoted)]
    `(quote ~(ana/macroexpand-1 &env form))))
```

 <pre>
clojurescript @ r3190
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:2034-2041](https://github.com/clojure/clojurescript/blob/r3190/src/clj/cljs/core.clj#L2034-L2041)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/macroexpand-1"]))
```

```clj
{:ns "cljs.core",
 :name "macroexpand-1",
 :signature ["[quoted]"],
 :history [["+" "0.0-3165"]],
 :type "macro",
 :full-name-encode "cljs.core_macroexpand-1",
 :source {:code "(defmacro macroexpand-1\n  [quoted]\n  (core/assert (core/= (core/first quoted) 'quote)\n    \"Argument to macroexpand-1 must be quoted\")\n  (core/let [form (second quoted)]\n    `(quote ~(ana/macroexpand-1 &env form))))",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/clj/cljs/core.clj",
          :lines [2034 2041]},
 :full-name "cljs.core/macroexpand-1",
 :clj-symbol "clojure.core/macroexpand-1",
 :docstring "If form represents a macro form, returns its expansion,\nelse returns form."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_macroexpand-1.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_macroexpand-1.cljsdoc)
</pre>

