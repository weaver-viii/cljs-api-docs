## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/deftest

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/deftest</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/deftest)
</td>
</tr>
</table>

 <samp>
(__deftest__ name & body)<br>
</samp>

---




Source docstring:

```
Defines a test function with no arguments.  Test functions may call
other tests, so tests may be composed.  If you compose tests, you
should also define a function named test-ns-hook; run-tests will
call test-ns-hook instead of testing all vars.

Note: Actually, the test body goes in the :test metadata on the var,
and the real function (the value of the var) calls test-var on
itself.

When cljs.analyzer/*load-tests* is false, deftest is ignored.
```

Source code:

```clj
(defmacro deftest
  [name & body]
  (when ana/*load-tests*
    `(do
       (def ~(vary-meta name assoc :test `(fn [] ~@body))
         (fn [] (cljs.test/test-var (.-cljs$lang$var ~name))))
       (set! (.-cljs$lang$var ~name) (var ~name)))))
```

 <pre>
clojurescript @ r2740
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:204-220](https://github.com/clojure/clojurescript/blob/r2740/src/clj/cljs/test.clj#L204-L220)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/deftest"]))
```

```clj
{:ns "cljs.test",
 :name "deftest",
 :signature ["[name & body]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_deftest",
 :source {:code "(defmacro deftest\n  [name & body]\n  (when ana/*load-tests*\n    `(do\n       (def ~(vary-meta name assoc :test `(fn [] ~@body))\n         (fn [] (cljs.test/test-var (.-cljs$lang$var ~name))))\n       (set! (.-cljs$lang$var ~name) (var ~name)))))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/clj/cljs/test.clj",
          :lines [204 220]},
 :full-name "cljs.test/deftest",
 :clj-symbol "clojure.test/deftest",
 :docstring "Defines a test function with no arguments.  Test functions may call\nother tests, so tests may be composed.  If you compose tests, you\nshould also define a function named test-ns-hook; run-tests will\ncall test-ns-hook instead of testing all vars.\n\nNote: Actually, the test body goes in the :test metadata on the var,\nand the real function (the value of the var) calls test-var on\nitself.\n\nWhen cljs.analyzer/*load-tests* is false, deftest is ignored."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_deftest.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_deftest.cljsdoc)
</pre>

