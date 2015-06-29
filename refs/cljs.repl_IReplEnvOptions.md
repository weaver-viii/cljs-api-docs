## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/IReplEnvOptions

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IReplEnvOptions
  (-repl-options [repl-env] "Return default REPL options for a REPL Env"))
```

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:95-96](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl.clj#L95-L96)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IReplEnvOptions"]))
```

```clj
{:ns "cljs.repl",
 :name "IReplEnvOptions",
 :type "protocol",
 :full-name-encode "cljs.repl_IReplEnvOptions",
 :source {:code "(defprotocol IReplEnvOptions\n  (-repl-options [repl-env] \"Return default REPL options for a REPL Env\"))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/repl.clj",
          :lines [95 96]},
 :methods [{:name "-repl-options",
            :signature ["[repl-env]"],
            :docstring "Return default REPL options for a REPL Env"}],
 :full-name "cljs.repl/IReplEnvOptions",
 :history [["+" "0.0-2719"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_IReplEnvOptions.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_IReplEnvOptions.cljsdoc)
</pre>

