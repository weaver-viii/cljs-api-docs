## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/websocket-connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__websocket-connection__)<br>
</samp>
 <samp>
(__websocket-connection__ auto-reconnect?)<br>
</samp>
 <samp>
(__websocket-connection__ auto-reconnect? next-reconnect-fn)<br>
</samp>

---





Source code:

```clj
(defn websocket-connection
  ([]
     (websocket-connection nil nil))
  ([auto-reconnect?]
     (websocket-connection auto-reconnect? nil))
  ([auto-reconnect? next-reconnect-fn]
     (WebSocket. auto-reconnect? next-reconnect-fn)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[net.cljs:174-180](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/clojure/browser/net.cljs#L174-L180)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/websocket-connection"]))
```

```clj
{:ns "clojure.browser.net",
 :name "websocket-connection",
 :type "function",
 :signature ["[]"
             "[auto-reconnect?]"
             "[auto-reconnect? next-reconnect-fn]"],
 :source {:code "(defn websocket-connection\n  ([]\n     (websocket-connection nil nil))\n  ([auto-reconnect?]\n     (websocket-connection auto-reconnect? nil))\n  ([auto-reconnect? next-reconnect-fn]\n     (WebSocket. auto-reconnect? next-reconnect-fn)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/clojure/browser/net.cljs",
          :lines [174 180]},
 :full-name "clojure.browser.net/websocket-connection",
 :full-name-encode "clojure.browser.net_websocket-connection",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_websocket-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_websocket-connection.cljsdoc)
</pre>

