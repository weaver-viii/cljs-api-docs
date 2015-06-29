## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Subvec

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Subvec.__ meta v start end __hash)<br>
</samp>

---





Source code:

```clj
(deftype Subvec [meta v start end ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  ICloneable
  (-clone [_] (Subvec. meta v start end __hash))

  IWithMeta
  (-with-meta [coll meta] (build-subvec meta v start end __hash))

  IMeta
  (-meta [coll] meta)

  IStack
  (-peek [coll]
    (-nth v (dec end)))
  (-pop [coll]
    (if (== start end)
      (throw (js/Error. "Can't pop empty vector"))
      (build-subvec meta v start (dec end) nil)))

  ICollection
  (-conj [coll o]
    (build-subvec meta (-assoc-n v end o) start (inc end) nil))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY PersistentVector) meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  ISeqable
  (-seq [coll]
    (let [subvec-seq (fn subvec-seq [i]
                       (when-not (== i end)
                         (cons (-nth v i)
                               (lazy-seq
                                (subvec-seq (inc i))))))]
      (subvec-seq start)))

  IReversible
  (-rseq [coll]
    (if-not (== start end)
      (RSeq. coll (dec (- end start)) nil)))

  ICounted
  (-count [coll] (- end start))

  IIndexed
  (-nth [coll n]
    (if (or (neg? n) (<= end (+ start n)))
      (vector-index-out-of-bounds n (- end start))
      (-nth v (+ start n))))
  (-nth [coll n not-found]
    (if (or (neg? n) (<= end (+ start n)))
      not-found
      (-nth v (+ start n) not-found)))

  ILookup
  (-lookup [coll k] (-lookup coll k nil))
  (-lookup [coll k not-found] (if (number? k)
                                (-nth coll k not-found)
                                not-found))

  IAssociative
  (-assoc [coll key val]
    (if (number? key)
      (-assoc-n coll key val)
      (throw (js/Error. "Subvec's key for assoc must be a number."))))

  IVector
  (-assoc-n [coll n val]
    (let [v-pos (+ start n)]
      (build-subvec meta (assoc v v-pos val) start (max end (inc v-pos)) nil)))

  IReduce
  (-reduce [coll f]
    (ci-reduce coll f))
  (-reduce [coll f start]
    (ci-reduce coll f start))

  IFn
  (-invoke [coll k]
    (-nth coll k))
  (-invoke [coll k not-found]
    (-nth coll k not-found)))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4490-4582](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L4490-L4582)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Subvec"]))
```

```clj
{:ns "cljs.core",
 :name "Subvec",
 :type "type",
 :signature ["[meta v start end __hash]"],
 :source {:code "(deftype Subvec [meta v start end ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  ICloneable\n  (-clone [_] (Subvec. meta v start end __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (build-subvec meta v start end __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IStack\n  (-peek [coll]\n    (-nth v (dec end)))\n  (-pop [coll]\n    (if (== start end)\n      (throw (js/Error. \"Can't pop empty vector\"))\n      (build-subvec meta v start (dec end) nil)))\n\n  ICollection\n  (-conj [coll o]\n    (build-subvec meta (-assoc-n v end o) start (inc end) nil))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY PersistentVector) meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (let [subvec-seq (fn subvec-seq [i]\n                       (when-not (== i end)\n                         (cons (-nth v i)\n                               (lazy-seq\n                                (subvec-seq (inc i))))))]\n      (subvec-seq start)))\n\n  IReversible\n  (-rseq [coll]\n    (if-not (== start end)\n      (RSeq. coll (dec (- end start)) nil)))\n\n  ICounted\n  (-count [coll] (- end start))\n\n  IIndexed\n  (-nth [coll n]\n    (if (or (neg? n) (<= end (+ start n)))\n      (vector-index-out-of-bounds n (- end start))\n      (-nth v (+ start n))))\n  (-nth [coll n not-found]\n    (if (or (neg? n) (<= end (+ start n)))\n      not-found\n      (-nth v (+ start n) not-found)))\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found] (if (number? k)\n                                (-nth coll k not-found)\n                                not-found))\n\n  IAssociative\n  (-assoc [coll key val]\n    (if (number? key)\n      (-assoc-n coll key val)\n      (throw (js/Error. \"Subvec's key for assoc must be a number.\"))))\n\n  IVector\n  (-assoc-n [coll n val]\n    (let [v-pos (+ start n)]\n      (build-subvec meta (assoc v v-pos val) start (max end (inc v-pos)) nil)))\n\n  IReduce\n  (-reduce [coll f]\n    (ci-reduce coll f))\n  (-reduce [coll f start]\n    (ci-reduce coll f start))\n\n  IFn\n  (-invoke [coll k]\n    (-nth coll k))\n  (-invoke [coll k not-found]\n    (-nth coll k not-found)))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4490 4582]},
 :full-name "cljs.core/Subvec",
 :full-name-encode "cljs.core_Subvec",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Subvec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Subvec.cljsdoc)
</pre>

