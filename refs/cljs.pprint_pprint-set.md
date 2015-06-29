## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pprint-set

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def pprint-set (formatter-out "~<#{~;~@{~w~^ ~:_~}~;}~:>"))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2873](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L2873)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-set"]))
```

```clj
{:ns "cljs.pprint",
 :name "pprint-set",
 :type "var",
 :source {:code "(def pprint-set (formatter-out \"~<#{~;~@{~w~^ ~:_~}~;}~:>\"))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2873]},
 :full-name "cljs.pprint/pprint-set",
 :full-name-encode "cljs.pprint_pprint-set",
 :history [["+" "0.0-3255"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pprint-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pprint-set.cljsdoc)
</pre>

