## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/filter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/filter</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/filter)
</td>
</tr>
</table>

 <samp>
(__filter__ pred)<br>
</samp>
 <samp>
(__filter__ pred coll)<br>
</samp>

---




Source docstring:

```
Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```

Source code:

```clj
(defcurried filter
  "Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               ret))))))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:117-128](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/core/reducers.cljs#L117-L128)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/filter"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "filter",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_filter",
 :source {:code "(defcurried filter\n  \"Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               ret))))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [117 128]},
 :full-name "clojure.core.reducers/filter",
 :clj-symbol "clojure.core.reducers/filter",
 :docstring "Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_filter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_filter.cljsdoc)
</pre>

