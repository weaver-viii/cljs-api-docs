## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkBuffer

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ChunkBuffer</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ChunkBuffer.java)
</td>
</tr>
</table>

 <samp>
(__ChunkBuffer.__ buf end)<br>
</samp>

---





Source code:

```clj
(deftype ChunkBuffer [^:mutable buf ^:mutable end]
  Object
  (add [_ o]
    (aset buf end o)
    (set! end (inc end)))

  (chunk [_ o]
    (let [ret (ArrayChunk. buf 0 end)]
      (set! buf nil)
      ret))

  ICounted
  (-count [_] end))
```

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2217-2229](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L2217-L2229)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ChunkBuffer"]))
```

```clj
{:ns "cljs.core",
 :name "ChunkBuffer",
 :signature ["[buf end]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_ChunkBuffer",
 :source {:code "(deftype ChunkBuffer [^:mutable buf ^:mutable end]\n  Object\n  (add [_ o]\n    (aset buf end o)\n    (set! end (inc end)))\n\n  (chunk [_ o]\n    (let [ret (ArrayChunk. buf 0 end)]\n      (set! buf nil)\n      ret))\n\n  ICounted\n  (-count [_] end))",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2217 2229]},
 :full-name "cljs.core/ChunkBuffer",
 :clj-symbol "clojure.lang/ChunkBuffer"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ChunkBuffer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ChunkBuffer.cljsdoc)
</pre>

