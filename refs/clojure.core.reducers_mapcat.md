## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/mapcat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/mapcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/mapcat)
</td>
</tr>
</table>

 <samp>
(__mapcat__ f)<br>
</samp>
 <samp>
(__mapcat__ f coll)<br>
</samp>

---




Source docstring:

```
Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable.
```

Source code:

```clj
(defcurried mapcat
  "Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable."
  {}
  [f coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (reduce f1 ret (f k v)))))))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:106-115](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/clojure/core/reducers.cljs#L106-L115)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/mapcat"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "mapcat",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_mapcat",
 :source {:code "(defcurried mapcat\n  \"Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable.\"\n  {}\n  [f coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (reduce f1 ret (f k v)))))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [106 115]},
 :full-name "clojure.core.reducers/mapcat",
 :clj-symbol "clojure.core.reducers/mapcat",
 :docstring "Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_mapcat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_mapcat.cljsdoc)
</pre>

