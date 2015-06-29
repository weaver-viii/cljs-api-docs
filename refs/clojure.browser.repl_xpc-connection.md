## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/xpc-connection

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def xpc-connection (atom nil))
```

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:21](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/clojure/browser/repl.cljs#L21)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/xpc-connection"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "xpc-connection",
 :type "var",
 :source {:code "(def xpc-connection (atom nil))",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [21]},
 :full-name "clojure.browser.repl/xpc-connection",
 :full-name-encode "clojure.browser.repl_xpc-connection",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_xpc-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_xpc-connection.cljsdoc)
</pre>

