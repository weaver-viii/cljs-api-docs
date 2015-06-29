## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/drop

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/drop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/drop)
</td>
</tr>
</table>

 <samp>
(__drop__ n)<br>
</samp>
 <samp>
(__drop__ n coll)<br>
</samp>

---




Source docstring:

```
Elides the first n values from the reduction of coll.
```

Source code:

```clj
(defcurried drop
  "Elides the first n values from the reduction of coll."
  {}
  [n coll]
  (reducer coll
   (fn [f1]
     (let [cnt (atom n)]
       (rfn [f1 k]
         ([ret k v]
            (swap! cnt dec)
            (if (neg? @cnt)
              (f1 ret k v)
              ret)))))))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:178-190](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/core/reducers.cljs#L178-L190)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/drop"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "drop",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_drop",
 :source {:code "(defcurried drop\n  \"Elides the first n values from the reduction of coll.\"\n  {}\n  [n coll]\n  (reducer coll\n   (fn [f1]\n     (let [cnt (atom n)]\n       (rfn [f1 k]\n         ([ret k v]\n            (swap! cnt dec)\n            (if (neg? @cnt)\n              (f1 ret k v)\n              ret)))))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [178 190]},
 :full-name "clojure.core.reducers/drop",
 :clj-symbol "clojure.core.reducers/drop",
 :docstring "Elides the first n values from the reduction of coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_drop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_drop.cljsdoc)
</pre>

