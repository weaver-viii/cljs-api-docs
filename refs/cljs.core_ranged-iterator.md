## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ranged-iterator

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ranged-iterator__ v start end)<br>
</samp>

---





Source code:

```clj
(defn ranged-iterator [v start end]
  (let [i start]
    (RangedIterator. i (- i (js-mod i 32))
      (when (< start (count v))
        (unchecked-array-for v i))
      v start end)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4561-4566](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L4561-L4566)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ranged-iterator"]))
```

```clj
{:ns "cljs.core",
 :name "ranged-iterator",
 :type "function",
 :signature ["[v start end]"],
 :source {:code "(defn ranged-iterator [v start end]\n  (let [i start]\n    (RangedIterator. i (- i (js-mod i 32))\n      (when (< start (count v))\n        (unchecked-array-for v i))\n      v start end)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4561 4566]},
 :full-name "cljs.core/ranged-iterator",
 :full-name-encode "cljs.core_ranged-iterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ranged-iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ranged-iterator.cljsdoc)
</pre>

