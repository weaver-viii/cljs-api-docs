## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayIter

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ArrayIter</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArrayIter.java)
</td>
</tr>
</table>

 <samp>
(__ArrayIter.__ arr i)<br>
</samp>

---





Source code:

```clj
(deftype ArrayIter [arr ^:mutable i]
  Object
  (hasNext [_] (< i (alength arr)))
  (next [_]
    (let [ret (aget arr i)]
      (set! i (inc i))
      ret))
  (remove [_] (js/Error. "Unsupported operation")))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3365-3372](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L3365-L3372)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayIter"]))
```

```clj
{:ns "cljs.core",
 :name "ArrayIter",
 :signature ["[arr i]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core_ArrayIter",
 :source {:code "(deftype ArrayIter [arr ^:mutable i]\n  Object\n  (hasNext [_] (< i (alength arr)))\n  (next [_]\n    (let [ret (aget arr i)]\n      (set! i (inc i))\n      ret))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3365 3372]},
 :full-name "cljs.core/ArrayIter",
 :clj-symbol "clojure.lang/ArrayIter"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ArrayIter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ArrayIter.cljsdoc)
</pre>

