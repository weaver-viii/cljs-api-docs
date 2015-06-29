## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentArrayMap.fromArray

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentArrayMap.fromArray__ arr no-clone)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.PersistentArrayMap/fromArray
  (fn [arr ^boolean no-clone]
    (let [arr (if no-clone arr (aclone arr))] 
      (let [cnt (/ (alength arr) 2)]
        (PersistentArrayMap. nil cnt arr nil)))))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3992-3996](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L3992-L3996)</ins>
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
 :signature ["[arr no-clone]"],
 :history [["+" "0.0-1798"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core_PersistentArrayMapDOTfromArray",
 :source {:code "(set! cljs.core.PersistentArrayMap/fromArray\n  (fn [arr ^boolean no-clone]\n    (let [arr (if no-clone arr (aclone arr))] \n      (let [cnt (/ (alength arr) 2)]\n        (PersistentArrayMap. nil cnt arr nil)))))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3992 3996]},
 :full-name "cljs.core/PersistentArrayMap.fromArray"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_PersistentArrayMapDOTfromArray.cljsdoc)
</pre>

