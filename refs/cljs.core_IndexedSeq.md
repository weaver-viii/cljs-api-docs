## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IndexedSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IndexedSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IndexedSeq.java)
</td>
</tr>
</table>

 <samp>
(__IndexedSeq.__ arr i)<br>
</samp>

---





Source code:

```clj
(deftype IndexedSeq [arr i]
  Object
  (toString [coll]
   (pr-str* coll))

  ISeqable
  (-seq [this] this)

  ASeq
  ISeq
  (-first [_] (aget arr i))
  (-rest [_] (if (< (inc i) (alength arr))
               (IndexedSeq. arr (inc i))
               (list)))

  INext
  (-next [_] (if (< (inc i) (alength arr))
               (IndexedSeq. arr (inc i))
               nil))

  ICounted
  (-count [_] (- (alength arr) i))

  IIndexed
  (-nth [coll n]
    (let [i (+ n i)]
      (when (< i (alength arr))
        (aget arr i))))
  (-nth [coll n not-found]
    (let [i (+ n i)]
      (if (< i (alength arr))
        (aget arr i)
        not-found)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] cljs.core.List/EMPTY)

  IReduce
  (-reduce [coll f]
    (array-reduce arr f (aget arr i) (inc i)))
  (-reduce [coll f start]
    (array-reduce arr f start i))

  IHash
  (-hash [coll] (hash-coll coll))

  IReversible
  (-rseq [coll]
    (let [c (-count coll)]
      (if (pos? c)
        (RSeq. coll (dec c) nil)
        ()))))
```

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:661-719](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L661-L719)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IndexedSeq"]))
```

```clj
{:ns "cljs.core",
 :name "IndexedSeq",
 :signature ["[arr i]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_IndexedSeq",
 :source {:code "(deftype IndexedSeq [arr i]\n  Object\n  (toString [coll]\n   (pr-str* coll))\n\n  ISeqable\n  (-seq [this] this)\n\n  ASeq\n  ISeq\n  (-first [_] (aget arr i))\n  (-rest [_] (if (< (inc i) (alength arr))\n               (IndexedSeq. arr (inc i))\n               (list)))\n\n  INext\n  (-next [_] (if (< (inc i) (alength arr))\n               (IndexedSeq. arr (inc i))\n               nil))\n\n  ICounted\n  (-count [_] (- (alength arr) i))\n\n  IIndexed\n  (-nth [coll n]\n    (let [i (+ n i)]\n      (when (< i (alength arr))\n        (aget arr i))))\n  (-nth [coll n not-found]\n    (let [i (+ n i)]\n      (if (< i (alength arr))\n        (aget arr i)\n        not-found)))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] cljs.core.List/EMPTY)\n\n  IReduce\n  (-reduce [coll f]\n    (array-reduce arr f (aget arr i) (inc i)))\n  (-reduce [coll f start]\n    (array-reduce arr f start i))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  IReversible\n  (-rseq [coll]\n    (let [c (-count coll)]\n      (if (pos? c)\n        (RSeq. coll (dec c) nil)\n        ()))))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [661 719]},
 :full-name "cljs.core/IndexedSeq",
 :clj-symbol "clojure.lang/IndexedSeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IndexedSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IndexedSeq.cljsdoc)
</pre>

