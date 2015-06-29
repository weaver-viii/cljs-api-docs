## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/cljs-dependents-for-macro-namespaces

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__cljs-dependents-for-macro-namespaces__ namespaces)<br>
</samp>

---




Source docstring:

```
Takes a list of Clojure (.clj) namespaces that define macros and
returns a list ClojureScript (.cljs) namespaces that depend on those macro
namespaces.

For example where example.macros is defined in the clojure file
"example/macros.clj" and both 'example.core and 'example.util are
ClojureScript namespaces that require and use the macros from
'example.macros :
(cljs-dependents-for-macro-namespaces 'example.macros) ->
('example.core 'example.util)

This must be called when cljs.env/*compiler* is bound to the
compile env that you are inspecting. See cljs.env/with-compile-env.
```

Source code:

```clj
(defn cljs-dependents-for-macro-namespaces
  [namespaces]
  (map :name
       (let [namespaces-set (set namespaces)]
         (filter (fn [x] (not-empty
                         (intersection namespaces-set (-> x :require-macros vals set))))
                 (vals (:cljs.analyzer/namespaces @env/*compiler*))))))
```

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:45-64](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/build/api.clj#L45-L64)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/cljs-dependents-for-macro-namespaces"]))
```

```clj
{:ns "cljs.build.api",
 :name "cljs-dependents-for-macro-namespaces",
 :signature ["[namespaces]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api_cljs-dependents-for-macro-namespaces",
 :source {:code "(defn cljs-dependents-for-macro-namespaces\n  [namespaces]\n  (map :name\n       (let [namespaces-set (set namespaces)]\n         (filter (fn [x] (not-empty\n                         (intersection namespaces-set (-> x :require-macros vals set))))\n                 (vals (:cljs.analyzer/namespaces @env/*compiler*))))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/build/api.clj",
          :lines [45 64]},
 :full-name "cljs.build.api/cljs-dependents-for-macro-namespaces",
 :docstring "Takes a list of Clojure (.clj) namespaces that define macros and\nreturns a list ClojureScript (.cljs) namespaces that depend on those macro\nnamespaces.\n\nFor example where example.macros is defined in the clojure file\n\"example/macros.clj\" and both 'example.core and 'example.util are\nClojureScript namespaces that require and use the macros from\n'example.macros :\n(cljs-dependents-for-macro-namespaces 'example.macros) ->\n('example.core 'example.util)\n\nThis must be called when cljs.env/*compiler* is bound to the\ncompile env that you are inspecting. See cljs.env/with-compile-env."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_cljs-dependents-for-macro-namespaces.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_cljs-dependents-for-macro-namespaces.cljsdoc)
</pre>

