## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/setup

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2665"><img valign="middle" alt="[+] 0.0-2665" src="https://img.shields.io/badge/+-0.0--2665-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__setup__ repl-env opts)<br>
</samp>

---





Source code:

```clj
(defn setup [repl-env opts]
  (server/start repl-env))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:195-196](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/browser.clj#L195-L196)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/setup"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "setup",
 :type "function",
 :signature ["[repl-env opts]"],
 :source {:code "(defn setup [repl-env opts]\n  (server/start repl-env))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [195 196]},
 :full-name "cljs.repl.browser/setup",
 :full-name-encode "cljs.repl.browser_setup",
 :history [["+" "0.0-2665"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_setup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_setup.cljsdoc)
</pre>

