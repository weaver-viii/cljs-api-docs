## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/run-tests-block

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__run-tests-block__ env-or-ns & namespaces)<br>
</samp>

---




Source docstring:

```
Like test-vars, but returns a block for further composition and
later execution.
```

Source code:

```clj
(defmacro run-tests-block
  [env-or-ns & namespaces]
  (assert (every?
           (fn [[quote ns]] (and (= quote 'quote) (symbol? ns)))
           namespaces)
          "All arguments to run-tests must be quoted symbols")
  (let [is-ns (ns? env-or-ns)
        env (gensym "env")
        summary (gensym "summary")]
    `(let [~env ~(if is-ns
                   `(cljs.test/empty-env)
                   env-or-ns)
           ~summary (cljs.core/volatile!
                     {:test 0 :pass 0 :fail 0 :error 0
                      :type :summary})]
       (concat ~@(map
                  (fn [ns]
                    `(concat (cljs.test/test-ns-block ~env ~ns)
                             [(fn []
                                (cljs.core/vswap!
                                 ~summary
                                 (partial merge-with +)
                                 (:report-counters
                                  (cljs.test/get-and-clear-env!))))]))
                  (if is-ns
                    (concat [env-or-ns] namespaces)
                    namespaces))
               [(fn []
                   (cljs.test/set-env! ~env)
                   (do-report (deref ~summary))
                   (cljs.test/clear-env!))]))))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[test.clj:247-279](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/test.clj#L247-L279)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-tests-block"]))
```

```clj
{:ns "cljs.test",
 :name "run-tests-block",
 :signature ["[env-or-ns & namespaces]"],
 :history [["+" "0.0-2814"]],
 :type "macro",
 :full-name-encode "cljs.test_run-tests-block",
 :source {:code "(defmacro run-tests-block\n  [env-or-ns & namespaces]\n  (assert (every?\n           (fn [[quote ns]] (and (= quote 'quote) (symbol? ns)))\n           namespaces)\n          \"All arguments to run-tests must be quoted symbols\")\n  (let [is-ns (ns? env-or-ns)\n        env (gensym \"env\")\n        summary (gensym \"summary\")]\n    `(let [~env ~(if is-ns\n                   `(cljs.test/empty-env)\n                   env-or-ns)\n           ~summary (cljs.core/volatile!\n                     {:test 0 :pass 0 :fail 0 :error 0\n                      :type :summary})]\n       (concat ~@(map\n                  (fn [ns]\n                    `(concat (cljs.test/test-ns-block ~env ~ns)\n                             [(fn []\n                                (cljs.core/vswap!\n                                 ~summary\n                                 (partial merge-with +)\n                                 (:report-counters\n                                  (cljs.test/get-and-clear-env!))))]))\n                  (if is-ns\n                    (concat [env-or-ns] namespaces)\n                    namespaces))\n               [(fn []\n                   (cljs.test/set-env! ~env)\n                   (do-report (deref ~summary))\n                   (cljs.test/clear-env!))]))))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/test.clj",
          :lines [247 279]},
 :full-name "cljs.test/run-tests-block",
 :docstring "Like test-vars, but returns a block for further composition and\nlater execution."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_run-tests-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_run-tests-block.cljsdoc)
</pre>

