## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/\*current-env\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *current-env* nil)
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:259](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.cljs#L259)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/*current-env*"]))
```

```clj
{:ns "cljs.test",
 :name "*current-env*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *current-env* nil)",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [259]},
 :full-name "cljs.test/*current-env*",
 :full-name-encode "cljs.test_STARcurrent-envSTAR",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_STARcurrent-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_STARcurrent-envSTAR.cljsdoc)
</pre>

