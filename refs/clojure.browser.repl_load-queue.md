## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/load-queue

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3115"><img valign="middle" alt="[+] 0.0-3115" src="https://img.shields.io/badge/+-0.0--3115-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def load-queue nil)
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[repl.cljs:110](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/clojure/browser/repl.cljs#L110)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/load-queue"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "load-queue",
 :type "var",
 :source {:code "(def load-queue nil)",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [110]},
 :full-name "clojure.browser.repl/load-queue",
 :full-name-encode "clojure.browser.repl_load-queue",
 :history [["+" "0.0-3115"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_load-queue.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_load-queue.cljsdoc)
</pre>

