## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentQueueSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentQueueSeq.__ meta front rear __hash)<br>
</samp>

---





Source code:

```clj
(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first front))
  (-rest  [coll]
    (if-let [f1 (next front)]
      (PersistentQueueSeq. meta f1 rear nil)
      (if (nil? rear)
        (-empty coll)
        (PersistentQueueSeq. meta rear nil nil))))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll] coll))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3565-3595](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L3565-L3595)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueueSeq"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentQueueSeq",
 :type "type",
 :signature ["[meta front rear __hash]"],
 :source {:code "(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first front))\n  (-rest  [coll]\n    (if-let [f1 (next front)]\n      (PersistentQueueSeq. meta f1 rear nil)\n      (if (nil? rear)\n        (-empty coll)\n        (PersistentQueueSeq. meta rear nil nil))))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3565 3595]},
 :full-name "cljs.core/PersistentQueueSeq",
 :full-name-encode "cljs.core_PersistentQueueSeq",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentQueueSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentQueueSeq.cljsdoc)
</pre>

