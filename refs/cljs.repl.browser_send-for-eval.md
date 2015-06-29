## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-for-eval

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-for-eval__ form return-value-fn)<br>
</samp>
 <samp>
(__send-for-eval__ conn form return-value-fn)<br>
</samp>

---




Source docstring:

```
Given a form and a return value function, send the form to the
browser for evaluation. The return value function will be called
when the return value is received.
```

Source code:

```clj
(defn send-for-eval
  ([form return-value-fn]
     (send-for-eval @(server/connection) form return-value-fn))
  ([conn form return-value-fn]
     (do (set-return-value-fn return-value-fn)
         (server/send-and-close conn 200 form "text/javascript"))))
```

 <pre>
clojurescript @ r2027
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:32-40](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/repl/browser.clj#L32-L40)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-for-eval"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "send-for-eval",
 :signature ["[form return-value-fn]" "[conn form return-value-fn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_send-for-eval",
 :source {:code "(defn send-for-eval\n  ([form return-value-fn]\n     (send-for-eval @(server/connection) form return-value-fn))\n  ([conn form return-value-fn]\n     (do (set-return-value-fn return-value-fn)\n         (server/send-and-close conn 200 form \"text/javascript\"))))",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [32 40]},
 :full-name "cljs.repl.browser/send-for-eval",
 :docstring "Given a form and a return value function, send the form to the\nbrowser for evaluation. The return value function will be called\nwhen the return value is received."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-for-eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-for-eval.cljsdoc)
</pre>

