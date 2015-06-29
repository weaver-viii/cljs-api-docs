## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkedCons

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ChunkedCons</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ChunkedCons.java)
</td>
</tr>
</table>

 <samp>
(__ChunkedCons.__ chunk more meta __hash)<br>
</samp>

---





Source code:

```clj
(deftype ChunkedCons [chunk more meta ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  
  IWithMeta
  (-with-meta [coll m]
    (ChunkedCons. chunk more m __hash))

  IMeta
  (-meta [coll] meta)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ASeq
  ISeq
  (-first [coll] (-nth chunk 0))
  (-rest [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (if (nil? more)
        ()
        more)))

  INext
  (-next [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (let [more (-seq more)]
        (when-not (nil? more)
          more))))

  IChunkedSeq
  (-chunked-first [coll] chunk)
  (-chunked-rest [coll]
    (if (nil? more)
      ()
      more))

  IChunkedNext
  (-chunked-next [coll]
    (if (nil? more)
      nil
      more))

  ICollection
  (-conj [this o]
    (cons o this))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash)))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2428-2486](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L2428-L2486)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ChunkedCons"]))
```

```clj
{:ns "cljs.core",
 :name "ChunkedCons",
 :signature ["[chunk more meta __hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_ChunkedCons",
 :source {:code "(deftype ChunkedCons [chunk more meta ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  \n  IWithMeta\n  (-with-meta [coll m]\n    (ChunkedCons. chunk more m __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ASeq\n  ISeq\n  (-first [coll] (-nth chunk 0))\n  (-rest [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta nil)\n      (if (nil? more)\n        ()\n        more)))\n\n  INext\n  (-next [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta nil)\n      (let [more (-seq more)]\n        (when-not (nil? more)\n          more))))\n\n  IChunkedSeq\n  (-chunked-first [coll] chunk)\n  (-chunked-rest [coll]\n    (if (nil? more)\n      ()\n      more))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (if (nil? more)\n      nil\n      more))\n\n  ICollection\n  (-conj [this o]\n    (cons o this))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash)))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2428 2486]},
 :full-name "cljs.core/ChunkedCons",
 :clj-symbol "clojure.lang/ChunkedCons"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ChunkedCons.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ChunkedCons.cljsdoc)
</pre>

