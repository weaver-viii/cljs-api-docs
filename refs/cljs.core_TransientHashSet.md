## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/TransientHashSet

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TransientHashSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>

 <samp>
(__TransientHashSet.__ transient-map)<br>
</samp>

---





Source code:

```clj
(deftype TransientHashSet [^:mutable transient-map]
  ITransientCollection
  (-conj! [tcoll o]
    (set! transient-map (assoc! transient-map o nil))
    tcoll)

  (-persistent! [tcoll]
    (PersistentHashSet. nil (persistent! transient-map) nil))

  ITransientSet
  (-disjoin! [tcoll v]
    (set! transient-map (dissoc! transient-map v))
    tcoll)

  ICounted
  (-count [tcoll] (count transient-map))

  ILookup
  (-lookup [tcoll v]
    (-lookup tcoll v nil))

  (-lookup [tcoll v not-found]
    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)
      not-found
      v))

  IFn
  (-invoke [tcoll k]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      nil
      k))

  (-invoke [tcoll k not-found]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      not-found
      k)))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7749-7784](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L7749-L7784)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TransientHashSet"]))
```

```clj
{:ns "cljs.core",
 :name "TransientHashSet",
 :signature ["[transient-map]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core_TransientHashSet",
 :source {:code "(deftype TransientHashSet [^:mutable transient-map]\n  ITransientCollection\n  (-conj! [tcoll o]\n    (set! transient-map (assoc! transient-map o nil))\n    tcoll)\n\n  (-persistent! [tcoll]\n    (PersistentHashSet. nil (persistent! transient-map) nil))\n\n  ITransientSet\n  (-disjoin! [tcoll v]\n    (set! transient-map (dissoc! transient-map v))\n    tcoll)\n\n  ICounted\n  (-count [tcoll] (count transient-map))\n\n  ILookup\n  (-lookup [tcoll v]\n    (-lookup tcoll v nil))\n\n  (-lookup [tcoll v not-found]\n    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)\n      not-found\n      v))\n\n  IFn\n  (-invoke [tcoll k]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      nil\n      k))\n\n  (-invoke [tcoll k not-found]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      not-found\n      k)))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7749 7784]},
 :full-name "cljs.core/TransientHashSet",
 :clj-symbol "clojure.lang/TransientHashSet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_TransientHashSet.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_TransientHashSet.cljsdoc)
</pre>

