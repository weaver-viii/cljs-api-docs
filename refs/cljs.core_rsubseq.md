## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rsubseq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rsubseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rsubseq)
</td>
</tr>
</table>

 <samp>
(__rsubseq__ sc test key)<br>
</samp>
 <samp>
(__rsubseq__ sc start-test start-key end-test end-key)<br>
</samp>

---

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a reverse sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.

---


See Also:

[`cljs.core/subseq`](cljs.core_subseq.md)<br>

---

Source docstring:

```
sc must be a sorted collection, test(s) one of <, <=, > or
>=. Returns a reverse seq of those entries with keys ek for
which (test (.. sc comparator (compare ek key)) 0) is true
```

Source code:

```clj
(defn rsubseq
  ([sc test key]
     (let [include (mk-bound-fn sc test key)]
       (if (#{< <=} test)
         (when-let [[e :as s] (-sorted-seq-from sc key false)]
           (if (include e) s (next s)))
         (take-while include (-sorted-seq sc false)))))
  ([sc start-test start-key end-test end-key]
     (when-let [[e :as s] (-sorted-seq-from sc end-key false)]
       (take-while (mk-bound-fn sc start-test start-key)
                   (if ((mk-bound-fn sc end-test end-key) e) s (next s))))))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8087-8100](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L8087-L8100)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rsubseq"]))
```

```clj
{:description "`sc` must be a sorted collection.\n\n`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.\n\nReturns a reverse sequence of those entries with keys `ek` for which\n`(test (.. sc comparator (compare ek key)) 0)` is true.",
 :ns "cljs.core",
 :name "rsubseq",
 :signature ["[sc test key]"
             "[sc start-test start-key end-test end-key]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/subseq"],
 :full-name-encode "cljs.core_rsubseq",
 :source {:code "(defn rsubseq\n  ([sc test key]\n     (let [include (mk-bound-fn sc test key)]\n       (if (#{< <=} test)\n         (when-let [[e :as s] (-sorted-seq-from sc key false)]\n           (if (include e) s (next s)))\n         (take-while include (-sorted-seq sc false)))))\n  ([sc start-test start-key end-test end-key]\n     (when-let [[e :as s] (-sorted-seq-from sc end-key false)]\n       (take-while (mk-bound-fn sc start-test start-key)\n                   (if ((mk-bound-fn sc end-test end-key) e) s (next s))))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8087 8100]},
 :full-name "cljs.core/rsubseq",
 :clj-symbol "clojure.core/rsubseq",
 :docstring "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a reverse seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rsubseq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rsubseq.cljsdoc)
</pre>

