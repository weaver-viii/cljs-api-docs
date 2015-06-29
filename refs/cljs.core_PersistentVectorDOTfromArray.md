## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentVector.fromArray__ xs no-clone)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentVector/fromArray
  (fn [xs ^boolean no-clone]
    (let [l (alength xs)
          xs (if no-clone xs (aclone xs))]
      (if (< l 32)
        (PersistentVector. nil l 5 cljs.core.PersistentVector/EMPTY_NODE xs nil)
        (let [node (.slice xs 0 32)
              v (PersistentVector. nil 32 5 cljs.core.PersistentVector/EMPTY_NODE node nil)]
          (loop [i 32 out (-as-transient v)]
            (if (< i l)
              (recur (inc i) (conj! out (aget xs i)))
              (persistent! out))))))))
```

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3273-3284](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L3273-L3284)</ins>
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
 :signature ["[xs no-clone]"],
 :history [["+" "0.0-1006"]],
 :parent-type "PersistentVector",
 :type "function",
 :full-name-encode "cljs.core_PersistentVectorDOTfromArray",
 :source {:code "(set! cljs.core.PersistentVector/fromArray\n  (fn [xs ^boolean no-clone]\n    (let [l (alength xs)\n          xs (if no-clone xs (aclone xs))]\n      (if (< l 32)\n        (PersistentVector. nil l 5 cljs.core.PersistentVector/EMPTY_NODE xs nil)\n        (let [node (.slice xs 0 32)\n              v (PersistentVector. nil 32 5 cljs.core.PersistentVector/EMPTY_NODE node nil)]\n          (loop [i 32 out (-as-transient v)]\n            (if (< i l)\n              (recur (inc i) (conj! out (aget xs i)))\n              (persistent! out))))))))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3273 3284]},
 :full-name "cljs.core/PersistentVector.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentVectorDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentVectorDOTfromArray.cljsdoc)
</pre>

