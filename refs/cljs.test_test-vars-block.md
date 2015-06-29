## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-vars-block

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__test-vars-block__ vars)<br>
</samp>

---




Source docstring:

```
Like test-vars, but returns a block for further composition and
later execution.
```

Source code:

```clj
(defn test-vars-block
  [vars]
  (map
   (fn [[ns vars]]
     (fn []
       (block
        (let [env (get-current-env)
              once-fixtures (get-in env [:once-fixtures ns])
              each-fixtures (get-in env [:each-fixtures ns])]
          (case (execution-strategy once-fixtures each-fixtures)
            :async
            (->> vars
                 (filter (comp :test meta))
                 (mapcat (comp (partial wrap-map-fixtures each-fixtures)
                               test-var-block))
                 (wrap-map-fixtures once-fixtures))
            :sync
            (let [each-fixture-fn (join-fixtures each-fixtures)]
              [(fn []
                 ((join-fixtures once-fixtures)
                  (fn []
                    (doseq [v vars]
                      (when-let [t (:test (meta v))]
                        ;; (alter-meta! v update :test disable-async)
                        (each-fixture-fn
                         (fn []
                           ;; (test-var v)
                           (run-block
                            (test-var-block* v (disable-async t))))))))))]))))))
   (group-by (comp :ns meta) vars)))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:524-555](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/test.cljs#L524-L555)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-vars-block"]))
```

```clj
{:ns "cljs.test",
 :name "test-vars-block",
 :signature ["[vars]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test_test-vars-block",
 :source {:code "(defn test-vars-block\n  [vars]\n  (map\n   (fn [[ns vars]]\n     (fn []\n       (block\n        (let [env (get-current-env)\n              once-fixtures (get-in env [:once-fixtures ns])\n              each-fixtures (get-in env [:each-fixtures ns])]\n          (case (execution-strategy once-fixtures each-fixtures)\n            :async\n            (->> vars\n                 (filter (comp :test meta))\n                 (mapcat (comp (partial wrap-map-fixtures each-fixtures)\n                               test-var-block))\n                 (wrap-map-fixtures once-fixtures))\n            :sync\n            (let [each-fixture-fn (join-fixtures each-fixtures)]\n              [(fn []\n                 ((join-fixtures once-fixtures)\n                  (fn []\n                    (doseq [v vars]\n                      (when-let [t (:test (meta v))]\n                        ;; (alter-meta! v update :test disable-async)\n                        (each-fixture-fn\n                         (fn []\n                           ;; (test-var v)\n                           (run-block\n                            (test-var-block* v (disable-async t))))))))))]))))))\n   (group-by (comp :ns meta) vars)))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [524 555]},
 :full-name "cljs.test/test-vars-block",
 :docstring "Like test-vars, but returns a block for further composition and\nlater execution."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-vars-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-vars-block.cljsdoc)
</pre>

