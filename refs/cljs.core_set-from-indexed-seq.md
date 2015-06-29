## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set-from-indexed-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1877"><img valign="middle" alt="[+] 0.0-1877" src="https://img.shields.io/badge/+-0.0--1877-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-from-indexed-seq__ iseq)<br>
</samp>

---





Source code:

```clj
(defn set-from-indexed-seq [iseq]
  (let [arr (.-arr iseq)
        ret (areduce arr i ^not-native res (-as-transient #{})
              (-conj! res (aget arr i)))]
    (-persistent! ^not-native ret)))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6175-6179](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L6175-L6179)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set-from-indexed-seq"]))
```

```clj
{:ns "cljs.core",
 :name "set-from-indexed-seq",
 :type "function",
 :signature ["[iseq]"],
 :source {:code "(defn set-from-indexed-seq [iseq]\n  (let [arr (.-arr iseq)\n        ret (areduce arr i ^not-native res (-as-transient #{})\n              (-conj! res (aget arr i)))]\n    (-persistent! ^not-native ret)))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6175 6179]},
 :full-name "cljs.core/set-from-indexed-seq",
 :full-name-encode "cljs.core_set-from-indexed-seq",
 :history [["+" "0.0-1877"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_set-from-indexed-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_set-from-indexed-seq.cljsdoc)
</pre>

