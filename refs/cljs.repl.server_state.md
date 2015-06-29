## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/state

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defonce state (atom {:socket nil
                      :connection nil
                      :promised-conn nil}))
```

 <pre>
clojurescript @ r1835
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:16-18](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/repl/server.clj#L16-L18)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/state"]))
```

```clj
{:ns "cljs.repl.server",
 :name "state",
 :type "var",
 :source {:code "(defonce state (atom {:socket nil\n                      :connection nil\n                      :promised-conn nil}))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [16 18]},
 :full-name "cljs.repl.server/state",
 :full-name-encode "cljs.repl.server_state",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_state.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_state.cljsdoc)
</pre>

