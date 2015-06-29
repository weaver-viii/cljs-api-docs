## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/init-engine

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__init-engine__ engine output-dir debug)<br>
</samp>

---





Source code:

```clj
(defn init-engine [engine output-dir debug]
  (eval-resource engine "goog/base.js" debug)
  (eval-resource engine "goog/deps.js" debug)
  (eval-str engine "var global = this") ; required by React
  (eval-str engine
    (format
      (str "var nashorn_load = function(path) {"
           "  var outputPath = \"%s\" + \"/\" + path;"
           (when debug "  print(\"loading: \" + outputPath) ; ")
           "  load(outputPath);"
           "};")
      output-dir))
  (eval-str engine
    (str "goog.global.CLOSURE_IMPORT_SCRIPT = function(path) {"
         " nashorn_load(\"goog/\" + path);"
         " return true;"
         "};"))
  (eval-str engine "goog.global.isProvided_ = function(name) { return false; };")
  engine)
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:93-111](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/repl/nashorn.clj#L93-L111)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/init-engine"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "init-engine",
 :type "function",
 :signature ["[engine output-dir debug]"],
 :source {:code "(defn init-engine [engine output-dir debug]\n  (eval-resource engine \"goog/base.js\" debug)\n  (eval-resource engine \"goog/deps.js\" debug)\n  (eval-str engine \"var global = this\") ; required by React\n  (eval-str engine\n    (format\n      (str \"var nashorn_load = function(path) {\"\n           \"  var outputPath = \\\"%s\\\" + \\\"/\\\" + path;\"\n           (when debug \"  print(\\\"loading: \\\" + outputPath) ; \")\n           \"  load(outputPath);\"\n           \"};\")\n      output-dir))\n  (eval-str engine\n    (str \"goog.global.CLOSURE_IMPORT_SCRIPT = function(path) {\"\n         \" nashorn_load(\\\"goog/\\\" + path);\"\n         \" return true;\"\n         \"};\"))\n  (eval-str engine \"goog.global.isProvided_ = function(name) { return false; };\")\n  engine)",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [93 111]},
 :full-name "cljs.repl.nashorn/init-engine",
 :full-name-encode "cljs.repl.nashorn_init-engine",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_init-engine.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_init-engine.cljsdoc)
</pre>

