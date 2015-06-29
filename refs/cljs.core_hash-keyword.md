## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-keyword

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__hash-keyword__ k)<br>
</samp>

---





Source code:

```clj
(defn hash-keyword [k]
  (int (+ (hash-symbol k) 0x9e3779b9)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2766-2767](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L2766-L2767)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-keyword"]))
```

```clj
{:ns "cljs.core",
 :name "hash-keyword",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn hash-keyword [k]\n  (int (+ (hash-symbol k) 0x9e3779b9)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2766 2767]},
 :full-name "cljs.core/hash-keyword",
 :full-name-encode "cljs.core_hash-keyword",
 :history [["+" "0.0-2261"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-keyword.cljsdoc)
</pre>

