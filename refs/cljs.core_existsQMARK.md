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





Source code:

```clj
(defmacro exists? [x]
  (bool-expr (list 'js* "typeof ~{} !== 'undefined'" x)))
```

 <pre>
clojurescript @ r1896
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:240-241](https://github.com/clojure/clojurescript/blob/r1896/src/clj/cljs/core.clj#L240-L241)</ins>
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
 :type "macro",
 :signature ["[x]"],
 :source {:code "(defmacro exists? [x]\n  (bool-expr (list 'js* \"typeof ~{} !== 'undefined'\" x)))",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/clj/cljs/core.clj",
          :lines [240 241]},
 :full-name "cljs.core/exists?",
 :full-name-encode "cljs.core_existsQMARK",
 :history [["+" "0.0-1798"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_existsQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_existsQMARK.cljsdoc)
</pre>

