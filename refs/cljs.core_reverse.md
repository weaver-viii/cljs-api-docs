## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reverse

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reverse)
</td>
</tr>
</table>

 <samp>
(__reverse__ coll)<br>
</samp>

---

Returns a sequence of the items in `coll` in reverse order. Not lazy.

---


See Also:

[`cljs.core/rseq`](cljs.core_rseq.md)<br>

---

Source docstring:

```
Returns a seq of the items in coll in reverse order. Not lazy.
```

Source code:

```clj
(defn reverse
  [coll]
  (if (reversible? coll)
    (rseq coll)
    (reduce conj () coll)))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1659-1664](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1659-L1664)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reverse"]))
```

```clj
{:description "Returns a sequence of the items in `coll` in reverse order. Not lazy.",
 :ns "cljs.core",
 :name "reverse",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rseq"],
 :full-name-encode "cljs.core_reverse",
 :source {:code "(defn reverse\n  [coll]\n  (if (reversible? coll)\n    (rseq coll)\n    (reduce conj () coll)))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1659 1664]},
 :full-name "cljs.core/reverse",
 :clj-symbol "clojure.core/reverse",
 :docstring "Returns a seq of the items in coll in reverse order. Not lazy."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reverse.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reverse.cljsdoc)
</pre>

