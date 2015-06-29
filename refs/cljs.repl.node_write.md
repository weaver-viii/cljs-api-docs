## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/write

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__write__ out js)<br>
</samp>

---





Source code:

```clj
(defn write [^BufferedWriter out ^String js]
  (.write out js)
  (.write out (int 0)) ;; terminator
  (.flush out))
```

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:34-37](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/node.clj#L34-L37)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/write"]))
```

```clj
{:ns "cljs.repl.node",
 :name "write",
 :type "function",
 :signature ["[out js]"],
 :source {:code "(defn write [^BufferedWriter out ^String js]\n  (.write out js)\n  (.write out (int 0)) ;; terminator\n  (.flush out))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [34 37]},
 :full-name "cljs.repl.node/write",
 :full-name-encode "cljs.repl.node_write",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_write.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_write.cljsdoc)
</pre>

