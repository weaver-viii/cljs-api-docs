## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove)
</td>
</tr>
</table>

 <samp>
(__remove__ pred)<br>
</samp>
 <samp>
(__remove__ pred coll)<br>
</samp>

---

Returns a lazy sequence of the items in `coll` for which `(pred item)` returns
false.

`pred` must be free of side-effects.

Returns a transducer when no collection is provided.

---


See Also:

[`cljs.core/filter`](cljs.core_filter.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the items in coll for which
(pred item) returns false. pred must be free of side-effects.
Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn remove
  ([pred] (filter (complement pred)))
  ([pred coll]
     (filter (complement pred) coll)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4285-4291](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L4285-L4291)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove"]))
```

```clj
{:description "Returns a lazy sequence of the items in `coll` for which `(pred item)` returns\nfalse.\n\n`pred` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "remove",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/filter"],
 :full-name-encode "cljs.core_remove",
 :source {:code "(defn remove\n  ([pred] (filter (complement pred)))\n  ([pred coll]\n     (filter (complement pred) coll)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4285 4291]},
 :full-name "cljs.core/remove",
 :clj-symbol "clojure.core/remove",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns false. pred must be free of side-effects.\nReturns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_remove.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_remove.cljsdoc)
</pre>

