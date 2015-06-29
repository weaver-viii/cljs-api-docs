## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ES6Iterator

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ES6Iterator.__ s)<br>
</samp>

---





Source code:

```clj
(deftype ES6Iterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [x (first s)]
        (set! s (next s))
        #js {:value x :done false})
      #js {:value nil :done true})))
```

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:777-784](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L777-L784)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ES6Iterator"]))
```

```clj
{:ns "cljs.core",
 :name "ES6Iterator",
 :type "type",
 :signature ["[s]"],
 :source {:code "(deftype ES6Iterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [x (first s)]\n        (set! s (next s))\n        #js {:value x :done false})\n      #js {:value nil :done true})))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/core.cljs",
          :lines [777 784]},
 :full-name "cljs.core/ES6Iterator",
 :full-name-encode "cljs.core_ES6Iterator",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ES6Iterator.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ES6Iterator.cljsdoc)
</pre>

