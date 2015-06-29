## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IndexedSeqIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__IndexedSeqIterator.__ arr i)<br>
</samp>

---





Source code:

```clj
(deftype IndexedSeqIterator [arr ^:mutable i]
  Object
  (hasNext [_]
    (< i (alength arr)))
  (next [_]
    (let [ret (aget arr i)]
      (set! i (inc i))
      ret)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1239-1246](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L1239-L1246)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IndexedSeqIterator"]))
```

```clj
{:ns "cljs.core",
 :name "IndexedSeqIterator",
 :type "type",
 :signature ["[arr i]"],
 :source {:code "(deftype IndexedSeqIterator [arr ^:mutable i]\n  Object\n  (hasNext [_]\n    (< i (alength arr)))\n  (next [_]\n    (let [ret (aget arr i)]\n      (set! i (inc i))\n      ret)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1239 1246]},
 :full-name "cljs.core/IndexedSeqIterator",
 :full-name-encode "cljs.core_IndexedSeqIterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IndexedSeqIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IndexedSeqIterator.cljsdoc)
</pre>

