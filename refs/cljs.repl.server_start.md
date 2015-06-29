## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/start

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__start__ opts)<br>
</samp>

---




Source docstring:

```
Start the server on the specified port.
```

Source code:

```clj
(defn start
  [opts]
  (let [ss (ServerSocket. (:port opts))]
    (future (server-loop opts ss))
    (swap! state (fn [old] (assoc old :socket ss :port (:port opts))))))
```

 <pre>
clojurescript @ r2173
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:164-169](https://github.com/clojure/clojurescript/blob/r2173/src/clj/cljs/repl/server.clj#L164-L169)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/start"]))
```

```clj
{:ns "cljs.repl.server",
 :name "start",
 :signature ["[opts]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_start",
 :source {:code "(defn start\n  [opts]\n  (let [ss (ServerSocket. (:port opts))]\n    (future (server-loop opts ss))\n    (swap! state (fn [old] (assoc old :socket ss :port (:port opts))))))",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [164 169]},
 :full-name "cljs.repl.server/start",
 :docstring "Start the server on the specified port."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_start.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_start.cljsdoc)
</pre>

