## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/set-connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-connection__ conn)<br>
</samp>

---




Source docstring:

```
Given a new available connection, either use it to deliver the
connection which was promised or store the connection for later
use.
```

Source code:

```clj
(defn set-connection
  [conn]
  (if-let [promised-conn (:promised-conn @state)]
    (do
      (swap! state
        (fn [old]
          (-> old
            (assoc :connection nil)
            (assoc :promised-conn nil))))
      (deliver promised-conn conn))
    (swap! state (fn [old] (assoc old :connection conn)))))
```

 <pre>
clojurescript @ r2758
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:28-41](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/repl/server.clj#L28-L41)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/set-connection"]))
```

```clj
{:ns "cljs.repl.server",
 :name "set-connection",
 :signature ["[conn]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_set-connection",
 :source {:code "(defn set-connection\n  [conn]\n  (if-let [promised-conn (:promised-conn @state)]\n    (do\n      (swap! state\n        (fn [old]\n          (-> old\n            (assoc :connection nil)\n            (assoc :promised-conn nil))))\n      (deliver promised-conn conn))\n    (swap! state (fn [old] (assoc old :connection conn)))))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [28 41]},
 :full-name "cljs.repl.server/set-connection",
 :docstring "Given a new available connection, either use it to deliver the\nconnection which was promised or store the connection for later\nuse."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_set-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_set-connection.cljsdoc)
</pre>

