## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove-all-methods

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-all-methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-all-methods)
</td>
</tr>
</table>

 <samp>
(__remove-all-methods__ multifn)<br>
</samp>

---




Source docstring:

```
Removes all of the methods of multimethod.
```

Source code:

```clj
(defn remove-all-methods
 [multifn]
 (-reset multifn))
```

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7593-7596](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L7593-L7596)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove-all-methods"]))
```

```clj
{:ns "cljs.core",
 :name "remove-all-methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove-all-methods",
 :source {:code "(defn remove-all-methods\n [multifn]\n (-reset multifn))",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7593 7596]},
 :full-name "cljs.core/remove-all-methods",
 :clj-symbol "clojure.core/remove-all-methods",
 :docstring "Removes all of the methods of multimethod."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_remove-all-methods.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_remove-all-methods.cljsdoc)
</pre>

