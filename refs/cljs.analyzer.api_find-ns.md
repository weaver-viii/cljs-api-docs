## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/find-ns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/find-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find-ns)
</td>
</tr>
</table>

 <samp>
(__find-ns__ sym)<br>
</samp>

---




Source docstring:

```
Given a namespace return the corresponding namespace analysis map. Analagous
to clojure.core/find-ns.
```

Source code:

```clj
(defn find-ns
  [sym]
  {:pre [(symbol? sym)]}
  (get-in @env/*compiler* [::ana/namespaces sym]))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:93-98](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/analyzer/api.clj#L93-L98)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/find-ns"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "find-ns",
 :signature ["[sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_find-ns",
 :source {:code "(defn find-ns\n  [sym]\n  {:pre [(symbol? sym)]}\n  (get-in @env/*compiler* [::ana/namespaces sym]))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [93 98]},
 :full-name "cljs.analyzer.api/find-ns",
 :clj-symbol "clojure.core/find-ns",
 :docstring "Given a namespace return the corresponding namespace analysis map. Analagous\nto clojure.core/find-ns."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_find-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_find-ns.cljsdoc)
</pre>

