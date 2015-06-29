## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/close-socket

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__close-socket__ s)<br>
</samp>

---





Source code:

```clj
(defn close-socket [s]
  (.close (:in s))
  (.close (:out s))
  (.close (:socket s)))
```

 <pre>
clojurescript @ r2816
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:29-32](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/node.clj#L29-L32)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/close-socket"]))
```

```clj
{:ns "cljs.repl.node",
 :name "close-socket",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn close-socket [s]\n  (.close (:in s))\n  (.close (:out s))\n  (.close (:socket s)))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [29 32]},
 :full-name "cljs.repl.node/close-socket",
 :full-name-encode "cljs.repl.node_close-socket",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_close-socket.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_close-socket.cljsdoc)
</pre>

