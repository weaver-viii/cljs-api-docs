## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IParseError

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IParseError
  (-parse-error [repl-env error build-options]
    "Given the original JavaScript error return the error to actually
     use."))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:113-116](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/repl.clj#L113-L116)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IParseError"]))
```

```clj
{:ns "cljs.repl",
 :name "IParseError",
 :type "protocol",
 :full-name-encode "cljs.repl_IParseError",
 :source {:code "(defprotocol IParseError\n  (-parse-error [repl-env error build-options]\n    \"Given the original JavaScript error return the error to actually\n     use.\"))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/repl.clj",
          :lines [113 116]},
 :methods [{:name "-parse-error",
            :signature ["[repl-env error build-options]"],
            :docstring "Given the original JavaScript error return the error to actually\n     use."}],
 :full-name "cljs.repl/IParseError",
 :history [["+" "0.0-3030"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IParseError.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IParseError.cljsdoc)
</pre>

