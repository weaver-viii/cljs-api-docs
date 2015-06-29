## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/LazyTransformer

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__LazyTransformer.__ stepper first rest meta)<br>
</samp>

---





Source code:

```clj
(deftype LazyTransformer [^:mutable stepper ^:mutable first ^:mutable rest meta]
  IWithMeta
  (-with-meta [this new-meta]
    (LazyTransformer. stepper first rest new-meta))

  ICollection
  (-conj [this o]
    (cons o (-seq this)))

  IEmptyableCollection
  (-empty [this]
    ())

  ISequential
  IEquiv
  (-equiv [this other]
    (let [s (-seq this)]
      (if-not (nil? s)
        (equiv-sequential this other)
        (and (sequential? other)
             (nil? (seq other))))))

  IHash
  (-hash [this]
    (hash-ordered-coll this))

  ISeqable
  (-seq [this]
    (when-not (nil? stepper)
      (.step stepper this))
    (if (nil? rest)
      nil
      this))

  ISeq
  (-first [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      nil
      first))

  (-rest [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      ()
      rest))

  INext
  (-next [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      nil
      (-seq rest))))
```

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3208-3263](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/core.cljs#L3208-L3263)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazyTransformer"]))
```

```clj
{:ns "cljs.core",
 :name "LazyTransformer",
 :type "type",
 :signature ["[stepper first rest meta]"],
 :source {:code "(deftype LazyTransformer [^:mutable stepper ^:mutable first ^:mutable rest meta]\n  IWithMeta\n  (-with-meta [this new-meta]\n    (LazyTransformer. stepper first rest new-meta))\n\n  ICollection\n  (-conj [this o]\n    (cons o (-seq this)))\n\n  IEmptyableCollection\n  (-empty [this]\n    ())\n\n  ISequential\n  IEquiv\n  (-equiv [this other]\n    (let [s (-seq this)]\n      (if-not (nil? s)\n        (equiv-sequential this other)\n        (and (sequential? other)\n             (nil? (seq other))))))\n\n  IHash\n  (-hash [this]\n    (hash-ordered-coll this))\n\n  ISeqable\n  (-seq [this]\n    (when-not (nil? stepper)\n      (.step stepper this))\n    (if (nil? rest)\n      nil\n      this))\n\n  ISeq\n  (-first [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      nil\n      first))\n\n  (-rest [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      ()\n      rest))\n\n  INext\n  (-next [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      nil\n      (-seq rest))))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3208 3263]},
 :full-name "cljs.core/LazyTransformer",
 :full-name-encode "cljs.core_LazyTransformer",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_LazyTransformer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_LazyTransformer.cljsdoc)
</pre>

