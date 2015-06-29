## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/load-namespace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-namespace__ repl-env sym)<br>
</samp>

---




Source docstring:

```
Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once and
only once.
```

Source code:

```clj
(defn load-namespace
  [repl-env sym]
  (let [sym (if (and (seq? sym)
                     (= (first sym) 'quote))
              (second sym)
              sym)
        deps (->> (cljsc/add-dependencies (env->opts repl-env)
                                          {:requires [(name sym)] :type :seed})
                  (remove (comp #{["goog"]} :provides))
                  (remove (comp #{:seed} :type))
                  (map #(select-keys % [:provides :url])))]
    (doseq [{:keys [url provides]} deps]
      (-load repl-env provides url))))
```

 <pre>
clojurescript @ r2069
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:37-52](https://github.com/clojure/clojurescript/blob/r2069/src/clj/cljs/repl.clj#L37-L52)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-namespace"]))
```

```clj
{:ns "cljs.repl",
 :name "load-namespace",
 :signature ["[repl-env sym]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl_load-namespace",
 :source {:code "(defn load-namespace\n  [repl-env sym]\n  (let [sym (if (and (seq? sym)\n                     (= (first sym) 'quote))\n              (second sym)\n              sym)\n        deps (->> (cljsc/add-dependencies (env->opts repl-env)\n                                          {:requires [(name sym)] :type :seed})\n                  (remove (comp #{[\"goog\"]} :provides))\n                  (remove (comp #{:seed} :type))\n                  (map #(select-keys % [:provides :url])))]\n    (doseq [{:keys [url provides]} deps]\n      (-load repl-env provides url))))",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/clj/cljs/repl.clj",
          :lines [37 52]},
 :full-name "cljs.repl/load-namespace",
 :docstring "Load a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once and\nonly once."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-namespace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-namespace.cljsdoc)
</pre>

