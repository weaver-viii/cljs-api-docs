## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/read-get

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-get__ line rdr)<br>
</samp>

---





Source code:

```clj
(defn read-get [line rdr]
  (let [[_ path _] (str/split line #" ")
        headers (parse-headers (read-headers rdr))]
    {:method :get
     :path path
     :headers headers}))
```

 <pre>
clojurescript @ r2173
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:88-93](https://github.com/clojure/clojurescript/blob/r2173/src/clj/cljs/repl/server.clj#L88-L93)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-get"]))
```

```clj
{:ns "cljs.repl.server",
 :name "read-get",
 :type "function",
 :signature ["[line rdr]"],
 :source {:code "(defn read-get [line rdr]\n  (let [[_ path _] (str/split line #\" \")\n        headers (parse-headers (read-headers rdr))]\n    {:method :get\n     :path path\n     :headers headers}))",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [88 93]},
 :full-name "cljs.repl.server/read-get",
 :full-name-encode "cljs.repl.server_read-get",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_read-get.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_read-get.cljsdoc)
</pre>

