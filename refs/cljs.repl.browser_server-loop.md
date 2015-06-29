## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/server-loop

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__server-loop__ opts server-socket)<br>
</samp>

---





Source code:

```clj
(defn server-loop
  [opts server-socket]
  (let [conn (.accept server-socket)]
    (do (.setKeepAlive conn true)
        (future (handle-connection opts conn))
        (recur opts server-socket))))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:240-245](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/repl/browser.clj#L240-L245)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/server-loop"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "server-loop",
 :type "function",
 :signature ["[opts server-socket]"],
 :source {:code "(defn server-loop\n  [opts server-socket]\n  (let [conn (.accept server-socket)]\n    (do (.setKeepAlive conn true)\n        (future (handle-connection opts conn))\n        (recur opts server-socket))))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [240 245]},
 :full-name "cljs.repl.browser/server-loop",
 :full-name-encode "cljs.repl.browser_server-loop",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_server-loop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_server-loop.cljsdoc)
</pre>

