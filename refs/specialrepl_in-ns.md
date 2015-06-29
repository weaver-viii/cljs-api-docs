## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/in-ns

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/in-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/in-ns)
</td>
</tr>
</table>

 <samp>
(__in-ns__ name)<br>
</samp>

---

Only usable from a REPL.

Changes to the namespace `name`, creating it if needed.

Sets `*cljs-ns*` to the namespace `name`.

---

Example:

```clj
(in-ns 'foo.core)
```

---



Source code:

```clj
(defn repl
  "Note - repl will reload core.cljs every time, even if supplied old repl-env"
  [repl-env & {:keys [verbose warn-on-undeclared]}]
  (prn "Type: " :cljs/quit " to quit")
  (binding [comp/*cljs-ns* 'cljs.user
            *cljs-verbose* verbose
            comp/*cljs-warn-on-undeclared* warn-on-undeclared]
    (let [env {:context :statement :locals {}}]
      (-setup repl-env)
      (loop []
        (print (str "ClojureScript:" comp/*cljs-ns* "> "))
        (flush)
        (let [{:keys [status form]} (read-next-form)]
          (cond
           (= form :cljs/quit) :quit
           
           (= status :error) (recur)
           
           (and (seq? form) (= (first form) 'in-ns))
           (do (set! comp/*cljs-ns* (second (second form))) (newline) (recur))
           
           (and (seq? form) ('#{load-file clojure.core/load-file} (first form)))
           (do (load-file repl-env (second form)) (newline) (recur))
           
           (and (seq? form) ('#{load-namespace} (first form)))
           (do (load-namespace repl-env (second form)) (newline) (recur))
           
           :else
           (do (eval-and-print repl-env env form) (recur)))))
      (-tear-down repl-env))))
```

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:132-161](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/repl.clj#L132-L161)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/in-ns"]))
```

```clj
{:description "Only usable from a REPL.\n\nChanges to the namespace `name`, creating it if needed.\n\nSets `*cljs-ns*` to the namespace `name`.",
 :ns "specialrepl",
 :name "in-ns",
 :signature ["[name]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl_in-ns",
 :source {:code "(defn repl\n  \"Note - repl will reload core.cljs every time, even if supplied old repl-env\"\n  [repl-env & {:keys [verbose warn-on-undeclared]}]\n  (prn \"Type: \" :cljs/quit \" to quit\")\n  (binding [comp/*cljs-ns* 'cljs.user\n            *cljs-verbose* verbose\n            comp/*cljs-warn-on-undeclared* warn-on-undeclared]\n    (let [env {:context :statement :locals {}}]\n      (-setup repl-env)\n      (loop []\n        (print (str \"ClojureScript:\" comp/*cljs-ns* \"> \"))\n        (flush)\n        (let [{:keys [status form]} (read-next-form)]\n          (cond\n           (= form :cljs/quit) :quit\n           \n           (= status :error) (recur)\n           \n           (and (seq? form) (= (first form) 'in-ns))\n           (do (set! comp/*cljs-ns* (second (second form))) (newline) (recur))\n           \n           (and (seq? form) ('#{load-file clojure.core/load-file} (first form)))\n           (do (load-file repl-env (second form)) (newline) (recur))\n           \n           (and (seq? form) ('#{load-namespace} (first form)))\n           (do (load-namespace repl-env (second form)) (newline) (recur))\n           \n           :else\n           (do (eval-and-print repl-env env form) (recur)))))\n      (-tear-down repl-env))))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/clj/cljs/repl.clj",
          :lines [132 161]},
 :examples [{:id "e81eb3", :content "```clj\n(in-ns 'foo.core)\n```"}],
 :full-name "specialrepl/in-ns",
 :clj-symbol "clojure.core/in-ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_in-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_in-ns.cljsdoc)
</pre>

