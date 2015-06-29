## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/add-dependencies

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__add-dependencies__ opts & ijss)<br>
</samp>

---




Source docstring:

```
Given one or more IJavaScript objects in dependency order, produce
a new sequence of IJavaScript objects which includes the input list
plus all dependencies in dependency order.
```

Source code:

```clj
(defn add-dependencies
  [opts & ijss]
  (closure/add-dependencies opts ijss))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:126-131](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L126-L131)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/add-dependencies"]))
```

```clj
{:ns "cljs.build.api",
 :name "add-dependencies",
 :signature ["[opts & ijss]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_add-dependencies",
 :source {:code "(defn add-dependencies\n  [opts & ijss]\n  (closure/add-dependencies opts ijss))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [126 131]},
 :full-name "cljs.build.api/add-dependencies",
 :docstring "Given one or more IJavaScript objects in dependency order, produce\na new sequence of IJavaScript objects which includes the input list\nplus all dependencies in dependency order."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_add-dependencies.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_add-dependencies.cljsdoc)
</pre>

