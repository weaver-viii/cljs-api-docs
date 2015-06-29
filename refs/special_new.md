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

 <samp>
(__new__ Constructor. args\*)<br>
</samp>
 <samp>
(__new__ Constructor args\*)<br>
</samp>

---




Source docstring:

```
The args, if any, are evaluated from left to right, and
passed to the JavaScript constructor. The constructed object is
returned.
```

Source code:

```clj
(defmethod parse 'new
  [_ env [_ ctor & args :as form] _ _]
  (when-not (symbol? ctor) 
    (throw (error env "First arg to new must be a symbol")))
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         ctorexpr (analyze enve ctor)
         ctor-var (resolve-existing-var env ctor)
         record-args
         (when (and (:record ctor-var) (not (-> ctor meta :internal-ctor)))
           (repeat 3 (analyze enve nil)))
         argexprs (into (vec (map #(analyze enve %) args)) record-args)
         known-num-fields (:num-fields ctor-var)
         argc (count args)]
     (when (and (not (-> ctor meta :internal-ctor))
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
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1149-1175](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/analyzer.clj#L1149-L1175)</ins>
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
 :signature ["[Constructor. args*]" "[Constructor args*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special_new",
 :source {:code "(defmethod parse 'new\n  [_ env [_ ctor & args :as form] _ _]\n  (when-not (symbol? ctor) \n    (throw (error env \"First arg to new must be a symbol\")))\n  (disallowing-recur\n   (let [enve (assoc env :context :expr)\n         ctorexpr (analyze enve ctor)\n         ctor-var (resolve-existing-var env ctor)\n         record-args\n         (when (and (:record ctor-var) (not (-> ctor meta :internal-ctor)))\n           (repeat 3 (analyze enve nil)))\n         argexprs (into (vec (map #(analyze enve %) args)) record-args)\n         known-num-fields (:num-fields ctor-var)\n         argc (count args)]\n     (when (and (not (-> ctor meta :internal-ctor))\n                known-num-fields (not= known-num-fields argc))\n       (warning :fn-arity env {:argc argc :ctor ctor}))\n     {:env env :op :new :form form :ctor ctorexpr :args argexprs\n      :children (into [ctorexpr] argexprs)\n      :tag (let [name (-> ctorexpr :info :name)]\n             (or ('{js/Object object\n                    js/String string\n                    js/Array  array\n                    js/Number number\n                    js/Function function\n                    js/Boolean boolean} name)\n                 name))})))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1149 1175]},
 :full-name "special/new",
 :clj-symbol "clojure.core/new",
 :docstring "The args, if any, are evaluated from left to right, and\npassed to the JavaScript constructor. The constructed object is\nreturned."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_new.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_new.cljsdoc)
</pre>

