## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/goog-dep-string

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__goog-dep-string__ opts ijs)<br>
</samp>

---




Source docstring:

```
Given compiler options and a IJavaScript instance return the corresponding
goog.addDependency string
```

Source code:

```clj
(defn goog-dep-string
  [opts ijs]
  (closure/add-dep-string opts ijs))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:100-104](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L100-L104)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/goog-dep-string"]))
```

```clj
{:ns "cljs.build.api",
 :name "goog-dep-string",
 :signature ["[opts ijs]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_goog-dep-string",
 :source {:code "(defn goog-dep-string\n  [opts ijs]\n  (closure/add-dep-string opts ijs))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [100 104]},
 :full-name "cljs.build.api/goog-dep-string",
 :docstring "Given compiler options and a IJavaScript instance return the corresponding\ngoog.addDependency string"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_goog-dep-string.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_goog-dep-string.cljsdoc)
</pre>

