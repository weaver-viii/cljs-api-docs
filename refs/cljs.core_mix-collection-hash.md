## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mix-collection-hash

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mix-collection-hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mix-collection-hash)
</td>
</tr>
</table>

 <samp>
(__mix-collection-hash__ hash-basis count)<br>
</samp>

---




Source docstring:

```
Mix final collection hash for ordered or unordered collections.
hash-basis is the combined collection hash, count is the number
of elements included in the basis. Note this is the hash code
consistent with =, different from .hashCode.
See http://clojure.org/data_structures#hash for full algorithms.
```

Source code:

```clj
(defn ^number mix-collection-hash
  [hash-basis count]
  (let [h1 m3-seed
        k1 (m3-mix-K1 hash-basis)
        h1 (m3-mix-H1 h1 k1)]
    (m3-fmix h1 count)))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1041-1051](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L1041-L1051)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mix-collection-hash"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "mix-collection-hash",
 :signature ["[hash-basis count]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_mix-collection-hash",
 :source {:code "(defn ^number mix-collection-hash\n  [hash-basis count]\n  (let [h1 m3-seed\n        k1 (m3-mix-K1 hash-basis)\n        h1 (m3-mix-H1 h1 k1)]\n    (m3-fmix h1 count)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1041 1051]},
 :full-name "cljs.core/mix-collection-hash",
 :clj-symbol "clojure.core/mix-collection-hash",
 :docstring "Mix final collection hash for ordered or unordered collections.\nhash-basis is the combined collection hash, count is the number\nof elements included in the basis. Note this is the hash code\nconsistent with =, different from .hashCode.\nSee http://clojure.org/data_structures#hash for full algorithms."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_mix-collection-hash.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_mix-collection-hash.cljsdoc)
</pre>

