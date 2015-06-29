## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/mark-cljs-ns-for-recompile!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mark-cljs-ns-for-recompile!__ output-dir ns-sym)<br>
</samp>

---




Source docstring:

```
Backdates a cljs target file so that it the cljs compiler will recompile it.
```

Source code:

```clj
(defn mark-cljs-ns-for-recompile!
  [output-dir ns-sym]
  (let [s (target-file-for-cljs-ns output-dir ns-sym)]
    (when (.exists s)
      (.setLastModified s 5000))))
```

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:31-36](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/build/api.clj#L31-L36)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/mark-cljs-ns-for-recompile!"]))
```

```clj
{:ns "cljs.build.api",
 :name "mark-cljs-ns-for-recompile!",
 :signature ["[output-dir ns-sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api_mark-cljs-ns-for-recompileBANG",
 :source {:code "(defn mark-cljs-ns-for-recompile!\n  [output-dir ns-sym]\n  (let [s (target-file-for-cljs-ns output-dir ns-sym)]\n    (when (.exists s)\n      (.setLastModified s 5000))))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/clj/cljs/build/api.clj",
          :lines [31 36]},
 :full-name "cljs.build.api/mark-cljs-ns-for-recompile!",
 :docstring "Backdates a cljs target file so that it the cljs compiler will recompile it."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_mark-cljs-ns-for-recompileBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_mark-cljs-ns-for-recompileBANG.cljsdoc)
</pre>

