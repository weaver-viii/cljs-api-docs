## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashSet

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>

 <samp>
(__PersistentHashSet.__ meta hash-map __hash)<br>
</samp>

---





Source code:

```clj
(deftype PersistentHashSet [meta hash-map ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))
  
  IWithMeta
  (-with-meta [coll meta] (PersistentHashSet. meta hash-map __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (PersistentHashSet. meta (assoc hash-map o nil) nil))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.PersistentHashSet/EMPTY meta))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (== (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  IHash
  (-hash [coll] (caching-hash coll hash-iset __hash))

  ISeqable
  (-seq [coll] (keys hash-map))

  ICounted
  (-count [coll] (count (seq coll)))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (-contains-key? hash-map v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (PersistentHashSet. meta (dissoc hash-map v) nil))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll] (TransientHashSet. (transient hash-map))))
```

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5546-5600](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L5546-L5600)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashSet",
 :signature ["[meta hash-map __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_PersistentHashSet",
 :source {:code "(deftype PersistentHashSet [meta hash-map ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n  \n  IWithMeta\n  (-with-meta [coll meta] (PersistentHashSet. meta hash-map __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll o]\n    (PersistentHashSet. meta (assoc hash-map o nil) nil))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.PersistentHashSet/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other]\n    (and\n     (set? other)\n     (== (count coll) (count other))\n     (every? #(contains? coll %)\n             other)))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-iset __hash))\n\n  ISeqable\n  (-seq [coll] (keys hash-map))\n\n  ICounted\n  (-count [coll] (count (seq coll)))\n\n  ILookup\n  (-lookup [coll v]\n    (-lookup coll v nil))\n  (-lookup [coll v not-found]\n    (if (-contains-key? hash-map v)\n      v\n      not-found))\n\n  ISet\n  (-disjoin [coll v]\n    (PersistentHashSet. meta (dissoc hash-map v) nil))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll] (TransientHashSet. (transient hash-map))))",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5546 5600]},
 :full-name "cljs.core/PersistentHashSet",
 :clj-symbol "clojure.lang/PersistentHashSet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashSet.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashSet.cljsdoc)
</pre>

