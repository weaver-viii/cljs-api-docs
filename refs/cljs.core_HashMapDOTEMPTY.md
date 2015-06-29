## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/HashMap.EMPTY

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.HashMap/EMPTY (HashMap. nil 0 (js-obj)))
```

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2591](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2591)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashMap.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "HashMap.EMPTY",
 :type "var",
 :parent-type "HashMap",
 :source {:code "(set! cljs.core.HashMap/EMPTY (HashMap. nil 0 (js-obj)))",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2591]},
 :full-name "cljs.core/HashMap.EMPTY",
 :full-name-encode "cljs.core_HashMapDOTEMPTY",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_HashMapDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_HashMapDOTEMPTY.cljsdoc)
</pre>

