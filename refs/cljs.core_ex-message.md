## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-message

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ex-message__ ex)<br>
</samp>

---




Source docstring:

```
Alpha - subject to change.
Returns the message attached to the given Error / ExceptionInfo object.
For non-Errors returns nil.
```

Source code:

```clj
(defn ex-message
  [ex]
  (when (instance? js/Error ex)
    (.-message ex)))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8778-8784](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L8778-L8784)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-message"]))
```

```clj
{:ns "cljs.core",
 :name "ex-message",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-message",
 :source {:code "(defn ex-message\n  [ex]\n  (when (instance? js/Error ex)\n    (.-message ex)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8778 8784]},
 :full-name "cljs.core/ex-message",
 :docstring "Alpha - subject to change.\nReturns the message attached to the given Error / ExceptionInfo object.\nFor non-Errors returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ex-message.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ex-message.cljsdoc)
</pre>

