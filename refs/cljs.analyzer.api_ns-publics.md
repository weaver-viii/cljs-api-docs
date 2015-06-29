## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/ns-publics

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-publics</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-publics)
</td>
</tr>
</table>

 <samp>
(__ns-publics__ ns)<br>
</samp>

---




Source docstring:

```
Given a namespace return all the public var analysis maps. Analagous to
clojure.core/ns-publics but returns var analysis maps not vars.
```

Source code:

```clj
(defn ns-publics
  [ns]
  {:pre [(symbol? ns)]}
  (->> (merge
         (get-in @env/*compiler* [::ana/namespaces ns :macros])
         (get-in @env/*compiler* [::ana/namespaces ns :defs]))
       (remove (fn [[k v]] (:private v)))
       (into {})))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:102-111](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/analyzer/api.clj#L102-L111)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-publics"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "ns-publics",
 :signature ["[ns]"],
 :history [["+" "0.0-2985"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_ns-publics",
 :source {:code "(defn ns-publics\n  [ns]\n  {:pre [(symbol? ns)]}\n  (->> (merge\n         (get-in @env/*compiler* [::ana/namespaces ns :macros])\n         (get-in @env/*compiler* [::ana/namespaces ns :defs]))\n       (remove (fn [[k v]] (:private v)))\n       (into {})))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [102 111]},
 :full-name "cljs.analyzer.api/ns-publics",
 :clj-symbol "clojure.core/ns-publics",
 :docstring "Given a namespace return all the public var analysis maps. Analagous to\nclojure.core/ns-publics but returns var analysis maps not vars."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_ns-publics.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_ns-publics.cljsdoc)
</pre>

