## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/val

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/val</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/val)
</td>
</tr>
</table>

 <samp>
(__val__ map-entry)<br>
</samp>

---

Returns the value in the map entry.

---


See Also:

[`cljs.core/vals`](cljs.core_vals.md)<br>

---

Source docstring:

```
Returns the value in the map entry.
```

Source code:

```clj
(defn val
  [map-entry]
  (-val map-entry))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7619-7622](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L7619-L7622)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/val"]))
```

```clj
{:description "Returns the value in the map entry.",
 :ns "cljs.core",
 :name "val",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/vals"],
 :full-name-encode "cljs.core_val",
 :source {:code "(defn val\n  [map-entry]\n  (-val map-entry))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7619 7622]},
 :full-name "cljs.core/val",
 :clj-symbol "clojure.core/val",
 :docstring "Returns the value in the map entry."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_val.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_val.cljsdoc)
</pre>

