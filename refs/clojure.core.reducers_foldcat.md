## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/foldcat

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__foldcat__ coll)<br>
</samp>

---




Source docstring:

```
Equivalent to (fold cat append! coll)
```

Source code:

```clj
(defn foldcat
  [coll]
  (fold cat append! coll))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:228-231](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/core/reducers.cljs#L228-L231)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/foldcat"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "foldcat",
 :signature ["[coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_foldcat",
 :source {:code "(defn foldcat\n  [coll]\n  (fold cat append! coll))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [228 231]},
 :full-name "clojure.core.reducers/foldcat",
 :docstring "Equivalent to (fold cat append! coll)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_foldcat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_foldcat.cljsdoc)
</pre>
