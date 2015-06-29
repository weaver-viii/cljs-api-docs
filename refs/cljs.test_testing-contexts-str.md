## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/testing-contexts-str

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/testing-contexts-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing-contexts-str)
</td>
</tr>
</table>

 <samp>
(__testing-contexts-str__)<br>
</samp>

---




Source docstring:

```
Returns a string representation of the current test context. Joins
strings in *testing-contexts* with spaces.
```

Source code:

```clj
(defn testing-contexts-str
  []
  (apply str (interpose " " (reverse (:testing-contexts (get-current-env))))))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:289-293](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/test.cljs#L289-L293)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/testing-contexts-str"]))
```

```clj
{:ns "cljs.test",
 :name "testing-contexts-str",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_testing-contexts-str",
 :source {:code "(defn testing-contexts-str\n  []\n  (apply str (interpose \" \" (reverse (:testing-contexts (get-current-env))))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/test.cljs",
          :lines [289 293]},
 :full-name "cljs.test/testing-contexts-str",
 :clj-symbol "clojure.test/testing-contexts-str",
 :docstring "Returns a string representation of the current test context. Joins\nstrings in *testing-contexts* with spaces."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_testing-contexts-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_testing-contexts-str.cljsdoc)
</pre>

