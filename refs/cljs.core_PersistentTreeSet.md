## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentTreeSet

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentTreeSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentTreeSet.java)
</td>
</tr>
</table>

 <samp>
(__PersistentTreeSet.__ meta tree-map __hash)<br>
</samp>

---





Source code:

```clj
(deftype PersistentTreeSet [meta tree-map ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  ;; EXPERIMENTAL: subject to change
  (keys [coll]
    (es6-iterator (seq coll)))
  (entries [coll]
    (es6-set-entries-iterator (seq coll)))
  (values [coll]
    (es6-iterator (seq coll)))
  (has [coll k]
    (contains? coll k))
  (forEach [coll f]
    (doseq [[k v] coll]
      (f v k)))

  ICloneable
  (-clone [_] (PersistentTreeSet. meta tree-map __hash))

  IWithMeta
  (-with-meta [coll meta] (PersistentTreeSet. meta tree-map __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (PersistentTreeSet. meta (assoc tree-map o nil) nil))

  IEmptyableCollection
  (-empty [coll] (PersistentTreeSet. meta (-empty tree-map) 0))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (== (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  IHash
  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))

  ISeqable
  (-seq [coll] (keys tree-map))

  ISorted
  (-sorted-seq [coll ascending?]
    (map key (-sorted-seq tree-map ascending?)))

  (-sorted-seq-from [coll k ascending?]
    (map key (-sorted-seq-from tree-map k ascending?)))

  (-entry-key [coll entry] entry)

  (-comparator [coll] (-comparator tree-map))

  IReversible
  (-rseq [coll]
    (if (pos? (count tree-map))
      (map key (rseq tree-map))))

  ICounted
  (-count [coll] (count tree-map))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (let [n (.entry-at tree-map v)]
      (if-not (nil? n)
        (.-key n)
        not-found)))

  ISet
  (-disjoin [coll v]
    (PersistentTreeSet. meta (dissoc tree-map v) nil))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7390-7476](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L7390-L7476)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeSet"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentTreeSet",
 :signature ["[meta tree-map __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_PersistentTreeSet",
 :source {:code "(deftype PersistentTreeSet [meta tree-map ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  ;; EXPERIMENTAL: subject to change\n  (keys [coll]\n    (es6-iterator (seq coll)))\n  (entries [coll]\n    (es6-set-entries-iterator (seq coll)))\n  (values [coll]\n    (es6-iterator (seq coll)))\n  (has [coll k]\n    (contains? coll k))\n  (forEach [coll f]\n    (doseq [[k v] coll]\n      (f v k)))\n\n  ICloneable\n  (-clone [_] (PersistentTreeSet. meta tree-map __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentTreeSet. meta tree-map __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll o]\n    (PersistentTreeSet. meta (assoc tree-map o nil) nil))\n\n  IEmptyableCollection\n  (-empty [coll] (PersistentTreeSet. meta (-empty tree-map) 0))\n\n  IEquiv\n  (-equiv [coll other]\n    (and\n     (set? other)\n     (== (count coll) (count other))\n     (every? #(contains? coll %)\n             other)))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))\n\n  ISeqable\n  (-seq [coll] (keys tree-map))\n\n  ISorted\n  (-sorted-seq [coll ascending?]\n    (map key (-sorted-seq tree-map ascending?)))\n\n  (-sorted-seq-from [coll k ascending?]\n    (map key (-sorted-seq-from tree-map k ascending?)))\n\n  (-entry-key [coll entry] entry)\n\n  (-comparator [coll] (-comparator tree-map))\n\n  IReversible\n  (-rseq [coll]\n    (if (pos? (count tree-map))\n      (map key (rseq tree-map))))\n\n  ICounted\n  (-count [coll] (count tree-map))\n\n  ILookup\n  (-lookup [coll v]\n    (-lookup coll v nil))\n  (-lookup [coll v not-found]\n    (let [n (.entry-at tree-map v)]\n      (if-not (nil? n)\n        (.-key n)\n        not-found)))\n\n  ISet\n  (-disjoin [coll v]\n    (PersistentTreeSet. meta (dissoc tree-map v) nil))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7390 7476]},
 :full-name "cljs.core/PersistentTreeSet",
 :clj-symbol "clojure.lang/PersistentTreeSet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentTreeSet.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentTreeSet.cljsdoc)
</pre>

