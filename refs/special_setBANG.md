## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/set!

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set!)
</td>
</tr>
</table>

 <samp>
(__set!__ js-var val)<br>
</samp>

---

Sets `js-var` to `val` using the JavaScript `=` operator.

---


See Also:

[`cljs.core/aset`](cljs.core_aset.md)<br>
[`cljs.core/reset!`](cljs.core_resetBANG.md)<br>

---


Source code:

```clj
(defmethod parse 'set!
  [_ env [_ target val alt :as form] _]
  (let [[target val] (if alt
                       ;; (set! o -prop val)
                       [`(. ~target ~val) alt]
                       [target val])]
    (disallowing-recur
     (let [enve (assoc env :context :expr)
           targetexpr (cond
                       ;; TODO: proper resolve
                       (= target '*unchecked-if*)
                       (do
                         (reset! *unchecked-if* val)
                         ::set-unchecked-if)

                       (symbol? target)
                       (do
                         (let [local (-> env :locals target)]
                           (assert (or (nil? local)
                                       (and (:field local)
                                            (:mutable local)))
                                   "Can't set! local var or non-mutable field"))
                         (analyze-symbol enve target))

                       :else
                       (when (seq? target)
                         (let [targetexpr (analyze-seq enve target nil)]
                           (when (:field targetexpr)
                             targetexpr))))
           valexpr (analyze enve val)]
       (assert targetexpr "set! target must be a field or a symbol naming a var")
       (cond
        (= targetexpr ::set-unchecked-if) {:env env :op :no-op}
        :else {:env env :op :set! :form form :target targetexpr :val valexpr
               :children [targetexpr valexpr]})))))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:1107-1141](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L1107-L1141)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/set!"]))
```

```clj
{:description "Sets `js-var` to `val` using the JavaScript `=` operator.",
 :ns "special",
 :name "set!",
 :signature ["[js-var val]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["cljs.core/aset" "cljs.core/reset!"],
 :full-name-encode "special_setBANG",
 :source {:code "(defmethod parse 'set!\n  [_ env [_ target val alt :as form] _]\n  (let [[target val] (if alt\n                       ;; (set! o -prop val)\n                       [`(. ~target ~val) alt]\n                       [target val])]\n    (disallowing-recur\n     (let [enve (assoc env :context :expr)\n           targetexpr (cond\n                       ;; TODO: proper resolve\n                       (= target '*unchecked-if*)\n                       (do\n                         (reset! *unchecked-if* val)\n                         ::set-unchecked-if)\n\n                       (symbol? target)\n                       (do\n                         (let [local (-> env :locals target)]\n                           (assert (or (nil? local)\n                                       (and (:field local)\n                                            (:mutable local)))\n                                   \"Can't set! local var or non-mutable field\"))\n                         (analyze-symbol enve target))\n\n                       :else\n                       (when (seq? target)\n                         (let [targetexpr (analyze-seq enve target nil)]\n                           (when (:field targetexpr)\n                             targetexpr))))\n           valexpr (analyze enve val)]\n       (assert targetexpr \"set! target must be a field or a symbol naming a var\")\n       (cond\n        (= targetexpr ::set-unchecked-if) {:env env :op :no-op}\n        :else {:env env :op :set! :form form :target targetexpr :val valexpr\n               :children [targetexpr valexpr]})))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/compiler.clj",
          :lines [1107 1141]},
 :full-name "special/set!",
 :clj-symbol "clojure.core/set!"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_setBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_setBANG.cljsdoc)
</pre>
