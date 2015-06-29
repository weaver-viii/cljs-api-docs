## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/empty-env

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__empty-env__)<br>
</samp>

---




Source docstring:

```
Creates an empty analysis environment.
```

Source code:

```clj
(defn empty-env
  []
  (ana/empty-env))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:18-21](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer/api.clj#L18-L21)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/empty-env"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "empty-env",
 :signature ["[]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_empty-env",
 :source {:code "(defn empty-env\n  []\n  (ana/empty-env))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [18 21]},
 :full-name "cljs.analyzer.api/empty-env",
 :docstring "Creates an empty analysis environment."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_empty-env.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_empty-env.cljsdoc)
</pre>

