## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/deftype\*

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defmethod parse 'deftype*
  [_ env [_ tsym fields pmasks :as form] _]
  (let [t (:name (resolve-var (dissoc env :locals) tsym))]
    (swap! env/*compiler* update-in [::namespaces (-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {})
                       :name t
                       :type true
                       :num-fields (count fields))]
               (merge m
                 {:protocols (-> tsym meta :protocols)}
                 (source-info tsym env)))))
    {:env env :op :deftype* :form form :t t :fields fields :pmasks pmasks}))
```

 <pre>
clojurescript @ r2027
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:932-944](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/analyzer.clj#L932-L944)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/deftype*"]))
```

```clj
{:ns "special",
 :name "deftype*",
 :type "special form",
 :source {:code "(defmethod parse 'deftype*\n  [_ env [_ tsym fields pmasks :as form] _]\n  (let [t (:name (resolve-var (dissoc env :locals) tsym))]\n    (swap! env/*compiler* update-in [::namespaces (-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {})\n                       :name t\n                       :type true\n                       :num-fields (count fields))]\n               (merge m\n                 {:protocols (-> tsym meta :protocols)}\n                 (source-info tsym env)))))\n    {:env env :op :deftype* :form form :t t :fields fields :pmasks pmasks}))",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [932 944]},
 :full-name "special/deftype*",
 :full-name-encode "special_deftypeSTAR",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_deftypeSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_deftypeSTAR.cljsdoc)
</pre>

