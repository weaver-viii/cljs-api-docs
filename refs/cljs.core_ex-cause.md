## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-cause

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ex-cause__ ex)<br>
</samp>

---




Source docstring:

```
Alpha - subject to change.
Returns exception cause (an Error / ExceptionInfo) if ex is an
ExceptionInfo.
Otherwise returns nil.
```

Source code:

```clj
(defn ex-cause
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-cause ex)))
```

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8767-8774](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L8767-L8774)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-cause"]))
```

```clj
{:ns "cljs.core",
 :name "ex-cause",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-cause",
 :source {:code "(defn ex-cause\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-cause ex)))",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8767 8774]},
 :full-name "cljs.core/ex-cause",
 :docstring "Alpha - subject to change.\nReturns exception cause (an Error / ExceptionInfo) if ex is an\nExceptionInfo.\nOtherwise returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ex-cause.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ex-cause.cljsdoc)
</pre>

