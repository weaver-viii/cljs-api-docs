## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map)
</td>
</tr>
</table>

 <samp>
(__sorted-map__ & keyvals)<br>
</samp>

---

Returns a new sorted map with supplied mappings.

`keyvals` must be an even number of forms.

---


See Also:

[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>
[`cljs.core/subseq`](cljs.core_subseq.md)<br>
[`cljs.core/rsubseq`](cljs.core_rsubseq.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/array-map`](cljs.core_array-map.md)<br>
[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>

---

Source docstring:

```
keyval => key val
Returns a new sorted map with supplied mappings.
```

Source code:

```clj
(defn sorted-map
  ([& keyvals]
     (loop [in (seq keyvals) out (.-EMPTY PersistentTreeMap)]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7154-7161](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L7154-L7161)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-map"]))
```

```clj
{:description "Returns a new sorted map with supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "sorted-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-map-by"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-set"
           "cljs.core/array-map"
           "cljs.core/hash-map"],
 :full-name-encode "cljs.core_sorted-map",
 :source {:code "(defn sorted-map\n  ([& keyvals]\n     (loop [in (seq keyvals) out (.-EMPTY PersistentTreeMap)]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7154 7161]},
 :full-name "cljs.core/sorted-map",
 :clj-symbol "clojure.core/sorted-map",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sorted-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sorted-map.cljsdoc)
</pre>

