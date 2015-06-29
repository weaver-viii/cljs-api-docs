## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl__ repl-env & {:as opts})<br>
</samp>

---




Source docstring:

```
Note - repl will reload core.cljs every time, even if supplied old repl-env
```

Source code:

```clj
(defn repl
  [repl-env & {:as opts}]
  (repl* repl-env opts))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:613-616](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/repl.clj#L613-L616)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl"]))
```

```clj
{:ns "cljs.repl",
 :name "repl",
 :signature ["[repl-env & {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl_repl",
 :source {:code "(defn repl\n  [repl-env & {:as opts}]\n  (repl* repl-env opts))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/repl.clj",
          :lines [613 616]},
 :full-name "cljs.repl/repl",
 :docstring "Note - repl will reload core.cljs every time, even if supplied old repl-env"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl.cljsdoc)
</pre>

