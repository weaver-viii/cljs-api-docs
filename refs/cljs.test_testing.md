## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/testing

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/testing</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing)
</td>
</tr>
</table>

 <samp>
(__testing__ string & body)<br>
</samp>

---




Source docstring:

```
Adds a new string to the list of testing contexts.  May be nested,
but must occur inside a test function (deftest).
```

Source code:

```clj
(defmacro testing
  ([string & body]
   `(do
      (cljs.test/update-current-env! [:testing-contexts] conj ~string)
      (let [ret# (do ~@body)]
        (cljs.test/update-current-env! [:testing-contexts] rest)
        ret#))))
```

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:191-199](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/test.clj#L191-L199)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/testing"]))
```

```clj
{:ns "cljs.test",
 :name "testing",
 :signature ["[string & body]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_testing",
 :source {:code "(defmacro testing\n  ([string & body]\n   `(do\n      (cljs.test/update-current-env! [:testing-contexts] conj ~string)\n      (let [ret# (do ~@body)]\n        (cljs.test/update-current-env! [:testing-contexts] rest)\n        ret#))))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/test.clj",
          :lines [191 199]},
 :full-name "cljs.test/testing",
 :clj-symbol "clojure.test/testing",
 :docstring "Adds a new string to the list of testing contexts.  May be nested,\nbut must occur inside a test function (deftest)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_testing.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_testing.cljsdoc)
</pre>

