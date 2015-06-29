## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*target\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Var bound to the name value of the compiler build :target option.
For example, if the compiler build :target is :nodejs, *target* will be bound
to "nodejs". *target* is a Google Closure define and can be set by compiler
:closure-defines option.
```

Source code:

```clj
(def
  ^{:dynamic true
    :doc "Var bound to the name value of the compiler build :target option.
  For example, if the compiler build :target is :nodejs, *target* will be bound
  to \"nodejs\". *target* is a Google Closure define and can be set by compiler
  :closure-defines option."
    :jsdoc ["@define {string}"]}
  *target* "default")
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:20-27](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L20-L27)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*target*"]))
```

```clj
{:ns "cljs.core",
 :name "*target*",
 :docstring "Var bound to the name value of the compiler build :target option.\nFor example, if the compiler build :target is :nodejs, *target* will be bound\nto \"nodejs\". *target* is a Google Closure define and can be set by compiler\n:closure-defines option.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"Var bound to the name value of the compiler build :target option.\n  For example, if the compiler build :target is :nodejs, *target* will be bound\n  to \\\"nodejs\\\". *target* is a Google Closure define and can be set by compiler\n  :closure-defines option.\"\n    :jsdoc [\"@define {string}\"]}\n  *target* \"default\")",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [20 27]},
 :full-name "cljs.core/*target*",
 :full-name-encode "cljs.core_STARtargetSTAR",
 :history [["+" "0.0-2985"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARtargetSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARtargetSTAR.cljsdoc)
</pre>

