## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/inc-report-counter!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__inc-report-counter!__ name)<br>
</samp>

---




Source docstring:

```
Increments the named counter in *report-counters*, a ref to a map.
Does nothing if *report-counters* is nil.
```

Source code:

```clj
(defn inc-report-counter!
  [name]
  (if (:report-counters (get-current-env))
    (update-current-env! [:report-counters name] (fnil inc 0))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:295-300](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/test.cljs#L295-L300)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/inc-report-counter!"]))
```

```clj
{:ns "cljs.test",
 :name "inc-report-counter!",
 :signature ["[name]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_inc-report-counterBANG",
 :source {:code "(defn inc-report-counter!\n  [name]\n  (if (:report-counters (get-current-env))\n    (update-current-env! [:report-counters name] (fnil inc 0))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [295 300]},
 :full-name "cljs.test/inc-report-counter!",
 :docstring "Increments the named counter in *report-counters*, a ref to a map.\nDoes nothing if *report-counters* is nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_inc-report-counterBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_inc-report-counterBANG.cljsdoc)
</pre>

