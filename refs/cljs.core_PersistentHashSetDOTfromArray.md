## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashSet.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentHashSet.fromArray__ items no-clone)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentHashSet/fromArray
  (fn [items ^boolean no-clone]
    (let [len (alength items)]
     (if (<= (/ len 2) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD)
       (let [arr (if no-clone items (aclone items))]
         (PersistentHashSet. nil
           (cljs.core.PersistentArrayMap/fromArray arr true) nil))
       (loop [i 0
              out (transient cljs.core.PersistentHashSet/EMPTY)]
         (if (< i len)
           (recur (+ i 2) (conj! out (aget items i)))
           (persistent! out)))))))
```

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6029-6040](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L6029-L6040)</ins>
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
 :signature ["[items no-clone]"],
 :history [["+" "0.0-1443"]],
 :parent-type "PersistentHashSet",
 :type "function",
 :full-name-encode "cljs.core_PersistentHashSetDOTfromArray",
 :source {:code "(set! cljs.core.PersistentHashSet/fromArray\n  (fn [items ^boolean no-clone]\n    (let [len (alength items)]\n     (if (<= (/ len 2) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD)\n       (let [arr (if no-clone items (aclone items))]\n         (PersistentHashSet. nil\n           (cljs.core.PersistentArrayMap/fromArray arr true) nil))\n       (loop [i 0\n              out (transient cljs.core.PersistentHashSet/EMPTY)]\n         (if (< i len)\n           (recur (+ i 2) (conj! out (aget items i)))\n           (persistent! out)))))))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6029 6040]},
 :full-name "cljs.core/PersistentHashSet.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc)
</pre>

