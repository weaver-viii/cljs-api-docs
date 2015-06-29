## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-string\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__hash-string\*__ s)<br>
</samp>

---





Source code:

```clj
(defn hash-string* [s]
  (if-not (nil? s)
    (let [len (alength s)]
      (if (pos? len)
        (loop [i 0 hash 0]
          (if (< i len)
            (recur (inc i) (+ (imul 31 hash) (.charCodeAt s i)))
            hash))
        0))
    0))
```

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:535-544](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L535-L544)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-string*"]))
```

```clj
{:ns "cljs.core",
 :name "hash-string*",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn hash-string* [s]\n  (if-not (nil? s)\n    (let [len (alength s)]\n      (if (pos? len)\n        (loop [i 0 hash 0]\n          (if (< i len)\n            (recur (inc i) (+ (imul 31 hash) (.charCodeAt s i)))\n            hash))\n        0))\n    0))",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [535 544]},
 :full-name "cljs.core/hash-string*",
 :full-name-encode "cljs.core_hash-stringSTAR",
 :history [["+" "0.0-2261"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-stringSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-stringSTAR.cljsdoc)
</pre>

