## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkedSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ChunkedSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentVector.java)
</td>
</tr>
</table>

 <samp>
(__ChunkedSeq.__ vec node i off meta __hash)<br>
</samp>

---





Source code:

```clj
(deftype ChunkedSeq [vec node i off meta ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IWithMeta
  (-with-meta [coll m]
    (chunked-seq vec node i off m))
  IMeta
  (-meta [coll] meta)

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ASeq
  ISeq
  (-first [coll]
    (aget node off))
  (-rest [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          ()
          s))
      (-chunked-rest coll)))

  INext
  (-next [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          nil
          s))
      (-chunked-next coll)))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll]
    (with-meta (.-EMPTY PersistentVector) meta))

  IChunkedSeq
  (-chunked-first [coll]
    (array-chunk node off))
  (-chunked-rest [coll]
    (let [end (+ i (alength node))]
      (if (< end (-count vec))
        (chunked-seq vec (unchecked-array-for vec end) end 0)
        ())))

  IChunkedNext
  (-chunked-next [coll]
    (let [end (+ i (alength node))]
      (when (< end (-count vec))
        (chunked-seq vec (unchecked-array-for vec end) end 0))))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  IReduce
  (-reduce [coll f]
    (ci-reduce (subvec vec (+ i off) (count vec)) f))

  (-reduce [coll f start]
    (ci-reduce (subvec vec (+ i off) (count vec)) f start)))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4489-4561](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L4489-L4561)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ChunkedSeq"]))
```

```clj
{:ns "cljs.core",
 :name "ChunkedSeq",
 :signature ["[vec node i off meta __hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_ChunkedSeq",
 :source {:code "(deftype ChunkedSeq [vec node i off meta ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IWithMeta\n  (-with-meta [coll m]\n    (chunked-seq vec node i off m))\n  IMeta\n  (-meta [coll] meta)\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ASeq\n  ISeq\n  (-first [coll]\n    (aget node off))\n  (-rest [coll]\n    (if (< (inc off) (alength node))\n      (let [s (chunked-seq vec node i (inc off))]\n        (if (nil? s)\n          ()\n          s))\n      (-chunked-rest coll)))\n\n  INext\n  (-next [coll]\n    (if (< (inc off) (alength node))\n      (let [s (chunked-seq vec node i (inc off))]\n        (if (nil? s)\n          nil\n          s))\n      (-chunked-next coll)))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll]\n    (with-meta (.-EMPTY PersistentVector) meta))\n\n  IChunkedSeq\n  (-chunked-first [coll]\n    (array-chunk node off))\n  (-chunked-rest [coll]\n    (let [end (+ i (alength node))]\n      (if (< end (-count vec))\n        (chunked-seq vec (unchecked-array-for vec end) end 0)\n        ())))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (let [end (+ i (alength node))]\n      (when (< end (-count vec))\n        (chunked-seq vec (unchecked-array-for vec end) end 0))))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  IReduce\n  (-reduce [coll f]\n    (ci-reduce (subvec vec (+ i off) (count vec)) f))\n\n  (-reduce [coll f start]\n    (ci-reduce (subvec vec (+ i off) (count vec)) f start)))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4489 4561]},
 :full-name "cljs.core/ChunkedSeq",
 :clj-symbol "clojure.lang/ChunkedSeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ChunkedSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ChunkedSeq.cljsdoc)
</pre>

