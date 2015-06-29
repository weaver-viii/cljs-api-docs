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
  IList
  
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (EmptyList. meta))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] nil)
  (-rest [coll] nil)

  IStack
  (-peek [coll] nil)
  (-pop [coll] #_(throw (js/Error. "Can't pop empty list")))

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
  (-count [coll] 0))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1406-1444](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1406-L1444)</ins>
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
 :source {:code "(deftype EmptyList [meta]\n  IList\n  \n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (EmptyList. meta))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] nil)\n  (-rest [coll] nil)\n\n  IStack\n  (-peek [coll] nil)\n  (-pop [coll] #_(throw (js/Error. \"Can't pop empty list\")))\n\n  ICollection\n  (-conj [coll o] (List. meta o nil 1 nil))\n\n  IEmptyableCollection\n  (-empty [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] 0)\n\n  ISeqable\n  (-seq [coll] nil)\n\n  ICounted\n  (-count [coll] 0))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1406 1444]},
 :full-name "cljs.core/EmptyList",
 :clj-symbol "clojure.lang/EmptyList"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_EmptyList.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_EmptyList.cljsdoc)
</pre>
