## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentTreeMapSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentTreeMapSeq.__ meta stack ascending? cnt __hash)<br>
</samp>

---





Source code:

```clj
(deftype PersistentTreeMapSeq [meta stack ascending? cnt ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  ISeqable
  (-seq [this] this)

  ISequential
  ISeq
  (-first [this] (peek stack))

  (-rest [this]
    (let [t (peek stack)
          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))
                                        (pop stack)
                                        ascending?)]
      (if (coercive-not= next-stack nil)
        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil))))

  ICounted
  (-count [coll]
    (if (neg? cnt)
      (inc (count (next coll)))
      cnt))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta]
    (PersistentTreeMapSeq. meta stack ascending? cnt __hash)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4363-4403](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L4363-L4403)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeMapSeq"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentTreeMapSeq",
 :type "type",
 :signature ["[meta stack ascending? cnt __hash]"],
 :source {:code "(deftype PersistentTreeMapSeq [meta stack ascending? cnt ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  ISeqable\n  (-seq [this] this)\n\n  ISequential\n  ISeq\n  (-first [this] (peek stack))\n\n  (-rest [this]\n    (let [t (peek stack)\n          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))\n                                        (pop stack)\n                                        ascending?)]\n      (if (coercive-not= next-stack nil)\n        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil))))\n\n  ICounted\n  (-count [coll]\n    (if (neg? cnt)\n      (inc (count (next coll)))\n      cnt))\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta]\n    (PersistentTreeMapSeq. meta stack ascending? cnt __hash)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4363 4403]},
 :full-name "cljs.core/PersistentTreeMapSeq",
 :full-name-encode "cljs.core_PersistentTreeMapSeq",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentTreeMapSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentTreeMapSeq.cljsdoc)
</pre>

