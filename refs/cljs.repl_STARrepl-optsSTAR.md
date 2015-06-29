## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/\*repl-opts\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *repl-opts* nil)
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:35](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/repl.clj#L35)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/*repl-opts*"]))
```

```clj
{:ns "cljs.repl",
 :name "*repl-opts*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *repl-opts* nil)",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/clj/cljs/repl.clj",
          :lines [35]},
 :full-name "cljs.repl/*repl-opts*",
 :full-name-encode "cljs.repl_STARrepl-optsSTAR",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_STARrepl-optsSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_STARrepl-optsSTAR.cljsdoc)
</pre>

