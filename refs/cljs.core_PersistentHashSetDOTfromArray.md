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
(set! (.-fromArray PersistentHashSet)
  (fn [items ^boolean no-clone]
    (let [len (alength items)]
      (if (<= len (.-HASHMAP-THRESHOLD PersistentArrayMap))
        (let [arr (if no-clone items (aclone items))]
          (loop [i 0
                 out (transient (.-EMPTY PersistentArrayMap))]
            (if (< i len)
              (recur (inc i) (-assoc! out (aget items i) nil))
              (PersistentHashSet. nil (-persistent! out) nil))))
       (loop [i 0
              out (transient (.-EMPTY PersistentHashSet))]
         (if (< i len)
           (recur (inc i) (-conj! out (aget items i)))
           (-persistent! out)))))))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7428-7442](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L7428-L7442)</ins>
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
 :source {:code "(set! (.-fromArray PersistentHashSet)\n  (fn [items ^boolean no-clone]\n    (let [len (alength items)]\n      (if (<= len (.-HASHMAP-THRESHOLD PersistentArrayMap))\n        (let [arr (if no-clone items (aclone items))]\n          (loop [i 0\n                 out (transient (.-EMPTY PersistentArrayMap))]\n            (if (< i len)\n              (recur (inc i) (-assoc! out (aget items i) nil))\n              (PersistentHashSet. nil (-persistent! out) nil))))\n       (loop [i 0\n              out (transient (.-EMPTY PersistentHashSet))]\n         (if (< i len)\n           (recur (inc i) (-conj! out (aget items i)))\n           (-persistent! out)))))))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7428 7442]},
 :full-name "cljs.core/PersistentHashSet.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashSetDOTfromArray.cljsdoc)
</pre>

