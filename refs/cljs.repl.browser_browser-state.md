## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/browser-state

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defonce browser-state (atom {:return-value-fn nil
                              :client-js nil}))
```

 <pre>
clojurescript @ r2307
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:20-21](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/repl/browser.clj#L20-L21)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/browser-state"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "browser-state",
 :type "var",
 :source {:code "(defonce browser-state (atom {:return-value-fn nil\n                              :client-js nil}))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [20 21]},
 :full-name "cljs.repl.browser/browser-state",
 :full-name-encode "cljs.repl.browser_browser-state",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_browser-state.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_browser-state.cljsdoc)
</pre>

