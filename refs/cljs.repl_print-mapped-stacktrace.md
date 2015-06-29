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
  ([stacktrace] (print-mapped-stacktrace stacktrace *repl-opts*))
  ([stacktrace opts]
    (doseq [{:keys [function file line column]}
            (mapped-stacktrace stacktrace opts)]
      (err-out
        (println "\t"
          (str (when function (str function " "))
            "(" file (when line (str ":" line)) (when column (str ":" column)) ")"))))))
```

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:327-337](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl.clj#L327-L337)</ins>
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
 :source {:code "(defn print-mapped-stacktrace\n  ([stacktrace] (print-mapped-stacktrace stacktrace *repl-opts*))\n  ([stacktrace opts]\n    (doseq [{:keys [function file line column]}\n            (mapped-stacktrace stacktrace opts)]\n      (err-out\n        (println \"\\t\"\n          (str (when function (str function \" \"))\n            \"(\" file (when line (str \":\" line)) (when column (str \":\" column)) \")\"))))))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/repl.clj",
          :lines [327 337]},
 :full-name "cljs.repl/print-mapped-stacktrace",
 :docstring "Given a vector representing the canonicalized JavaScript stacktrace\nprint the ClojureScript stacktrace. See mapped-stacktrace."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_print-mapped-stacktrace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_print-mapped-stacktrace.cljsdoc)
</pre>

