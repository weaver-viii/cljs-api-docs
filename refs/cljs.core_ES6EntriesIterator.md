## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ES6EntriesIterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ES6EntriesIterator.__ s)<br>
</samp>

---





Source code:

```clj
(deftype ES6EntriesIterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [[k v] (first s)]
        (set! s (next s))
        #js {:value #js [k v] :done false})
      #js {:value nil :done true})))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5460-5467](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L5460-L5467)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ES6EntriesIterator"]))
```

```clj
{:ns "cljs.core",
 :name "ES6EntriesIterator",
 :type "type",
 :signature ["[s]"],
 :source {:code "(deftype ES6EntriesIterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [[k v] (first s)]\n        (set! s (next s))\n        #js {:value #js [k v] :done false})\n      #js {:value nil :done true})))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5460 5467]},
 :full-name "cljs.core/ES6EntriesIterator",
 :full-name-encode "cljs.core_ES6EntriesIterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ES6EntriesIterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ES6EntriesIterator.cljsdoc)
</pre>

