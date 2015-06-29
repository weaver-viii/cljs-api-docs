## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/inputs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__inputs__ & xs)<br>
</samp>

---




Source docstring:

```
Given a list of directories and files, return a compilable object that may
be passed to build or watch.
```

Source code:

```clj
(defn inputs
  [& xs]
  (reify
    closure/Inputs
    (-paths [_]
      (map io/file xs))
    closure/Compilable
    (-compile [_ opts]
      (letfn [(compile-input [x]
                (let [compiled (closure/-compile x opts)]
                  (if (sequential? compiled)
                    compiled
                    [compiled])))]
        (mapcat compile-input xs)))))
```

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:99-114](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/build/api.clj#L99-L114)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/inputs"]))
```

```clj
{:ns "cljs.build.api",
 :name "inputs",
 :signature ["[& xs]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.build.api_inputs",
 :source {:code "(defn inputs\n  [& xs]\n  (reify\n    closure/Inputs\n    (-paths [_]\n      (map io/file xs))\n    closure/Compilable\n    (-compile [_ opts]\n      (letfn [(compile-input [x]\n                (let [compiled (closure/-compile x opts)]\n                  (if (sequential? compiled)\n                    compiled\n                    [compiled])))]\n        (mapcat compile-input xs)))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/build/api.clj",
          :lines [99 114]},
 :full-name "cljs.build.api/inputs",
 :docstring "Given a list of directories and files, return a compilable object that may\nbe passed to build or watch."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_inputs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_inputs.cljsdoc)
</pre>

