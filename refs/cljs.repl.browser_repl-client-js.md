## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-client-js

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-client-js__)<br>
</samp>

---





Source code:

```clj
(defn repl-client-js []
  (slurp (:client-js @browser-state)))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:49-50](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/browser.clj#L49-L50)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-client-js"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "repl-client-js",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn repl-client-js []\n  (slurp (:client-js @browser-state)))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [49 50]},
 :full-name "cljs.repl.browser/repl-client-js",
 :full-name-encode "cljs.repl.browser_repl-client-js",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-client-js.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-client-js.cljsdoc)
</pre>

