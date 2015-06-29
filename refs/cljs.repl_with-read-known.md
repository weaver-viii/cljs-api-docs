## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/with-read-known

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__with-read-known__ & body)<br>
</samp>

---




Source docstring:

```
Evaluates body with *read-eval* set to a "known" value,
i.e. substituting true for :unknown if necessary.
```

Source code:

```clj
(defmacro with-read-known
  [& body]
  `(binding [*read-eval* (if (= :unknown *read-eval*) true *read-eval*)]
     ~@body))
```

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:80-85](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/repl.clj#L80-L85)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/with-read-known"]))
```

```clj
{:ns "cljs.repl",
 :name "with-read-known",
 :signature ["[& body]"],
 :history [["+" "0.0-2719"]],
 :type "macro",
 :full-name-encode "cljs.repl_with-read-known",
 :source {:code "(defmacro with-read-known\n  [& body]\n  `(binding [*read-eval* (if (= :unknown *read-eval*) true *read-eval*)]\n     ~@body))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/repl.clj",
          :lines [80 85]},
 :full-name "cljs.repl/with-read-known",
 :docstring "Evaluates body with *read-eval* set to a \"known\" value,\ni.e. substituting true for :unknown if necessary."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_with-read-known.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_with-read-known.cljsdoc)
</pre>

