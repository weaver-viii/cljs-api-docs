## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Range

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Range</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Range.java)
</td>
</tr>
</table>

 <samp>
(__Range.__ meta start end step __hash)<br>
</samp>

---





Source code:

```clj
(deftype Range [meta start end step ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))
  
  IWithMeta
  (-with-meta [rng meta] (Range. meta start end step __hash))

  IMeta
  (-meta [rng] meta)

  ISeq
  (-first [rng] start)
  (-rest [rng]
    (if (-seq rng)
      (Range. meta (+ start step) end step nil)
      (list)))

  ICollection
  (-conj [rng o] (cons o rng))

  IEmptyableCollection
  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [rng other] (equiv-sequential rng other))

  IHash
  (-hash [rng] (caching-hash rng hash-coll __hash))

  ICounted
  (-count [rng]
    (if-not (-seq rng)
      0
      (js/Math.ceil (/ (- end start) step))))

  IIndexed
  (-nth [rng n]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        (throw (js/Error. "Index out of bounds")))))
  (-nth [rng n not-found]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        not-found)))

  ISeqable
  (-seq [rng]
    (let [comp (if (pos? step) < >)]
      (when (comp start end)
        rng)))

  IReduce
  (-reduce [rng f] (ci-reduce rng f))
  (-reduce [rng f s] (ci-reduce rng f s)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5412-5471](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5412-L5471)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Range"]))
```

```clj
{:ns "cljs.core",
 :name "Range",
 :signature ["[meta start end step __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_Range",
 :source {:code "(deftype Range [meta start end step ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n  \n  IWithMeta\n  (-with-meta [rng meta] (Range. meta start end step __hash))\n\n  IMeta\n  (-meta [rng] meta)\n\n  ISeq\n  (-first [rng] start)\n  (-rest [rng]\n    (if (-seq rng)\n      (Range. meta (+ start step) end step nil)\n      (list)))\n\n  ICollection\n  (-conj [rng o] (cons o rng))\n\n  IEmptyableCollection\n  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [rng other] (equiv-sequential rng other))\n\n  IHash\n  (-hash [rng] (caching-hash rng hash-coll __hash))\n\n  ICounted\n  (-count [rng]\n    (if-not (-seq rng)\n      0\n      (js/Math.ceil (/ (- end start) step))))\n\n  IIndexed\n  (-nth [rng n]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        (throw (js/Error. \"Index out of bounds\")))))\n  (-nth [rng n not-found]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        not-found)))\n\n  ISeqable\n  (-seq [rng]\n    (let [comp (if (pos? step) < >)]\n      (when (comp start end)\n        rng)))\n\n  IReduce\n  (-reduce [rng f] (ci-reduce rng f))\n  (-reduce [rng f s] (ci-reduce rng f s)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5412 5471]},
 :full-name "cljs.core/Range",
 :clj-symbol "clojure.lang/Range"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Range.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Range.cljsdoc)
</pre>
