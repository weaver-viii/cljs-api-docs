## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/do

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/do</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)
</td>
</tr>
</table>

 <samp>
(__do__ exprs\*)<br>
</samp>

---




Source docstring:

```
Evaluates the expressions in order and returns the value of
the last. If no expressions are supplied, returns nil.
```

Source code:

```clj
(defmethod parse 'do
  [op env [_ & exprs :as form] _ _]
  (let [statements (disallowing-recur
                     (seq (map #(analyze (assoc env :context :statement) %) (butlast exprs))))
        ret (if (<= (count exprs) 1)
              (analyze env (first exprs))
              (analyze (assoc env :context (if (= :statement (:context env)) :statement :return)) (last exprs)))]
    {:env env :op :do :form form
     :statements statements :ret ret
     :children (conj (vec statements) ret)}))
```

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1052-1061](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/analyzer.clj#L1052-L1061)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/do"]))
```

```clj
{:ns "special",
 :name "do",
 :signature ["[exprs*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special_do",
 :source {:code "(defmethod parse 'do\n  [op env [_ & exprs :as form] _ _]\n  (let [statements (disallowing-recur\n                     (seq (map #(analyze (assoc env :context :statement) %) (butlast exprs))))\n        ret (if (<= (count exprs) 1)\n              (analyze env (first exprs))\n              (analyze (assoc env :context (if (= :statement (:context env)) :statement :return)) (last exprs)))]\n    {:env env :op :do :form form\n     :statements statements :ret ret\n     :children (conj (vec statements) ret)}))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1052 1061]},
 :full-name "special/do",
 :clj-symbol "clojure.core/do",
 :docstring "Evaluates the expressions in order and returns the value of\nthe last. If no expressions are supplied, returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_do.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_do.cljsdoc)
</pre>

