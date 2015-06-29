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
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:57-61](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl/node.clj#L57-L61)</ins>
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
          :tag "r2629",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [57 61]},
 :full-name "cljs.repl.node/load-javascript",
 :docstring "Load a Closure JavaScript file into the Node REPL process."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_load-javascript.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_load-javascript.cljsdoc)
</pre>

