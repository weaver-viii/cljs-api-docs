## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/test-var

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-var</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-var)
</td>
</tr>
</table>

 <samp>
(__test-var__ v)<br>
</samp>

---




Source docstring:

```
If v has a function in its :test metadata, calls that function,
add v to :testing-vars property of env.
```

Source code:

```clj
(defn test-var
  [v]
  (run-block (test-var-block v)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:464-468](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/test.cljs#L464-L468)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-var"]))
```

```clj
{:ns "cljs.test",
 :name "test-var",
 :signature ["[v]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_test-var",
 :source {:code "(defn test-var\n  [v]\n  (run-block (test-var-block v)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [464 468]},
 :full-name "cljs.test/test-var",
 :clj-symbol "clojure.test/test-var",
 :docstring "If v has a function in its :test metadata, calls that function,\nadd v to :testing-vars property of env."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_test-var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_test-var.cljsdoc)
</pre>

