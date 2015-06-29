## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as options})<br>
</samp>

---





Source code:

```clj
(defn repl-env
  [& {:as options}]
  (repl-env* options))
```

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:194-196](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/node.clj#L194-L196)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/repl-env"]))
```

```clj
{:ns "cljs.repl.node",
 :name "repl-env",
 :type "function",
 :signature ["[& {:as options}]"],
 :source {:code "(defn repl-env\n  [& {:as options}]\n  (repl-env* options))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [194 196]},
 :full-name "cljs.repl.node/repl-env",
 :full-name-encode "cljs.repl.node_repl-env",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_repl-env.cljsdoc)
</pre>

