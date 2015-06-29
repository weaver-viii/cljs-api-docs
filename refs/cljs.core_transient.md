## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/transient

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/transient</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/transient)
</td>
</tr>
</table>

 <samp>
(__transient__ coll)<br>
</samp>

---




Source docstring:

```
Returns a new, transient version of the collection, in constant time.
```

Source code:

```clj
(defn transient
  [coll]
  (-as-transient coll))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3211-3214](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L3211-L3214)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/transient"]))
```

```clj
{:ns "cljs.core",
 :name "transient",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_transient",
 :source {:code "(defn transient\n  [coll]\n  (-as-transient coll))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3211 3214]},
 :full-name "cljs.core/transient",
 :clj-symbol "clojure.core/transient",
 :docstring "Returns a new, transient version of the collection, in constant time."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_transient.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_transient.cljsdoc)
</pre>

