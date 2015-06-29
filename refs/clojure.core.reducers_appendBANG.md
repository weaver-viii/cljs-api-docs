## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/append!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/append!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/append!)
</td>
</tr>
</table>

 <samp>
(__append!__ acc x)<br>
</samp>

---




Source docstring:

```
.adds x to acc and returns acc
```

Source code:

```clj
(defn append!
  [acc x]
  (doto acc (.push x)))
```

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:225-228](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/clojure/core/reducers.cljs#L225-L228)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/append!"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "append!",
 :signature ["[acc x]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_appendBANG",
 :source {:code "(defn append!\n  [acc x]\n  (doto acc (.push x)))",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [225 228]},
 :full-name "clojure.core.reducers/append!",
 :clj-symbol "clojure.core.reducers/append!",
 :docstring ".adds x to acc and returns acc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_appendBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_appendBANG.cljsdoc)
</pre>

