## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/use-fixtures

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2498"><img valign="middle" alt="[+] 0.0-2498" src="https://img.shields.io/badge/+-0.0--2498-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/use-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/use-fixtures)
</td>
</tr>
</table>

 <samp>
(__use-fixtures__ type & fns)<br>
</samp>

---





Source code:

```clj
(defmacro use-fixtures [type & fns]
  (condp = type
    :once
    `(def ~'cljs-test-once-fixtures
       [~@fns])
    :each
    `(def ~'cljs-test-each-fixtures
       [~@fns])
    :else
    (throw
      (Exception. "First argument to cljs.test/use-fixtures must be :once or :each"))))
```

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:369-379](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/test.clj#L369-L379)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/use-fixtures"]))
```

```clj
{:ns "cljs.test",
 :name "use-fixtures",
 :signature ["[type & fns]"],
 :history [["+" "0.0-2498"]],
 :type "macro",
 :full-name-encode "cljs.test_use-fixtures",
 :source {:code "(defmacro use-fixtures [type & fns]\n  (condp = type\n    :once\n    `(def ~'cljs-test-once-fixtures\n       [~@fns])\n    :each\n    `(def ~'cljs-test-each-fixtures\n       [~@fns])\n    :else\n    (throw\n      (Exception. \"First argument to cljs.test/use-fixtures must be :once or :each\"))))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/test.clj",
          :lines [369 379]},
 :full-name "cljs.test/use-fixtures",
 :clj-symbol "clojure.test/use-fixtures"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_use-fixtures.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_use-fixtures.cljsdoc)
</pre>

