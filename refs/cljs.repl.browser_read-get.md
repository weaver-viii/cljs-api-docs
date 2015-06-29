## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/read-get

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
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
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:153-158](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/repl/browser.clj#L153-L158)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/read-get"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "read-get",
 :type "function",
 :signature ["[line rdr]"],
 :source {:code "(defn read-get [line rdr]\n  (let [[_ path _] (str/split line #\" \")\n        headers (parse-headers (read-headers rdr))]\n    {:method :get\n     :path path\n     :headers headers}))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [153 158]},
 :full-name "cljs.repl.browser/read-get",
 :full-name-encode "cljs.repl.browser_read-get",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_read-get.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_read-get.cljsdoc)
</pre>

