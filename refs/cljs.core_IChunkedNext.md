## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunkedNext

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for accessing the chunks of a collection.
```

Source code:

```clj
(defprotocol IChunkedNext
  "Protocol for accessing the chunks of a collection."
  (-chunked-next [coll]
    "Returns a new collection of coll without the first chunk."))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:602-605](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L602-L605)</ins>
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
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core_IChunkedNext",
 :source {:code "(defprotocol IChunkedNext\n  \"Protocol for accessing the chunks of a collection.\"\n  (-chunked-next [coll]\n    \"Returns a new collection of coll without the first chunk.\"))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [602 605]},
 :methods [{:name "-chunked-next",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first chunk."}],
 :full-name "cljs.core/IChunkedNext",
 :docstring "Protocol for accessing the chunks of a collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IChunkedNext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IChunkedNext.cljsdoc)
</pre>

