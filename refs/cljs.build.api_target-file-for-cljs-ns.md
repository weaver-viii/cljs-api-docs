## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/target-file-for-cljs-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__target-file-for-cljs-ns__ output-dir ns-sym)<br>
</samp>

---




Source docstring:

```
Given an output directory and a clojurescript namespace return the
compilation target file for that namespace.

For example:
(target-file-from-cljs-ns "resources/out" 'example.core) ->
<File: "resources/out/example/core.js">
```

Source code:

```clj
(defn target-file-for-cljs-ns
  [output-dir ns-sym]
  (util/to-target-file (cljs.closure/output-directory { :output-dir output-dir })
                       {:ns ns-sym }))
```

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:20-29](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/build/api.clj#L20-L29)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/target-file-for-cljs-ns"]))
```

```clj
{:ns "cljs.build.api",
 :name "target-file-for-cljs-ns",
 :signature ["[output-dir ns-sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api_target-file-for-cljs-ns",
 :source {:code "(defn target-file-for-cljs-ns\n  [output-dir ns-sym]\n  (util/to-target-file (cljs.closure/output-directory { :output-dir output-dir })\n                       {:ns ns-sym }))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/build/api.clj",
          :lines [20 29]},
 :full-name "cljs.build.api/target-file-for-cljs-ns",
 :docstring "Given an output directory and a clojurescript namespace return the\ncompilation target file for that namespace.\n\nFor example:\n(target-file-from-cljs-ns \"resources/out\" 'example.core) ->\n<File: \"resources/out/example/core.js\">"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_target-file-for-cljs-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_target-file-for-cljs-ns.cljsdoc)
</pre>

