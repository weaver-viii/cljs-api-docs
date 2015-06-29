## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/successful?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/successful?</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/successful?)
</td>
</tr>
</table>

 <samp>
(__successful?__ summary)<br>
</samp>

---




Source docstring:

```
Returns true if the given test summary indicates all tests
were successful, false otherwise.
```

Source code:

```clj
(defn successful?
  [summary]
  (and (zero? (:fail summary 0))
       (zero? (:error summary 0))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:565-570](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/test.cljs#L565-L570)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/successful?"]))
```

```clj
{:ns "cljs.test",
 :name "successful?",
 :signature ["[summary]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_successfulQMARK",
 :source {:code "(defn successful?\n  [summary]\n  (and (zero? (:fail summary 0))\n       (zero? (:error summary 0))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/test.cljs",
          :lines [565 570]},
 :full-name "cljs.test/successful?",
 :clj-symbol "clojure.test/successful?",
 :docstring "Returns true if the given test summary indicates all tests\nwere successful, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_successfulQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_successfulQMARK.cljsdoc)
</pre>

