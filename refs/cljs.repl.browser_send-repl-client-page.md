## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-repl-client-page

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-repl-client-page__ request conn opts)<br>
</samp>

---





Source code:

```clj
(defn send-repl-client-page
  [request conn opts]
  (server/send-and-close conn 200
    (str "<html><head><meta charset=\"UTF-8\"></head><body>
          <script type=\"text/javascript\">"
         (repl-client-js)
         "</script>"
         "<script type=\"text/javascript\">
          clojure.browser.repl.client.start(\"http://" (-> request :headers :host) "\");
          </script>"
         "</body></html>")
    "text/html"))
```

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:51-62](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/repl/browser.clj#L51-L62)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-repl-client-page"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "send-repl-client-page",
 :type "function",
 :signature ["[request conn opts]"],
 :source {:code "(defn send-repl-client-page\n  [request conn opts]\n  (server/send-and-close conn 200\n    (str \"<html><head><meta charset=\\\"UTF-8\\\"></head><body>\n          <script type=\\\"text/javascript\\\">\"\n         (repl-client-js)\n         \"</script>\"\n         \"<script type=\\\"text/javascript\\\">\n          clojure.browser.repl.client.start(\\\"http://\" (-> request :headers :host) \"\\\");\n          </script>\"\n         \"</body></html>\")\n    \"text/html\"))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [51 62]},
 :full-name "cljs.repl.browser/send-repl-client-page",
 :full-name-encode "cljs.repl.browser_send-repl-client-page",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-repl-client-page.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-repl-client-page.cljsdoc)
</pre>

