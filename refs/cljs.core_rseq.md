## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rseq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rseq)
</td>
</tr>
</table>

 <samp>
(__rseq__ coll)<br>
</samp>

---

Returns a sequence of the items in `coll` in reverse order in constant time.

Returns nil if `coll` is empty.

`coll` must be a vector or a sorted-map.

---


See Also:

[`cljs.core/reverse`](cljs.core_reverse.md)<br>

---

Source docstring:

```
Returns, in constant time, a seq of the items in rev (which
can be a vector or sorted-map), in reverse order. If rev is empty returns nil
```

Source code:

```clj
(defn ^seq rseq
  [coll]
  (-rseq coll))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2660-2664](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L2660-L2664)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rseq"]))
```

```clj
{:description "Returns a sequence of the items in `coll` in reverse order in constant time.\n\nReturns nil if `coll` is empty.\n\n`coll` must be a vector or a sorted-map.",
 :return-type seq,
 :ns "cljs.core",
 :name "rseq",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/reverse"],
 :full-name-encode "cljs.core_rseq",
 :source {:code "(defn ^seq rseq\n  [coll]\n  (-rseq coll))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2660 2664]},
 :full-name "cljs.core/rseq",
 :clj-symbol "clojure.core/rseq",
 :docstring "Returns, in constant time, a seq of the items in rev (which\ncan be a vector or sorted-map), in reverse order. If rev is empty returns nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rseq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rseq.cljsdoc)
</pre>

