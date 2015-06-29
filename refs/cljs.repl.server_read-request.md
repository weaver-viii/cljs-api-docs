## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/read-request

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-request__ rdr)<br>
</samp>

---





Source code:

```clj
(defn read-request [rdr]
  (let [line (.readLine rdr)]
    (cond
      (.startsWith line "POST") (read-post line rdr)
      (.startsWith line "GET") (read-get line rdr)
      :else {:method :unknown :content line})))
```

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:92-97](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl/server.clj#L92-L97)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-request"]))
```

```clj
{:ns "cljs.repl.server",
 :name "read-request",
 :type "function",
 :signature ["[rdr]"],
 :source {:code "(defn read-request [rdr]\n  (let [line (.readLine rdr)]\n    (cond\n      (.startsWith line \"POST\") (read-post line rdr)\n      (.startsWith line \"GET\") (read-get line rdr)\n      :else {:method :unknown :content line})))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [92 97]},
 :full-name "cljs.repl.server/read-request",
 :full-name-encode "cljs.repl.server_read-request",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_read-request.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_read-request.cljsdoc)
</pre>

