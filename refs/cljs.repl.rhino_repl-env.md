## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/repl-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-env__)<br>
</samp>

---




Source docstring:

```
Returns a fresh JS environment, suitable for passing to repl.
Hang on to return for use across repl calls.
```

Source code:

```clj
(defn repl-env
  []
  (let [cx (Context/enter)
        scope (.initStandardObjects cx)
        base (io/resource "goog/base.js")
        deps (io/resource "goog/deps.js")
        new-repl-env (merge (RhinoEnv. (atom #{})) {:cx cx :scope scope})]
    (assert base "Can't find goog/base.js in classpath")
    (assert deps "Can't find goog/deps.js in classpath")
    (swap! current-repl-env (fn [old] new-repl-env))
    (ScriptableObject/putProperty scope
                                  "___repl_env"
                                  (Context/javaToJS new-repl-env scope))
    (with-open [r (io/reader base)]
      (-eval r new-repl-env "goog/base.js" 1))
    (-eval bootjs new-repl-env "bootjs" 1)
    ;; Load deps.js line-by-line to avoid 64K method limit
    (with-open [reader (io/reader deps)]
      (doseq [^String line (line-seq reader)]
        (-eval line new-repl-env "goog/deps.js" 1)))
    new-repl-env))
```

 <pre>
clojurescript @ r2173
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:123-145](https://github.com/clojure/clojurescript/blob/r2173/src/clj/cljs/repl/rhino.clj#L123-L145)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/repl-env"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "repl-env",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.rhino_repl-env",
 :source {:code "(defn repl-env\n  []\n  (let [cx (Context/enter)\n        scope (.initStandardObjects cx)\n        base (io/resource \"goog/base.js\")\n        deps (io/resource \"goog/deps.js\")\n        new-repl-env (merge (RhinoEnv. (atom #{})) {:cx cx :scope scope})]\n    (assert base \"Can't find goog/base.js in classpath\")\n    (assert deps \"Can't find goog/deps.js in classpath\")\n    (swap! current-repl-env (fn [old] new-repl-env))\n    (ScriptableObject/putProperty scope\n                                  \"___repl_env\"\n                                  (Context/javaToJS new-repl-env scope))\n    (with-open [r (io/reader base)]\n      (-eval r new-repl-env \"goog/base.js\" 1))\n    (-eval bootjs new-repl-env \"bootjs\" 1)\n    ;; Load deps.js line-by-line to avoid 64K method limit\n    (with-open [reader (io/reader deps)]\n      (doseq [^String line (line-seq reader)]\n        (-eval line new-repl-env \"goog/deps.js\" 1)))\n    new-repl-env))",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [123 145]},
 :full-name "cljs.repl.rhino/repl-env",
 :docstring "Returns a fresh JS environment, suitable for passing to repl.\nHang on to return for use across repl calls."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_repl-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_repl-env.cljsdoc)
</pre>

