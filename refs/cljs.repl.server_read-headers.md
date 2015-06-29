## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/read-headers

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-headers__ rdr)<br>
</samp>

---





Source code:

```clj
(defn read-headers [rdr]
  (loop [next-line (.readLine rdr)
         header-lines []]
    (if (= "" next-line)
      header-lines                      ;we're done reading headers
      (recur (.readLine rdr) (conj header-lines next-line)))))
```

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:70-75](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/repl/server.clj#L70-L75)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-headers"]))
```

```clj
{:ns "cljs.repl.server",
 :name "read-headers",
 :type "function",
 :signature ["[rdr]"],
 :source {:code "(defn read-headers [rdr]\n  (loop [next-line (.readLine rdr)\n         header-lines []]\n    (if (= \"\" next-line)\n      header-lines                      ;we're done reading headers\n      (recur (.readLine rdr) (conj header-lines next-line)))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [70 75]},
 :full-name "cljs.repl.server/read-headers",
 :full-name-encode "cljs.repl.server_read-headers",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_read-headers.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_read-headers.cljsdoc)
</pre>

