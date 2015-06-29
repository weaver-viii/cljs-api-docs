## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/persistent-array-map-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__persistent-array-map-seq__ arr i _meta)<br>
</samp>

---





Source code:

```clj
(defn persistent-array-map-seq [arr i _meta]
  (when (<= i (- (alength arr) 2))
    (PersistentArrayMapSeq. arr i _meta)))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4445-4447](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L4445-L4447)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/persistent-array-map-seq"]))
```

```clj
{:ns "cljs.core",
 :name "persistent-array-map-seq",
 :type "function",
 :signature ["[arr i _meta]"],
 :source {:code "(defn persistent-array-map-seq [arr i _meta]\n  (when (<= i (- (alength arr) 2))\n    (PersistentArrayMapSeq. arr i _meta)))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4445 4447]},
 :full-name "cljs.core/persistent-array-map-seq",
 :full-name-encode "cljs.core_persistent-array-map-seq",
 :history [["+" "0.0-1820"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_persistent-array-map-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_persistent-array-map-seq.cljsdoc)
</pre>

