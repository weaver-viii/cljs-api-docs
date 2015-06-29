## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-map-by

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map-by)
</td>
</tr>
</table>

 <samp>
(__sorted-map-by__ comparator & keyvals)<br>
</samp>

---

Returns a new sorted map with supplied mappings, using the supplied comparator
function.

`keyvals` must be an even number of forms.

---


See Also:

[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>
[`cljs.core/subseq`](cljs.core_subseq.md)<br>
[`cljs.core/rsubseq`](cljs.core_rsubseq.md)<br>
[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>

---

Source docstring:

```
keyval => key val
Returns a new sorted map with supplied mappings, using the supplied comparator.
```

Source code:

```clj
(defn sorted-map-by
  ([comparator & keyvals]
     (loop [in (seq keyvals)
            out (PersistentTreeMap. (fn->comparator comparator) nil 0 nil 0)]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7466-7474](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L7466-L7474)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-map-by"]))
```

```clj
{:description "Returns a new sorted map with supplied mappings, using the supplied comparator\nfunction.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "sorted-map-by",
 :signature ["[comparator & keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-map"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-set-by"],
 :full-name-encode "cljs.core_sorted-map-by",
 :source {:code "(defn sorted-map-by\n  ([comparator & keyvals]\n     (loop [in (seq keyvals)\n            out (PersistentTreeMap. (fn->comparator comparator) nil 0 nil 0)]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7466 7474]},
 :full-name "cljs.core/sorted-map-by",
 :clj-symbol "clojure.core/sorted-map-by",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings, using the supplied comparator."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_sorted-map-by.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_sorted-map-by.cljsdoc)
</pre>

