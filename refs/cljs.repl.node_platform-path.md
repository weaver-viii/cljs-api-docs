## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/platform-path

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__platform-path__ v)<br>
</samp>

---





Source code:

```clj
(defn platform-path [v]
  (str "path.join.apply(null, " (seq->js-array v) ")"))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:78-79](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/repl/node.clj#L78-L79)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/platform-path"]))
```

```clj
{:ns "cljs.repl.node",
 :name "platform-path",
 :type "function",
 :signature ["[v]"],
 :source {:code "(defn platform-path [v]\n  (str \"path.join.apply(null, \" (seq->js-array v) \")\"))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [78 79]},
 :full-name "cljs.repl.node/platform-path",
 :full-name-encode "cljs.repl.node_platform-path",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_platform-path.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_platform-path.cljsdoc)
</pre>

