## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/analyze-source

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__analyze-source__ src-dir)<br>
</samp>

---




Source docstring:

```
Given a source directory, analyzes all .cljs files. Used to populate
(:cljs.analyzer/namespaces compiler-env) so as to support code reflection.
```

Source code:

```clj
(defn analyze-source
  [src-dir]
  (if-let [src-dir (and (not (empty? src-dir))
                     (File. src-dir))]
    (doseq [file (comp/cljs-files-in src-dir)]
      (ana/analyze-file (str "file://" (.getAbsolutePath file))))))
```

 <pre>
clojurescript @ r2342
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:173-180](https://github.com/clojure/clojurescript/blob/r2342/src/clj/cljs/repl.clj#L173-L180)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/analyze-source"]))
```

```clj
{:ns "cljs.repl",
 :name "analyze-source",
 :signature ["[src-dir]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl_analyze-source",
 :source {:code "(defn analyze-source\n  [src-dir]\n  (if-let [src-dir (and (not (empty? src-dir))\n                     (File. src-dir))]\n    (doseq [file (comp/cljs-files-in src-dir)]\n      (ana/analyze-file (str \"file://\" (.getAbsolutePath file))))))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/clj/cljs/repl.clj",
          :lines [173 180]},
 :full-name "cljs.repl/analyze-source",
 :docstring "Given a source directory, analyzes all .cljs files. Used to populate\n(:cljs.analyzer/namespaces compiler-env) so as to support code reflection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_analyze-source.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_analyze-source.cljsdoc)
</pre>

