## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/regexp?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__regexp?__ x)<br>
</samp>

---




Source docstring:

```
Returns true if x is a JavaScript RegExp instance.
```

Source code:

```clj
(defn regexp?
  [x]
  (instance? js/RegExp x))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8365-8368](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L8365-L8368)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/regexp?"]))
```

```clj
{:ns "cljs.core",
 :name "regexp?",
 :signature ["[x]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core_regexpQMARK",
 :source {:code "(defn regexp?\n  [x]\n  (instance? js/RegExp x))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8365 8368]},
 :full-name "cljs.core/regexp?",
 :docstring "Returns true if x is a JavaScript RegExp instance."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_regexpQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_regexpQMARK.cljsdoc)
</pre>

