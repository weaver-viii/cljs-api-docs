## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/load-namespace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-namespace__ repl-env ns)<br>
</samp>
 <samp>
(__load-namespace__ repl-env ns opts)<br>
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
  ([repl-env ns] (load-namespace repl-env ns nil))
  ([repl-env ns opts]
   (let [ns (if (and (seq? ns)
                     (= (first ns) 'quote))
               (second ns)
               ns)
         ;; TODO: add pre-condition to source-on-disk, the
         ;; source must supply at least :url - David
         sources (cljsc/add-dependencies
                   (merge (env->opts repl-env) opts)
                   {:requires [(name ns)] :type :seed
                    :url (:uri (cljsc/source-for-namespace
                                 ns env/*compiler*))})
         deps (->> sources
                (remove (comp #{["goog"]} :provides))
                (remove (comp #{:seed} :type))
                (map #(select-keys % [:provides :url])))]
     (if (:output-dir opts)
       ;; REPLs that read from :output-dir just need to add deps,
       ;; environment will handle actual loading - David
       (doseq [source (map #(cljsc/source-on-disk opts %) sources)]
         (-evaluate repl-env "<cljs repl>" 1
           (cljsc/add-dep-string opts source)))
       ;; REPLs that stream must manually load each dep - David
       (doseq [{:keys [url provides]} deps]
         (-load repl-env provides url))))))
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:166-195](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/repl.clj#L166-L195)</ins>
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
 :signature ["[repl-env ns]" "[repl-env ns opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl_load-namespace",
 :source {:code "(defn load-namespace\n  ([repl-env ns] (load-namespace repl-env ns nil))\n  ([repl-env ns opts]\n   (let [ns (if (and (seq? ns)\n                     (= (first ns) 'quote))\n               (second ns)\n               ns)\n         ;; TODO: add pre-condition to source-on-disk, the\n         ;; source must supply at least :url - David\n         sources (cljsc/add-dependencies\n                   (merge (env->opts repl-env) opts)\n                   {:requires [(name ns)] :type :seed\n                    :url (:uri (cljsc/source-for-namespace\n                                 ns env/*compiler*))})\n         deps (->> sources\n                (remove (comp #{[\"goog\"]} :provides))\n                (remove (comp #{:seed} :type))\n                (map #(select-keys % [:provides :url])))]\n     (if (:output-dir opts)\n       ;; REPLs that read from :output-dir just need to add deps,\n       ;; environment will handle actual loading - David\n       (doseq [source (map #(cljsc/source-on-disk opts %) sources)]\n         (-evaluate repl-env \"<cljs repl>\" 1\n           (cljsc/add-dep-string opts source)))\n       ;; REPLs that stream must manually load each dep - David\n       (doseq [{:keys [url provides]} deps]\n         (-load repl-env provides url))))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/clj/cljs/repl.clj",
          :lines [166 195]},
 :full-name "cljs.repl/load-namespace",
 :docstring "Load a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once and\nonly once."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-namespace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-namespace.cljsdoc)
</pre>

