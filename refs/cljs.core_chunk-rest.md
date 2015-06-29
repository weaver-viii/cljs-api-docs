## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-rest

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-rest__ s)<br>
</samp>

---





Source code:

```clj
(defn chunk-rest [s]
  (-chunked-rest s))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2690-2691](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L2690-L2691)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-rest"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-rest",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-rest [s]\n  (-chunked-rest s))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2690 2691]},
 :full-name "cljs.core/chunk-rest",
 :full-name-encode "cljs.core_chunk-rest",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-rest.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-rest.cljsdoc)
</pre>

