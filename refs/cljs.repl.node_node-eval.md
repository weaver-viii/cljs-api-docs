## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/node-eval

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__node-eval__ repl-env js)<br>
</samp>

---




Source docstring:

```
Evaluate a JavaScript string in the Node REPL process.
```

Source code:

```clj
(defn node-eval
  [repl-env js]
  (let [{:keys [in out]} @(:socket repl-env)]
    (write out js)
    {:status :success
     :value (read-response in)}))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:49-55](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl/node.clj#L49-L55)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/node-eval"]))
```

```clj
{:ns "cljs.repl.node",
 :name "node-eval",
 :signature ["[repl-env js]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node_node-eval",
 :source {:code "(defn node-eval\n  [repl-env js]\n  (let [{:keys [in out]} @(:socket repl-env)]\n    (write out js)\n    {:status :success\n     :value (read-response in)}))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [49 55]},
 :full-name "cljs.repl.node/node-eval",
 :docstring "Evaluate a JavaScript string in the Node REPL process."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_node-eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_node-eval.cljsdoc)
</pre>

