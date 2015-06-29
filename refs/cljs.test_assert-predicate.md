## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/assert-predicate

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/assert-predicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-predicate)
</td>
</tr>
</table>

 <samp>
(__assert-predicate__ msg form)<br>
</samp>

---




Source docstring:

```
Returns generic assertion code for any functional predicate.  The
'expected' argument to 'report' will contains the original form, the
'actual' argument will contain the form with all its sub-forms
evaluated.  If the predicate returns false, the 'actual' form will
be wrapped in (not...).
```

Source code:

```clj
(defn assert-predicate
  [msg form]
  (let [args (rest form)
        pred (first form)]
    `(let [values# (list ~@args)
           result# (apply ~pred values#)]
       (if result#
         (cljs.test/do-report
           {:type :pass, :message ~msg,
            :expected '~form, :actual (cons ~pred values#)})
         (cljs.test/do-report
           {:type :fail, :message ~msg,
            :expected '~form, :actual (list '~'not (cons '~pred values#))}))
       result#)))
```

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:24-42](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/test.clj#L24-L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/assert-predicate"]))
```

```clj
{:ns "cljs.test",
 :name "assert-predicate",
 :signature ["[msg form]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_assert-predicate",
 :source {:code "(defn assert-predicate\n  [msg form]\n  (let [args (rest form)\n        pred (first form)]\n    `(let [values# (list ~@args)\n           result# (apply ~pred values#)]\n       (if result#\n         (cljs.test/do-report\n           {:type :pass, :message ~msg,\n            :expected '~form, :actual (cons ~pred values#)})\n         (cljs.test/do-report\n           {:type :fail, :message ~msg,\n            :expected '~form, :actual (list '~'not (cons '~pred values#))}))\n       result#)))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/test.clj",
          :lines [24 42]},
 :full-name "cljs.test/assert-predicate",
 :clj-symbol "clojure.test/assert-predicate",
 :docstring "Returns generic assertion code for any functional predicate.  The\n'expected' argument to 'report' will contains the original form, the\n'actual' argument will contain the form with all its sub-forms\nevaluated.  If the predicate returns false, the 'actual' form will\nbe wrapped in (not...)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_assert-predicate.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_assert-predicate.cljsdoc)
</pre>

