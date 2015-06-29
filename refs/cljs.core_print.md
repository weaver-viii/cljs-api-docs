## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/print

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print)
</td>
</tr>
</table>





Source docstring:

```
Prints the object(s) using string-print.
print and println produce output for human consumption.
```

Source code:

```clj
(def ^{:doc
  "Prints the object(s) using string-print.
  print and println produce output for human consumption."}
  print
  (fn cljs-core-print [& objs]
    (pr-with-opts objs (assoc (pr-opts) :readably false))))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8172-8177](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L8172-L8177)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print"]))
```

```clj
{:ns "cljs.core",
 :name "print",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_print",
 :source {:code "(def ^{:doc\n  \"Prints the object(s) using string-print.\n  print and println produce output for human consumption.\"}\n  print\n  (fn cljs-core-print [& objs]\n    (pr-with-opts objs (assoc (pr-opts) :readably false))))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8172 8177]},
 :full-name "cljs.core/print",
 :clj-symbol "clojure.core/print",
 :docstring "Prints the object(s) using string-print.\nprint and println produce output for human consumption."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_print.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_print.cljsdoc)
</pre>

