## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/EmptyList

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/EmptyList</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentList.java)
</td>
</tr>
</table>

 <samp>
(__EmptyList.__ meta)<br>
</samp>

---





Source code:

```clj
(deftype EmptyList [meta]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IList

  ICloneable
  (-clone [_] (EmptyList. meta))

  IWithMeta
  (-with-meta [coll meta] (EmptyList. meta))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] nil)
  (-rest [coll] ())

  INext
  (-next [coll] nil)

  IStack
  (-peek [coll] nil)
  (-pop [coll] (throw (js/Error. "Can't pop empty list")))

  ICollection
  (-conj [coll o] (List. meta o nil 1 nil))

  IEmptyableCollection
  (-empty [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] 0)

  ISeqable
  (-seq [coll] nil)

  ICounted
  (-count [coll] 0)

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2275-2325](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L2275-L2325)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/EmptyList"]))
```

```clj
{:ns "cljs.core",
 :name "EmptyList",
 :signature ["[meta]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_EmptyList",
 :source {:code "(deftype EmptyList [meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IList\n\n  ICloneable\n  (-clone [_] (EmptyList. meta))\n\n  IWithMeta\n  (-with-meta [coll meta] (EmptyList. meta))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] nil)\n  (-rest [coll] ())\n\n  INext\n  (-next [coll] nil)\n\n  IStack\n  (-peek [coll] nil)\n  (-pop [coll] (throw (js/Error. \"Can't pop empty list\")))\n\n  ICollection\n  (-conj [coll o] (List. meta o nil 1 nil))\n\n  IEmptyableCollection\n  (-empty [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] 0)\n\n  ISeqable\n  (-seq [coll] nil)\n\n  ICounted\n  (-count [coll] 0)\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2275 2325]},
 :full-name "cljs.core/EmptyList",
 :clj-symbol "clojure.lang/EmptyList"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_EmptyList.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_EmptyList.cljsdoc)
</pre>

