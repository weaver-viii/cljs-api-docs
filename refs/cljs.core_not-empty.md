## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-empty

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-empty)
</td>
</tr>
</table>

 <samp>
(__not-empty__ coll)<br>
</samp>

---

Returns nil if `coll` is empty, else returns `coll`.

---


See Also:

[`cljs.core/empty`](cljs.core_empty.md)<br>

---

Source docstring:

```
If coll is empty, returns nil, else coll
```

Source code:

```clj
(defn not-empty
  [coll] (when (seq coll) coll))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3058-3060](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L3058-L3060)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not-empty"]))
```

```clj
{:description "Returns nil if `coll` is empty, else returns `coll`.",
 :ns "cljs.core",
 :name "not-empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/empty"],
 :full-name-encode "cljs.core_not-empty",
 :source {:code "(defn not-empty\n  [coll] (when (seq coll) coll))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3058 3060]},
 :full-name "cljs.core/not-empty",
 :clj-symbol "clojure.core/not-empty",
 :docstring "If coll is empty, returns nil, else coll"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_not-empty.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_not-empty.cljsdoc)
</pre>

