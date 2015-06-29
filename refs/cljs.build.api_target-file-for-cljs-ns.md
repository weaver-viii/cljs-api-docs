## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/target-file-for-cljs-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__target-file-for-cljs-ns__ ns-sym)<br>
</samp>
 <samp>
(__target-file-for-cljs-ns__ ns-sym output-dir)<br>
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
(defn ^File target-file-for-cljs-ns
  ([ns-sym] (target-file-for-cljs-ns ns-sym nil))
  ([ns-sym output-dir]
    (util/to-target-file
      (util/output-directory {:output-dir output-dir})
      {:ns ns-sym})))
```

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:24-35](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/build/api.clj#L24-L35)</ins>
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
{:return-type File,
 :ns "cljs.build.api",
 :name "target-file-for-cljs-ns",
 :signature ["[ns-sym]" "[ns-sym output-dir]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api_target-file-for-cljs-ns",
 :source {:code "(defn ^File target-file-for-cljs-ns\n  ([ns-sym] (target-file-for-cljs-ns ns-sym nil))\n  ([ns-sym output-dir]\n    (util/to-target-file\n      (util/output-directory {:output-dir output-dir})\n      {:ns ns-sym})))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/build/api.clj",
          :lines [24 35]},
 :full-name "cljs.build.api/target-file-for-cljs-ns",
 :docstring "Given an output directory and a clojurescript namespace return the\ncompilation target file for that namespace.\n\nFor example:\n(target-file-from-cljs-ns \"resources/out\" 'example.core) ->\n<File: \"resources/out/example/core.js\">"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_target-file-for-cljs-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_target-file-for-cljs-ns.cljsdoc)
</pre>

