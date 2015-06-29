## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/handle-connection

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__handle-connection__ opts conn)<br>
</samp>

---





Source code:

```clj
(defn handle-connection
  [opts conn]
  (let [rdr (BufferedReader. (InputStreamReader. (.getInputStream conn)))]
    (if-let [request (read-request rdr)]
      (case (:method request)
        :get (handle-get opts conn request)
        :post (handle-post conn (read-string (:content request)))
        (.close conn))
      (.close conn))))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:230-238](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/repl/browser.clj#L230-L238)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/handle-connection"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "handle-connection",
 :type "function",
 :signature ["[opts conn]"],
 :source {:code "(defn handle-connection\n  [opts conn]\n  (let [rdr (BufferedReader. (InputStreamReader. (.getInputStream conn)))]\n    (if-let [request (read-request rdr)]\n      (case (:method request)\n        :get (handle-get opts conn request)\n        :post (handle-post conn (read-string (:content request)))\n        (.close conn))\n      (.close conn))))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [230 238]},
 :full-name "cljs.repl.browser/handle-connection",
 :full-name-encode "cljs.repl.browser_handle-connection",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_handle-connection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_handle-connection.cljsdoc)
</pre>

