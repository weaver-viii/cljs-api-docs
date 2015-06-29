## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/repl-print

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-print__ data)<br>
</samp>

---





Source code:

```clj
(defn repl-print [data]
  (if-let [conn @xpc-connection]
    (net/transmit conn :print (pr-str data))))
```

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:23-25](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/browser/repl.cljs#L23-L25)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/repl-print"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "repl-print",
 :type "function",
 :signature ["[data]"],
 :source {:code "(defn repl-print [data]\n  (if-let [conn @xpc-connection]\n    (net/transmit conn :print (pr-str data))))",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [23 25]},
 :full-name "clojure.browser.repl/repl-print",
 :full-name-encode "clojure.browser.repl_repl-print",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_repl-print.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_repl-print.cljsdoc)
</pre>

