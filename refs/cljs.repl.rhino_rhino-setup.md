## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/rhino-setup

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__rhino-setup__ repl-env opts)<br>
</samp>

---





Source code:

```clj
(defn rhino-setup [repl-env opts]
  (let [env   (ana/empty-env)
        scope (:scope repl-env)]
    (ScriptableObject/putProperty scope "__repl_opts"
      (Context/javaToJS opts scope))
    (repl/load-file repl-env "cljs/core.cljs" opts)
    (ScriptableObject/putProperty scope
      "out" (Context/javaToJS *out* scope))
    (binding [ana/*cljs-ns* 'cljs.core]
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(do
           (set! (.-isProvided_ js/goog) (fn [_] false))
           (set! *print-fn* (fn [x] (.write js/out x))))))))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:118-130](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/repl/rhino.clj#L118-L130)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/rhino-setup"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "rhino-setup",
 :type "function",
 :signature ["[repl-env opts]"],
 :source {:code "(defn rhino-setup [repl-env opts]\n  (let [env   (ana/empty-env)\n        scope (:scope repl-env)]\n    (ScriptableObject/putProperty scope \"__repl_opts\"\n      (Context/javaToJS opts scope))\n    (repl/load-file repl-env \"cljs/core.cljs\" opts)\n    (ScriptableObject/putProperty scope\n      \"out\" (Context/javaToJS *out* scope))\n    (binding [ana/*cljs-ns* 'cljs.core]\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(do\n           (set! (.-isProvided_ js/goog) (fn [_] false))\n           (set! *print-fn* (fn [x] (.write js/out x))))))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [118 130]},
 :full-name "cljs.repl.rhino/rhino-setup",
 :full-name-encode "cljs.repl.rhino_rhino-setup",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_rhino-setup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_rhino-setup.cljsdoc)
</pre>

