## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/compose-fixtures

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/compose-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/compose-fixtures)
</td>
</tr>
</table>

 <samp>
(__compose-fixtures__ f1 f2)<br>
</samp>

---




Source docstring:

```
Composes two fixture functions, creating a new fixture function
that combines their behavior.

NOTE: Incompatible with map fixtures.
```

Source code:

```clj
(defn compose-fixtures
  [f1 f2]
  (fn [g] (f1 (fn [] (f2 g)))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:477-483](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/test.cljs#L477-L483)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/compose-fixtures"]))
```

```clj
{:ns "cljs.test",
 :name "compose-fixtures",
 :signature ["[f1 f2]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_compose-fixtures",
 :source {:code "(defn compose-fixtures\n  [f1 f2]\n  (fn [g] (f1 (fn [] (f2 g)))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [477 483]},
 :full-name "cljs.test/compose-fixtures",
 :clj-symbol "clojure.test/compose-fixtures",
 :docstring "Composes two fixture functions, creating a new fixture function\nthat combines their behavior.\n\nNOTE: Incompatible with map fixtures."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_compose-fixtures.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_compose-fixtures.cljsdoc)
</pre>

