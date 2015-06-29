## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/remove-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-ns)
</td>
</tr>
</table>

 <samp>
(__remove-ns__ ns)<br>
</samp>

---




Source docstring:

```
Removes the namespace named by the symbol.
```

Source code:

```clj
(defn remove-ns
  [ns]
  {:pre [(symbol? ns)]}
  (swap! env/*compiler* update-in [::ana/namespaces] dissoc ns))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:127-131](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/analyzer/api.clj#L127-L131)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/remove-ns"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "remove-ns",
 :signature ["[ns]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_remove-ns",
 :source {:code "(defn remove-ns\n  [ns]\n  {:pre [(symbol? ns)]}\n  (swap! env/*compiler* update-in [::ana/namespaces] dissoc ns))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [127 131]},
 :full-name "cljs.analyzer.api/remove-ns",
 :clj-symbol "clojure.core/remove-ns",
 :docstring "Removes the namespace named by the symbol."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_remove-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_remove-ns.cljsdoc)
</pre>

