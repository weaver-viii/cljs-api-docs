## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.repl.browser/stop-server~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[×] 0.0-1503" src="https://img.shields.io/badge/×-0.0--1503-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__stop-server__)<br>
</samp>

---





Source code:

```clj
(defn stop-server
  []
  (.close (:socket @server-state)))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:272-274](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L272-L274)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/stop-server"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "stop-server",
 :signature ["[]"],
 :history [["+" "0.0-927"] ["-" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_stop-server",
 :source {:code "(defn stop-server\n  []\n  (.close (:socket @server-state)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [272 274]},
 :full-name "cljs.repl.browser/stop-server",
 :removed {:in "0.0-1503", :last-seen "0.0-1450"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_stop-server.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_stop-server.cljsdoc)
</pre>

