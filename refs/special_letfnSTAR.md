## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/letfn\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'letfn*
  [op env [_ bindings & exprs :as form] name]
  (assert (and (vector? bindings) (even? (count bindings))) "bindings must be vector of even number of elements")
  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))
        names    (keys n->fexpr)
        context  (:context env)
        [meth-env bes]
        (reduce (fn [[{:keys [locals] :as env} bes] n]
                  (let [be {:name   n
                            :line (get-line n env)
                            :column (get-col n env)
                            :tag    (-> n meta :tag)
                            :local  true
                            :shadow (locals n)}]
                    [(assoc-in env [:locals n] be)
                     (conj bes be)]))
                [env []] names)
        meth-env (assoc meth-env :context :expr)
        bes (vec (map (fn [{:keys [name shadow] :as be}]
                        (let [env (assoc-in meth-env [:locals name] shadow)]
                          (assoc be :init (analyze env (n->fexpr name)))))
                      bes))
        expr (analyze (assoc meth-env :context (if (= :expr context) :return context)) `(do ~@exprs))]
    {:env env :op :letfn :bindings bes :expr expr :form form
     :children (conj (vec (map :init bes)) expr)}))
```

 <pre>
clojurescript @ r1853
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:437-461](https://github.com/clojure/clojurescript/blob/r1853/src/clj/cljs/analyzer.clj#L437-L461)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/letfn*"]))
```

```clj
{:ns "special",
 :name "letfn*",
 :type "special form",
 :source {:code "(defmethod parse 'letfn*\n  [op env [_ bindings & exprs :as form] name]\n  (assert (and (vector? bindings) (even? (count bindings))) \"bindings must be vector of even number of elements\")\n  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))\n        names    (keys n->fexpr)\n        context  (:context env)\n        [meth-env bes]\n        (reduce (fn [[{:keys [locals] :as env} bes] n]\n                  (let [be {:name   n\n                            :line (get-line n env)\n                            :column (get-col n env)\n                            :tag    (-> n meta :tag)\n                            :local  true\n                            :shadow (locals n)}]\n                    [(assoc-in env [:locals n] be)\n                     (conj bes be)]))\n                [env []] names)\n        meth-env (assoc meth-env :context :expr)\n        bes (vec (map (fn [{:keys [name shadow] :as be}]\n                        (let [env (assoc-in meth-env [:locals name] shadow)]\n                          (assoc be :init (analyze env (n->fexpr name)))))\n                      bes))\n        expr (analyze (assoc meth-env :context (if (= :expr context) :return context)) `(do ~@exprs))]\n    {:env env :op :letfn :bindings bes :expr expr :form form\n     :children (conj (vec (map :init bes)) expr)}))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [437 461]},
 :full-name "special/letfn*",
 :full-name-encode "special_letfnSTAR",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_letfnSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_letfnSTAR.cljsdoc)
</pre>

