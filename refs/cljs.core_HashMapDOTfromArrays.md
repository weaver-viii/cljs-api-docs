## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/HashMap.fromArrays

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__HashMap.fromArrays__ ks vs)<br>
</samp>

---





Source code:

```clj
(set! cljs.core.HashMap/fromArrays (fn [ks vs]
  (let [len (alength ks)]
    (loop [i 0, out cljs.core.HashMap/EMPTY]
      (if (< i len)
        (recur (inc i) (assoc out (aget ks i) (aget vs i)))
        out)))))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3780-3785](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L3780-L3785)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashMap.fromArrays"]))
```

```clj
{:ns "cljs.core",
 :name "HashMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-927"]],
 :parent-type "HashMap",
 :type "function",
 :full-name-encode "cljs.core_HashMapDOTfromArrays",
 :source {:code "(set! cljs.core.HashMap/fromArrays (fn [ks vs]\n  (let [len (alength ks)]\n    (loop [i 0, out cljs.core.HashMap/EMPTY]\n      (if (< i len)\n        (recur (inc i) (assoc out (aget ks i) (aget vs i)))\n        out)))))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3780 3785]},
 :full-name "cljs.core/HashMap.fromArrays"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_HashMapDOTfromArrays.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_HashMapDOTfromArrays.cljsdoc)
</pre>

