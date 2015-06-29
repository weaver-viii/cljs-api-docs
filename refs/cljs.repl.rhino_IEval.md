## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/IEval

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEval
  (-eval [this env filename line]))
```

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:25-26](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/repl/rhino.clj#L25-L26)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/IEval"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "IEval",
 :type "protocol",
 :full-name-encode "cljs.repl.rhino_IEval",
 :source {:code "(defprotocol IEval\n  (-eval [this env filename line]))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [25 26]},
 :methods [{:name "-eval",
            :signature ["[this env filename line]"],
            :docstring nil}],
 :full-name "cljs.repl.rhino/IEval",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_IEval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_IEval.cljsdoc)
</pre>

