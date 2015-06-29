## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dissoc!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc!)
</td>
</tr>
</table>

 <samp>
(__dissoc!__ tcoll key)<br>
</samp>

---





Source code:

```clj
(defn dissoc! [tcoll key]
  (-dissoc! tcoll key))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2431-2432](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L2431-L2432)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dissoc!"]))
```

```clj
{:ns "cljs.core",
 :name "dissoc!",
 :signature ["[tcoll key]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_dissocBANG",
 :source {:code "(defn dissoc! [tcoll key]\n  (-dissoc! tcoll key))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2431 2432]},
 :full-name "cljs.core/dissoc!",
 :clj-symbol "clojure.core/dissoc!"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dissocBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dissocBANG.cljsdoc)
</pre>

