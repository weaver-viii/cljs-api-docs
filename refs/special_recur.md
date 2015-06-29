## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/recur

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/recur</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/recur)
</td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'recur
  [op env [_ & exprs :as form] _]
  (let [context (:context env)
        frame (first *recur-frames*)
        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]
    (assert frame "Can't recur here")
    (assert (= (count exprs) (count (:names frame))) "recur argument count mismatch")
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur :form form}
      :frame frame
      :exprs exprs
      :children exprs)))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:1081-1092](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L1081-L1092)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/recur"]))
```

```clj
{:ns "special",
 :name "recur",
 :type "special form",
 :source {:code "(defmethod parse 'recur\n  [op env [_ & exprs :as form] _]\n  (let [context (:context env)\n        frame (first *recur-frames*)\n        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]\n    (assert frame \"Can't recur here\")\n    (assert (= (count exprs) (count (:names frame))) \"recur argument count mismatch\")\n    (reset! (:flag frame) true)\n    (assoc {:env env :op :recur :form form}\n      :frame frame\n      :exprs exprs\n      :children exprs)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/compiler.clj",
          :lines [1081 1092]},
 :full-name "special/recur",
 :full-name-encode "special_recur",
 :clj-symbol "clojure.core/recur",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_recur.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_recur.cljsdoc)
</pre>
