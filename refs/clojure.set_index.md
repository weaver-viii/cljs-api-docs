## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/index

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/index</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/index)
</td>
</tr>
</table>

 <samp>
(__index__ xrel ks)<br>
</samp>

---




Source docstring:

```
Returns a map of the distinct values of ks in the xrel mapped to a
set of the maps in xrel with the corresponding values of ks.
```

Source code:

```clj
(defn index
  [xrel ks]
    (reduce
     (fn [m x]
       (let [ik (select-keys x ks)]
         (assoc m ik (conj (get m ik #{}) x))))
     {} xrel))
```

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:87-95](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/clojure/set.cljs#L87-L95)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/index"]))
```

```clj
{:ns "clojure.set",
 :name "index",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_index",
 :source {:code "(defn index\n  [xrel ks]\n    (reduce\n     (fn [m x]\n       (let [ik (select-keys x ks)]\n         (assoc m ik (conj (get m ik #{}) x))))\n     {} xrel))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/clojure/set.cljs",
          :lines [87 95]},
 :full-name "clojure.set/index",
 :clj-symbol "clojure.set/index",
 :docstring "Returns a map of the distinct values of ks in the xrel mapped to a\nset of the maps in xrel with the corresponding values of ks."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_index.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_index.cljsdoc)
</pre>

