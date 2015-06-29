## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Cons

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Cons</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Cons.java)
</td>
</tr>
</table>

 <samp>
(__Cons.__ meta first rest __hash)<br>
</samp>

---





Source code:

```clj
(deftype Cons [meta first rest ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IList

  ICloneable
  (-clone [_] (Cons. meta first rest __hash))

  IWithMeta
  (-with-meta [coll meta] (Cons. meta first rest __hash))

  IMeta
  (-meta [coll] meta)

  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  INext
  (-next [coll]
    (if (nil? rest) nil (seq rest)))

  ICollection
  (-conj [coll o] (Cons. nil o coll __hash))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  ISeqable
  (-seq [coll] coll)
  
  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2350-2395](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L2350-L2395)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Cons"]))
```

```clj
{:ns "cljs.core",
 :name "Cons",
 :signature ["[meta first rest __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_Cons",
 :source {:code "(deftype Cons [meta first rest ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IList\n\n  ICloneable\n  (-clone [_] (Cons. meta first rest __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (Cons. meta first rest __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ASeq\n  ISeq\n  (-first [coll] first)\n  (-rest [coll] (if (nil? rest) () rest))\n\n  INext\n  (-next [coll]\n    (if (nil? rest) nil (seq rest)))\n\n  ICollection\n  (-conj [coll o] (Cons. nil o coll __hash))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll)\n  \n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2350 2395]},
 :full-name "cljs.core/Cons",
 :clj-symbol "clojure.lang/Cons"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Cons.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Cons.cljsdoc)
</pre>

