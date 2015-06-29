## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/make-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-array)
</td>
</tr>
</table>

 <samp>
(__make-array__ size)<br>
</samp>

---

Creates an empty JavaScript array of size `size`.

---


See Also:

[`cljs.core/aclone`](cljs.core_aclone.md)<br>
[`cljs.core/array`](cljs.core_array.md)<br>

---


Source code:

```clj
(defn make-array
  ([size]
     (js/Array. size))
  ([type size]
     (make-array size)))
```

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:131-135](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L131-L135)</ins>
</pre>


---

```clj
(defmacro make-array
  [size]
  `(js/Array. ~size))
```

 <pre>
clojurescript @ r1853
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1185-1187](https://github.com/clojure/clojurescript/blob/r1853/src/clj/cljs/core.clj#L1185-L1187)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/make-array"]))
```

```clj
{:description "Creates an empty JavaScript array of size `size`.",
 :ns "cljs.core",
 :name "make-array",
 :signature ["[size]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/aclone" "cljs.core/array"],
 :full-name-encode "cljs.core_make-array",
 :source {:code "(defn make-array\n  ([size]\n     (js/Array. size))\n  ([type size]\n     (make-array size)))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [131 135]},
 :extra-sources ({:code "(defmacro make-array\n  [size]\n  `(js/Array. ~size))",
                  :repo "clojurescript",
                  :tag "r1853",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1185 1187]}),
 :full-name "cljs.core/make-array",
 :clj-symbol "clojure.core/make-array"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_make-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_make-array.cljsdoc)
</pre>

