## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashSet.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentHashSet.fromArray__ items)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentHashSet/fromArray
      (fn [items]
        (let [len (count items)]
          (loop [i   0
                 out (transient cljs.core.PersistentHashSet/EMPTY)]
            (if (< i len)
              (recur (inc i) (conj! out (aget items i)))
              (persistent! out))))))
```

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5604-5611](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L5604-L5611)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet.fromArray"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashSet.fromArray",
 :signature ["[items]"],
 :history [["+" "0.0-1443"]],
 :parent-type "PersistentHashSet",
 :type "function",
 :full-name-encode "cljs.core_PersistentHashSetDOTfromArray",
 :source {:code "(set! cljs.core.PersistentHashSet/fromArray\n      (fn [items]\n        (let [len (count items)]\n          (loop [i   0\n                 out (transient cljs.core.PersistentHashSet/EMPTY)]\n            (if (< i len)\n              (recur (inc i) (conj! out (aget items i)))\n              (persistent! out))))))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5604 5611]},
 :full-name "cljs.core/PersistentHashSet.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc)
</pre>

