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
    (let [arr (if no-clone arr (aclone arr))]
      (if no-check
        (let [cnt (/ (alength arr) 2)]
          (PersistentArrayMap. nil cnt arr nil))
        (let [len (alength arr)]
          (loop [i 0
                 ret (transient (.-EMPTY PersistentArrayMap))]
            (if (< i len)
              (recur (+ i 2)
                (-assoc! ret (aget arr i) (aget arr (inc i))))
              (-persistent! ret))))))))
```

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5393-5405](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L5393-L5405)</ins>
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
 :source {:code "(set! (.-fromArray PersistentArrayMap)\n  (fn [arr ^boolean no-clone ^boolean no-check]\n    (let [arr (if no-clone arr (aclone arr))]\n      (if no-check\n        (let [cnt (/ (alength arr) 2)]\n          (PersistentArrayMap. nil cnt arr nil))\n        (let [len (alength arr)]\n          (loop [i 0\n                 ret (transient (.-EMPTY PersistentArrayMap))]\n            (if (< i len)\n              (recur (+ i 2)\n                (-assoc! ret (aget arr i) (aget arr (inc i))))\n              (-persistent! ret))))))))",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5393 5405]},
 :full-name "cljs.core/PersistentArrayMap.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc)
</pre>

