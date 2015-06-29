## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-vars

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-vars</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-vars)
</td>
</tr>
</table>

 <samp>
(__test-vars__ vars)<br>
</samp>

---




Source docstring:

```
Groups vars by their namespace and runs test-vars on them with
appropriate fixtures assuming they are present in the current
testing environment.
```

Source code:

```clj
(defn test-vars
  [vars]
  (doseq [[ns vars] (group-by (comp :ns meta) vars)]
    (let [env (get-current-env)
          once-fixture-fn (join-fixtures (get-in env [:once-fixtures ns]))
          each-fixture-fn (join-fixtures (get-in env [:each-fixtures ns]))]
      (once-fixture-fn
        (fn []
          (doseq [v vars]
            (when (:test (meta v))
              (each-fixture-fn (fn [] (test-var v))))))))))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:395-408](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/test.cljs#L395-L408)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-vars"]))
```

```clj
{:ns "cljs.test",
 :name "test-vars",
 :signature ["[vars]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_test-vars",
 :source {:code "(defn test-vars\n  [vars]\n  (doseq [[ns vars] (group-by (comp :ns meta) vars)]\n    (let [env (get-current-env)\n          once-fixture-fn (join-fixtures (get-in env [:once-fixtures ns]))\n          each-fixture-fn (join-fixtures (get-in env [:each-fixtures ns]))]\n      (once-fixture-fn\n        (fn []\n          (doseq [v vars]\n            (when (:test (meta v))\n              (each-fixture-fn (fn [] (test-var v))))))))))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/test.cljs",
          :lines [395 408]},
 :full-name "cljs.test/test-vars",
 :clj-symbol "clojure.test/test-vars",
 :docstring "Groups vars by their namespace and runs test-vars on them with\nappropriate fixtures assuming they are present in the current\ntesting environment."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-vars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-vars.cljsdoc)
</pre>

