## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/fn\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        locals (:locals env)
        name-var (if name
                   {:name name :shadow (locals name)}) 
        locals (if (and locals name) (assoc locals name name-var) locals)
        type (-> form meta ::type)
        fields (-> form meta ::fields)
        protocol-impl (-> form meta :protocol-impl)
        protocol-inline (-> form meta :protocol-inline)
        locals (reduce (fn [m fld]
                         (assoc m fld
                                {:name fld
                                 :line (get-line fld env)
                                 :column (get-col fld env)
                                 :field true
                                 :mutable (-> fld meta :mutable)
                                 :unsynchronized-mutable (-> fld meta :unsynchronized-mutable)
                                 :volatile-mutable (-> fld meta :volatile-mutable)
                                 :tag (-> fld meta :tag)
                                 :shadow (m fld)}))
                       locals fields)

        menv (if (> (count meths) 1) (assoc env :context :expr) env)
        menv (merge menv
               {:protocol-impl protocol-impl
                :protocol-inline protocol-inline})
        methods (map #(analyze-fn-method menv locals % type) meths)
        max-fixed-arity (apply max (map :max-fixed-arity methods))
        variadic (boolean (some :variadic methods))
        locals (if name
                 (update-in locals [name] assoc
                            :fn-var true
                            :variadic variadic
                            :max-fixed-arity max-fixed-arity
                            :method-params (map :params methods))
                 locals)
        methods (if name
                  ;; a second pass with knowledge of our function-ness/arity
                  ;; lets us optimize self calls
                  (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))
                  methods)]
    ;;todo - validate unique arities, at most one variadic, variadic takes max required args
    {:env env :op :fn :form form :name name-var :methods methods :variadic variadic
     :recur-frames *recur-frames* :loop-lets *loop-lets*
     :jsdoc [(when variadic "@param {...*} var_args")]
     :max-fixed-arity max-fixed-arity
     :protocol-impl protocol-impl
     :protocol-inline protocol-inline
     :children (mapv :expr methods)}))
```

 <pre>
clojurescript @ r1913
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:419-473](https://github.com/clojure/clojurescript/blob/r1913/src/clj/cljs/analyzer.clj#L419-L473)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/fn*"]))
```

```clj
{:ns "special",
 :name "fn*",
 :type "special form",
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;;turn (fn [] ...) into (fn ([]...))\n        meths (if (vector? (first meths)) (list meths) meths)\n        locals (:locals env)\n        name-var (if name\n                   {:name name :shadow (locals name)}) \n        locals (if (and locals name) (assoc locals name name-var) locals)\n        type (-> form meta ::type)\n        fields (-> form meta ::fields)\n        protocol-impl (-> form meta :protocol-impl)\n        protocol-inline (-> form meta :protocol-inline)\n        locals (reduce (fn [m fld]\n                         (assoc m fld\n                                {:name fld\n                                 :line (get-line fld env)\n                                 :column (get-col fld env)\n                                 :field true\n                                 :mutable (-> fld meta :mutable)\n                                 :unsynchronized-mutable (-> fld meta :unsynchronized-mutable)\n                                 :volatile-mutable (-> fld meta :volatile-mutable)\n                                 :tag (-> fld meta :tag)\n                                 :shadow (m fld)}))\n                       locals fields)\n\n        menv (if (> (count meths) 1) (assoc env :context :expr) env)\n        menv (merge menv\n               {:protocol-impl protocol-impl\n                :protocol-inline protocol-inline})\n        methods (map #(analyze-fn-method menv locals % type) meths)\n        max-fixed-arity (apply max (map :max-fixed-arity methods))\n        variadic (boolean (some :variadic methods))\n        locals (if name\n                 (update-in locals [name] assoc\n                            :fn-var true\n                            :variadic variadic\n                            :max-fixed-arity max-fixed-arity\n                            :method-params (map :params methods))\n                 locals)\n        methods (if name\n                  ;; a second pass with knowledge of our function-ness/arity\n                  ;; lets us optimize self calls\n                  (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))\n                  methods)]\n    ;;todo - validate unique arities, at most one variadic, variadic takes max required args\n    {:env env :op :fn :form form :name name-var :methods methods :variadic variadic\n     :recur-frames *recur-frames* :loop-lets *loop-lets*\n     :jsdoc [(when variadic \"@param {...*} var_args\")]\n     :max-fixed-arity max-fixed-arity\n     :protocol-impl protocol-impl\n     :protocol-inline protocol-inline\n     :children (mapv :expr methods)}))",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [419 473]},
 :full-name "special/fn*",
 :full-name-encode "special_fnSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_fnSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_fnSTAR.cljsdoc)
</pre>

