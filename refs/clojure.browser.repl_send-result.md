## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/send-result

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-result__ connection url data)<br>
</samp>

---





Source code:

```clj
(defn send-result [connection url data]
  (net/transmit connection url "POST" data nil 0))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:38-39](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/clojure/browser/repl.cljs#L38-L39)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/send-result"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "send-result",
 :type "function",
 :signature ["[connection url data]"],
 :source {:code "(defn send-result [connection url data]\n  (net/transmit connection url \"POST\" data nil 0))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [38 39]},
 :full-name "clojure.browser.repl/send-result",
 :full-name-encode "clojure.browser.repl_send-result",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_send-result.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_send-result.cljsdoc)
</pre>

