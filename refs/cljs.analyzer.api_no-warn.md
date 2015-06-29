## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/no-warn

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__no-warn__ & body)<br>
</samp>

---




Source docstring:

```
Disable analyzer warnings for any analysis executed in body.
```

Source code:

```clj
(defmacro no-warn
  [& body]
  (let [no-warnings (zipmap (keys ana/*cljs-warnings*) (repeat false))]
    `(binding [ana/*cljs-warnings* ~no-warnings]
       ~@body)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:23-28](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/analyzer/api.clj#L23-L28)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/no-warn"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "no-warn",
 :signature ["[& body]"],
 :history [["+" "0.0-3291"]],
 :type "macro",
 :full-name-encode "cljs.analyzer.api_no-warn",
 :source {:code "(defmacro no-warn\n  [& body]\n  (let [no-warnings (zipmap (keys ana/*cljs-warnings*) (repeat false))]\n    `(binding [ana/*cljs-warnings* ~no-warnings]\n       ~@body)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [23 28]},
 :full-name "cljs.analyzer.api/no-warn",
 :docstring "Disable analyzer warnings for any analysis executed in body."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_no-warn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_no-warn.cljsdoc)
</pre>

