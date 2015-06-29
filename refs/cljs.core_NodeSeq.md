## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/NodeSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/NodeSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>

 <samp>
(__NodeSeq.__ meta nodes i s __hash)<br>
</samp>

---





Source code:

```clj
(deftype NodeSeq [meta nodes i s ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  ISequential
  ISeq
  (-first [coll]
    (if (nil? s)
      [(aget nodes i) (aget nodes (inc i))]
      (first s)))

  (-rest [coll]
    (if (nil? s)
      (create-inode-seq nodes (+ i 2) nil)
      (create-inode-seq nodes i (next s))))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5049-5095](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L5049-L5095)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/NodeSeq"]))
```

```clj
{:ns "cljs.core",
 :name "NodeSeq",
 :signature ["[meta nodes i s __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_NodeSeq",
 :source {:code "(deftype NodeSeq [meta nodes i s ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  ISequential\n  ISeq\n  (-first [coll]\n    (if (nil? s)\n      [(aget nodes i) (aget nodes (inc i))]\n      (first s)))\n\n  (-rest [coll]\n    (if (nil? s)\n      (create-inode-seq nodes (+ i 2) nil)\n      (create-inode-seq nodes i (next s))))\n\n  ISeqable\n  (-seq [this] this)\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5049 5095]},
 :full-name "cljs.core/NodeSeq",
 :clj-symbol "clojure.lang/NodeSeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_NodeSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_NodeSeq.cljsdoc)
</pre>

