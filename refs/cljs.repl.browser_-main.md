## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/-main

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__-main__)<br>
</samp>

---





Source code:

```clj
(defn -main []
  (repl/repl (repl-env)))
```

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:577-578](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/repl/browser.clj#L577-L578)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/-main"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "-main",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn -main []\n  (repl/repl (repl-env)))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [577 578]},
 :full-name "cljs.repl.browser/-main",
 :full-name-encode "cljs.repl.browser_-main",
 :history [["+" "0.0-3165"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_-main.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_-main.cljsdoc)
</pre>

