## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/EntriesIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2268"><img valign="middle" alt="[+] 0.0-2268" src="https://img.shields.io/badge/+-0.0--2268-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__EntriesIterator.__ s)<br>
</samp>

---





Source code:

```clj
(deftype EntriesIterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [[k v] (first s)]
        (set! s (next s))
        #js {:value #js [k v] :done false})
      #js {:value nil :done true})))
```

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4370-4377](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L4370-L4377)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/EntriesIterator"]))
```

```clj
{:ns "cljs.core",
 :name "EntriesIterator",
 :type "type",
 :signature ["[s]"],
 :source {:code "(deftype EntriesIterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [[k v] (first s)]\n        (set! s (next s))\n        #js {:value #js [k v] :done false})\n      #js {:value nil :done true})))",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4370 4377]},
 :full-name "cljs.core/EntriesIterator",
 :full-name-encode "cljs.core_EntriesIterator",
 :history [["+" "0.0-2268"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_EntriesIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_EntriesIterator.cljsdoc)
</pre>

