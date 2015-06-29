## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-data

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-data</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-data)
</td>
</tr>
</table>

 <samp>
(__ex-data__ ex)<br>
</samp>

---




Source docstring:

```
Alpha - subject to change.
Returns exception data (a map) if ex is an ExceptionInfo.
Otherwise returns nil.
```

Source code:

```clj
(defn ex-data
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-data ex)))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7752-7758](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L7752-L7758)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-data"]))
```

```clj
{:ns "cljs.core",
 :name "ex-data",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-data",
 :source {:code "(defn ex-data\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-data ex)))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7752 7758]},
 :full-name "cljs.core/ex-data",
 :clj-symbol "clojure.core/ex-data",
 :docstring "Alpha - subject to change.\nReturns exception data (a map) if ex is an ExceptionInfo.\nOtherwise returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ex-data.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ex-data.cljsdoc)
</pre>

