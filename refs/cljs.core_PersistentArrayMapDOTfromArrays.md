## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.fromArrays

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentArrayMap.fromArrays__ ks vs)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentArrayMap/fromArrays
      (fn [ks vs]
        (let [len (count ks)]
          (loop [i   0
                 out (transient cljs.core.PersistentArrayMap/EMPTY)]
            (if (< i len)
              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))
              (persistent! out))))))
```

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3975-3982](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L3975-L3982)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.fromArrays"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core_PersistentArrayMapDOTfromArrays",
 :source {:code "(set! cljs.core.PersistentArrayMap/fromArrays\n      (fn [ks vs]\n        (let [len (count ks)]\n          (loop [i   0\n                 out (transient cljs.core.PersistentArrayMap/EMPTY)]\n            (if (< i len)\n              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))\n              (persistent! out))))))",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3975 3982]},
 :full-name "cljs.core/PersistentArrayMap.fromArrays"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTfromArrays.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTfromArrays.cljsdoc)
</pre>

