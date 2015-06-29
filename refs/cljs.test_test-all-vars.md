## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-all-vars

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-all-vars</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-all-vars)
</td>
</tr>
</table>

 <samp>
(__test-all-vars__ \[quote ns\])<br>
</samp>

---




Source docstring:

```
Calls test-vars on every var with :test metadata interned in the
namespace, with fixtures.
```

Source code:

```clj
(defmacro test-all-vars
  ([[quote ns]]
   `(let [env# (cljs.test/get-current-env)]
      (when (nil? env#)
        (cljs.test/set-env! (cljs.test/empty-env)))
      ~(when (ana-api/ns-resolve ns 'cljs-test-once-fixtures)
         `(cljs.test/update-current-env! [:once-fixtures] assoc '~ns
            ~(symbol (name ns) "cljs-test-once-fixtures")))
      ~(when (ana-api/ns-resolve ns 'cljs-test-each-fixtures)
         `(cljs.test/update-current-env! [:each-fixtures] assoc '~ns
            ~(symbol (name ns) "cljs-test-each-fixtures")))
      (cljs.test/test-vars
        [~@(map
             (fn [[k _]]
               `(var ~(symbol (name ns) (name k))))
             (filter
               (fn [[_ v]] (:test v))
               (ana-api/ns-interns ns)))])
      (when (nil? env#)
        (cljs.test/clear-env!)))))
```

 <pre>
clojurescript @ r2723
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:278-299](https://github.com/clojure/clojurescript/blob/r2723/src/clj/cljs/test.clj#L278-L299)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-all-vars"]))
```

```clj
{:ns "cljs.test",
 :name "test-all-vars",
 :signature ["[[quote ns]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_test-all-vars",
 :source {:code "(defmacro test-all-vars\n  ([[quote ns]]\n   `(let [env# (cljs.test/get-current-env)]\n      (when (nil? env#)\n        (cljs.test/set-env! (cljs.test/empty-env)))\n      ~(when (ana-api/ns-resolve ns 'cljs-test-once-fixtures)\n         `(cljs.test/update-current-env! [:once-fixtures] assoc '~ns\n            ~(symbol (name ns) \"cljs-test-once-fixtures\")))\n      ~(when (ana-api/ns-resolve ns 'cljs-test-each-fixtures)\n         `(cljs.test/update-current-env! [:each-fixtures] assoc '~ns\n            ~(symbol (name ns) \"cljs-test-each-fixtures\")))\n      (cljs.test/test-vars\n        [~@(map\n             (fn [[k _]]\n               `(var ~(symbol (name ns) (name k))))\n             (filter\n               (fn [[_ v]] (:test v))\n               (ana-api/ns-interns ns)))])\n      (when (nil? env#)\n        (cljs.test/clear-env!)))))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/clj/cljs/test.clj",
          :lines [278 299]},
 :full-name "cljs.test/test-all-vars",
 :clj-symbol "clojure.test/test-all-vars",
 :docstring "Calls test-vars on every var with :test metadata interned in the\nnamespace, with fixtures."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-all-vars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-all-vars.cljsdoc)
</pre>

