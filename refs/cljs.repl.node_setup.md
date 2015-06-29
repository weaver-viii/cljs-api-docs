## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.node/setup

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__setup__ repl-env)<br>
</samp>
 <samp>
(__setup__ repl-env opts)<br>
</samp>

---





Source code:

```clj
(defn setup
  ([repl-env] (setup repl-env nil))
  ([repl-env opts]
    (let [output-dir (io/file (:output-dir opts))
          _    (.mkdirs output-dir)
          of   (io/file output-dir "node_repl.js")
          _   (spit of
                (string/replace (slurp (io/resource "cljs/repl/node_repl.js"))
                  "var PORT = 5001;"
                  (str "var PORT = " (:port repl-env) ";")))
          bldr (ProcessBuilder. (into-array ["node"]))
          _    (-> bldr
                 (.redirectInput of)
                 (.redirectOutput ProcessBuilder$Redirect/INHERIT)
                 (.redirectError ProcessBuilder$Redirect/INHERIT))
          proc (.start bldr)
          env  (ana/empty-env)
          core (io/resource "cljs/core.cljs")
          root-path (.getCanonicalFile output-dir)
          rewrite-path (str (.getPath root-path) File/separator "goog")]
      ;; TODO: temporary hack, should wait till we can read the start string
      ;; from the process - David
      (Thread/sleep 300)
      (reset! (:socket repl-env)
        (socket (:host repl-env) (:port repl-env)))
      (reset! (:proc repl-env) proc)
      ;; compile cljs.core & its dependencies, goog/base.js must be available
      ;; for bootstrap to load, use new closure/compile as it can handle
      ;; resources in JARs
      (let [core-js (closure/compile core
                      (assoc opts
                        :output-file
                        (closure/src-file->target-file core)
                        ;:static-fns true
                        ))
            deps    (closure/add-dependencies opts core-js)]
        ;; output unoptimized code and the deps file
        ;; for all compiled namespaces
        (apply closure/output-unoptimized
          (assoc opts
            :output-to (.getPath (io/file output-dir "node_repl_deps.js")))
          deps))
      ;; bootstrap, replace __dirname as __dirname won't be set
      ;; properly due to how we are running it - David
      (node-eval repl-env
        (-> (slurp (io/resource "cljs/bootstrap_node.js"))
          (string/replace "__dirname"
            (str "\"" (str rewrite-path File/separator "bootstrap") "\""))
          (string/replace "./.." rewrite-path)
          (string/replace
            "var CLJS_ROOT = \"./\";"
            (str "var CLJS_ROOT = \"" (.getPath root-path) "/\";"))))
      ;; load the deps file so we can goog.require cljs.core etc.
      (node-eval repl-env
        (str "require('"
          (.getPath root-path)
          File/separator "node_repl_deps.js')"))
      ;; monkey-patch isProvided_ to avoid useless warnings - David
      (node-eval repl-env
        (str "goog.isProvided_ = function(x) { return false; };"))
      ;; monkey-patch goog.require, skip all the loaded checks
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(set! (.-require js/goog)
           (fn [name]
             (js/CLOSURE_IMPORT_SCRIPT
               (aget (.. js/goog -dependencies_ -nameToPath) name)))))
      ;; load cljs.core, setup printing
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(do
           (.require js/goog "cljs.core")
           (set! *print-fn* (.-print (js/require "util")))))
      ;; redef goog.require to track loaded libs
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(set! (.-require js/goog)
           (fn [name reload]
             (when (or (not (contains? *loaded-libs* name)) reload)
               (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))
               (js/CLOSURE_IMPORT_SCRIPT
                 (aget (.. js/goog -dependencies_ -nameToPath) name))))))
      )))
```

 <pre>
clojurescript @ r2665
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:72-151](https://github.com/clojure/clojurescript/blob/r2665/src/clj/cljs/repl/node.clj#L72-L151)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/setup"]))
```

```clj
{:ns "cljs.repl.node",
 :name "setup",
 :type "function",
 :signature ["[repl-env]" "[repl-env opts]"],
 :source {:code "(defn setup\n  ([repl-env] (setup repl-env nil))\n  ([repl-env opts]\n    (let [output-dir (io/file (:output-dir opts))\n          _    (.mkdirs output-dir)\n          of   (io/file output-dir \"node_repl.js\")\n          _   (spit of\n                (string/replace (slurp (io/resource \"cljs/repl/node_repl.js\"))\n                  \"var PORT = 5001;\"\n                  (str \"var PORT = \" (:port repl-env) \";\")))\n          bldr (ProcessBuilder. (into-array [\"node\"]))\n          _    (-> bldr\n                 (.redirectInput of)\n                 (.redirectOutput ProcessBuilder$Redirect/INHERIT)\n                 (.redirectError ProcessBuilder$Redirect/INHERIT))\n          proc (.start bldr)\n          env  (ana/empty-env)\n          core (io/resource \"cljs/core.cljs\")\n          root-path (.getCanonicalFile output-dir)\n          rewrite-path (str (.getPath root-path) File/separator \"goog\")]\n      ;; TODO: temporary hack, should wait till we can read the start string\n      ;; from the process - David\n      (Thread/sleep 300)\n      (reset! (:socket repl-env)\n        (socket (:host repl-env) (:port repl-env)))\n      (reset! (:proc repl-env) proc)\n      ;; compile cljs.core & its dependencies, goog/base.js must be available\n      ;; for bootstrap to load, use new closure/compile as it can handle\n      ;; resources in JARs\n      (let [core-js (closure/compile core\n                      (assoc opts\n                        :output-file\n                        (closure/src-file->target-file core)\n                        ;:static-fns true\n                        ))\n            deps    (closure/add-dependencies opts core-js)]\n        ;; output unoptimized code and the deps file\n        ;; for all compiled namespaces\n        (apply closure/output-unoptimized\n          (assoc opts\n            :output-to (.getPath (io/file output-dir \"node_repl_deps.js\")))\n          deps))\n      ;; bootstrap, replace __dirname as __dirname won't be set\n      ;; properly due to how we are running it - David\n      (node-eval repl-env\n        (-> (slurp (io/resource \"cljs/bootstrap_node.js\"))\n          (string/replace \"__dirname\"\n            (str \"\\\"\" (str rewrite-path File/separator \"bootstrap\") \"\\\"\"))\n          (string/replace \"./..\" rewrite-path)\n          (string/replace\n            \"var CLJS_ROOT = \\\"./\\\";\"\n            (str \"var CLJS_ROOT = \\\"\" (.getPath root-path) \"/\\\";\"))))\n      ;; load the deps file so we can goog.require cljs.core etc.\n      (node-eval repl-env\n        (str \"require('\"\n          (.getPath root-path)\n          File/separator \"node_repl_deps.js')\"))\n      ;; monkey-patch isProvided_ to avoid useless warnings - David\n      (node-eval repl-env\n        (str \"goog.isProvided_ = function(x) { return false; };\"))\n      ;; monkey-patch goog.require, skip all the loaded checks\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(set! (.-require js/goog)\n           (fn [name]\n             (js/CLOSURE_IMPORT_SCRIPT\n               (aget (.. js/goog -dependencies_ -nameToPath) name)))))\n      ;; load cljs.core, setup printing\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(do\n           (.require js/goog \"cljs.core\")\n           (set! *print-fn* (.-print (js/require \"util\")))))\n      ;; redef goog.require to track loaded libs\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(set! (.-require js/goog)\n           (fn [name reload]\n             (when (or (not (contains? *loaded-libs* name)) reload)\n               (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))\n               (js/CLOSURE_IMPORT_SCRIPT\n                 (aget (.. js/goog -dependencies_ -nameToPath) name))))))\n      )))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [72 151]},
 :full-name "cljs.repl.node/setup",
 :full-name-encode "cljs.repl.node_setup",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.node_setup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node_setup.cljsdoc)
</pre>

