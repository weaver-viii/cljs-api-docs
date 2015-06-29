## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/KeySeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/KeySeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)
</td>
</tr>
</table>

 <samp>
(__KeySeq.__ mseq _meta)<br>
</samp>

---





Source code:

```clj
(deftype KeySeq [^not-native mseq _meta]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta] (KeySeq. mseq new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY _meta))

  IHash
  (-hash [coll] (hash-coll coll))
  
  ISeq
  (-first [coll]
    (let [^not-native me (-first mseq)]
      (-key me)))

  (-rest [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (if-not (nil? nseq)
        (KeySeq. nseq _meta)
        ())))

  INext
  (-next [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (when-not (nil? nseq)
        (KeySeq. nseq _meta))))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5823-5874](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L5823-L5874)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/KeySeq"]))
```

```clj
{:ns "cljs.core",
 :name "KeySeq",
 :signature ["[mseq _meta]"],
 :history [["+" "0.0-1820"]],
 :type "type",
 :full-name-encode "cljs.core_KeySeq",
 :source {:code "(deftype KeySeq [^not-native mseq _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta] (KeySeq. mseq new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY _meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n  \n  ISeq\n  (-first [coll]\n    (let [^not-native me (-first mseq)]\n      (-key me)))\n\n  (-rest [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (if-not (nil? nseq)\n        (KeySeq. nseq _meta)\n        ())))\n\n  INext\n  (-next [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (when-not (nil? nseq)\n        (KeySeq. nseq _meta))))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5823 5874]},
 :full-name "cljs.core/KeySeq",
 :clj-symbol "clojure.lang/KeySeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_KeySeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_KeySeq.cljsdoc)
</pre>

