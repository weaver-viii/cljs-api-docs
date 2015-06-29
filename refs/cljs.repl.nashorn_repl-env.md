## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---




Source docstring:

```
Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript.
```

Source code:

```clj
(defn repl-env 
  [& {:as opts}]
  (assert (even? (count opts)) "Arguments must be interleaved key value pairs")
  (repl-env* opts))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:225-229](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/nashorn.clj#L225-L229)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-env"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.nashorn_repl-env",
 :source {:code "(defn repl-env \n  [& {:as opts}]\n  (assert (even? (count opts)) \"Arguments must be interleaved key value pairs\")\n  (repl-env* opts))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [225 229]},
 :full-name "cljs.repl.nashorn/repl-env",
 :docstring "Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_repl-env.cljsdoc)
</pre>

