## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/check-string-hash-cache

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__check-string-hash-cache__ k)<br>
</samp>

---





Source code:

```clj
(defn check-string-hash-cache [k]
  (when (> string-hash-cache-count 255)
    (set! string-hash-cache (js-obj))
    (set! string-hash-cache-count 0))
  (let [h (aget string-hash-cache k)]
    (if-not (nil? h)
      h
      (add-to-string-hash-cache k))))
```

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:889-896](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L889-L896)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/check-string-hash-cache"]))
```

```clj
{:ns "cljs.core",
 :name "check-string-hash-cache",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn check-string-hash-cache [k]\n  (when (> string-hash-cache-count 255)\n    (set! string-hash-cache (js-obj))\n    (set! string-hash-cache-count 0))\n  (let [h (aget string-hash-cache k)]\n    (if-not (nil? h)\n      h\n      (add-to-string-hash-cache k))))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [889 896]},
 :full-name "cljs.core/check-string-hash-cache",
 :full-name-encode "cljs.core_check-string-hash-cache",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_check-string-hash-cache.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_check-string-hash-cache.cljsdoc)
</pre>

