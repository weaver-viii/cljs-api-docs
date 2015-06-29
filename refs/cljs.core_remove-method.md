## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove-method

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-method)
</td>
</tr>
</table>

 <samp>
(__remove-method__ multifn dispatch-val)<br>
</samp>

---




Source docstring:

```
Removes the method of multimethod associated with dispatch-value.
```

Source code:

```clj
(defn remove-method
 [multifn dispatch-val]
 (-remove-method multifn dispatch-val))
```

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8690-8693](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L8690-L8693)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove-method"]))
```

```clj
{:ns "cljs.core",
 :name "remove-method",
 :signature ["[multifn dispatch-val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove-method",
 :source {:code "(defn remove-method\n [multifn dispatch-val]\n (-remove-method multifn dispatch-val))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8690 8693]},
 :full-name "cljs.core/remove-method",
 :clj-symbol "clojure.core/remove-method",
 :docstring "Removes the method of multimethod associated with dispatch-value."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_remove-method.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_remove-method.cljsdoc)
</pre>

