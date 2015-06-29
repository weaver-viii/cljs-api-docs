## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-cons

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-cons__ chunk rest)<br>
</samp>

---





Source code:

```clj
(defn chunk-cons [chunk rest]
  (if (zero? (-count chunk))
    rest
    (ChunkedCons. chunk rest nil nil)))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1928-1931](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L1928-L1931)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-cons"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-cons",
 :type "function",
 :signature ["[chunk rest]"],
 :source {:code "(defn chunk-cons [chunk rest]\n  (if (zero? (-count chunk))\n    rest\n    (ChunkedCons. chunk rest nil nil)))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1928 1931]},
 :full-name "cljs.core/chunk-cons",
 :full-name-encode "cljs.core_chunk-cons",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-cons.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-cons.cljsdoc)
</pre>

