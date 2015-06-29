## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/LazySeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/LazySeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LazySeq.java)
</td>
</tr>
</table>

 <samp>
(__LazySeq.__ meta realized x)<br>
</samp>

---





Source code:

```clj
(deftype LazySeq [meta realized x]
  IWithMeta
  (-with-meta [coll meta] (LazySeq. meta realized x))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first (lazy-seq-value coll)))
  (-rest [coll] (rest (lazy-seq-value coll)))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] (seq (lazy-seq-value coll))))
```

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1293-1318](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1293-L1318)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazySeq"]))
```

```clj
{:ns "cljs.core",
 :name "LazySeq",
 :signature ["[meta realized x]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_LazySeq",
 :source {:code "(deftype LazySeq [meta realized x]\n  IWithMeta\n  (-with-meta [coll meta] (LazySeq. meta realized x))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first (lazy-seq-value coll)))\n  (-rest [coll] (rest (lazy-seq-value coll)))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] (seq (lazy-seq-value coll))))",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1293 1318]},
 :full-name "cljs.core/LazySeq",
 :clj-symbol "clojure.lang/LazySeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_LazySeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_LazySeq.cljsdoc)
</pre>

