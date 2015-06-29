## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/StringIter

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__StringIter.__ s i)<br>
</samp>

---





Source code:

```clj
(deftype StringIter [s ^:mutable i]
  Object
  (hasNext [_] (< i (alength s)))
  (next [_]
    (let [ret (.charAt s i)]
      (set! i (inc i))
      ret))
  (remove [_] (js/Error. "Unsupported operation")))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3353-3360](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L3353-L3360)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/StringIter"]))
```

```clj
{:ns "cljs.core",
 :name "StringIter",
 :type "type",
 :signature ["[s i]"],
 :source {:code "(deftype StringIter [s ^:mutable i]\n  Object\n  (hasNext [_] (< i (alength s)))\n  (next [_]\n    (let [ret (.charAt s i)]\n      (set! i (inc i))\n      ret))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3353 3360]},
 :full-name "cljs.core/StringIter",
 :full-name-encode "cljs.core_StringIter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_StringIter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_StringIter.cljsdoc)
</pre>

