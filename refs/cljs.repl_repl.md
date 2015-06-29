## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl__ repl-env & {:keys \[analyze-path verbose warn-on-undeclared special-fns static-fns\]})<br>
</samp>

---




Source docstring:

```
Note - repl will reload core.cljs every time, even if supplied old repl-env
```

Source code:

```clj
(defn repl
  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]
  (print "To quit, type: ")
  (prn :cljs/quit)
  (env/with-compiler-env
    (or (::env/compiler repl-env) (env/default-compiler-env))
    (binding [ana/*cljs-ns* 'cljs.user
              *cljs-verbose* verbose
              ana/*cljs-warnings* (assoc ana/*cljs-warnings*
                                    :undeclared-var warn-on-undeclared
                                    :undeclared-ns warn-on-undeclared
                                    :undeclared-ns-form warn-on-undeclared)
              ana/*cljs-static-fns* static-fns]
      (when analyze-path
        (analyze-source analyze-path))
      (let [env {:context :expr :locals {}}
            special-fns (merge default-special-fns special-fns)
            is-special-fn? (set (keys special-fns))
            read-error (Object.)]
        (-setup repl-env)
        (loop []
          (print (str "ClojureScript:" ana/*cljs-ns* "> "))
          (flush)
          (let [rdr (readers/source-logging-push-back-reader
                     (java.io.PushbackReader. (io/reader *in*))
                     1
                     "NO_SOURCE_FILE")
                form (try
                       (binding [*ns* (create-ns ana/*cljs-ns*)
                                 reader/*data-readers* tags/*cljs-data-readers*
                                 reader/*alias-map*
                                 (apply merge
                                        ((juxt :requires :require-macros)
                                         (ana/get-namespace ana/*cljs-ns*)))]
                         (reader/read rdr nil read-error))
                       (catch Exception e
                         (println (.getMessage e))
                         read-error))]
            (cond
             (identical? form read-error) (recur)
             (= form :cljs/quit) :quit

             (and (seq? form) (is-special-fn? (first form)))
             (do (apply (get special-fns (first form)) repl-env (rest form))
                 (newline)
                 (recur))

             :else
             (do (eval-and-print repl-env env form)
                 (recur)))))
        (-tear-down repl-env)))))
```

 <pre>
clojurescript @ r2156
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:181-232](https://github.com/clojure/clojurescript/blob/r2156/src/clj/cljs/repl.clj#L181-L232)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl"]))
```

```clj
{:ns "cljs.repl",
 :name "repl",
 :signature ["[repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl_repl",
 :source {:code "(defn repl\n  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]\n  (print \"To quit, type: \")\n  (prn :cljs/quit)\n  (env/with-compiler-env\n    (or (::env/compiler repl-env) (env/default-compiler-env))\n    (binding [ana/*cljs-ns* 'cljs.user\n              *cljs-verbose* verbose\n              ana/*cljs-warnings* (assoc ana/*cljs-warnings*\n                                    :undeclared-var warn-on-undeclared\n                                    :undeclared-ns warn-on-undeclared\n                                    :undeclared-ns-form warn-on-undeclared)\n              ana/*cljs-static-fns* static-fns]\n      (when analyze-path\n        (analyze-source analyze-path))\n      (let [env {:context :expr :locals {}}\n            special-fns (merge default-special-fns special-fns)\n            is-special-fn? (set (keys special-fns))\n            read-error (Object.)]\n        (-setup repl-env)\n        (loop []\n          (print (str \"ClojureScript:\" ana/*cljs-ns* \"> \"))\n          (flush)\n          (let [rdr (readers/source-logging-push-back-reader\n                     (java.io.PushbackReader. (io/reader *in*))\n                     1\n                     \"NO_SOURCE_FILE\")\n                form (try\n                       (binding [*ns* (create-ns ana/*cljs-ns*)\n                                 reader/*data-readers* tags/*cljs-data-readers*\n                                 reader/*alias-map*\n                                 (apply merge\n                                        ((juxt :requires :require-macros)\n                                         (ana/get-namespace ana/*cljs-ns*)))]\n                         (reader/read rdr nil read-error))\n                       (catch Exception e\n                         (println (.getMessage e))\n                         read-error))]\n            (cond\n             (identical? form read-error) (recur)\n             (= form :cljs/quit) :quit\n\n             (and (seq? form) (is-special-fn? (first form)))\n             (do (apply (get special-fns (first form)) repl-env (rest form))\n                 (newline)\n                 (recur))\n\n             :else\n             (do (eval-and-print repl-env env form)\n                 (recur)))))\n        (-tear-down repl-env)))))",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/clj/cljs/repl.clj",
          :lines [181 232]},
 :full-name "cljs.repl/repl",
 :docstring "Note - repl will reload core.cljs every time, even if supplied old repl-env"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl.cljsdoc)
</pre>

