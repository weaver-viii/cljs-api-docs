## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/bootstrap-repl

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bootstrap-repl__ engine output-dir opts)<br>
</samp>

---





Source code:

```clj
(defn bootstrap-repl [engine output-dir opts]
  (env/ensure
    (let [deps-file ".nashorn_repl_deps.js"
          core (io/resource "cljs/core.cljs")
          core-js (closure/compile core
                    (assoc opts
                      :output-file (closure/src-file->target-file core)))
          deps (closure/add-dependencies opts core-js)]
      ;; output unoptimized code and the deps file
      ;; for all compiled namespaces
      (apply closure/output-unoptimized
        (assoc opts :output-to (.getPath (io/file output-dir deps-file)))
        deps)
      ;; load the deps file so we can goog.require cljs.core etc.
      (load-js-file engine deps-file))))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:118-132](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl/nashorn.clj#L118-L132)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/bootstrap-repl"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "bootstrap-repl",
 :type "function",
 :signature ["[engine output-dir opts]"],
 :source {:code "(defn bootstrap-repl [engine output-dir opts]\n  (env/ensure\n    (let [deps-file \".nashorn_repl_deps.js\"\n          core (io/resource \"cljs/core.cljs\")\n          core-js (closure/compile core\n                    (assoc opts\n                      :output-file (closure/src-file->target-file core)))\n          deps (closure/add-dependencies opts core-js)]\n      ;; output unoptimized code and the deps file\n      ;; for all compiled namespaces\n      (apply closure/output-unoptimized\n        (assoc opts :output-to (.getPath (io/file output-dir deps-file)))\n        deps)\n      ;; load the deps file so we can goog.require cljs.core etc.\n      (load-js-file engine deps-file))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [118 132]},
 :full-name "cljs.repl.nashorn/bootstrap-repl",
 :full-name-encode "cljs.repl.nashorn_bootstrap-repl",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_bootstrap-repl.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_bootstrap-repl.cljsdoc)
</pre>

