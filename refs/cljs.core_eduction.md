## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/eduction

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/eduction</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/eduction)
</td>
</tr>
</table>

 <samp>
(__eduction__ & xforms)<br>
</samp>

---




Source docstring:

```
Returns a reducible/iterable application of the transducers
to the items in coll. Transducers are applied in order as if
combined with comp. Note that these applications will be
performed every time reduce/iterator is called.
```

Source code:

```clj
(defn eduction
  [& xforms]
  (Eduction. (apply comp (butlast xforms)) (last xforms)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8951-8958](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L8951-L8958)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/eduction"]))
```

```clj
{:ns "cljs.core",
 :name "eduction",
 :signature ["[& xforms]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core_eduction",
 :source {:code "(defn eduction\n  [& xforms]\n  (Eduction. (apply comp (butlast xforms)) (last xforms)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8951 8958]},
 :full-name "cljs.core/eduction",
 :clj-symbol "clojure.core/eduction",
 :docstring "Returns a reducible/iterable application of the transducers\nto the items in coll. Transducers are applied in order as if\ncombined with comp. Note that these applications will be\nperformed every time reduce/iterator is called."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_eduction.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_eduction.cljsdoc)
</pre>

