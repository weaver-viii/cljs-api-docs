## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/\*cljs-verbose\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *cljs-verbose* false)
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:34](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/repl.clj#L34)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/*cljs-verbose*"]))
```

```clj
{:ns "cljs.repl",
 :name "*cljs-verbose*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *cljs-verbose* false)",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/repl.clj",
          :lines [34]},
 :full-name "cljs.repl/*cljs-verbose*",
 :full-name-encode "cljs.repl_STARcljs-verboseSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_STARcljs-verboseSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_STARcljs-verboseSTAR.cljsdoc)
</pre>

