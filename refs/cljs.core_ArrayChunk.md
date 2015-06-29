## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayChunk

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ArrayChunk</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArrayChunk.java)
</td>
</tr>
</table>

 <samp>
(__ArrayChunk.__ arr off end)<br>
</samp>

---





Source code:

```clj
(deftype ArrayChunk [arr off end]
  ICounted
  (-count [_] (- end off))

  IIndexed
  (-nth [coll i]
    (aget arr (+ off i)))
  (-nth [coll i not-found]
    (if (and (>= i 0) (< i (- end off)))
      (aget arr (+ off i))
      not-found))

  IChunk
  (-drop-first [coll]
    (if (== off end)
      (throw (js/Error. "-drop-first of empty chunk"))
      (ArrayChunk. arr (inc off) end)))

  IReduce
  (-reduce [coll f]
    (array-reduce arr f (aget arr off) (inc off)))
  (-reduce [coll f start]
    (array-reduce arr f start off)))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2636-2658](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L2636-L2658)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayChunk"]))
```

```clj
{:ns "cljs.core",
 :name "ArrayChunk",
 :signature ["[arr off end]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_ArrayChunk",
 :source {:code "(deftype ArrayChunk [arr off end]\n  ICounted\n  (-count [_] (- end off))\n\n  IIndexed\n  (-nth [coll i]\n    (aget arr (+ off i)))\n  (-nth [coll i not-found]\n    (if (and (>= i 0) (< i (- end off)))\n      (aget arr (+ off i))\n      not-found))\n\n  IChunk\n  (-drop-first [coll]\n    (if (== off end)\n      (throw (js/Error. \"-drop-first of empty chunk\"))\n      (ArrayChunk. arr (inc off) end)))\n\n  IReduce\n  (-reduce [coll f]\n    (array-reduce arr f (aget arr off) (inc off)))\n  (-reduce [coll f start]\n    (array-reduce arr f start off)))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2636 2658]},
 :full-name "cljs.core/ArrayChunk",
 :clj-symbol "clojure.lang/ArrayChunk"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ArrayChunk.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ArrayChunk.cljsdoc)
</pre>

