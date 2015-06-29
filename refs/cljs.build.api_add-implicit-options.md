## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/add-implicit-options

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__add-implicit-options__ opts)<br>
</samp>

---




Source docstring:

```
Given a valid map of build options add any standard implicit options. For
example :optimizations :none implies :cache-analysis true and :source-map
true.
```

Source code:

```clj
(defn add-implicit-options
  [opts]
  (closure/add-implicit-options opts))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:133-138](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/build/api.clj#L133-L138)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/add-implicit-options"]))
```

```clj
{:ns "cljs.build.api",
 :name "add-implicit-options",
 :signature ["[opts]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_add-implicit-options",
 :source {:code "(defn add-implicit-options\n  [opts]\n  (closure/add-implicit-options opts))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [133 138]},
 :full-name "cljs.build.api/add-implicit-options",
 :docstring "Given a valid map of build options add any standard implicit options. For\nexample :optimizations :none implies :cache-analysis true and :source-map\ntrue."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_add-implicit-options.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_add-implicit-options.cljsdoc)
</pre>

