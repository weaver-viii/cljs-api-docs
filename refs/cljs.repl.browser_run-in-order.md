## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/run-in-order

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__run-in-order__ {:keys \[expecting fns\]})<br>
</samp>

---





Source code:

```clj
(defn run-in-order [{:keys [expecting fns]}]
  (loop [order expecting
         fns fns]
    (if-let [f (get fns order)]
      (do (f)
          (recur (inc order) (dissoc fns order)))
      {:expecting order :fns fns})))
```

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:110-116](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/browser.clj#L110-L116)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/run-in-order"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "run-in-order",
 :type "function",
 :signature ["[{:keys [expecting fns]}]"],
 :source {:code "(defn run-in-order [{:keys [expecting fns]}]\n  (loop [order expecting\n         fns fns]\n    (if-let [f (get fns order)]\n      (do (f)\n          (recur (inc order) (dissoc fns order)))\n      {:expecting order :fns fns})))",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [110 116]},
 :full-name "cljs.repl.browser/run-in-order",
 :full-name-encode "cljs.repl.browser_run-in-order",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_run-in-order.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_run-in-order.cljsdoc)
</pre>

