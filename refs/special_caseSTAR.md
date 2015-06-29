## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/case\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2227"><img valign="middle" alt="[+] 0.0-2227" src="https://img.shields.io/badge/+-0.0--2227-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'case*
  [op env [_ sym tests thens default :as form] name _]
  (assert (symbol? sym) "case* must switch on symbol")
  (assert (every? vector? tests) "case* tests must be grouped in vectors")
  (let [expr-env (assoc env :context :expr)
        v        (disallowing-recur (analyze expr-env sym))
        tests    (mapv #(mapv (fn [t] (analyze expr-env t)) %) tests)
        thens    (mapv #(analyze env %) thens)
        default  (analyze env default)]
    (assert (every? (fn [t] (and (= :constant (:op t))
                              ((some-fn number? string? char?) (:form t))))
              (apply concat tests))
      "case* tests must be numbers or strings")
    {:env env :op :case* :form form
     :v v :tests tests :thens thens :default default
     :children (vec (concat [v] tests thens (if default [default])))}))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:529-544](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/analyzer.clj#L529-L544)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/case*"]))
```

```clj
{:ns "special",
 :name "case*",
 :type "special form",
 :source {:code "(defmethod parse 'case*\n  [op env [_ sym tests thens default :as form] name _]\n  (assert (symbol? sym) \"case* must switch on symbol\")\n  (assert (every? vector? tests) \"case* tests must be grouped in vectors\")\n  (let [expr-env (assoc env :context :expr)\n        v        (disallowing-recur (analyze expr-env sym))\n        tests    (mapv #(mapv (fn [t] (analyze expr-env t)) %) tests)\n        thens    (mapv #(analyze env %) thens)\n        default  (analyze env default)]\n    (assert (every? (fn [t] (and (= :constant (:op t))\n                              ((some-fn number? string? char?) (:form t))))\n              (apply concat tests))\n      \"case* tests must be numbers or strings\")\n    {:env env :op :case* :form form\n     :v v :tests tests :thens thens :default default\n     :children (vec (concat [v] tests thens (if default [default])))}))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [529 544]},
 :full-name "special/case*",
 :full-name-encode "special_caseSTAR",
 :history [["+" "0.0-2227"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_caseSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_caseSTAR.cljsdoc)
</pre>

