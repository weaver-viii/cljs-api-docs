## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prim-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__prim-seq__ prim)<br>
</samp>
 <samp>
(__prim-seq__ prim i)<br>
</samp>

---





Source code:

```clj
(defn prim-seq
  ([prim]
     (prim-seq prim 0))
  ([prim i]
     (when (< i (alength prim))
       (IndexedSeq. prim i))))
```

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:716-721](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L716-L721)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prim-seq"]))
```

```clj
{:ns "cljs.core",
 :name "prim-seq",
 :type "function",
 :signature ["[prim]" "[prim i]"],
 :source {:code "(defn prim-seq\n  ([prim]\n     (prim-seq prim 0))\n  ([prim i]\n     (when (< i (alength prim))\n       (IndexedSeq. prim i))))",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/core.cljs",
          :lines [716 721]},
 :full-name "cljs.core/prim-seq",
 :full-name-encode "cljs.core_prim-seq",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prim-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prim-seq.cljsdoc)
</pre>

