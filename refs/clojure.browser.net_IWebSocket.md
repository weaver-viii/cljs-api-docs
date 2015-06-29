## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/IWebSocket

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IWebSocket
  (open? [this]))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:143-144](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/browser/net.cljs#L143-L144)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/IWebSocket"]))
```

```clj
{:ns "clojure.browser.net",
 :name "IWebSocket",
 :type "protocol",
 :full-name-encode "clojure.browser.net_IWebSocket",
 :source {:code "(defprotocol IWebSocket\n  (open? [this]))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [143 144]},
 :methods [{:name "open?", :signature ["[this]"], :docstring nil}],
 :full-name "clojure.browser.net/IWebSocket",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_IWebSocket.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_IWebSocket.cljsdoc)
</pre>

