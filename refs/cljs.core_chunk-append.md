## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-append

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-append__ b x)<br>
</samp>

---





Source code:

```clj
(defn chunk-append [b x]
  (.add b x))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3032-3033](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L3032-L3033)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-append"]))
```

```clj
{:ns "cljs.core",
 :name "chunk-append",
 :type "function",
 :signature ["[b x]"],
 :source {:code "(defn chunk-append [b x]\n  (.add b x))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3032 3033]},
 :full-name "cljs.core/chunk-append",
 :full-name-encode "cljs.core_chunk-append",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunk-append.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunk-append.cljsdoc)
</pre>

