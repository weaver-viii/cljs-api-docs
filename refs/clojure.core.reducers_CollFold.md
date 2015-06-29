## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/CollFold

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol CollFold
  (coll-fold [coll n combinef reducef]))
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:46-47](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/clojure/core/reducers.cljs#L46-L47)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/CollFold"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "CollFold",
 :type "protocol",
 :full-name-encode "clojure.core.reducers_CollFold",
 :source {:code "(defprotocol CollFold\n  (coll-fold [coll n combinef reducef]))",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [46 47]},
 :methods [{:name "coll-fold",
            :signature ["[coll n combinef reducef]"],
            :docstring nil}],
 :full-name "clojure.core.reducers/CollFold",
 :history [["+" "0.0-2120"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_CollFold.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_CollFold.cljsdoc)
</pre>

