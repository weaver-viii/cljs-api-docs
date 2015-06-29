## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/run-tests

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/run-tests</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-tests)
</td>
</tr>
</table>

 <samp>
(__run-tests__)<br>
</samp>
 <samp>
(__run-tests__ env-or-ns)<br>
</samp>
 <samp>
(__run-tests__ env-or-ns & namespaces)<br>
</samp>

---




Source docstring:

```
Runs all tests in the given namespaces; prints results.
Defaults to current namespace if none given.
```

Source code:

```clj
(defmacro run-tests
  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))
  ([env-or-ns]
   (if (ns? env-or-ns)
     `(run-tests (cljs.test/empty-env) ~env-or-ns)
     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))
  ([env-or-ns & namespaces]
   `(cljs.test/run-block (run-tests-block ~env-or-ns ~@namespaces))))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:281-290](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/test.clj#L281-L290)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-tests"]))
```

```clj
{:ns "cljs.test",
 :name "run-tests",
 :signature ["[]" "[env-or-ns]" "[env-or-ns & namespaces]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_run-tests",
 :source {:code "(defmacro run-tests\n  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))\n  ([env-or-ns]\n   (if (ns? env-or-ns)\n     `(run-tests (cljs.test/empty-env) ~env-or-ns)\n     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))\n  ([env-or-ns & namespaces]\n   `(cljs.test/run-block (run-tests-block ~env-or-ns ~@namespaces))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/test.clj",
          :lines [281 290]},
 :full-name "cljs.test/run-tests",
 :clj-symbol "clojure.test/run-tests",
 :docstring "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_run-tests.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_run-tests.cljsdoc)
</pre>

