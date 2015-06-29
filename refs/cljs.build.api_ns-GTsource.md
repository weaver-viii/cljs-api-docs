## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/ns->source

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ns->source__ ns)<br>
</samp>

---




Source docstring:

```
Given a namespace as a symbol return the corresponding resource if it exists.
```

Source code:

```clj
(defn ns->source
  [ns]
  (util/ns->source ns))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:112-115](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/build/api.clj#L112-L115)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/ns->source"]))
```

```clj
{:ns "cljs.build.api",
 :name "ns->source",
 :signature ["[ns]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_ns-GTsource",
 :source {:code "(defn ns->source\n  [ns]\n  (util/ns->source ns))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [112 115]},
 :full-name "cljs.build.api/ns->source",
 :docstring "Given a namespace as a symbol return the corresponding resource if it exists."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_ns-GTsource.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_ns-GTsource.cljsdoc)
</pre>

