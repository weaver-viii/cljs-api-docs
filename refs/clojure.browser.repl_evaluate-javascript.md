## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/evaluate-javascript

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__evaluate-javascript__ conn block)<br>
</samp>

---




Source docstring:

```
Process a single block of JavaScript received from the server
```

Source code:

```clj
(defn evaluate-javascript
  [conn block]
  (let [result (try {:status :success :value (str (js* "eval(~{block})"))}
                    (catch :default e
                      {:status :exception :value (pr-str e)
                       :stacktrace (if (.hasOwnProperty e "stack")
                                     (.-stack e)
                                     "No stacktrace available.")}))]
    (pr-str result)))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:27-36](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/clojure/browser/repl.cljs#L27-L36)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/evaluate-javascript"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "evaluate-javascript",
 :signature ["[conn block]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl_evaluate-javascript",
 :source {:code "(defn evaluate-javascript\n  [conn block]\n  (let [result (try {:status :success :value (str (js* \"eval(~{block})\"))}\n                    (catch :default e\n                      {:status :exception :value (pr-str e)\n                       :stacktrace (if (.hasOwnProperty e \"stack\")\n                                     (.-stack e)\n                                     \"No stacktrace available.\")}))]\n    (pr-str result)))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [27 36]},
 :full-name "clojure.browser.repl/evaluate-javascript",
 :docstring "Process a single block of JavaScript received from the server"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_evaluate-javascript.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_evaluate-javascript.cljsdoc)
</pre>

