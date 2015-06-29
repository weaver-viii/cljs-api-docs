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
(__ChunkedCons.__ chunk more meta)<br>
</samp>

---





Source code:

```clj
(deftype ChunkedCons [chunk more meta]
  IWithMeta
  (-with-meta [coll m]
    (ChunkedCons. chunk more m))

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
      (ChunkedCons. (-drop-first chunk) more meta)
      (if (nil? more)
        ()
        more)))

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
    (cons o this)))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1849-1889](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1849-L1889)</ins>
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
 :signature ["[chunk more meta]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_ChunkedCons",
 :source {:code "(deftype ChunkedCons [chunk more meta]\n  IWithMeta\n  (-with-meta [coll m]\n    (ChunkedCons. chunk more m))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ASeq\n  ISeq\n  (-first [coll] (-nth chunk 0))\n  (-rest [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta)\n      (if (nil? more)\n        ()\n        more)))\n\n  IChunkedSeq\n  (-chunked-first [coll] chunk)\n  (-chunked-rest [coll]\n    (if (nil? more)\n      ()\n      more))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (if (nil? more)\n      nil\n      more))\n\n  ICollection\n  (-conj [this o]\n    (cons o this)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1849 1889]},
 :full-name "cljs.core/ChunkedCons",
 :clj-symbol "clojure.lang/ChunkedCons"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ChunkedCons.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ChunkedCons.cljsdoc)
</pre>

