## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/ns-info

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ns-info__ f)<br>
</samp>

---




Source docstring:

```
Given a path to a js source file return the ns info for the corresponding
ClojureScript file if it exists.
```

Source code:

```clj
(defn ns-info
  [f]
  (let [f' (js-src->cljs-src f)]
    (when (.exists f')
      (ana/parse-ns f'))))
```

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:215-221](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl.clj#L215-L221)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/ns-info"]))
```

```clj
{:ns "cljs.repl",
 :name "ns-info",
 :signature ["[f]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl_ns-info",
 :source {:code "(defn ns-info\n  [f]\n  (let [f' (js-src->cljs-src f)]\n    (when (.exists f')\n      (ana/parse-ns f'))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/clj/cljs/repl.clj",
          :lines [215 221]},
 :full-name "cljs.repl/ns-info",
 :docstring "Given a path to a js source file return the ns info for the corresponding\nClojureScript file if it exists."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_ns-info.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_ns-info.cljsdoc)
</pre>

