## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduced

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reduced__ x)<br>
</samp>

---




Source docstring:

```
Wraps x in a way such that a reduce will terminate with the value x
```

Source code:

```clj
(defn reduced
  [x]
  (Reduced. x))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1017-1020](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1017-L1020)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduced"]))
```

```clj
{:ns "cljs.core",
 :name "reduced",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduced",
 :source {:code "(defn reduced\n  [x]\n  (Reduced. x))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1017 1020]},
 :full-name "cljs.core/reduced",
 :docstring "Wraps x in a way such that a reduce will terminate with the value x"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reduced.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reduced.cljsdoc)
</pre>

