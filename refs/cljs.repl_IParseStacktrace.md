## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IParseStacktrace

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2843"><img valign="middle" alt="[+] 0.0-2843" src="https://img.shields.io/badge/+-0.0--2843-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IParseStacktrace
  (-parse-stacktrace [repl-env stacktrace error build-options]
    "Given the original JavaScript stacktrace string, the entire original error
     value and current compiler build options, parse the stacktrace into the
     canonical form:

     [{:file <string>
       :function <string>
       :line <integer>
       :column <integer>}*]

     :file must be a URL path (without protocol) relative to :output-dir. If
     no source file can be supplied (such as REPL defs), :file may be a custom
     identifier string surrounded by angle brackets, i.e. \"<cljs repl>\"."))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:134-147](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl.clj#L134-L147)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IParseStacktrace"]))
```

```clj
{:ns "cljs.repl",
 :name "IParseStacktrace",
 :type "protocol",
 :full-name-encode "cljs.repl_IParseStacktrace",
 :source {:code "(defprotocol IParseStacktrace\n  (-parse-stacktrace [repl-env stacktrace error build-options]\n    \"Given the original JavaScript stacktrace string, the entire original error\n     value and current compiler build options, parse the stacktrace into the\n     canonical form:\n\n     [{:file <string>\n       :function <string>\n       :line <integer>\n       :column <integer>}*]\n\n     :file must be a URL path (without protocol) relative to :output-dir. If\n     no source file can be supplied (such as REPL defs), :file may be a custom\n     identifier string surrounded by angle brackets, i.e. \\\"<cljs repl>\\\".\"))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl.clj",
          :lines [134 147]},
 :methods [{:name "-parse-stacktrace",
            :signature ["[repl-env stacktrace error build-options]"],
            :docstring "Given the original JavaScript stacktrace string, the entire original error\n     value and current compiler build options, parse the stacktrace into the\n     canonical form:\n\n     [{:file <string>\n       :function <string>\n       :line <integer>\n       :column <integer>}*]\n\n     :file must be a URL path (without protocol) relative to :output-dir. If\n     no source file can be supplied (such as REPL defs), :file may be a custom\n     identifier string surrounded by angle brackets, i.e. \"<cljs repl>\"."}],
 :full-name "cljs.repl/IParseStacktrace",
 :history [["+" "0.0-2843"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IParseStacktrace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IParseStacktrace.cljsdoc)
</pre>

