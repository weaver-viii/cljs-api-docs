## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunkedSeq

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IChunkedSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IChunkedSeq.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for accessing a collection as sequential chunks.
```

Source code:

```clj
(defprotocol IChunkedSeq
  "Protocol for accessing a collection as sequential chunks."
  (-chunked-first [coll]
    "Returns the first chunk in coll.")
  (-chunked-rest [coll]
    "Return a new collection of coll with the first chunk removed."))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:595-600](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L595-L600)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunkedSeq"]))
```

```clj
{:ns "cljs.core",
 :name "IChunkedSeq",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core_IChunkedSeq",
 :source {:code "(defprotocol IChunkedSeq\n  \"Protocol for accessing a collection as sequential chunks.\"\n  (-chunked-first [coll]\n    \"Returns the first chunk in coll.\")\n  (-chunked-rest [coll]\n    \"Return a new collection of coll with the first chunk removed.\"))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [595 600]},
 :methods [{:name "-chunked-first",
            :signature ["[coll]"],
            :docstring "Returns the first chunk in coll."}
           {:name "-chunked-rest",
            :signature ["[coll]"],
            :docstring "Return a new collection of coll with the first chunk removed."}],
 :full-name "cljs.core/IChunkedSeq",
 :clj-symbol "clojure.lang/IChunkedSeq",
 :docstring "Protocol for accessing a collection as sequential chunks."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IChunkedSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IChunkedSeq.cljsdoc)
</pre>

