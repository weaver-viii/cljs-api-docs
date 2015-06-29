## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IPrintStacktrace

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2843"><img valign="middle" alt="[+] 0.0-2843" src="https://img.shields.io/badge/+-0.0--2843-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IPrintStacktrace
  (-print-stacktrace [repl-env stacktrace error build-options]
    "Implementing REPL evaluation environments are given the opportunity to
     print the mapped stacktrace themselves. This permits further processing."))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:145-148](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L145-L148)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IPrintStacktrace"]))
```

```clj
{:ns "cljs.repl",
 :name "IPrintStacktrace",
 :type "protocol",
 :full-name-encode "cljs.repl_IPrintStacktrace",
 :source {:code "(defprotocol IPrintStacktrace\n  (-print-stacktrace [repl-env stacktrace error build-options]\n    \"Implementing REPL evaluation environments are given the opportunity to\n     print the mapped stacktrace themselves. This permits further processing.\"))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl.clj",
          :lines [145 148]},
 :methods [{:name "-print-stacktrace",
            :signature ["[repl-env stacktrace error build-options]"],
            :docstring "Implementing REPL evaluation environments are given the opportunity to\n     print the mapped stacktrace themselves. This permits further processing."}],
 :full-name "cljs.repl/IPrintStacktrace",
 :history [["+" "0.0-2843"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IPrintStacktrace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IPrintStacktrace.cljsdoc)
</pre>

