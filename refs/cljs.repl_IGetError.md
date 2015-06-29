## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IGetError

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IGetError
  (-get-error [repl-env name env build-options]
    "Given a symbol representing a var holding an error, an analysis
     environment, and the REPL/compiler options return the canonical error
     representation:

     {:value <string>
      :stacktrace <string>}

    :value should be the host environment JavaScript error message string.
    :stacktrace should be the host JavaScript environment stacktrace string."))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:122-132](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/repl.cljc#L122-L132)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IGetError"]))
```

```clj
{:ns "cljs.repl",
 :name "IGetError",
 :type "protocol",
 :full-name-encode "cljs.repl_IGetError",
 :source {:code "(defprotocol IGetError\n  (-get-error [repl-env name env build-options]\n    \"Given a symbol representing a var holding an error, an analysis\n     environment, and the REPL/compiler options return the canonical error\n     representation:\n\n     {:value <string>\n      :stacktrace <string>}\n\n    :value should be the host environment JavaScript error message string.\n    :stacktrace should be the host JavaScript environment stacktrace string.\"))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [122 132]},
 :methods [{:name "-get-error",
            :signature ["[repl-env name env build-options]"],
            :docstring "Given a symbol representing a var holding an error, an analysis\n     environment, and the REPL/compiler options return the canonical error\n     representation:\n\n     {:value <string>\n      :stacktrace <string>}\n\n    :value should be the host environment JavaScript error message string.\n    :stacktrace should be the host JavaScript environment stacktrace string."}],
 :full-name "cljs.repl/IGetError",
 :history [["+" "0.0-2985"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IGetError.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IGetError.cljsdoc)
</pre>

