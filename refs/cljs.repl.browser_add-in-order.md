## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/add-in-order

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__add-in-order__ {:keys \[expecting fns\]} order f)<br>
</samp>

---





Source code:

```clj
(defn add-in-order [{:keys [expecting fns]} order f]
  {:expecting (or expecting order)
   :fns (assoc fns order f)})
```

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:130-132](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl/browser.clj#L130-L132)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/add-in-order"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "add-in-order",
 :type "function",
 :signature ["[{:keys [expecting fns]} order f]"],
 :source {:code "(defn add-in-order [{:keys [expecting fns]} order f]\n  {:expecting (or expecting order)\n   :fns (assoc fns order f)})",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [130 132]},
 :full-name "cljs.repl.browser/add-in-order",
 :full-name-encode "cljs.repl.browser_add-in-order",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_add-in-order.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_add-in-order.cljsdoc)
</pre>

