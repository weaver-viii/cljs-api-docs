## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentVector.fromArray__ xs)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentVector/fromArray
      (fn [xs]
        (loop [xs (seq xs) out (transient cljs.core.PersistentVector/EMPTY)]
          (if xs
            (recur (next xs) (conj! out (first xs)))
            (persistent! out)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2676-2681](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2676-L2681)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.fromArray"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentVector.fromArray",
 :signature ["[xs]"],
 :history [["+" "0.0-1006"]],
 :parent-type "PersistentVector",
 :type "function",
 :full-name-encode "cljs.core_PersistentVectorDOTfromArray",
 :source {:code "(set! cljs.core.PersistentVector/fromArray\n      (fn [xs]\n        (loop [xs (seq xs) out (transient cljs.core.PersistentVector/EMPTY)]\n          (if xs\n            (recur (next xs) (conj! out (first xs)))\n            (persistent! out)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2676 2681]},
 :full-name "cljs.core/PersistentVector.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTfromArray.cljsdoc)
</pre>
