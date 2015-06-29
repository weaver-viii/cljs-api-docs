## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/ns-specs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ns-specs__ ns)<br>
</samp>

---




Source docstring:

```
Given a namespace return all the original specs for a namspace as originally
provided in the source.
```

Source code:

```clj
(defn ns-specs
  [ns]
  {:pre [(symbol? ns)]}
  (get-in @env/*compiler* [::ana/namespaces ns :specs]))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:48-53](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/analyzer/api.clj#L48-L53)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-specs"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "ns-specs",
 :signature ["[ns]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_ns-specs",
 :source {:code "(defn ns-specs\n  [ns]\n  {:pre [(symbol? ns)]}\n  (get-in @env/*compiler* [::ana/namespaces ns :specs]))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [48 53]},
 :full-name "cljs.analyzer.api/ns-specs",
 :docstring "Given a namespace return all the original specs for a namspace as originally\nprovided in the source."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_ns-specs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_ns-specs.cljsdoc)
</pre>

