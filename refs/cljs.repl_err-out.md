## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/err-out

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__err-out__ & body)<br>
</samp>

---





Source code:

```clj
(defmacro err-out [& body]
  `(binding [*out* *err*]
     ~@body))
```

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:37-39](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl.clj#L37-L39)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/err-out"]))
```

```clj
{:ns "cljs.repl",
 :name "err-out",
 :type "macro",
 :signature ["[& body]"],
 :source {:code "(defmacro err-out [& body]\n  `(binding [*out* *err*]\n     ~@body))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl.clj",
          :lines [37 39]},
 :full-name "cljs.repl/err-out",
 :full-name-encode "cljs.repl_err-out",
 :history [["+" "0.0-3148"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_err-out.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_err-out.cljsdoc)
</pre>

