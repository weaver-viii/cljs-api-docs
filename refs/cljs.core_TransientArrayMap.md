## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/TransientArrayMap

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TransientArrayMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentArrayMap.java)
</td>
</tr>
</table>

 <samp>
(__TransientArrayMap.__ editable? len arr)<br>
</samp>

---





Source code:

```clj
(deftype TransientArrayMap [^:mutable editable?
                            ^:mutable len
                            arr]
  ICounted
  (-count [tcoll]
    (if editable?
      (quot len 2)
      (throw (js/Error. "count after persistent!"))))

  ILookup
  (-lookup [tcoll k]
    (-lookup tcoll k nil))

  (-lookup [tcoll k not-found]
    (if editable?
      (let [idx (array-map-index-of tcoll k)]
        (if (== idx -1)
          not-found
          (aget arr (inc idx))))
      (throw (js/Error. "lookup after persistent!"))))

  ITransientCollection
  (-conj! [tcoll o]
    (if editable?
      (if (satisfies? IMapEntry o)
        (-assoc! tcoll (key o) (val o))
        (loop [es (seq o) tcoll tcoll]
          (if-let [e (first es)]
            (recur (next es)
                   (-assoc! tcoll (key e) (val e)))
            tcoll)))
      (throw (js/Error. "conj! after persistent!"))))

  (-persistent! [tcoll]
    (if editable?
      (do (set! editable? false)
          (PersistentArrayMap. nil (quot len 2) arr nil))
      (throw (js/Error. "persistent! called twice"))))

  ITransientAssociative
  (-assoc! [tcoll key val]
    (if editable?
      (let [idx (array-map-index-of tcoll key)]
        (if (== idx -1)
          (if (<= (+ len 2) (* 2 cljs.core.PersistentArrayMap.HASHMAP_THRESHOLD))
            (do (set! len (+ len 2))
                (.push arr key)
                (.push arr val)
                tcoll)
            (assoc! (array->transient-hash-map len arr) key val))
          (if (identical? val (aget arr (inc idx)))
            tcoll
            (do (aset arr (inc idx) val)
                tcoll))))
      (throw (js/Error. "assoc! after persistent!"))))

  ITransientMap
  (-dissoc! [tcoll key]
    (if editable?
      (let [idx (array-map-index-of tcoll key)]
        (when (>= idx 0)
          (aset arr idx (aget arr (- len 2)))
          (aset arr (inc idx) (aget arr (dec len)))
          (doto arr .pop .pop)
          (set! len (- len 2)))
        tcoll)
      (throw (js/Error. "dissoc! after persistent!")))))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4591-4657](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L4591-L4657)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TransientArrayMap"]))
```

```clj
{:ns "cljs.core",
 :name "TransientArrayMap",
 :signature ["[editable? len arr]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_TransientArrayMap",
 :source {:code "(deftype TransientArrayMap [^:mutable editable?\n                            ^:mutable len\n                            arr]\n  ICounted\n  (-count [tcoll]\n    (if editable?\n      (quot len 2)\n      (throw (js/Error. \"count after persistent!\"))))\n\n  ILookup\n  (-lookup [tcoll k]\n    (-lookup tcoll k nil))\n\n  (-lookup [tcoll k not-found]\n    (if editable?\n      (let [idx (array-map-index-of tcoll k)]\n        (if (== idx -1)\n          not-found\n          (aget arr (inc idx))))\n      (throw (js/Error. \"lookup after persistent!\"))))\n\n  ITransientCollection\n  (-conj! [tcoll o]\n    (if editable?\n      (if (satisfies? IMapEntry o)\n        (-assoc! tcoll (key o) (val o))\n        (loop [es (seq o) tcoll tcoll]\n          (if-let [e (first es)]\n            (recur (next es)\n                   (-assoc! tcoll (key e) (val e)))\n            tcoll)))\n      (throw (js/Error. \"conj! after persistent!\"))))\n\n  (-persistent! [tcoll]\n    (if editable?\n      (do (set! editable? false)\n          (PersistentArrayMap. nil (quot len 2) arr nil))\n      (throw (js/Error. \"persistent! called twice\"))))\n\n  ITransientAssociative\n  (-assoc! [tcoll key val]\n    (if editable?\n      (let [idx (array-map-index-of tcoll key)]\n        (if (== idx -1)\n          (if (<= (+ len 2) (* 2 cljs.core.PersistentArrayMap.HASHMAP_THRESHOLD))\n            (do (set! len (+ len 2))\n                (.push arr key)\n                (.push arr val)\n                tcoll)\n            (assoc! (array->transient-hash-map len arr) key val))\n          (if (identical? val (aget arr (inc idx)))\n            tcoll\n            (do (aset arr (inc idx) val)\n                tcoll))))\n      (throw (js/Error. \"assoc! after persistent!\"))))\n\n  ITransientMap\n  (-dissoc! [tcoll key]\n    (if editable?\n      (let [idx (array-map-index-of tcoll key)]\n        (when (>= idx 0)\n          (aset arr idx (aget arr (- len 2)))\n          (aset arr (inc idx) (aget arr (dec len)))\n          (doto arr .pop .pop)\n          (set! len (- len 2)))\n        tcoll)\n      (throw (js/Error. \"dissoc! after persistent!\")))))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4591 4657]},
 :full-name "cljs.core/TransientArrayMap",
 :clj-symbol "clojure.lang/TransientArrayMap"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_TransientArrayMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_TransientArrayMap.cljsdoc)
</pre>

