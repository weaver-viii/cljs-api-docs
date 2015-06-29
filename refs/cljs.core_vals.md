## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vals

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vals</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vals)
</td>
</tr>
</table>

 <samp>
(__vals__ hash-map)<br>
</samp>

---

Returns a sequence of the values in `hash-map`.

---


See Also:

[`cljs.core/keys`](cljs.core_keys.md)<br>

---

Source docstring:

```
Returns a sequence of the map's values.
```

Source code:

```clj
(defn vals
  [hash-map]
  (when-let [mseq (seq hash-map)]
    (ValSeq. mseq nil)))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7601-7605](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L7601-L7605)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vals"]))
```

```clj
{:description "Returns a sequence of the values in `hash-map`.",
 :ns "cljs.core",
 :name "vals",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core_vals",
 :source {:code "(defn vals\n  [hash-map]\n  (when-let [mseq (seq hash-map)]\n    (ValSeq. mseq nil)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7601 7605]},
 :full-name "cljs.core/vals",
 :clj-symbol "clojure.core/vals",
 :docstring "Returns a sequence of the map's values."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vals.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vals.cljsdoc)
</pre>

