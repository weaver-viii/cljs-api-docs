## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/var?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var?)
</td>
</tr>
</table>

 <samp>
(__var?__ v)<br>
</samp>

---




Source docstring:

```
Returns true if v is of type cljs.core.Var
```

Source code:

```clj
(defn var?
  [v]
  (instance? cljs.core.Var v))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:911-914](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L911-L914)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/var?"]))
```

```clj
{:ns "cljs.core",
 :name "var?",
 :signature ["[v]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core_varQMARK",
 :source {:code "(defn var?\n  [v]\n  (instance? cljs.core.Var v))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [911 914]},
 :full-name "cljs.core/var?",
 :clj-symbol "clojure.core/var?",
 :docstring "Returns true if v is of type cljs.core.Var"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_varQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_varQMARK.cljsdoc)
</pre>

