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
(set! cljs.core.PersistentHashMap/fromArrays
      (fn [ks vs]
        (let [len (.-length ks)]
          (loop [i 0 out (transient cljs.core.PersistentHashMap/EMPTY)]
            (if (< i len)
              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))
              (persistent! out))))))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4670-4676](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L4670-L4676)</ins>
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
 :source {:code "(set! cljs.core.PersistentHashMap/fromArrays\n      (fn [ks vs]\n        (let [len (.-length ks)]\n          (loop [i 0 out (transient cljs.core.PersistentHashMap/EMPTY)]\n            (if (< i len)\n              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))\n              (persistent! out))))))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4670 4676]},
 :full-name "cljs.core/PersistentHashMap.fromArrays"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentHashMapDOTfromArrays.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentHashMapDOTfromArrays.cljsdoc)
</pre>

