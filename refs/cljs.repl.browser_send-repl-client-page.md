## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-repl-client-page

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-repl-client-page__ opts conn request)<br>
</samp>

---





Source code:

```clj
(defn send-repl-client-page
  [opts conn request]
  (send-and-close conn 200
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
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:169-180](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl/browser.clj#L169-L180)</ins>
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
 :signature ["[opts conn request]"],
 :source {:code "(defn send-repl-client-page\n  [opts conn request]\n  (send-and-close conn 200\n    (str \"<html><head><meta charset=\\\"UTF-8\\\"></head><body>\n          <script type=\\\"text/javascript\\\">\"\n         (repl-client-js)\n         \"</script>\"\n         \"<script type=\\\"text/javascript\\\">\n          clojure.browser.repl.client.start(\\\"http://\" (-> request :headers :host) \"\\\");\n          </script>\"\n         \"</body></html>\")\n    \"text/html\"))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [169 180]},
 :full-name "cljs.repl.browser/send-repl-client-page",
 :full-name-encode "cljs.repl.browser_send-repl-client-page",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-repl-client-page.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-repl-client-page.cljsdoc)
</pre>
