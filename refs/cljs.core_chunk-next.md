## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-next

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-next__ s)<br>
</samp>

---





Source code:

```clj
(defn chunk-next [s]
  (if (satisfies? IChunkedNext s)
    (-chunked-next s)
    (seq (-chunked-rest s))))
```

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1972-1975](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1972-L1975)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-next"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-next",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-next [s]\n  (if (satisfies? IChunkedNext s)\n    (-chunked-next s)\n    (seq (-chunked-rest s))))",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1972 1975]},
 :full-name "cljs.core/chunk-next",
 :full-name-encode "cljs.core_chunk-next",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-next.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-next.cljsdoc)
</pre>

