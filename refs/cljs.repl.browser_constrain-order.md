## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/constrain-order

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__constrain-order__ order f)<br>
</samp>

---




Source docstring:

```
Elements to be printed in the REPL will arrive out of order. Ensure
that they are printed in the correct order.
```

Source code:

```clj
(defn constrain-order
  [order f]
  (send-off ordering add-in-order order f)
  (send-off ordering run-in-order))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:136-141](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/repl/browser.clj#L136-L141)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/constrain-order"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "constrain-order",
 :signature ["[order f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_constrain-order",
 :source {:code "(defn constrain-order\n  [order f]\n  (send-off ordering add-in-order order f)\n  (send-off ordering run-in-order))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [136 141]},
 :full-name "cljs.repl.browser/constrain-order",
 :docstring "Elements to be printed in the REPL will arrive out of order. Ensure\nthat they are printed in the correct order."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_constrain-order.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_constrain-order.cljsdoc)
</pre>

