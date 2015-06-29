## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-all-vars-block

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__test-all-vars-block__ \[quote ns\])<br>
</samp>

---





Source code:

```clj
(defmacro test-all-vars-block
  ([[quote ns]]
   `(let [env# (cljs.test/get-current-env)]
      (concat
       [(fn []
          (when (nil? env#)
            (cljs.test/set-env! (cljs.test/empty-env)))
          ~(when (ana-api/ns-resolve ns 'cljs-test-once-fixtures)
             `(cljs.test/update-current-env! [:once-fixtures] assoc '~ns
                                             ~(symbol (name ns) "cljs-test-once-fixtures")))
          ~(when (ana-api/ns-resolve ns 'cljs-test-each-fixtures)
             `(cljs.test/update-current-env! [:each-fixtures] assoc '~ns
                                             ~(symbol (name ns) "cljs-test-each-fixtures"))))]
       (cljs.test/test-vars-block
        [~@(map
            (fn [[k _]]
              `(var ~(symbol (name ns) (name k))))
            (filter
             (fn [[_ v]] (:test v))
             (ana-api/ns-interns ns)))])
       [(fn []
          (when (nil? env#)
            (cljs.test/clear-env!)))]))))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.clj:310-332](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.clj#L310-L332)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-all-vars-block"]))
```

```clj
{:ns "cljs.test",
 :name "test-all-vars-block",
 :type "macro",
 :signature ["[[quote ns]]"],
 :source {:code "(defmacro test-all-vars-block\n  ([[quote ns]]\n   `(let [env# (cljs.test/get-current-env)]\n      (concat\n       [(fn []\n          (when (nil? env#)\n            (cljs.test/set-env! (cljs.test/empty-env)))\n          ~(when (ana-api/ns-resolve ns 'cljs-test-once-fixtures)\n             `(cljs.test/update-current-env! [:once-fixtures] assoc '~ns\n                                             ~(symbol (name ns) \"cljs-test-once-fixtures\")))\n          ~(when (ana-api/ns-resolve ns 'cljs-test-each-fixtures)\n             `(cljs.test/update-current-env! [:each-fixtures] assoc '~ns\n                                             ~(symbol (name ns) \"cljs-test-each-fixtures\"))))]\n       (cljs.test/test-vars-block\n        [~@(map\n            (fn [[k _]]\n              `(var ~(symbol (name ns) (name k))))\n            (filter\n             (fn [[_ v]] (:test v))\n             (ana-api/ns-interns ns)))])\n       [(fn []\n          (when (nil? env#)\n            (cljs.test/clear-env!)))]))))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.clj",
          :lines [310 332]},
 :full-name "cljs.test/test-all-vars-block",
 :full-name-encode "cljs.test_test-all-vars-block",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-all-vars-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-all-vars-block.cljsdoc)
</pre>

