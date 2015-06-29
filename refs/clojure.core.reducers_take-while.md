## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/take-while

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/take-while)
</td>
</tr>
</table>

 <samp>
(__take-while__ pred)<br>
</samp>
 <samp>
(__take-while__ pred coll)<br>
</samp>

---




Source docstring:

```
Ends the reduction of coll when (pred val) returns logical false.
```

Source code:

```clj
(defcurried take-while
  "Ends the reduction of coll when (pred val) returns logical false."
  {}
  [pred coll]
  (reducer coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               (reduced ret)))))))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:152-162](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/clojure/core/reducers.cljs#L152-L162)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/take-while"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "take-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_take-while",
 :source {:code "(defcurried take-while\n  \"Ends the reduction of coll when (pred val) returns logical false.\"\n  {}\n  [pred coll]\n  (reducer coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               (reduced ret)))))))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [152 162]},
 :full-name "clojure.core.reducers/take-while",
 :clj-symbol "clojure.core.reducers/take-while",
 :docstring "Ends the reduction of coll when (pred val) returns logical false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_take-while.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_take-while.cljsdoc)
</pre>

