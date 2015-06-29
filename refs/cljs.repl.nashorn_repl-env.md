## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__ & {debug :debug, :as opts})<br>
</samp>

---




Source docstring:

```
Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript and as the
:repl-env argument to piggieback/cljs-repl. Opts has the following extra parameters:

:output-dir  the directory of the compiled files, e.g. "resources/public/my-app" (mandatory).
:output-to   load this file initially into Nashorn, relative to output-dir.
             Use a minimal bootstrapped cljs.core environment if not specified.
```

Source code:

```clj
(defn repl-env 
  [& {debug :debug :as opts}]
  (let [engine (create-engine)
        compiler-env (env/default-compiler-env)]
    (merge (NashornEnv. engine debug)
      {:cljs.env/compiler compiler-env}  ; required by cider middleware ?
      opts)))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:161-173](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/repl/nashorn.clj#L161-L173)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-env"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-env",
 :signature ["[& {debug :debug, :as opts}]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.nashorn_repl-env",
 :source {:code "(defn repl-env \n  [& {debug :debug :as opts}]\n  (let [engine (create-engine)\n        compiler-env (env/default-compiler-env)]\n    (merge (NashornEnv. engine debug)\n      {:cljs.env/compiler compiler-env}  ; required by cider middleware ?\n      opts)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [161 173]},
 :full-name "cljs.repl.nashorn/repl-env",
 :docstring "Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript and as the\n:repl-env argument to piggieback/cljs-repl. Opts has the following extra parameters:\n\n:output-dir  the directory of the compiled files, e.g. \"resources/public/my-app\" (mandatory).\n:output-to   load this file initially into Nashorn, relative to output-dir.\n             Use a minimal bootstrapped cljs.core environment if not specified."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_repl-env.cljsdoc)
</pre>

