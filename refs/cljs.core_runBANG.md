## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/run!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__run!__ proc coll)<br>
</samp>

---




Source docstring:

```
Runs the supplied procedure (via reduce), for purposes of side
effects, on successive items in the collection. Returns nil
```

Source code:

```clj
(defn run!
  [proc coll]
  (reduce #(proc %2) nil coll))
```

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8615-8619](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L8615-L8619)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/run!"]))
```

```clj
{:ns "cljs.core",
 :name "run!",
 :signature ["[proc coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core_runBANG",
 :source {:code "(defn run!\n  [proc coll]\n  (reduce #(proc %2) nil coll))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8615 8619]},
 :full-name "cljs.core/run!",
 :docstring "Runs the supplied procedure (via reduce), for purposes of side\neffects, on successive items in the collection. Returns nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_runBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_runBANG.cljsdoc)
</pre>

