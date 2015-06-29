## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/test

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/test</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/test)
</td>
</tr>
</table>

 <samp>
(__test__ v)<br>
</samp>

---




Source docstring:

```
test [v] finds fn at key :test in var metadata and calls it,
presuming failure will throw exception
```

Source code:

```clj
(defn test
  [v]
  (let [f (.-cljs$lang$test v)]
    (if f
      (do (f) :ok)
      :no-test)))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9364-9371](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L9364-L9371)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/test"]))
```

```clj
{:ns "cljs.core",
 :name "test",
 :signature ["[v]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.core_test",
 :source {:code "(defn test\n  [v]\n  (let [f (.-cljs$lang$test v)]\n    (if f\n      (do (f) :ok)\n      :no-test)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9364 9371]},
 :full-name "cljs.core/test",
 :clj-symbol "clojure.core/test",
 :docstring "test [v] finds fn at key :test in var metadata and calls it,\npresuming failure will throw exception"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_test.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_test.cljsdoc)
</pre>

