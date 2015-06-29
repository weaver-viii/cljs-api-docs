## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/testing-vars-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/testing-vars-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-vars-str)
</td>
</tr>
</table>

 <samp>
(__testing-vars-str__ m)<br>
</samp>

---




Source docstring:

```
Returns a string representation of the current test.  Renders names
in *testing-vars* as a list, then the source file and line of
current assertion.
```

Source code:

```clj
(defn testing-vars-str
  [m]
  (let [{:keys [file line]} m]
    (str
      (reverse (map #(:name (meta %)) (:testing-vars (get-current-env))))
      " (" file ":" line ")")))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:238-246](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/test.cljs#L238-L246)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/testing-vars-str"]))
```

```clj
{:ns "cljs.test",
 :name "testing-vars-str",
 :signature ["[m]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_testing-vars-str",
 :source {:code "(defn testing-vars-str\n  [m]\n  (let [{:keys [file line]} m]\n    (str\n      (reverse (map #(:name (meta %)) (:testing-vars (get-current-env))))\n      \" (\" file \":\" line \")\")))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/test.cljs",
          :lines [238 246]},
 :full-name "cljs.test/testing-vars-str",
 :clj-symbol "clojure.test/testing-vars-str",
 :docstring "Returns a string representation of the current test.  Renders names\nin *testing-vars* as a list, then the source file and line of\ncurrent assertion."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_testing-vars-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_testing-vars-str.cljsdoc)
</pre>

