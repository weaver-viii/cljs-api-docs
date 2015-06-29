## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/load-javascript

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-javascript__ repl-env provides url)<br>
</samp>

---




Source docstring:

```
Load a Closure JavaScript file into the Node REPL process.
```

Source code:

```clj
(defn load-javascript
  [repl-env provides url]
  (node-eval repl-env
    (str "goog.require('" (comp/munge (first provides)) "')")))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:69-73](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/node.clj#L69-L73)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/load-javascript"]))
```

```clj
{:ns "cljs.repl.node",
 :name "load-javascript",
 :signature ["[repl-env provides url]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node_load-javascript",
 :source {:code "(defn load-javascript\n  [repl-env provides url]\n  (node-eval repl-env\n    (str \"goog.require('\" (comp/munge (first provides)) \"')\")))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [69 73]},
 :full-name "cljs.repl.node/load-javascript",
 :docstring "Load a Closure JavaScript file into the Node REPL process."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_load-javascript.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_load-javascript.cljsdoc)
</pre>

