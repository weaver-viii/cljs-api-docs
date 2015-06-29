## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xhr-connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__xhr-connection__)<br>
</samp>

---




Source docstring:

```
Returns an XhrIo connection
```

Source code:

```clj
(defn xhr-connection
  []
  (goog.net.XhrIo.))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:83-86](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/browser/net.cljs#L83-L86)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/xhr-connection"]))
```

```clj
{:ns "clojure.browser.net",
 :name "xhr-connection",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.net_xhr-connection",
 :source {:code "(defn xhr-connection\n  []\n  (goog.net.XhrIo.))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [83 86]},
 :full-name "clojure.browser.net/xhr-connection",
 :docstring "Returns an XhrIo connection"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.net_xhr-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net_xhr-connection.cljsdoc)
</pre>

