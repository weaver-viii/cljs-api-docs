## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/start-evaluator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__start-evaluator__ url)<br>
</samp>

---




Source docstring:

```
Start the REPL server connection.
```

Source code:

```clj
(defn start-evaluator
  [url]
  (if-let [repl-connection (net/xpc-connection)]
    (let [connection (net/xhr-connection)]
      (event/listen connection
        :success
        (fn [e]
          (net/transmit
            repl-connection
            :evaluate-javascript
            (.getResponseText (.-currentTarget e)
              ()))))

      (net/register-service repl-connection
        :send-result
        (fn [data]
          (send-result connection url (wrap-message :result data))))

      (net/register-service repl-connection
        :print
        (fn [data]
          (send-print url (wrap-message :print data))))

      (net/connect repl-connection
        (constantly nil))

      (js/setTimeout #(send-result connection url (wrap-message :ready "ready")) 50))
    (js/alert "No 'xpc' param provided to child iframe.")))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:82-110](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/clojure/browser/repl.cljs#L82-L110)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/start-evaluator"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "start-evaluator",
 :signature ["[url]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl_start-evaluator",
 :source {:code "(defn start-evaluator\n  [url]\n  (if-let [repl-connection (net/xpc-connection)]\n    (let [connection (net/xhr-connection)]\n      (event/listen connection\n        :success\n        (fn [e]\n          (net/transmit\n            repl-connection\n            :evaluate-javascript\n            (.getResponseText (.-currentTarget e)\n              ()))))\n\n      (net/register-service repl-connection\n        :send-result\n        (fn [data]\n          (send-result connection url (wrap-message :result data))))\n\n      (net/register-service repl-connection\n        :print\n        (fn [data]\n          (send-print url (wrap-message :print data))))\n\n      (net/connect repl-connection\n        (constantly nil))\n\n      (js/setTimeout #(send-result connection url (wrap-message :ready \"ready\")) 50))\n    (js/alert \"No 'xpc' param provided to child iframe.\")))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [82 110]},
 :full-name "clojure.browser.repl/start-evaluator",
 :docstring "Start the REPL server connection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_start-evaluator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_start-evaluator.cljsdoc)
</pre>

