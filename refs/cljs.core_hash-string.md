## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-string

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__hash-string__ k)<br>
</samp>

---





Source code:

```clj
(defn hash-string [k]
  (when (> string-hash-cache-count 255)
    (set! string-hash-cache (js-obj))
    (set! string-hash-cache-count 0))
  (let [h (aget string-hash-cache k)]
    (if (number? h)
      h
      (add-to-string-hash-cache k))))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:744-751](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L744-L751)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-string"]))
```

```clj
{:ns "cljs.core",
 :name "hash-string",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn hash-string [k]\n  (when (> string-hash-cache-count 255)\n    (set! string-hash-cache (js-obj))\n    (set! string-hash-cache-count 0))\n  (let [h (aget string-hash-cache k)]\n    (if (number? h)\n      h\n      (add-to-string-hash-cache k))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [744 751]},
 :full-name "cljs.core/hash-string",
 :full-name-encode "cljs.core_hash-string",
 :history [["+" "0.0-2261"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-string.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-string.cljsdoc)
</pre>

