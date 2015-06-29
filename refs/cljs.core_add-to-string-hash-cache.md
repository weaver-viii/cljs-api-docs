## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/add-to-string-hash-cache

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__add-to-string-hash-cache__ k)<br>
</samp>

---





Source code:

```clj
(defn add-to-string-hash-cache [k]
  (let [h (hash-string* k)]
    (aset string-hash-cache k h)
    (set! string-hash-cache-count (inc string-hash-cache-count))
    h))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:738-742](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L738-L742)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/add-to-string-hash-cache"]))
```

```clj
{:ns "cljs.core",
 :name "add-to-string-hash-cache",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn add-to-string-hash-cache [k]\n  (let [h (hash-string* k)]\n    (aset string-hash-cache k h)\n    (set! string-hash-cache-count (inc string-hash-cache-count))\n    h))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [738 742]},
 :full-name "cljs.core/add-to-string-hash-cache",
 :full-name-encode "cljs.core_add-to-string-hash-cache",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_add-to-string-hash-cache.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_add-to-string-hash-cache.cljsdoc)
</pre>

