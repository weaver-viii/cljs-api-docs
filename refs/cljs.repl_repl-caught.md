## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl-caught

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-caught__ e repl-env opts)<br>
</samp>

---





Source code:

```clj
(defn repl-caught [e repl-env opts]
  (if (and (instance? IExceptionInfo e)
           (#{:js-eval-error :js-eval-exception} (:type (ex-data e))))
    (let [{:keys [type repl-env error form js]} (ex-data e)]
      (case type
        :js-eval-error
        (display-error repl-env error form opts)

        :js-eval-exception
        (display-error repl-env error form
          (if (:repl-verbose opts)
            #(prn "Error evaluating:" form :as js)
            (constantly nil))
          opts)))
    (.printStackTrace e *err*)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:701-715](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl.cljc#L701-L715)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-caught"]))
```

```clj
{:ns "cljs.repl",
 :name "repl-caught",
 :type "function",
 :signature ["[e repl-env opts]"],
 :source {:code "(defn repl-caught [e repl-env opts]\n  (if (and (instance? IExceptionInfo e)\n           (#{:js-eval-error :js-eval-exception} (:type (ex-data e))))\n    (let [{:keys [type repl-env error form js]} (ex-data e)]\n      (case type\n        :js-eval-error\n        (display-error repl-env error form opts)\n\n        :js-eval-exception\n        (display-error repl-env error form\n          (if (:repl-verbose opts)\n            #(prn \"Error evaluating:\" form :as js)\n            (constantly nil))\n          opts)))\n    (.printStackTrace e *err*)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [701 715]},
 :full-name "cljs.repl/repl-caught",
 :full-name-encode "cljs.repl_repl-caught",
 :history [["+" "0.0-2911"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl-caught.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl-caught.cljsdoc)
</pre>

