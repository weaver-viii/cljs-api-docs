## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/remove

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/remove)
</td>
</tr>
</table>

 <samp>
(__remove__ pred)<br>
</samp>
 <samp>
(__remove__ pred coll)<br>
</samp>

---




Source docstring:

```
Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```

Source code:

```clj
(defcurried remove
  "Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (filter (complement pred) coll))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:145-150](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/core/reducers.cljs#L145-L150)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/remove"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "remove",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_remove",
 :source {:code "(defcurried remove\n  \"Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (filter (complement pred) coll))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [145 150]},
 :full-name "clojure.core.reducers/remove",
 :clj-symbol "clojure.core.reducers/remove",
 :docstring "Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_remove.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_remove.cljsdoc)
</pre>

