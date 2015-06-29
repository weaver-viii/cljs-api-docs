## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/socket

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__socket__ host port)<br>
</samp>

---





Source code:

```clj
(defn socket [host port]
  (let [socket (Socket. host port)
        in     (io/reader socket)
        out    (io/writer socket)]
    {:socket socket :in in :out out}))
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:24-28](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/repl/node.clj#L24-L28)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/socket"]))
```

```clj
{:ns "cljs.repl.node",
 :name "socket",
 :type "function",
 :signature ["[host port]"],
 :source {:code "(defn socket [host port]\n  (let [socket (Socket. host port)\n        in     (io/reader socket)\n        out    (io/writer socket)]\n    {:socket socket :in in :out out}))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [24 28]},
 :full-name "cljs.repl.node/socket",
 :full-name-encode "cljs.repl.node_socket",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_socket.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_socket.cljsdoc)
</pre>

