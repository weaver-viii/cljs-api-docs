## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/do-report

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/do-report</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/do-report)
</td>
</tr>
</table>

 <samp>
(__do-report__ m)<br>
</samp>

---





Source code:

```clj
(defn do-report [m]
  (let [m (case (:type m)
            :fail (merge (file-and-line (js/Error.) 4) m)
            :error (merge (file-and-line (:actual m) 0) m)
            m)]
    (report m)))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:347-352](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/test.cljs#L347-L352)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/do-report"]))
```

```clj
{:ns "cljs.test",
 :name "do-report",
 :signature ["[m]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test_do-report",
 :source {:code "(defn do-report [m]\n  (let [m (case (:type m)\n            :fail (merge (file-and-line (js/Error.) 4) m)\n            :error (merge (file-and-line (:actual m) 0) m)\n            m)]\n    (report m)))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/test.cljs",
          :lines [347 352]},
 :full-name "cljs.test/do-report",
 :clj-symbol "clojure.test/do-report"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_do-report.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_do-report.cljsdoc)
</pre>

