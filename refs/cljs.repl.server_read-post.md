## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/read-post

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-post__ line rdr)<br>
</samp>

---





Source code:

```clj
(defn read-post [line rdr]
  (let [[_ path _] (str/split line #" ")
        headers (parse-headers (read-headers rdr))
        content-length (Integer/parseInt (:content-length headers))
        content (char-array content-length)]
    (io! (.read rdr content 0 content-length)
         {:method :post
          :path path
          :headers headers
          :content (String. content)})))
```

 <pre>
clojurescript @ r2156
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:77-86](https://github.com/clojure/clojurescript/blob/r2156/src/clj/cljs/repl/server.clj#L77-L86)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-post"]))
```

```clj
{:ns "cljs.repl.server",
 :name "read-post",
 :type "function",
 :signature ["[line rdr]"],
 :source {:code "(defn read-post [line rdr]\n  (let [[_ path _] (str/split line #\" \")\n        headers (parse-headers (read-headers rdr))\n        content-length (Integer/parseInt (:content-length headers))\n        content (char-array content-length)]\n    (io! (.read rdr content 0 content-length)\n         {:method :post\n          :path path\n          :headers headers\n          :content (String. content)})))",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [77 86]},
 :full-name "cljs.repl.server/read-post",
 :full-name-encode "cljs.repl.server_read-post",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_read-post.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_read-post.cljsdoc)
</pre>

