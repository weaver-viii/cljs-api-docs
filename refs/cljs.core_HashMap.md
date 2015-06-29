## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/HashMap

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__HashMap.__ meta count hashobj __hash)<br>
</samp>

---





Source code:

```clj
(deftype HashMap [meta count hashobj ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (HashMap. meta count hashobj __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj
              coll
              entry)))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.HashMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ISeqable
  (-seq [coll]
    (when (pos? count)
      (let [hashes (.sort (js-keys hashobj))]
        (mapcat #(map vec (partition 2 (aget hashobj %)))
                hashes))))

  ICounted
  (-count [coll] count)

  ILookup
  (-lookup [coll k] (-lookup coll k nil))
  (-lookup [coll k not-found]
    (let [bucket (aget hashobj (hash k))
          i (when bucket (scan-array 2 k bucket))]
      (if i
        (aget bucket (inc i))
        not-found)))

  IAssociative
  (-assoc [coll k v]
    (let [h (hash k)
          bucket (aget hashobj h)]
      (if bucket
        (let [new-bucket (aclone bucket)
              new-hashobj (goog.object/clone hashobj)]
          (aset new-hashobj h new-bucket)
          (if-let [i (scan-array 2 k new-bucket)]
            (do                         ; found key, replace
              (aset new-bucket (inc i) v)
              (HashMap. meta count new-hashobj nil))
            (do                         ; did not find key, append
              (.push new-bucket k v)
              (HashMap. meta (inc count) new-hashobj nil))))
        (let [new-hashobj (goog.object/clone hashobj)] ; did not find bucket
          (aset new-hashobj h (array k v))
          (HashMap. meta (inc count) new-hashobj nil)))))
  (-contains-key? [coll k]
    (let [bucket (aget hashobj (hash k))
          i (when bucket (scan-array 2 k bucket))]
      (if i
        true
        false)))

  IMap
  (-dissoc [coll k]
    (let [h (hash k)
          bucket (aget hashobj h)
          i (when bucket (scan-array 2 k bucket))]
      (if (not i)
        coll ; key not found, return coll unchanged
        (let [new-hashobj (goog.object/clone hashobj)]
          (if (> 3 (alength bucket))
            (js-delete new-hashobj h)
            (let [new-bucket (aclone bucket)]
              (.splice new-bucket i 2)
              (aset new-hashobj h new-bucket)))
          (HashMap. meta (dec count) new-hashobj nil)))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3684-3775](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L3684-L3775)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashMap"]))
```

```clj
{:ns "cljs.core",
 :name "HashMap",
 :type "type",
 :signature ["[meta count hashobj __hash]"],
 :source {:code "(deftype HashMap [meta count hashobj ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (HashMap. meta count hashobj __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.HashMap/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-imap __hash))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? count)\n      (let [hashes (.sort (js-keys hashobj))]\n        (mapcat #(map vec (partition 2 (aget hashobj %)))\n                hashes))))\n\n  ICounted\n  (-count [coll] count)\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found]\n    (let [bucket (aget hashobj (hash k))\n          i (when bucket (scan-array 2 k bucket))]\n      (if i\n        (aget bucket (inc i))\n        not-found)))\n\n  IAssociative\n  (-assoc [coll k v]\n    (let [h (hash k)\n          bucket (aget hashobj h)]\n      (if bucket\n        (let [new-bucket (aclone bucket)\n              new-hashobj (goog.object/clone hashobj)]\n          (aset new-hashobj h new-bucket)\n          (if-let [i (scan-array 2 k new-bucket)]\n            (do                         ; found key, replace\n              (aset new-bucket (inc i) v)\n              (HashMap. meta count new-hashobj nil))\n            (do                         ; did not find key, append\n              (.push new-bucket k v)\n              (HashMap. meta (inc count) new-hashobj nil))))\n        (let [new-hashobj (goog.object/clone hashobj)] ; did not find bucket\n          (aset new-hashobj h (array k v))\n          (HashMap. meta (inc count) new-hashobj nil)))))\n  (-contains-key? [coll k]\n    (let [bucket (aget hashobj (hash k))\n          i (when bucket (scan-array 2 k bucket))]\n      (if i\n        true\n        false)))\n\n  IMap\n  (-dissoc [coll k]\n    (let [h (hash k)\n          bucket (aget hashobj h)\n          i (when bucket (scan-array 2 k bucket))]\n      (if (not i)\n        coll ; key not found, return coll unchanged\n        (let [new-hashobj (goog.object/clone hashobj)]\n          (if (> 3 (alength bucket))\n            (js-delete new-hashobj h)\n            (let [new-bucket (aclone bucket)]\n              (.splice new-bucket i 2)\n              (aset new-hashobj h new-bucket)))\n          (HashMap. meta (dec count) new-hashobj nil)))))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3684 3775]},
 :full-name "cljs.core/HashMap",
 :full-name-encode "cljs.core_HashMap",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_HashMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_HashMap.cljsdoc)
</pre>

