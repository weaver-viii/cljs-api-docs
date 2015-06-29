## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/SetEntriesIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2268"><img valign="middle" alt="[+] 0.0-2268" src="https://img.shields.io/badge/+-0.0--2268-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__SetEntriesIterator.__ s)<br>
</samp>

---





Source code:

```clj
(deftype SetEntriesIterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [x (first s)]
        (set! s (next s))
        #js {:value #js [x x] :done false})
      #js {:value nil :done true})))
```

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4859-4866](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/core.cljs#L4859-L4866)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/SetEntriesIterator"]))
```

```clj
{:ns "cljs.core",
 :name "SetEntriesIterator",
 :type "type",
 :signature ["[s]"],
 :source {:code "(deftype SetEntriesIterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [x (first s)]\n        (set! s (next s))\n        #js {:value #js [x x] :done false})\n      #js {:value nil :done true})))",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4859 4866]},
 :full-name "cljs.core/SetEntriesIterator",
 :full-name-encode "cljs.core_SetEntriesIterator",
 :history [["+" "0.0-2268"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_SetEntriesIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_SetEntriesIterator.cljsdoc)
</pre>

