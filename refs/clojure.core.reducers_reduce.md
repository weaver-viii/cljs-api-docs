## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/reduce

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/reduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/reduce)
</td>
</tr>
</table>

 <samp>
(__reduce__ f coll)<br>
</samp>
 <samp>
(__reduce__ f init coll)<br>
</samp>

---




Source docstring:

```
Like core/reduce except:
  When init is not provided, (f) is used.
  Maps are reduced with reduce-kv
```

Source code:

```clj
(defn reduce
  ([f coll] (reduce f (f) coll))
  ([f init coll]
     (if (map? coll)
       (-kv-reduce coll f init)
       (cond
         (nil? coll) init
         (array? coll) (array-reduce coll f init)
         :else (-reduce coll f init)))))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:33-44](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/clojure/core/reducers.cljs#L33-L44)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/reduce"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "reduce",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_reduce",
 :source {:code "(defn reduce\n  ([f coll] (reduce f (f) coll))\n  ([f init coll]\n     (if (map? coll)\n       (-kv-reduce coll f init)\n       (cond\n         (nil? coll) init\n         (array? coll) (array-reduce coll f init)\n         :else (-reduce coll f init)))))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [33 44]},
 :full-name "clojure.core.reducers/reduce",
 :clj-symbol "clojure.core.reducers/reduce",
 :docstring "Like core/reduce except:\n  When init is not provided, (f) is used.\n  Maps are reduced with reduce-kv"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_reduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_reduce.cljsdoc)
</pre>

