## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/var

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var)
</td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'var
  [op env [_ sym :as form] _ _]
  (let [var (resolve-var env sym)]
    {:env env :op :var-special :form form
     :var (analyze env sym)
     :sym (analyze env `(quote ~(symbol (name (:ns var)) (name (:name var)))))
     :meta (let [ks [:ns :name :doc :file :line :column]
                 m (assoc (zipmap ks (map #(list 'quote (get var %)) ks))
                     :test `(when ~sym (.-cljs$lang$test ~sym))
                     :arglists (:arglists var))]
            (analyze env m))}))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:505-515](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/analyzer.clj#L505-L515)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/var"]))
```

```clj
{:ns "special",
 :name "var",
 :type "special form",
 :source {:code "(defmethod parse 'var\n  [op env [_ sym :as form] _ _]\n  (let [var (resolve-var env sym)]\n    {:env env :op :var-special :form form\n     :var (analyze env sym)\n     :sym (analyze env `(quote ~(symbol (name (:ns var)) (name (:name var)))))\n     :meta (let [ks [:ns :name :doc :file :line :column]\n                 m (assoc (zipmap ks (map #(list 'quote (get var %)) ks))\n                     :test `(when ~sym (.-cljs$lang$test ~sym))\n                     :arglists (:arglists var))]\n            (analyze env m))}))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [505 515]},
 :full-name "special/var",
 :full-name-encode "special_var",
 :clj-symbol "clojure.core/var",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_var.cljsdoc)
</pre>

