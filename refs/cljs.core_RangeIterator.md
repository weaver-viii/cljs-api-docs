## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/RangeIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__RangeIterator.__ i end step)<br>
</samp>

---





Source code:

```clj
(deftype RangeIterator [^:mutable i end step]
  Object
  (hasNext [_]
    (if (pos? step)
      (< i end)
      (> i end)))
  (next [_]
    (let [ret i]
      (set! i (+ i step))
      ret)))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7691-7700](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L7691-L7700)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RangeIterator"]))
```

```clj
{:ns "cljs.core",
 :name "RangeIterator",
 :type "type",
 :signature ["[i end step]"],
 :source {:code "(deftype RangeIterator [^:mutable i end step]\n  Object\n  (hasNext [_]\n    (if (pos? step)\n      (< i end)\n      (> i end)))\n  (next [_]\n    (let [ret i]\n      (set! i (+ i step))\n      ret)))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7691 7700]},
 :full-name "cljs.core/RangeIterator",
 :full-name-encode "cljs.core_RangeIterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_RangeIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_RangeIterator.cljsdoc)
</pre>

