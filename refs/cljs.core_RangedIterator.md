## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/RangedIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__RangedIterator.__ i base arr v start end)<br>
</samp>

---





Source code:

```clj
(deftype RangedIterator [^:mutable i ^:mutable base ^:mutable arr v start end]
  Object
  (hasNext [this]
    (< i end))
  (next [this]
    (when (== (- i base) 32)
      (set! arr (unchecked-array-for v i))
      (set! base (+ base 32)))
    (let [ret (aget arr (bit-and i 0x01f))]
      (set! i (inc i))
      ret)))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4254-4264](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L4254-L4264)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RangedIterator"]))
```

```clj
{:ns "cljs.core",
 :name "RangedIterator",
 :type "type",
 :signature ["[i base arr v start end]"],
 :source {:code "(deftype RangedIterator [^:mutable i ^:mutable base ^:mutable arr v start end]\n  Object\n  (hasNext [this]\n    (< i end))\n  (next [this]\n    (when (== (- i base) 32)\n      (set! arr (unchecked-array-for v i))\n      (set! base (+ base 32)))\n    (let [ret (aget arr (bit-and i 0x01f))]\n      (set! i (inc i))\n      ret)))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4254 4264]},
 :full-name "cljs.core/RangedIterator",
 :full-name-encode "cljs.core_RangedIterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_RangedIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_RangedIterator.cljsdoc)
</pre>

