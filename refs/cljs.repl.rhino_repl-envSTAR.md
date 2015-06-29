## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/repl-env\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env\*__ opts)<br>
</samp>

---





Source code:

```clj
(defn repl-env*
  [opts]
  (let [cx (Context/enter)]
    ;; just avoid the 64K method limit
    ;; Rhino is slow even with optimizations enabled
    (.setOptimizationLevel cx -1)
    (merge (RhinoEnv.)
      {:cx cx
       :scope (.initStandardObjects cx)})))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[rhino.clj:211-219](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/rhino.clj#L211-L219)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/repl-env*"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "repl-env*",
 :type "function",
 :signature ["[opts]"],
 :source {:code "(defn repl-env*\n  [opts]\n  (let [cx (Context/enter)]\n    ;; just avoid the 64K method limit\n    ;; Rhino is slow even with optimizations enabled\n    (.setOptimizationLevel cx -1)\n    (merge (RhinoEnv.)\n      {:cx cx\n       :scope (.initStandardObjects cx)})))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [211 219]},
 :full-name "cljs.repl.rhino/repl-env*",
 :full-name-encode "cljs.repl.rhino_repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_repl-envSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_repl-envSTAR.cljsdoc)
</pre>

