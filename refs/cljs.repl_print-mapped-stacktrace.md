## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/print-mapped-stacktrace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__print-mapped-stacktrace__ stacktrace)<br>
</samp>
 <samp>
(__print-mapped-stacktrace__ stacktrace opts)<br>
</samp>

---




Source docstring:

```
Given a vector representing the canonicalized JavaScript stacktrace
print the ClojureScript stacktrace. See mapped-stacktrace.
```

Source code:

```clj
(defn print-mapped-stacktrace
  ([stacktrace] (print-mapped-stacktrace stacktrace nil))
  ([stacktrace opts]
    (doseq [{:keys [function file line column]}
            (mapped-stacktrace stacktrace opts)]
      (println "\t" (str function " (" file ":" line ":" column ")")))))
```

 <pre>
clojurescript @ r2843
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:261-268](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/repl.clj#L261-L268)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/print-mapped-stacktrace"]))
```

```clj
{:ns "cljs.repl",
 :name "print-mapped-stacktrace",
 :signature ["[stacktrace]" "[stacktrace opts]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl_print-mapped-stacktrace",
 :source {:code "(defn print-mapped-stacktrace\n  ([stacktrace] (print-mapped-stacktrace stacktrace nil))\n  ([stacktrace opts]\n    (doseq [{:keys [function file line column]}\n            (mapped-stacktrace stacktrace opts)]\n      (println \"\\t\" (str function \" (\" file \":\" line \":\" column \")\")))))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/clj/cljs/repl.clj",
          :lines [261 268]},
 :full-name "cljs.repl/print-mapped-stacktrace",
 :docstring "Given a vector representing the canonicalized JavaScript stacktrace\nprint the ClojureScript stacktrace. See mapped-stacktrace."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_print-mapped-stacktrace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_print-mapped-stacktrace.cljsdoc)
</pre>

