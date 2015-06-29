## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-404

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-404__ conn path)<br>
</samp>

---





Source code:

```clj
(defn send-404 [conn path]
  (send-and-close conn 404
                  (str "<html><body>"
                       "<h2>Page not found</h2>"
                       "No page " path " found on this server."
                       "</body></html>")
                  "text/html"))
```

 <pre>
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:92-98](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/repl/browser.clj#L92-L98)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-404"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "send-404",
 :type "function",
 :signature ["[conn path]"],
 :source {:code "(defn send-404 [conn path]\n  (send-and-close conn 404\n                  (str \"<html><body>\"\n                       \"<h2>Page not found</h2>\"\n                       \"No page \" path \" found on this server.\"\n                       \"</body></html>\")\n                  \"text/html\"))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [92 98]},
 :full-name "cljs.repl.browser/send-404",
 :full-name-encode "cljs.repl.browser_send-404",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-404.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-404.cljsdoc)
</pre>

