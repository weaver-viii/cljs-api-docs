## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/read-response

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-response__ in)<br>
</samp>

---





Source code:

```clj
(defn read-response [^BufferedReader in]
  (let [sb (StringBuilder.)]
    (loop [sb sb c (.read in)]
      (cond
       (= c 1) (let [ret (str sb)]
                 (print ret)
                 (recur (StringBuilder.) (.read in)))
       (= c 0) (str sb)
       :else (do
               (.append sb (char c))
               (recur sb (.read in)))))))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:39-49](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl/node.clj#L39-L49)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/read-response"]))
```

```clj
{:ns "cljs.repl.node",
 :name "read-response",
 :type "function",
 :signature ["[in]"],
 :source {:code "(defn read-response [^BufferedReader in]\n  (let [sb (StringBuilder.)]\n    (loop [sb sb c (.read in)]\n      (cond\n       (= c 1) (let [ret (str sb)]\n                 (print ret)\n                 (recur (StringBuilder.) (.read in)))\n       (= c 0) (str sb)\n       :else (do\n               (.append sb (char c))\n               (recur sb (.read in)))))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [39 49]},
 :full-name "cljs.repl.node/read-response",
 :full-name-encode "cljs.repl.node_read-response",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_read-response.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_read-response.cljsdoc)
</pre>

