## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.reflect/macroexpand

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macroexpand__ form)<br>
</samp>

---





Source code:

```clj
(defn macroexpand [form]
  "Fully expands a cljs macro form."
  (let [mform (analyzer/macroexpand-1 {} form)]
    (if (identical? form mform)
      mform
      (macroexpand mform))))
```

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:32-37](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/repl/reflect.clj#L32-L37)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/macroexpand"]))
```

```clj
{:ns "cljs.repl.reflect",
 :name "macroexpand",
 :type "function",
 :signature ["[form]"],
 :source {:code "(defn macroexpand [form]\n  \"Fully expands a cljs macro form.\"\n  (let [mform (analyzer/macroexpand-1 {} form)]\n    (if (identical? form mform)\n      mform\n      (macroexpand mform))))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [32 37]},
 :full-name "cljs.repl.reflect/macroexpand",
 :full-name-encode "cljs.repl.reflect_macroexpand",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.reflect_macroexpand.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect_macroexpand.cljsdoc)
</pre>

