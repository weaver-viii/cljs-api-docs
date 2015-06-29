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
(__test-all-vars__ \[quote ns :as form\])<br>
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
  [[quote ns :as form]]
  `(cljs.test/run-block (test-all-vars-block ~form)))
```

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:330-334](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/test.clj#L330-L334)</ins>
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
 :signature ["[[quote ns :as form]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_test-all-vars",
 :source {:code "(defmacro test-all-vars\n  [[quote ns :as form]]\n  `(cljs.test/run-block (test-all-vars-block ~form)))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/test.clj",
          :lines [330 334]},
 :full-name "cljs.test/test-all-vars",
 :clj-symbol "clojure.test/test-all-vars",
 :docstring "Calls test-vars on every var with :test metadata interned in the\nnamespace, with fixtures."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-all-vars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-all-vars.cljsdoc)
</pre>

