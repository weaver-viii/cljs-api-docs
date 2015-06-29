## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-chunk

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-chunk__ arr)<br>
</samp>
 <samp>
(__array-chunk__ arr off)<br>
</samp>
 <samp>
(__array-chunk__ arr off end)<br>
</samp>

---





Source code:

```clj
(defn array-chunk
  ([arr]
     (ArrayChunk. arr 0 (alength arr)))
  ([arr off]
     (ArrayChunk. arr off (alength arr)))
  ([arr off end]
     (ArrayChunk. arr off end)))
```

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2442-2448](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L2442-L2448)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-chunk"]))
```

```clj
{:ns "cljs.core",
 :name "array-chunk",
 :type "function",
 :signature ["[arr]" "[arr off]" "[arr off end]"],
 :source {:code "(defn array-chunk\n  ([arr]\n     (ArrayChunk. arr 0 (alength arr)))\n  ([arr off]\n     (ArrayChunk. arr off (alength arr)))\n  ([arr off end]\n     (ArrayChunk. arr off end)))",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2442 2448]},
 :full-name "cljs.core/array-chunk",
 :full-name-encode "cljs.core_array-chunk",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array-chunk.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array-chunk.cljsdoc)
</pre>

