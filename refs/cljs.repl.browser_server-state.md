## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/server-state

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defonce server-state (atom {:socket nil
                             :connection nil
                             :promised-conn nil
                             :return-value-fn nil
                             :client-js nil}))
```

 <pre>
clojurescript @ r1443
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:24-28](https://github.com/clojure/clojurescript/blob/r1443/src/clj/cljs/repl/browser.clj#L24-L28)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/server-state"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "server-state",
 :type "var",
 :source {:code "(defonce server-state (atom {:socket nil\n                             :connection nil\n                             :promised-conn nil\n                             :return-value-fn nil\n                             :client-js nil}))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [24 28]},
 :full-name "cljs.repl.browser/server-state",
 :full-name-encode "cljs.repl.browser_server-state",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_server-state.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_server-state.cljsdoc)
</pre>

