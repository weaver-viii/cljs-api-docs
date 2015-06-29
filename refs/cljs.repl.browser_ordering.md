## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/ordering

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic ordering nil)
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:24](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/repl/browser.clj#L24)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/ordering"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "ordering",
 :type "dynamic var",
 :source {:code "(def ^:dynamic ordering nil)",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [24]},
 :full-name "cljs.repl.browser/ordering",
 :full-name-encode "cljs.repl.browser_ordering",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_ordering.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_ordering.cljsdoc)
</pre>

