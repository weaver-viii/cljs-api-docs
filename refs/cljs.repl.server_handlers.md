## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/handlers

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defonce handlers (atom {}))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:51](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl/server.clj#L51)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/handlers"]))
```

```clj
{:ns "cljs.repl.server",
 :name "handlers",
 :type "var",
 :source {:code "(defonce handlers (atom {}))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [51]},
 :full-name "cljs.repl.server/handlers",
 :full-name-encode "cljs.repl.server_handlers",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_handlers.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_handlers.cljsdoc)
</pre>

