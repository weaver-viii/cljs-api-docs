## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ES6IteratorSeq

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ES6IteratorSeq.__ value iter _rest)<br>
</samp>

---





Source code:

```clj
(deftype ES6IteratorSeq [value iter ^:mutable _rest]
  ISeqable
  (-seq [this] this)
  ISeq
  (-first [_] value)
  (-rest [_]
    (when (nil? _rest)
      (set! _rest (es6-iterator-seq iter)))
    _rest))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:795-803](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/core.cljs#L795-L803)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ES6IteratorSeq"]))
```

```clj
{:ns "cljs.core",
 :name "ES6IteratorSeq",
 :type "type",
 :signature ["[value iter _rest]"],
 :source {:code "(deftype ES6IteratorSeq [value iter ^:mutable _rest]\n  ISeqable\n  (-seq [this] this)\n  ISeq\n  (-first [_] value)\n  (-rest [_]\n    (when (nil? _rest)\n      (set! _rest (es6-iterator-seq iter)))\n    _rest))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/core.cljs",
          :lines [795 803]},
 :full-name "cljs.core/ES6IteratorSeq",
 :full-name-encode "cljs.core_ES6IteratorSeq",
 :history [["+" "0.0-2411"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ES6IteratorSeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ES6IteratorSeq.cljsdoc)
</pre>

