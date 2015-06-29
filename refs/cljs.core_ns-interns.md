## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ns-interns

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-interns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-interns)
</td>
</tr>
</table>

 <samp>
(__ns-interns__ \[quote ns\])<br>
</samp>

---




Source docstring:

```
Returns a map of the intern mappings for the namespace.
```

Source code:

```clj
(defmacro ns-interns
  [[quote ns]]
  (core/assert (core/and (= quote 'quote) (core/symbol? ns))
    "Argument to ns-interns must be a quoted symbol")
  `(into {}
     [~@(map
          (fn [[sym _]]
            `[(symbol ~(name sym)) (var ~(symbol (name ns) (name sym)))])
          (get-in @env/*compiler* [:cljs.analyzer/namespaces ns :defs]))]))
```

 <pre>
clojurescript @ r2727
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1676-1685](https://github.com/clojure/clojurescript/blob/r2727/src/clj/cljs/core.clj#L1676-L1685)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ns-interns"]))
```

```clj
{:ns "cljs.core",
 :name "ns-interns",
 :signature ["[[quote ns]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.core_ns-interns",
 :source {:code "(defmacro ns-interns\n  [[quote ns]]\n  (core/assert (core/and (= quote 'quote) (core/symbol? ns))\n    \"Argument to ns-interns must be a quoted symbol\")\n  `(into {}\n     [~@(map\n          (fn [[sym _]]\n            `[(symbol ~(name sym)) (var ~(symbol (name ns) (name sym)))])\n          (get-in @env/*compiler* [:cljs.analyzer/namespaces ns :defs]))]))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/clj/cljs/core.clj",
          :lines [1676 1685]},
 :full-name "cljs.core/ns-interns",
 :clj-symbol "clojure.core/ns-interns",
 :docstring "Returns a map of the intern mappings for the namespace."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ns-interns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ns-interns.cljsdoc)
</pre>

