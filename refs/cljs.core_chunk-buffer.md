## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-buffer

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-buffer__ capacity)<br>
</samp>

---





Source code:

```clj
(defn chunk-buffer [capacity]
  (ChunkBuffer. (make-array capacity) 0))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2637-2638](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L2637-L2638)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-buffer"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-buffer",
 :type "function",
 :signature ["[capacity]"],
 :source {:code "(defn chunk-buffer [capacity]\n  (ChunkBuffer. (make-array capacity) 0))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2637 2638]},
 :full-name "cljs.core/chunk-buffer",
 :full-name-encode "cljs.core_chunk-buffer",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-buffer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-buffer.cljsdoc)
</pre>

