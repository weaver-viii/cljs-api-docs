## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/exists?

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__exists?__ x)<br>
</samp>

---




Source docstring:

```
Return true if argument exists, analogous to usage of typeof operator
in JavaScript.
```

Source code:

```clj
(defmacro exists?
  [x]
  (bool-expr
    (core/list 'js* "typeof ~{} !== 'undefined'"
      (vary-meta x assoc :cljs.analyzer/no-resolve true))))
```

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:324-330](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/core.clj#L324-L330)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/exists?"]))
```

```clj
{:ns "cljs.core",
 :name "exists?",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core_existsQMARK",
 :source {:code "(defmacro exists?\n  [x]\n  (bool-expr\n    (core/list 'js* \"typeof ~{} !== 'undefined'\"\n      (vary-meta x assoc :cljs.analyzer/no-resolve true))))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/core.clj",
          :lines [324 330]},
 :full-name "cljs.core/exists?",
 :docstring "Return true if argument exists, analogous to usage of typeof operator\nin JavaScript."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_existsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_existsQMARK.cljsdoc)
</pre>

