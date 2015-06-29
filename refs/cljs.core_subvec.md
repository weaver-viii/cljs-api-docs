## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subvec

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subvec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subvec)
</td>
</tr>
</table>

 <samp>
(__subvec__ v start)<br>
</samp>
 <samp>
(__subvec__ v start end)<br>
</samp>

---

Returns a persistent vector of the items in `v` from `start` inclusive to `end`
exclusive.

If `end` is not supplied, defaults to `(count v)`.

This operation is O(1) and very fast, as the resulting vector shares structure
with the original and no trimming is done.

---


See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/vector?`](cljs.core_vectorQMARK.md)<br>

---

Source docstring:

```
Returns a persistent vector of the items in vector from
start (inclusive) to end (exclusive).  If end is not supplied,
defaults to (count vector). This operation is O(1) and very fast, as
the resulting vector shares structure with the original and no
trimming is done.
```

Source code:

```clj
(defn subvec
  ([v start]
     (subvec v start (count v)))
  ([v start end]
     (Subvec. nil v start end nil)))
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2753-2762](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L2753-L2762)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/subvec"]))
```

```clj
{:description "Returns a persistent vector of the items in `v` from `start` inclusive to `end`\nexclusive.\n\nIf `end` is not supplied, defaults to `(count v)`.\n\nThis operation is O(1) and very fast, as the resulting vector shares structure\nwith the original and no trimming is done.",
 :ns "cljs.core",
 :name "subvec",
 :signature ["[v start]" "[v start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/vector?"],
 :full-name-encode "cljs.core_subvec",
 :source {:code "(defn subvec\n  ([v start]\n     (subvec v start (count v)))\n  ([v start end]\n     (Subvec. nil v start end nil)))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2753 2762]},
 :full-name "cljs.core/subvec",
 :clj-symbol "clojure.core/subvec",
 :docstring "Returns a persistent vector of the items in vector from\nstart (inclusive) to end (exclusive).  If end is not supplied,\ndefaults to (count vector). This operation is O(1) and very fast, as\nthe resulting vector shares structure with the original and no\ntrimming is done."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_subvec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_subvec.cljsdoc)
</pre>

