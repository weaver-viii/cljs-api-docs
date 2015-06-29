## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/into-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into-array)
</td>
</tr>
</table>

 <samp>
(__into-array__ aseq)<br>
</samp>

---

Returns a new JavaScript array from the elements of `aseq`.

---


See Also:

[`cljs.core/to-array`](cljs.core_to-array.md)<br>
[`cljs.core/make-array`](cljs.core_make-array.md)<br>

---


Source code:

```clj
(defn into-array
  ([aseq]
     (into-array nil aseq))
  ([type aseq]
     (reduce (fn [a x] (.push a x) a) (array) aseq)))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:185-189](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L185-L189)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/into-array"]))
```

```clj
{:description "Returns a new JavaScript array from the elements of `aseq`.",
 :ns "cljs.core",
 :name "into-array",
 :signature ["[aseq]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/to-array" "cljs.core/make-array"],
 :full-name-encode "cljs.core_into-array",
 :source {:code "(defn into-array\n  ([aseq]\n     (into-array nil aseq))\n  ([type aseq]\n     (reduce (fn [a x] (.push a x) a) (array) aseq)))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [185 189]},
 :full-name "cljs.core/into-array",
 :clj-symbol "clojure.core/into-array"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_into-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_into-array.cljsdoc)
</pre>

