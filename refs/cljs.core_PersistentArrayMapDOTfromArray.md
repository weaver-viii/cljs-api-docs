## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentArrayMap.fromArray__ arr no-clone no-check)<br>
</samp>

---





Source code:

```clj
(set! (.-fromArray PersistentArrayMap)
  (fn [arr ^boolean no-clone ^boolean no-check]
    (as-> (if no-clone arr (aclone arr)) arr
      (if no-check
        arr
        (let [ret (array)]
          (loop [i 0]
            (when (< i (alength arr))
              (let [k (aget arr i)
                    v (aget arr (inc i))
                    idx (array-index-of ret k)]
                (when (== idx -1)
                  (.push ret k)
                  (.push ret v)))
              (recur (+ i 2))))
          ret))
      (let [cnt (/ (alength arr) 2)]
        (PersistentArrayMap. nil cnt arr nil)))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5809-5826](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L5809-L5826)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.fromArray"]))
```

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.fromArray",
 :signature ["[arr no-clone no-check]"],
 :history [["+" "0.0-1798"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core_PersistentArrayMapDOTfromArray",
 :source {:code "(set! (.-fromArray PersistentArrayMap)\n  (fn [arr ^boolean no-clone ^boolean no-check]\n    (as-> (if no-clone arr (aclone arr)) arr\n      (if no-check\n        arr\n        (let [ret (array)]\n          (loop [i 0]\n            (when (< i (alength arr))\n              (let [k (aget arr i)\n                    v (aget arr (inc i))\n                    idx (array-index-of ret k)]\n                (when (== idx -1)\n                  (.push ret k)\n                  (.push ret v)))\n              (recur (+ i 2))))\n          ret))\n      (let [cnt (/ (alength arr) 2)]\n        (PersistentArrayMap. nil cnt arr nil)))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5809 5826]},
 :full-name "cljs.core/PersistentArrayMap.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc)
</pre>

