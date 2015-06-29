## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/repl-env\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env\*__ options)<br>
</samp>

---





Source code:

```clj
(defn repl-env* [options]
  (let [{:keys [host port]}
        (merge
          {:host "localhost"
           :port (+ 49000 (rand-int 10000))}
          options)]
    (NodeEnv. host port (atom nil) (atom nil))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:208-214](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/node.clj#L208-L214)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/repl-env*"]))
```

```clj
{:ns "cljs.repl.node",
 :name "repl-env*",
 :type "function",
 :signature ["[options]"],
 :source {:code "(defn repl-env* [options]\n  (let [{:keys [host port]}\n        (merge\n          {:host \"localhost\"\n           :port (+ 49000 (rand-int 10000))}\n          options)]\n    (NodeEnv. host port (atom nil) (atom nil))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [208 214]},
 :full-name "cljs.repl.node/repl-env*",
 :full-name-encode "cljs.repl.node_repl-envSTAR",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_repl-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_repl-envSTAR.cljsdoc)
</pre>

