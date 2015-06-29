## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunkedNext

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IChunkedNext
  (-chunked-next [coll]))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:277-278](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L277-L278)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunkedNext"]))
```

```clj
{:ns "cljs.core",
 :name "IChunkedNext",
 :type "protocol",
 :full-name-encode "cljs.core_IChunkedNext",
 :source {:code "(defprotocol IChunkedNext\n  (-chunked-next [coll]))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [277 278]},
 :methods [{:name "-chunked-next",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunkedNext",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IChunkedNext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IChunkedNext.cljsdoc)
</pre>

