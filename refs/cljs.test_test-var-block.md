## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-var-block

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__test-var-block__ v)<br>
</samp>

---




Source docstring:

```
Like test-var, but returns a block for further composition and
later execution.
```

Source code:

```clj
(defn test-var-block
  [v]
  {:pre [(instance? Var v)]}
  (if-let [t (:test (meta v))]
    [(fn []
       (update-current-env! [:testing-vars] conj v)
       (update-current-env! [:report-counters :test] inc)
       (do-report {:type :begin-test-var :var v})
       (try
         (t)
         (catch :default e
           (do-report
             {:type :error
              :message "Uncaught exception, not in assertion."
              :expected nil
              :actual e}))))
     (fn []
       (do-report {:type :end-test-var :var v})
       (update-current-env! [:testing-vars] rest))]))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:436-456](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/test.cljs#L436-L456)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-var-block"]))
```

```clj
{:ns "cljs.test",
 :name "test-var-block",
 :signature ["[v]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test_test-var-block",
 :source {:code "(defn test-var-block\n  [v]\n  {:pre [(instance? Var v)]}\n  (if-let [t (:test (meta v))]\n    [(fn []\n       (update-current-env! [:testing-vars] conj v)\n       (update-current-env! [:report-counters :test] inc)\n       (do-report {:type :begin-test-var :var v})\n       (try\n         (t)\n         (catch :default e\n           (do-report\n             {:type :error\n              :message \"Uncaught exception, not in assertion.\"\n              :expected nil\n              :actual e}))))\n     (fn []\n       (do-report {:type :end-test-var :var v})\n       (update-current-env! [:testing-vars] rest))]))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/test.cljs",
          :lines [436 456]},
 :full-name "cljs.test/test-var-block",
 :docstring "Like test-var, but returns a block for further composition and\nlater execution."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-var-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-var-block.cljsdoc)
</pre>

