## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-combine

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__hash-combine__ seed hash)<br>
</samp>

---





Source code:

```clj
(defn hash-combine [seed hash]
  ; a la boost
  (bit-xor seed
    (+ hash 0x9e3779b9
      (bit-shift-left seed 6)
      (bit-shift-right seed 2))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:779-784](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L779-L784)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-combine"]))
```

```clj
{:ns "cljs.core",
 :name "hash-combine",
 :type "function",
 :signature ["[seed hash]"],
 :source {:code "(defn hash-combine [seed hash]\n  ; a la boost\n  (bit-xor seed\n    (+ hash 0x9e3779b9\n      (bit-shift-left seed 6)\n      (bit-shift-right seed 2))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [779 784]},
 :full-name "cljs.core/hash-combine",
 :full-name-encode "cljs.core_hash-combine",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_hash-combine.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_hash-combine.cljsdoc)
</pre>

