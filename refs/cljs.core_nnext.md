## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nnext

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nnext)
</td>
</tr>
</table>

 <samp>
(__nnext__ coll)<br>
</samp>

---

Same as `(next (next coll))`.

---


See Also:

[`cljs.core/next`](cljs.core_next.md)<br>

---

Source docstring:

```
Same as (next (next x))
```

Source code:

```clj
(defn nnext
  [coll]
  (next (next coll)))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1167-1170](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L1167-L1170)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nnext"]))
```

```clj
{:description "Same as `(next (next coll))`.",
 :ns "cljs.core",
 :name "nnext",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/next"],
 :full-name-encode "cljs.core_nnext",
 :source {:code "(defn nnext\n  [coll]\n  (next (next coll)))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1167 1170]},
 :full-name "cljs.core/nnext",
 :clj-symbol "clojure.core/nnext",
 :docstring "Same as (next (next x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nnext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nnext.cljsdoc)
</pre>

