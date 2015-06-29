## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__connection__)<br>
</samp>

---




Source docstring:

```
Promise to return a connection when one is available. If a
connection is not available, store the promise in server/state.
```

Source code:

```clj
(defn connection
  []
  (let [p (promise)
        conn (:connection @state)]
    (if (and conn (not (.isClosed conn)))
      (do (deliver p conn)
          p)
      (do (swap! state (fn [old] (assoc old :promised-conn p)))
          p))))
```

 <pre>
clojurescript @ r2024
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:20-30](https://github.com/clojure/clojurescript/blob/r2024/src/clj/cljs/repl/server.clj#L20-L30)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/connection"]))
```

```clj
{:ns "cljs.repl.server",
 :name "connection",
 :signature ["[]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_connection",
 :source {:code "(defn connection\n  []\n  (let [p (promise)\n        conn (:connection @state)]\n    (if (and conn (not (.isClosed conn)))\n      (do (deliver p conn)\n          p)\n      (do (swap! state (fn [old] (assoc old :promised-conn p)))\n          p))))",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [20 30]},
 :full-name "cljs.repl.server/connection",
 :docstring "Promise to return a connection when one is available. If a\nconnection is not available, store the promise in server/state."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_connection.cljsdoc)
</pre>

