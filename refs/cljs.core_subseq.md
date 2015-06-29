## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subseq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subseq)
</td>
</tr>
</table>

 <samp>
(__subseq__ sc test key)<br>
</samp>
 <samp>
(__subseq__ sc start-test start-key end-test end-key)<br>
</samp>

---

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.

---


See Also:

[`cljs.core/rsubseq`](cljs.core_rsubseq.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>
[`cljs.core/sorted-set`](cljs.core_sorted-set.md)<br>
[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>
[`cljs.core/sorted-set-by`](cljs.core_sorted-set-by.md)<br>

---

Source docstring:

```
sc must be a sorted collection, test(s) one of <, <=, > or
>=. Returns a seq of those entries with keys ek for
which (test (.. sc comparator (compare ek key)) 0) is true
```

Source code:

```clj
(defn subseq
  ([sc test key]
     (let [include (mk-bound-fn sc test key)]
       (if (#{> >=} test)
         (when-let [[e :as s] (-sorted-seq-from sc key true)]
           (if (include e) s (next s)))
         (take-while include (-sorted-seq sc true)))))
  ([sc start-test start-key end-test end-key]
     (when-let [[e :as s] (-sorted-seq-from sc start-key true)]
       (take-while (mk-bound-fn sc end-test end-key)
                   (if ((mk-bound-fn sc start-test start-key) e) s (next s))))))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5852-5865](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5852-L5865)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/subseq"]))
```

```clj
{:description "`sc` must be a sorted collection.\n\n`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.\n\nReturns a sequence of those entries with keys `ek` for which\n`(test (.. sc comparator (compare ek key)) 0)` is true.",
 :ns "cljs.core",
 :name "subseq",
 :signature ["[sc test key]"
             "[sc start-test start-key end-test end-key]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/rsubseq"
           "cljs.core/sorted-map"
           "cljs.core/sorted-set"
           "cljs.core/sorted-map-by"
           "cljs.core/sorted-set-by"],
 :full-name-encode "cljs.core_subseq",
 :source {:code "(defn subseq\n  ([sc test key]\n     (let [include (mk-bound-fn sc test key)]\n       (if (#{> >=} test)\n         (when-let [[e :as s] (-sorted-seq-from sc key true)]\n           (if (include e) s (next s)))\n         (take-while include (-sorted-seq sc true)))))\n  ([sc start-test start-key end-test end-key]\n     (when-let [[e :as s] (-sorted-seq-from sc start-key true)]\n       (take-while (mk-bound-fn sc end-test end-key)\n                   (if ((mk-bound-fn sc start-test start-key) e) s (next s))))))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5852 5865]},
 :full-name "cljs.core/subseq",
 :clj-symbol "clojure.core/subseq",
 :docstring "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_subseq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_subseq.cljsdoc)
</pre>

