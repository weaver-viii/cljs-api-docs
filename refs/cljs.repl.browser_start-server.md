## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/start-server

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__start-server__ opts)<br>
</samp>

---




Source docstring:

```
Start the server on the specified port.
```

Source code:

```clj
(defn start-server
  [opts]
  (let [ss (ServerSocket. (:port opts))]
    (future (server-loop opts ss))
    (swap! server-state (fn [old] (assoc old :socket ss :port (:port opts))))))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:265-270](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L265-L270)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/start-server"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "start-server",
 :signature ["[opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_start-server",
 :source {:code "(defn start-server\n  [opts]\n  (let [ss (ServerSocket. (:port opts))]\n    (future (server-loop opts ss))\n    (swap! server-state (fn [old] (assoc old :socket ss :port (:port opts))))))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [265 270]},
 :full-name "cljs.repl.browser/start-server",
 :docstring "Start the server on the specified port."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_start-server.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_start-server.cljsdoc)
</pre>

