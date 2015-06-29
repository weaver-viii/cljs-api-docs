## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---




Source docstring:

```
Returns a fresh JS environment, suitable for passing to repl.
Hang on to return for use across repl calls.
```

Source code:

```clj
(defn repl-env
  [& {:as opts}]
  (repl-env* opts))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:222-226](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/rhino.clj#L222-L226)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/repl-env"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.rhino_repl-env",
 :source {:code "(defn repl-env\n  [& {:as opts}]\n  (repl-env* opts))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [222 226]},
 :full-name "cljs.repl.rhino/repl-env",
 :docstring "Returns a fresh JS environment, suitable for passing to repl.\nHang on to return for use across repl calls."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_repl-env.cljsdoc)
</pre>

