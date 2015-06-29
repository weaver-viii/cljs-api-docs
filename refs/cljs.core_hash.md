## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash)
</td>
</tr>
</table>

 <samp>
(__hash__ o)<br>
</samp>

---





Source code:

```clj
(defn hash [o]
  (cond
    (implements? IHash o)
    (-hash ^not-native o)

    (number? o)
    (js-mod (Math/floor o) 2147483647)

    (true? o) 1

    (false? o) 0

    (string? o)
    (m3-hash-int (hash-string o))

    (nil? o) 0

    :else
    (-hash o)))
```

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:512-530](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L512-L530)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash"]))
```

```clj
{:ns "cljs.core",
 :name "hash",
 :signature ["[o]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_hash",
 :source {:code "(defn hash [o]\n  (cond\n    (implements? IHash o)\n    (-hash ^not-native o)\n\n    (number? o)\n    (js-mod (Math/floor o) 2147483647)\n\n    (true? o) 1\n\n    (false? o) 0\n\n    (string? o)\n    (m3-hash-int (hash-string o))\n\n    (nil? o) 0\n\n    :else\n    (-hash o)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [512 530]},
 :full-name "cljs.core/hash",
 :clj-symbol "clojure.core/hash"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash.cljsdoc)
</pre>

