## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/SeqIter

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/SeqIterator</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/SeqIterator.java)
</td>
</tr>
</table>

 <samp>
(__SeqIter.__ seq)<br>
</samp>

---





Source code:

```clj
(deftype SeqIter [^:mutable seq]
  Object
  (hasNext [_] (not (nil? seq)))
  (next [_]
    (let [first (first seq)]
      (set! seq (next seq))
      first))
  (remove [_] (js/Error. "Unsupported operation")))
```

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2901-2908](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L2901-L2908)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/SeqIter"]))
```

```clj
{:ns "cljs.core",
 :name "SeqIter",
 :signature ["[seq]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core_SeqIter",
 :source {:code "(deftype SeqIter [^:mutable seq]\n  Object\n  (hasNext [_] (not (nil? seq)))\n  (next [_]\n    (let [first (first seq)]\n      (set! seq (next seq))\n      first))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2901 2908]},
 :full-name "cljs.core/SeqIter",
 :clj-symbol "clojure.lang/SeqIterator"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_SeqIter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_SeqIter.cljsdoc)
</pre>

