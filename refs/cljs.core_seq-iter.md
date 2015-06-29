## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seq-iter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__seq-iter__ coll)<br>
</samp>

---





Source code:

```clj
(defn seq-iter [coll]
  (SeqIter. INIT coll))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3412-3413](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L3412-L3413)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq-iter"]))
```

```clj
{:ns "cljs.core",
 :name "seq-iter",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn seq-iter [coll]\n  (SeqIter. INIT coll))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3412 3413]},
 :full-name "cljs.core/seq-iter",
 :full-name-encode "cljs.core_seq-iter",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_seq-iter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_seq-iter.cljsdoc)
</pre>

