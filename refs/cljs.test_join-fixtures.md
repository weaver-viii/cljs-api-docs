## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/join-fixtures

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/join-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/join-fixtures)
</td>
</tr>
</table>

 <samp>
(__join-fixtures__ fixtures)<br>
</samp>

---




Source docstring:

```
Composes a collection of fixtures, in order.  Always returns a valid
fixture function, even if the collection is empty.
```

Source code:

```clj
(defn join-fixtures
  [fixtures]
  (reduce compose-fixtures default-fixture fixtures))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:389-393](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/test.cljs#L389-L393)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/join-fixtures"]))
```

```clj
{:ns "cljs.test",
 :name "join-fixtures",
 :signature ["[fixtures]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_join-fixtures",
 :source {:code "(defn join-fixtures\n  [fixtures]\n  (reduce compose-fixtures default-fixture fixtures))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/test.cljs",
          :lines [389 393]},
 :full-name "cljs.test/join-fixtures",
 :clj-symbol "clojure.test/join-fixtures",
 :docstring "Composes a collection of fixtures, in order.  Always returns a valid\nfixture function, even if the collection is empty."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_join-fixtures.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_join-fixtures.cljsdoc)
</pre>

