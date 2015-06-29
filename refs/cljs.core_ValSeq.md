## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ValSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ValSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)
</td>
</tr>
</table>

 <samp>
(__ValSeq.__ mseq _meta)<br>
</samp>

---





Source code:

```clj
(deftype ValSeq [^not-native mseq _meta]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta] (ValSeq. mseq new-meta))

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
    (let [^not-native me (-first mseq)]
      (-val me)))

  (-rest [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (if-not (nil? nseq)
        (ValSeq. nseq _meta)
        ())))

  INext
  (-next [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (when-not (nil? nseq)
        (ValSeq. nseq _meta)))))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5814-5861](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L5814-L5861)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ValSeq"]))
```

```clj
{:ns "cljs.core",
 :name "ValSeq",
 :signature ["[mseq _meta]"],
 :history [["+" "0.0-1820"]],
 :type "type",
 :full-name-encode "cljs.core_ValSeq",
 :source {:code "(deftype ValSeq [^not-native mseq _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta] (ValSeq. mseq new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY _meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeq\n  (-first [coll]\n    (let [^not-native me (-first mseq)]\n      (-val me)))\n\n  (-rest [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (if-not (nil? nseq)\n        (ValSeq. nseq _meta)\n        ())))\n\n  INext\n  (-next [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (when-not (nil? nseq)\n        (ValSeq. nseq _meta)))))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5814 5861]},
 :full-name "cljs.core/ValSeq",
 :clj-symbol "clojure.lang/ValSeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ValSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ValSeq.cljsdoc)
</pre>

