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
  (slurp @(:client-js @browser-state)))
```

 <pre>
clojurescript @ r2322
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:48-49](https://github.com/clojure/clojurescript/blob/r2322/src/clj/cljs/repl/browser.clj#L48-L49)</ins>
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
 :source {:code "(defn repl-client-js []\n  (slurp @(:client-js @browser-state)))",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [48 49]},
 :full-name "cljs.repl.browser/repl-client-js",
 :full-name-encode "cljs.repl.browser_repl-client-js",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-client-js.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-client-js.cljsdoc)
</pre>

