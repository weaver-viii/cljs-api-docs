## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/order

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def order (atom 0))
```

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:55](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/clojure/browser/repl.cljs#L55)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/order"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "order",
 :type "var",
 :source {:code "(def order (atom 0))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [55]},
 :full-name "clojure.browser.repl/order",
 :full-name-encode "clojure.browser.repl_order",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_order.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_order.cljsdoc)
</pre>

