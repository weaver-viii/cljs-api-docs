## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.repl/IParseErrorMessage~~

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[×] 0.0-3030" src="https://img.shields.io/badge/×-0.0--3030-red.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IParseErrorMessage
  (-parse-error-message [repl-env message error build-options]
    "Given the original JavaScript error message return the string to actually
     use."))
```

 <pre>
clojurescript @ r2985
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:112-115](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/repl.clj#L112-L115)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IParseErrorMessage"]))
```

```clj
{:ns "cljs.repl",
 :name "IParseErrorMessage",
 :history [["+" "0.0-2985"] ["-" "0.0-3030"]],
 :type "protocol",
 :full-name-encode "cljs.repl_IParseErrorMessage",
 :source {:code "(defprotocol IParseErrorMessage\n  (-parse-error-message [repl-env message error build-options]\n    \"Given the original JavaScript error message return the string to actually\n     use.\"))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/clj/cljs/repl.clj",
          :lines [112 115]},
 :methods [{:name "-parse-error-message",
            :signature ["[repl-env message error build-options]"],
            :docstring "Given the original JavaScript error message return the string to actually\n     use."}],
 :full-name "cljs.repl/IParseErrorMessage",
 :removed {:in "0.0-3030", :last-seen "0.0-2985"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IParseErrorMessage.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IParseErrorMessage.cljsdoc)
</pre>

