## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduceable?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reduceable?__ x)<br>
</samp>

---




Source docstring:

```
Returns true if coll satisfies IReduce
```

Source code:

```clj
(defn ^boolean reduceable?
  [x] (satisfies? IReduce x))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1463-1465](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L1463-L1465)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduceable?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduceable?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduceableQMARK",
 :source {:code "(defn ^boolean reduceable?\n  [x] (satisfies? IReduce x))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1463 1465]},
 :full-name "cljs.core/reduceable?",
 :docstring "Returns true if coll satisfies IReduce"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reduceableQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reduceableQMARK.cljsdoc)
</pre>

