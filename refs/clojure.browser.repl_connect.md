## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/connect

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__connect__ repl-server-url)<br>
</samp>

---




Source docstring:

```
Connects to a REPL server from an HTML document. After the
connection is made, the REPL will evaluate forms in the context of
the document that called this function.
```

Source code:

```clj
(defn connect
  [repl-server-url]
  (let [repl-connection
        (net/xpc-connection
          {:peer_uri repl-server-url})]
    (swap! xpc-connection (constantly repl-connection))
    (net/register-service repl-connection
      :evaluate-javascript
      (fn [js]
        (net/transmit
          repl-connection
          :send-result
          (evaluate-javascript repl-connection js))))
    (net/connect repl-connection
      (constantly nil)
      (fn [iframe]
        (set! (.-display (.-style iframe))
          "none")))
    ;; Monkey-patch goog.require if running under optimizations :none - David
    (when-not js/COMPILED
      (set! *loaded-libs*
        (let [gntp (.. js/goog -dependencies_ -nameToPath)]
          (into #{}
            (filter
              (fn [name]
                (aget (.. js/goog -dependencies_ -visited) (aget gntp name)))
              (js-keys gntp)))))
      (set! (.-isProvided_ js/goog) (fn [_] false))
      (set! (.-require js/goog)
        (fn [name reload]
          (when (or (not (contains? *loaded-libs* name)) reload)
            (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))
            (.appendChild js/document.body
              (let [script (.createElement js/document "script")]
                (set! (.-type script) "text/javascript")
                (set! (.-src script)
                  (str "goog/"
                    (aget (.. js/goog -dependencies_ -nameToPath) name)))
                script))))))))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:95-136](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/clojure/browser/repl.cljs#L95-L136)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/connect"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "connect",
 :signature ["[repl-server-url]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl_connect",
 :source {:code "(defn connect\n  [repl-server-url]\n  (let [repl-connection\n        (net/xpc-connection\n          {:peer_uri repl-server-url})]\n    (swap! xpc-connection (constantly repl-connection))\n    (net/register-service repl-connection\n      :evaluate-javascript\n      (fn [js]\n        (net/transmit\n          repl-connection\n          :send-result\n          (evaluate-javascript repl-connection js))))\n    (net/connect repl-connection\n      (constantly nil)\n      (fn [iframe]\n        (set! (.-display (.-style iframe))\n          \"none\")))\n    ;; Monkey-patch goog.require if running under optimizations :none - David\n    (when-not js/COMPILED\n      (set! *loaded-libs*\n        (let [gntp (.. js/goog -dependencies_ -nameToPath)]\n          (into #{}\n            (filter\n              (fn [name]\n                (aget (.. js/goog -dependencies_ -visited) (aget gntp name)))\n              (js-keys gntp)))))\n      (set! (.-isProvided_ js/goog) (fn [_] false))\n      (set! (.-require js/goog)\n        (fn [name reload]\n          (when (or (not (contains? *loaded-libs* name)) reload)\n            (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))\n            (.appendChild js/document.body\n              (let [script (.createElement js/document \"script\")]\n                (set! (.-type script) \"text/javascript\")\n                (set! (.-src script)\n                  (str \"goog/\"\n                    (aget (.. js/goog -dependencies_ -nameToPath) name)))\n                script))))))))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [95 136]},
 :full-name "clojure.browser.repl/connect",
 :docstring "Connects to a REPL server from an HTML document. After the\nconnection is made, the REPL will evaluate forms in the context of\nthe document that called this function."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_connect.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_connect.cljsdoc)
</pre>

