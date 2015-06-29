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
  (prn "Type: " :cljs/quit " to quit")
  (binding [ana/*cljs-ns* 'cljs.user
            *cljs-verbose* verbose
            ana/*cljs-warnings* (assoc ana/*cljs-warnings*
                                  :undeclared warn-on-undeclared)
            ana/*cljs-static-fns* static-fns]
    (when analyze-path
      (analyze-source analyze-path))
    (let [env {:context :expr :locals {}}
          special-fns (merge default-special-fns special-fns)
          is-special-fn? (set (keys special-fns))]
      (-setup repl-env)
      (loop []
        (print (str "ClojureScript:" ana/*cljs-ns* "> "))
        (flush)
        (let [{:keys [status form]} (read-next-form)]
          (cond
           (= form :cljs/quit) :quit

           (= status :error) (recur)

           (and (seq? form) (is-special-fn? (first form)))
           (do (apply (get special-fns (first form)) repl-env (rest form)) (newline) (recur))

           :else
           (do (eval-and-print repl-env env form) (recur)))))
      (-tear-down repl-env))))
```

 <pre>
clojurescript @ r1853
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:164-193](https://github.com/clojure/clojurescript/blob/r1853/src/clj/cljs/repl.clj#L164-L193)</ins>
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
 :source {:code "(defn repl\n  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]\n  (prn \"Type: \" :cljs/quit \" to quit\")\n  (binding [ana/*cljs-ns* 'cljs.user\n            *cljs-verbose* verbose\n            ana/*cljs-warnings* (assoc ana/*cljs-warnings*\n                                  :undeclared warn-on-undeclared)\n            ana/*cljs-static-fns* static-fns]\n    (when analyze-path\n      (analyze-source analyze-path))\n    (let [env {:context :expr :locals {}}\n          special-fns (merge default-special-fns special-fns)\n          is-special-fn? (set (keys special-fns))]\n      (-setup repl-env)\n      (loop []\n        (print (str \"ClojureScript:\" ana/*cljs-ns* \"> \"))\n        (flush)\n        (let [{:keys [status form]} (read-next-form)]\n          (cond\n           (= form :cljs/quit) :quit\n\n           (= status :error) (recur)\n\n           (and (seq? form) (is-special-fn? (first form)))\n           (do (apply (get special-fns (first form)) repl-env (rest form)) (newline) (recur))\n\n           :else\n           (do (eval-and-print repl-env env form) (recur)))))\n      (-tear-down repl-env))))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/clj/cljs/repl.clj",
          :lines [164 193]},
 :full-name "cljs.repl/repl",
 :docstring "Note - repl will reload core.cljs every time, even if supplied old repl-env"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl.cljsdoc)
</pre>

