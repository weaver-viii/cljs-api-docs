## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prefer-method

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prefer-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prefer-method)
</td>
</tr>
</table>

 <samp>
(__prefer-method__ multifn dispatch-val-x dispatch-val-y)<br>
</samp>

---




Source docstring:

```
Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y
when there is a conflict
```

Source code:

```clj
(defn prefer-method
  [multifn dispatch-val-x dispatch-val-y]
  (-prefer-method multifn dispatch-val-x dispatch-val-y))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9461-9465](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L9461-L9465)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prefer-method"]))
```

```clj
{:ns "cljs.core",
 :name "prefer-method",
 :signature ["[multifn dispatch-val-x dispatch-val-y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prefer-method",
 :source {:code "(defn prefer-method\n  [multifn dispatch-val-x dispatch-val-y]\n  (-prefer-method multifn dispatch-val-x dispatch-val-y))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9461 9465]},
 :full-name "cljs.core/prefer-method",
 :clj-symbol "clojure.core/prefer-method",
 :docstring "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y\nwhen there is a conflict"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prefer-method.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prefer-method.cljsdoc)
</pre>

