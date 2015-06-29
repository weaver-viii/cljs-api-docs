## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentHashMap.fromArrays

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentHashMap.fromArrays__ ks vs)<br>
</samp>

---





Source code:

```clj
(set! (.-fromArrays PersistentHashMap)
  (fn [ks vs]
    (let [len (alength ks)]
      (loop [i 0 ^not-native out (transient (.-EMPTY PersistentHashMap))]
        (if (< i len)
          (recur (inc i) (-assoc! out (aget ks i) (aget vs i)))
          (persistent! out))))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:6667-6673](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L6667-L6673)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap.fromArrays"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentHashMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashMap",
 :type "function",
 :full-name-encode "cljs.core_PersistentHashMapDOTfromArrays",
 :source {:code "(set! (.-fromArrays PersistentHashMap)\n  (fn [ks vs]\n    (let [len (alength ks)]\n      (loop [i 0 ^not-native out (transient (.-EMPTY PersistentHashMap))]\n        (if (< i len)\n          (recur (inc i) (-assoc! out (aget ks i) (aget vs i)))\n          (persistent! out))))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6667 6673]},
 :full-name "cljs.core/PersistentHashMap.fromArrays"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashMapDOTfromArrays.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashMapDOTfromArrays.cljsdoc)
</pre>

