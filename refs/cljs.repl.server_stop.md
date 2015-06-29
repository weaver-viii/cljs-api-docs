## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/stop

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__stop__)<br>
</samp>

---





Source code:

```clj
(defn stop []
  (.close (:socket @state)))
```

 <pre>
clojurescript @ r3196
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:177-178](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl/server.clj#L177-L178)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/stop"]))
```

```clj
{:ns "cljs.repl.server",
 :name "stop",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn stop []\n  (.close (:socket @state)))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [177 178]},
 :full-name "cljs.repl.server/stop",
 :full-name-encode "cljs.repl.server_stop",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_stop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_stop.cljsdoc)
</pre>

