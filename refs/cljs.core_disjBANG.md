## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/disj!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/disj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/disj!)
</td>
</tr>
</table>

 <samp>
(__disj!__ tcoll val)<br>
</samp>

---





Source code:

```clj
(defn disj! [tcoll val]
  (-disjoin! tcoll val))
```

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2412-2413](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L2412-L2413)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/disj!"]))
```

```clj
{:ns "cljs.core",
 :name "disj!",
 :signature ["[tcoll val]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_disjBANG",
 :source {:code "(defn disj! [tcoll val]\n  (-disjoin! tcoll val))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2412 2413]},
 :full-name "cljs.core/disj!",
 :clj-symbol "clojure.core/disj!"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_disjBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_disjBANG.cljsdoc)
</pre>

