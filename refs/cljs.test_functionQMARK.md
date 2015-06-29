## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/function?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/function?</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/function?)
</td>
</tr>
</table>

 <samp>
(__function?__ menv x)<br>
</samp>

---




Source docstring:

```
Returns true if argument is a function or a symbol that resolves to
a function (not a macro).
```

Source code:

```clj
(defn function?
  [menv x]
  (and (symbol? x) (:fn-var (ana-api/resolve menv x))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.clj:18-22](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/test.clj#L18-L22)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/function?"]))
```

```clj
{:ns "cljs.test",
 :name "function?",
 :signature ["[menv x]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_functionQMARK",
 :source {:code "(defn function?\n  [menv x]\n  (and (symbol? x) (:fn-var (ana-api/resolve menv x))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/test.clj",
          :lines [18 22]},
 :full-name "cljs.test/function?",
 :clj-symbol "clojure.test/function?",
 :docstring "Returns true if argument is a function or a symbol that resolves to\na function (not a macro)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_functionQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_functionQMARK.cljsdoc)
</pre>

