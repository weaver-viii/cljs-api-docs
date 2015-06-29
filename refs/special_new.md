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
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         ctorexpr (analyze enve ctor)
         argexprs (vec (map #(analyze enve %) args))
         known-num-fields (:num-fields (resolve-existing-var env ctor))
         argc (count args)]
     (when (and known-num-fields (not= known-num-fields argc))
       (warning env
         (str "WARNING: Wrong number of args (" argc ") passed to " ctor)))
     
     {:env env :op :new :form form :ctor ctorexpr :args argexprs
      :children (into [ctorexpr] argexprs)})))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:525-538](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/analyzer.clj#L525-L538)</ins>
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
 :source {:code "(defmethod parse 'new\n  [_ env [_ ctor & args :as form] _]\n  (disallowing-recur\n   (let [enve (assoc env :context :expr)\n         ctorexpr (analyze enve ctor)\n         argexprs (vec (map #(analyze enve %) args))\n         known-num-fields (:num-fields (resolve-existing-var env ctor))\n         argc (count args)]\n     (when (and known-num-fields (not= known-num-fields argc))\n       (warning env\n         (str \"WARNING: Wrong number of args (\" argc \") passed to \" ctor)))\n     \n     {:env env :op :new :form form :ctor ctorexpr :args argexprs\n      :children (into [ctorexpr] argexprs)})))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [525 538]},
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

