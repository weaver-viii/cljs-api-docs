## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashMap

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>

 <samp>
(__PersistentHashMap.__ meta cnt root has-nil? nil-val __hash)<br>
</samp>

---





Source code:

```clj
(deftype PersistentHashMap [meta cnt root ^boolean has-nil? nil-val ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  ;; EXPERIMENTAL: subject to change
  (keys [coll]
    (iterator (keys coll)))
  (entries [coll]
    (entries-iterator (seq coll)))
  (values [coll]
    (iterator (vals coll)))
  (has [coll k]
    (contains? coll k))
  (get [coll k]
    (-lookup coll k))
  (forEach [coll f]
    (doseq [[k v] coll]
      (f v k)))

  ICloneable
  (-clone [_] (PersistentHashMap. meta cnt root has-nil? nil-val __hash))

  IWithMeta
  (-with-meta [coll meta] (PersistentHashMap. meta cnt root has-nil? nil-val __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (loop [ret coll es (seq entry)]
        (if (nil? es)
          ret
          (let [e (first es)]
            (if (vector? e)
              (recur (-assoc ret (-nth e 0) (-nth e 1))
                     (next es))
              (throw (js/Error. "conj on a map takes map entries or seqables of map entries"))))))))

  IEmptyableCollection
  (-empty [coll] (-with-meta (.-EMPTY PersistentHashMap) meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))

  ISeqable
  (-seq [coll]
    (when (pos? cnt)
      (let [s (if-not (nil? root) (.inode-seq root))]
        (if has-nil?
          (cons [nil nil-val] s)
          s))))

  ICounted
  (-count [coll] cnt)

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (cond (nil? k)    (if has-nil?
                        nil-val
                        not-found)
          (nil? root) not-found
          :else       (.inode-lookup root 0 (hash k) k not-found)))

  IAssociative
  (-assoc [coll k v]
    (if (nil? k)
      (if (and has-nil? (identical? v nil-val))
        coll
        (PersistentHashMap. meta (if has-nil? cnt (inc cnt)) root true v nil))
      (let [added-leaf? (Box. false)
            new-root    (-> (if (nil? root)
                              (.-EMPTY BitmapIndexedNode)
                              root)
                            (.inode-assoc 0 (hash k) k v added-leaf?))]
        (if (identical? new-root root)
          coll
          (PersistentHashMap. meta (if ^boolean (.-val added-leaf?) (inc cnt) cnt) new-root has-nil? nil-val nil)))))

  (-contains-key? [coll k]
    (cond (nil? k)    has-nil?
          (nil? root) false
          :else       (not (identical? (.inode-lookup root 0 (hash k) k lookup-sentinel)
                                       lookup-sentinel))))

  IMap
  (-dissoc [coll k]
    (cond (nil? k)    (if has-nil?
                        (PersistentHashMap. meta (dec cnt) root false nil nil)
                        coll)
          (nil? root) coll
          :else
          (let [new-root (.inode-without root 0 (hash k) k)]
            (if (identical? new-root root)
              coll
              (PersistentHashMap. meta (dec cnt) new-root has-nil? nil-val nil)))))

  IKVReduce
  (-kv-reduce [coll f init]
    (let [init (if has-nil? (f init nil nil-val) init)]
      (cond
        (reduced? init)          @init
        (not (nil? root)) (.kv-reduce root f init)
        :else                    init)))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (TransientHashMap. (js-obj) root cnt has-nil? nil-val)))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5883-6008](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L5883-L6008)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashMap",
 :signature ["[meta cnt root has-nil? nil-val __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_PersistentHashMap",
 :source {:code "(deftype PersistentHashMap [meta cnt root ^boolean has-nil? nil-val ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  ;; EXPERIMENTAL: subject to change\n  (keys [coll]\n    (iterator (keys coll)))\n  (entries [coll]\n    (entries-iterator (seq coll)))\n  (values [coll]\n    (iterator (vals coll)))\n  (has [coll k]\n    (contains? coll k))\n  (get [coll k]\n    (-lookup coll k))\n  (forEach [coll f]\n    (doseq [[k v] coll]\n      (f v k)))\n\n  ICloneable\n  (-clone [_] (PersistentHashMap. meta cnt root has-nil? nil-val __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentHashMap. meta cnt root has-nil? nil-val __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (loop [ret coll es (seq entry)]\n        (if (nil? es)\n          ret\n          (let [e (first es)]\n            (if (vector? e)\n              (recur (-assoc ret (-nth e 0) (-nth e 1))\n                     (next es))\n              (throw (js/Error. \"conj on a map takes map entries or seqables of map entries\"))))))))\n\n  IEmptyableCollection\n  (-empty [coll] (-with-meta (.-EMPTY PersistentHashMap) meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? cnt)\n      (let [s (if-not (nil? root) (.inode-seq root))]\n        (if has-nil?\n          (cons [nil nil-val] s)\n          s))))\n\n  ICounted\n  (-count [coll] cnt)\n\n  ILookup\n  (-lookup [coll k]\n    (-lookup coll k nil))\n\n  (-lookup [coll k not-found]\n    (cond (nil? k)    (if has-nil?\n                        nil-val\n                        not-found)\n          (nil? root) not-found\n          :else       (.inode-lookup root 0 (hash k) k not-found)))\n\n  IAssociative\n  (-assoc [coll k v]\n    (if (nil? k)\n      (if (and has-nil? (identical? v nil-val))\n        coll\n        (PersistentHashMap. meta (if has-nil? cnt (inc cnt)) root true v nil))\n      (let [added-leaf? (Box. false)\n            new-root    (-> (if (nil? root)\n                              (.-EMPTY BitmapIndexedNode)\n                              root)\n                            (.inode-assoc 0 (hash k) k v added-leaf?))]\n        (if (identical? new-root root)\n          coll\n          (PersistentHashMap. meta (if ^boolean (.-val added-leaf?) (inc cnt) cnt) new-root has-nil? nil-val nil)))))\n\n  (-contains-key? [coll k]\n    (cond (nil? k)    has-nil?\n          (nil? root) false\n          :else       (not (identical? (.inode-lookup root 0 (hash k) k lookup-sentinel)\n                                       lookup-sentinel))))\n\n  IMap\n  (-dissoc [coll k]\n    (cond (nil? k)    (if has-nil?\n                        (PersistentHashMap. meta (dec cnt) root false nil nil)\n                        coll)\n          (nil? root) coll\n          :else\n          (let [new-root (.inode-without root 0 (hash k) k)]\n            (if (identical? new-root root)\n              coll\n              (PersistentHashMap. meta (dec cnt) new-root has-nil? nil-val nil)))))\n\n  IKVReduce\n  (-kv-reduce [coll f init]\n    (let [init (if has-nil? (f init nil nil-val) init)]\n      (cond\n        (reduced? init)          @init\n        (not (nil? root)) (.kv-reduce root f init)\n        :else                    init)))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll]\n    (TransientHashMap. (js-obj) root cnt has-nil? nil-val)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5883 6008]},
 :full-name "cljs.core/PersistentHashMap",
 :clj-symbol "clojure.lang/PersistentHashMap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashMap.cljsdoc)
</pre>

