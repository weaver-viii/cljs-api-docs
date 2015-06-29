## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/assert-any

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/assert-any</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-any)
</td>
</tr>
</table>

 <samp>
(__assert-any__ msg form)<br>
</samp>

---




Source docstring:

```
Returns generic assertion code for any test, including macros, Java
method calls, or isolated symbols.
```

Source code:

```clj
(defn assert-any
  [msg form]
  `(let [value# ~form]
     (if value#
       (cljs.test/do-report
         {:type :pass, :message ~msg,
          :expected '~form, :actual value#})
       (cljs.test/do-report
         {:type :fail, :message ~msg,
          :expected '~form, :actual value#}))
     value#))
```

 <pre>
clojurescript @ r3190
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:44-56](https://github.com/clojure/clojurescript/blob/r3190/src/clj/cljs/test.clj#L44-L56)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/assert-any"]))
```

```clj
{:ns "cljs.test",
 :name "assert-any",
 :signature ["[msg form]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_assert-any",
 :source {:code "(defn assert-any\n  [msg form]\n  `(let [value# ~form]\n     (if value#\n       (cljs.test/do-report\n         {:type :pass, :message ~msg,\n          :expected '~form, :actual value#})\n       (cljs.test/do-report\n         {:type :fail, :message ~msg,\n          :expected '~form, :actual value#}))\n     value#))",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/clj/cljs/test.clj",
          :lines [44 56]},
 :full-name "cljs.test/assert-any",
 :clj-symbol "clojure.test/assert-any",
 :docstring "Returns generic assertion code for any test, including macros, Java\nmethod calls, or isolated symbols."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_assert-any.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_assert-any.cljsdoc)
</pre>

