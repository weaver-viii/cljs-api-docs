## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/filterv

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filterv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filterv)
</td>
</tr>
</table>

 <samp>
(__filterv__ pred coll)<br>
</samp>

---

Returns a vector of the items in `coll` for which `(pred item)` returns true.

`pred` must be free of side-effects.

---



Source docstring:

```
Returns a vector of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
```

Source code:

```clj
(defn filterv
  [pred coll]
  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))
              (transient [])
              coll)
      persistent!))
```

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2980-2987](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2980-L2987)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/filterv"]))
```

```clj
{:description "Returns a vector of the items in `coll` for which `(pred item)` returns true.\n\n`pred` must be free of side-effects.",
 :ns "cljs.core",
 :name "filterv",
 :signature ["[pred coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_filterv",
 :source {:code "(defn filterv\n  [pred coll]\n  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))\n              (transient [])\n              coll)\n      persistent!))",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2980 2987]},
 :full-name "cljs.core/filterv",
 :clj-symbol "clojure.core/filterv",
 :docstring "Returns a vector of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_filterv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_filterv.cljsdoc)
</pre>

