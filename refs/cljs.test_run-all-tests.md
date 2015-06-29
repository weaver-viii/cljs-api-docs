## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/run-all-tests

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/run-all-tests</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-all-tests)
</td>
</tr>
</table>

 <samp>
(__run-all-tests__)<br>
</samp>
 <samp>
(__run-all-tests__ re)<br>
</samp>
 <samp>
(__run-all-tests__ re env)<br>
</samp>

---




Source docstring:

```
Runs all tests in all namespaces; prints results.
Optional argument is a regular expression; only namespaces with
names matching the regular expression (with re-matches) will be
tested.
```

Source code:

```clj
(defmacro run-all-tests
  ([] `(cljs.test/run-all-tests nil (cljs.test/empty-env)))
  ([re] `(cljs.test/run-all-tests ~re (cljs.test/empty-env)))
  ([re env]
   `(cljs.test/run-tests ~env
      ~@(map
          (fn [ns] `(quote ~ns))
          (cond->> (ana-api/all-ns)
            re (filter #(re-matches re (name %))))))))
```

 <pre>
clojurescript @ r3169
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:292-304](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/test.clj#L292-L304)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-all-tests"]))
```

```clj
{:ns "cljs.test",
 :name "run-all-tests",
 :signature ["[]" "[re]" "[re env]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_run-all-tests",
 :source {:code "(defmacro run-all-tests\n  ([] `(cljs.test/run-all-tests nil (cljs.test/empty-env)))\n  ([re] `(cljs.test/run-all-tests ~re (cljs.test/empty-env)))\n  ([re env]\n   `(cljs.test/run-tests ~env\n      ~@(map\n          (fn [ns] `(quote ~ns))\n          (cond->> (ana-api/all-ns)\n            re (filter #(re-matches re (name %))))))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/clj/cljs/test.clj",
          :lines [292 304]},
 :full-name "cljs.test/run-all-tests",
 :clj-symbol "clojure.test/run-all-tests",
 :docstring "Runs all tests in all namespaces; prints results.\nOptional argument is a regular expression; only namespaces with\nnames matching the regular expression (with re-matches) will be\ntested."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_run-all-tests.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_run-all-tests.cljsdoc)
</pre>

