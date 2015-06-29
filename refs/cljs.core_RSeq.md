## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/RSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/RSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentVector.java)
</td>
</tr>
</table>

 <samp>
(__RSeq.__ ci i meta)<br>
</samp>

---





Source code:

```clj
(deftype RSeq [ci i meta]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  ICloneable
  (-clone [_] (RSeq. ci i meta))

  IMeta
  (-meta [coll] meta)
  IWithMeta
  (-with-meta [coll new-meta]
    (RSeq. ci i new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeq
  (-first [coll]
    (-nth ci i))
  (-rest [coll]
    (if (pos? i)
      (RSeq. ci (dec i) nil)
      ()))
  
  INext
  (-next [coll]
    (when (pos? i)
      (RSeq. ci (dec i) nil)))

  ICounted
  (-count [coll] (inc i))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  IHash
  (-hash [coll] (hash-ordered-coll coll))

  IReduce
  (-reduce [col f] (seq-reduce f col))
  (-reduce [col f start] (seq-reduce f start col)))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1330-1381](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L1330-L1381)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RSeq"]))
```

```clj
{:ns "cljs.core",
 :name "RSeq",
 :signature ["[ci i meta]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_RSeq",
 :source {:code "(deftype RSeq [ci i meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  ICloneable\n  (-clone [_] (RSeq. ci i meta))\n\n  IMeta\n  (-meta [coll] meta)\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (RSeq. ci i new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeq\n  (-first [coll]\n    (-nth ci i))\n  (-rest [coll]\n    (if (pos? i)\n      (RSeq. ci (dec i) nil)\n      ()))\n  \n  INext\n  (-next [coll]\n    (when (pos? i)\n      (RSeq. ci (dec i) nil)))\n\n  ICounted\n  (-count [coll] (inc i))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  IHash\n  (-hash [coll] (hash-ordered-coll coll))\n\n  IReduce\n  (-reduce [col f] (seq-reduce f col))\n  (-reduce [col f start] (seq-reduce f start col)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1330 1381]},
 :full-name "cljs.core/RSeq",
 :clj-symbol "clojure.lang/RSeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_RSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_RSeq.cljsdoc)
</pre>

