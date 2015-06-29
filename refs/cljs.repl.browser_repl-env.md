## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---





Source code:

```clj
(defn repl-env [& {:as opts}]
  (let [opts (merge {:port 9000 :optimizations :simple :working-dir ".repl"} opts)]
    (do (swap! server-state
               (fn [old] (assoc old :client-js
                               (future (create-client-js-file
                                        opts
                                        (io/file (:working-dir opts) "client.js"))))))
        opts)))
```

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:320-327](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/repl/browser.clj#L320-L327)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "repl-env",
 :type "function",
 :signature ["[& {:as opts}]"],
 :source {:code "(defn repl-env [& {:as opts}]\n  (let [opts (merge {:port 9000 :optimizations :simple :working-dir \".repl\"} opts)]\n    (do (swap! server-state\n               (fn [old] (assoc old :client-js\n                               (future (create-client-js-file\n                                        opts\n                                        (io/file (:working-dir opts) \"client.js\"))))))\n        opts)))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [320 327]},
 :full-name "cljs.repl.browser/repl-env",
 :full-name-encode "cljs.repl.browser_repl-env",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_repl-env.cljsdoc)
</pre>

