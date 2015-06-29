## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/es

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic es nil)
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:25](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/browser.clj#L25)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/es"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "es",
 :type "dynamic var",
 :source {:code "(def ^:dynamic es nil)",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [25]},
 :full-name "cljs.repl.browser/es",
 :full-name-encode "cljs.repl.browser_es",
 :history [["+" "0.0-3148"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_es.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_es.cljsdoc)
</pre>

