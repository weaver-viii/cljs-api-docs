## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/with-pprint-dispatch

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/with-pprint-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/with-pprint-dispatch)
</td>
</tr>
</table>

 <samp>
(__with-pprint-dispatch__ function & body)<br>
</samp>

---




Source docstring:

```
Execute body with the pretty print dispatch function bound to function.
```

Source code:

```clj
(defmacro with-pprint-dispatch
  [function & body]
  `(cljs.core/binding [cljs.pprint/*print-pprint-dispatch* ~function]
     ~@body))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:147-151](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.clj#L147-L151)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/with-pprint-dispatch"]))
```

```clj
{:ns "cljs.pprint",
 :name "with-pprint-dispatch",
 :signature ["[function & body]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_with-pprint-dispatch",
 :source {:code "(defmacro with-pprint-dispatch\n  [function & body]\n  `(cljs.core/binding [cljs.pprint/*print-pprint-dispatch* ~function]\n     ~@body))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [147 151]},
 :full-name "cljs.pprint/with-pprint-dispatch",
 :clj-symbol "clojure.pprint/with-pprint-dispatch",
 :docstring "Execute body with the pretty print dispatch function bound to function."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_with-pprint-dispatch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_with-pprint-dispatch.cljsdoc)
</pre>

