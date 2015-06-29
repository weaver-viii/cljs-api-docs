## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/setup

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2665"><img valign="middle" alt="[+] 0.0-2665" src="https://img.shields.io/badge/+-0.0--2665-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__setup__ {:keys \[working-dir\], :as repl-env} opts)<br>
</samp>

---





Source code:

```clj
(defn setup [{:keys [working-dir] :as repl-env} opts]
  (binding [browser-state (:browser-state repl-env)
            ordering (:ordering repl-env)
            es (:es repl-env)
            server/state (:server-state repl-env)]
    (repl/err-out (println "Compiling client js ..."))
    (swap! browser-state
      (fn [old]
        (assoc old :client-js
          (create-client-js-file
            repl-env (io/file working-dir "client.js")))))
    (repl/err-out (println "Waiting for browser to connect ..."))
    opts
    (server/start repl-env)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:506-519](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/browser.clj#L506-L519)</ins>
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
 :signature ["[{:keys [working-dir], :as repl-env} opts]"],
 :source {:code "(defn setup [{:keys [working-dir] :as repl-env} opts]\n  (binding [browser-state (:browser-state repl-env)\n            ordering (:ordering repl-env)\n            es (:es repl-env)\n            server/state (:server-state repl-env)]\n    (repl/err-out (println \"Compiling client js ...\"))\n    (swap! browser-state\n      (fn [old]\n        (assoc old :client-js\n          (create-client-js-file\n            repl-env (io/file working-dir \"client.js\")))))\n    (repl/err-out (println \"Waiting for browser to connect ...\"))\n    opts\n    (server/start repl-env)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [506 519]},
 :full-name "cljs.repl.browser/setup",
 :full-name-encode "cljs.repl.browser_setup",
 :history [["+" "0.0-2665"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_setup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_setup.cljsdoc)
</pre>

