## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/Iterator~~

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2268"><img valign="middle" alt="[+] 0.0-2268" src="https://img.shields.io/badge/+-0.0--2268-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[×] 0.0-2371" src="https://img.shields.io/badge/×-0.0--2371-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__Iterator.__ s)<br>
</samp>

---





Source code:

```clj
(deftype Iterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [x (first s)]
        (set! s (next s))
        #js {:value x :done false})
      #js {:value nil :done true})))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4861-4868](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L4861-L4868)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Iterator"]))
```

```clj
{:ns "cljs.core",
 :name "Iterator",
 :signature ["[s]"],
 :history [["+" "0.0-2268"] ["-" "0.0-2371"]],
 :type "type",
 :full-name-encode "cljs.core_Iterator",
 :source {:code "(deftype Iterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [x (first s)]\n        (set! s (next s))\n        #js {:value x :done false})\n      #js {:value nil :done true})))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4861 4868]},
 :full-name "cljs.core/Iterator",
 :removed {:in "0.0-2371", :last-seen "0.0-2356"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Iterator.cljsdoc)
</pre>

