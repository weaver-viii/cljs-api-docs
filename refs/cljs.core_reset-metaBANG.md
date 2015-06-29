## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reset-meta!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset-meta!)
</td>
</tr>
</table>

 <samp>
(__reset-meta!__ iref m)<br>
</samp>

---




Source docstring:

```
Atomically resets the metadata for an atom
```

Source code:

```clj
(defn reset-meta!
  [iref m]
  (set! (.-meta iref) m))
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8044-8047](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L8044-L8047)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reset-meta!"]))
```

```clj
{:ns "cljs.core",
 :name "reset-meta!",
 :signature ["[iref m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reset-metaBANG",
 :source {:code "(defn reset-meta!\n  [iref m]\n  (set! (.-meta iref) m))",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8044 8047]},
 :full-name "cljs.core/reset-meta!",
 :clj-symbol "clojure.core/reset-meta!",
 :docstring "Atomically resets the metadata for an atom"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reset-metaBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reset-metaBANG.cljsdoc)
</pre>

