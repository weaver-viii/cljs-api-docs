## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string-hash-cache

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def string-hash-cache (js-obj))
```

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:723](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L723)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string-hash-cache"]))
```

```clj
{:ns "cljs.core",
 :name "string-hash-cache",
 :type "var",
 :source {:code "(def string-hash-cache (js-obj))",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [723]},
 :full-name "cljs.core/string-hash-cache",
 :full-name-encode "cljs.core_string-hash-cache",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_string-hash-cache.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_string-hash-cache.cljsdoc)
</pre>

