## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/reducer

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/reducer</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/reducer)
</td>
</tr>
</table>

 <samp>
(__reducer__ coll xf)<br>
</samp>

---




Source docstring:

```
Given a reducible collection, and a transformation function xf,
returns a reducible collection, where any supplied reducing
fn will be transformed by xf. xf is a function of reducing fn to
reducing fn.
```

Source code:

```clj
(defn reducer
  ([coll xf]
     (reify
       cljs.core/IReduce
       (-reduce [this f1]
         (-reduce this f1 (f1)))
       (-reduce [_ f1 init]
         (-reduce coll (xf f1) init)))))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:66-77](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/clojure/core/reducers.cljs#L66-L77)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/reducer"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "reducer",
 :signature ["[coll xf]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_reducer",
 :source {:code "(defn reducer\n  ([coll xf]\n     (reify\n       cljs.core/IReduce\n       (-reduce [this f1]\n         (-reduce this f1 (f1)))\n       (-reduce [_ f1 init]\n         (-reduce coll (xf f1) init)))))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [66 77]},
 :full-name "clojure.core.reducers/reducer",
 :clj-symbol "clojure.core.reducers/reducer",
 :docstring "Given a reducible collection, and a transformation function xf,\nreturns a reducible collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_reducer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_reducer.cljsdoc)
</pre>

