## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMapSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentArrayMapSeq.__ arr i _meta)<br>
</samp>

---





Source code:

```clj
(deftype PersistentArrayMapSeq [arr i _meta]
  Object
  (toString [coll]
    (pr-str* coll))
  
  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta]
    (PersistentArrayMapSeq. arr i new-meta))

  ICounted
  (-count [coll]
    (/ (- (alength arr) i) 2))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY _meta))

  IHash
  (-hash [coll] (hash-coll coll))
  
  ISeq
  (-first [coll]
    [(aget arr i) (aget arr (inc i))])

  (-rest [coll]
    (if (< i (- (alength arr) 2))
      (PersistentArrayMapSeq. arr (+ i 2) _meta)
      ()))

  INext
  (-next [coll]
    (when (< i (- (alength arr) 2))
      (PersistentArrayMapSeq. arr (+ i 2) _meta)))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4056-4105](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L4056-L4105)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMapSeq"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMapSeq",
 :type "type",
 :signature ["[arr i _meta]"],
 :source {:code "(deftype PersistentArrayMapSeq [arr i _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  \n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (PersistentArrayMapSeq. arr i new-meta))\n\n  ICounted\n  (-count [coll]\n    (/ (- (alength arr) i) 2))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY _meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n  \n  ISeq\n  (-first [coll]\n    [(aget arr i) (aget arr (inc i))])\n\n  (-rest [coll]\n    (if (< i (- (alength arr) 2))\n      (PersistentArrayMapSeq. arr (+ i 2) _meta)\n      ()))\n\n  INext\n  (-next [coll]\n    (when (< i (- (alength arr) 2))\n      (PersistentArrayMapSeq. arr (+ i 2) _meta)))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4056 4105]},
 :full-name "cljs.core/PersistentArrayMapSeq",
 :full-name-encode "cljs.core_PersistentArrayMapSeq",
 :history [["+" "0.0-1820"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapSeq.cljsdoc)
</pre>

