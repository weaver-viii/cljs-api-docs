## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/defrecord\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'defrecord*
  [_ env [_ tsym fields pmasks :as form] _]
  (let [t (:name (resolve-var (dissoc env :locals) tsym))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {}) :name t :type true)]
               (merge m
                 {:protocols (-> tsym meta :protocols)}
                 (source-info tsym env)))))
    {:env env :op :defrecord* :form form :t t :fields fields :pmasks pmasks}))
```

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:739-748](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/analyzer.clj#L739-L748)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/defrecord*"]))
```

```clj
{:ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env [_ tsym fields pmasks :as form] _]\n  (let [t (:name (resolve-var (dissoc env :locals) tsym))]\n    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {}) :name t :type true)]\n               (merge m\n                 {:protocols (-> tsym meta :protocols)}\n                 (source-info tsym env)))))\n    {:env env :op :defrecord* :form form :t t :fields fields :pmasks pmasks}))",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [739 748]},
 :full-name "special/defrecord*",
 :full-name-encode "special_defrecordSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_defrecordSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_defrecordSTAR.cljsdoc)
</pre>

