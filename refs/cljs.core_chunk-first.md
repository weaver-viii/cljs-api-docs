## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-first

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-first__ s)<br>
</samp>

---





Source code:

```clj
(defn chunk-first [s]
  (-chunked-first s))
```

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1966-1967](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L1966-L1967)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-first"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-first",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-first [s]\n  (-chunked-first s))",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1966 1967]},
 :full-name "cljs.core/chunk-first",
 :full-name-encode "cljs.core_chunk-first",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-first.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-first.cljsdoc)
</pre>

