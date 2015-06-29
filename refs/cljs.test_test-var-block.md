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
  (if-let [t (:test (meta v))]
    (test-var-block* v t)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:458-463](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.cljs#L458-L463)</ins>
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
 :source {:code "(defn test-var-block\n  [v]\n  (if-let [t (:test (meta v))]\n    (test-var-block* v t)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [458 463]},
 :full-name "cljs.test/test-var-block",
 :docstring "Like test-var, but returns a block for further composition and\nlater execution."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-var-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-var-block.cljsdoc)
</pre>

