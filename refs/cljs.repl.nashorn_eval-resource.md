## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.nashorn/eval-resource

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__eval-resource__ engine path debug)<br>
</samp>

---




Source docstring:

```
Evaluate a file on the classpath in the engine.
```

Source code:

```clj
(defn eval-resource 
  [engine path debug]
  (let [r (io/resource path)]
    (eval-str engine (slurp r))
    (when debug (println "loaded: " path))))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:60-65](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/repl/nashorn.clj#L60-L65)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/eval-resource"]))
```

```clj
{:ns "cljs.repl.nashorn",
 :name "eval-resource",
 :signature ["[engine path debug]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.nashorn_eval-resource",
 :source {:code "(defn eval-resource \n  [engine path debug]\n  (let [r (io/resource path)]\n    (eval-str engine (slurp r))\n    (when debug (println \"loaded: \" path))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [60 65]},
 :full-name "cljs.repl.nashorn/eval-resource",
 :docstring "Evaluate a file on the classpath in the engine."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.nashorn_eval-resource.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn_eval-resource.cljsdoc)
</pre>

