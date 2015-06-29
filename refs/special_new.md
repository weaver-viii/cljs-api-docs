## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/new

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/new</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/new)
</td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'new
  [_ env [_ ctor & args :as form] _]
  (when-not (symbol? ctor) 
    (throw (error env "First arg to new must be a symbol")))
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         ctorexpr (analyze enve ctor)
         argexprs (vec (map #(analyze enve %) args))
         known-num-fields (:num-fields (resolve-existing-var env ctor))
         argc (count args)]
     (when (and (:fn-arity *cljs-warnings*)
                (not (-> ctor meta :internal-ctor))
                known-num-fields (not= known-num-fields argc))
       (warning :fn-arity env {:argc argc :ctor ctor}))
     {:env env :op :new :form form :ctor ctorexpr :args argexprs
      :children (into [ctorexpr] argexprs)
      :tag (let [name (-> ctorexpr :info :name)]
             (or ('{js/Object object
                    js/String string
                    js/Array  array
                    js/Number number
                    js/Function function
                    js/Boolean boolean} name)
                 name))})))
```

 <pre>
clojurescript @ r2127
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:883-906](https://github.com/clojure/clojurescript/blob/r2127/src/clj/cljs/analyzer.clj#L883-L906)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/new"]))
```

```clj
{:ns "special",
 :name "new",
 :type "special form",
 :source {:code "(defmethod parse 'new\n  [_ env [_ ctor & args :as form] _]\n  (when-not (symbol? ctor) \n    (throw (error env \"First arg to new must be a symbol\")))\n  (disallowing-recur\n   (let [enve (assoc env :context :expr)\n         ctorexpr (analyze enve ctor)\n         argexprs (vec (map #(analyze enve %) args))\n         known-num-fields (:num-fields (resolve-existing-var env ctor))\n         argc (count args)]\n     (when (and (:fn-arity *cljs-warnings*)\n                (not (-> ctor meta :internal-ctor))\n                known-num-fields (not= known-num-fields argc))\n       (warning :fn-arity env {:argc argc :ctor ctor}))\n     {:env env :op :new :form form :ctor ctorexpr :args argexprs\n      :children (into [ctorexpr] argexprs)\n      :tag (let [name (-> ctorexpr :info :name)]\n             (or ('{js/Object object\n                    js/String string\n                    js/Array  array\n                    js/Number number\n                    js/Function function\n                    js/Boolean boolean} name)\n                 name))})))",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [883 906]},
 :full-name "special/new",
 :full-name-encode "special_new",
 :clj-symbol "clojure.core/new",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_new.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_new.cljsdoc)
</pre>

