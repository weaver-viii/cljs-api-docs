## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/preloaded-libs

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def preloaded-libs (atom #{}))
```

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:24](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/repl/browser.clj#L24)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/preloaded-libs"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "preloaded-libs",
 :type "var",
 :source {:code "(def preloaded-libs (atom #{}))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [24]},
 :full-name "cljs.repl.browser/preloaded-libs",
 :full-name-encode "cljs.repl.browser_preloaded-libs",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_preloaded-libs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_preloaded-libs.cljsdoc)
</pre>

