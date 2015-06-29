## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/ns-interns

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-interns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-interns)
</td>
</tr>
</table>

 <samp>
(__ns-interns__ ns)<br>
</samp>

---




Source docstring:

```
Given a namespace return all the var analysis maps. Analagous to
clojure.core/ns-interns but returns var analysis maps not vars.
```

Source code:

```clj
(defn ns-interns
  [ns]
  {:pre [(symbol? ns)]}
  (get-in @env/*compiler* [::ana/namespaces ns :defs]))
```

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:37-42](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/analyzer/api.clj#L37-L42)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-interns"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "ns-interns",
 :signature ["[ns]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_ns-interns",
 :source {:code "(defn ns-interns\n  [ns]\n  {:pre [(symbol? ns)]}\n  (get-in @env/*compiler* [::ana/namespaces ns :defs]))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [37 42]},
 :full-name "cljs.analyzer.api/ns-interns",
 :clj-symbol "clojure.core/ns-interns",
 :docstring "Given a namespace return all the var analysis maps. Analagous to\nclojure.core/ns-interns but returns var analysis maps not vars."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_ns-interns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_ns-interns.cljsdoc)
</pre>

