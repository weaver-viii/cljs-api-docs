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
(__SeqIter.__ _seq _next)<br>
</samp>

---





Source code:

```clj
(deftype SeqIter [^:mutable _seq ^:mutable _next]
  Object
  (hasNext [_]
    (if (identical? _seq INIT)
      (do
        (set! _seq START)
        (set! _next (seq _next)))
      (if (identical? _seq _next)
        (set! _next (next _seq))))
    (not (nil? _next)))
  (next [this]
    (if-not (.hasNext this)
      (throw (js/Error. "No such element"))
      (do
        (set! _seq _next)
        (first _next))))
  (remove [_] (js/Error. "Unsupported operation")))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3036-3052](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L3036-L3052)</ins>
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
 :signature ["[_seq _next]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core_SeqIter",
 :source {:code "(deftype SeqIter [^:mutable _seq ^:mutable _next]\n  Object\n  (hasNext [_]\n    (if (identical? _seq INIT)\n      (do\n        (set! _seq START)\n        (set! _next (seq _next)))\n      (if (identical? _seq _next)\n        (set! _next (next _seq))))\n    (not (nil? _next)))\n  (next [this]\n    (if-not (.hasNext this)\n      (throw (js/Error. \"No such element\"))\n      (do\n        (set! _seq _next)\n        (first _next))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3036 3052]},
 :full-name "cljs.core/SeqIter",
 :clj-symbol "clojure.lang/SeqIterator"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_SeqIter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_SeqIter.cljsdoc)
</pre>

