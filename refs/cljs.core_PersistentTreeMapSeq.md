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
(deftype PersistentTreeMapSeq [meta stack ^boolean ascending? cnt ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  ISeqable
  (-seq [this] this)

  ISequential
  ISeq
  (-first [this] (peek stack))
  (-rest [this]
    (let [t (first stack)
          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))
                                        (next stack)
                                        ascending?)]
      (if-not (nil? next-stack)
        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil)
        ())))

  ICounted
  (-count [coll]
    (if (neg? cnt)
      (inc (count (next coll)))
      cnt))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta]
    (PersistentTreeMapSeq. meta stack ascending? cnt __hash))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5358-5405](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L5358-L5405)</ins>
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
 :source {:code "(deftype PersistentTreeMapSeq [meta stack ^boolean ascending? cnt ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  ISeqable\n  (-seq [this] this)\n\n  ISequential\n  ISeq\n  (-first [this] (peek stack))\n  (-rest [this]\n    (let [t (first stack)\n          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))\n                                        (next stack)\n                                        ascending?)]\n      (if-not (nil? next-stack)\n        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil)\n        ())))\n\n  ICounted\n  (-count [coll]\n    (if (neg? cnt)\n      (inc (count (next coll)))\n      cnt))\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta]\n    (PersistentTreeMapSeq. meta stack ascending? cnt __hash))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5358 5405]},
 :full-name "cljs.core/PersistentTreeMapSeq",
 :full-name-encode "cljs.core_PersistentTreeMapSeq",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentTreeMapSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentTreeMapSeq.cljsdoc)
</pre>

