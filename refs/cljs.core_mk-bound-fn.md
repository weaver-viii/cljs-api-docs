## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mk-bound-fn

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mk-bound-fn__ sc test key)<br>
</samp>

---





Source code:

```clj
(defn mk-bound-fn
  [sc test key]
  (fn [e]
    (let [comp (-comparator sc)]
      (test (comp (-entry-key sc e) key) 0))))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6504-6508](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L6504-L6508)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mk-bound-fn"]))
```

```clj
{:ns "cljs.core",
 :name "mk-bound-fn",
 :type "function",
 :signature ["[sc test key]"],
 :source {:code "(defn mk-bound-fn\n  [sc test key]\n  (fn [e]\n    (let [comp (-comparator sc)]\n      (test (comp (-entry-key sc e) key) 0))))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6504 6508]},
 :full-name "cljs.core/mk-bound-fn",
 :full-name-encode "cljs.core_mk-bound-fn",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_mk-bound-fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_mk-bound-fn.cljsdoc)
</pre>

