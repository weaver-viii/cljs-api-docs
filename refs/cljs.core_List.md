## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/List

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentList</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentList.java)
</td>
</tr>
</table>

 <samp>
(__List.__ meta first rest count __hash)<br>
</samp>

---





Source code:

```clj
(deftype List [meta first rest count ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IList

  ICloneable
  (-clone [_] (List. meta first rest count __hash))

  IWithMeta
  (-with-meta [coll meta] (List. meta first rest count __hash))

  IMeta
  (-meta [coll] meta)

  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll]
    (if (== count 1)
      ()
      rest))

  INext
  (-next [coll]
    (if (== count 1)
      nil
      rest))

  IStack
  (-peek [coll] first)
  (-pop [coll] (-rest coll))

  ICollection
  (-conj [coll o] (List. meta o coll (inc count) nil))

  IEmptyableCollection
  (-empty [coll] (-with-meta (.-EMPTY List) meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  ISeqable
  (-seq [coll] coll)

  ICounted
  (-count [coll] count)

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2342-2399](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2342-L2399)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/List"]))
```

```clj
{:ns "cljs.core",
 :name "List",
 :signature ["[meta first rest count __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_List",
 :source {:code "(deftype List [meta first rest count ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IList\n\n  ICloneable\n  (-clone [_] (List. meta first rest count __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (List. meta first rest count __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ASeq\n  ISeq\n  (-first [coll] first)\n  (-rest [coll]\n    (if (== count 1)\n      ()\n      rest))\n\n  INext\n  (-next [coll]\n    (if (== count 1)\n      nil\n      rest))\n\n  IStack\n  (-peek [coll] first)\n  (-pop [coll] (-rest coll))\n\n  ICollection\n  (-conj [coll o] (List. meta o coll (inc count) nil))\n\n  IEmptyableCollection\n  (-empty [coll] (-with-meta (.-EMPTY List) meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ICounted\n  (-count [coll] count)\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2342 2399]},
 :full-name "cljs.core/List",
 :clj-symbol "clojure.lang/PersistentList"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_List.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_List.cljsdoc)
</pre>

