## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/split-at

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-at</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-at)
</td>
</tr>
</table>

 <samp>
(__split-at__ n coll)<br>
</samp>

---

Returns a vector of `[(take n coll) (drop n coll)]`.

---


See Also:

[`cljs.core/split-with`](cljs.core_split-with.md)<br>
[`clojure.string/split`](clojure.string_split.md)<br>

---

Source docstring:

```
Returns a vector of [(take n coll) (drop n coll)]
```

Source code:

```clj
(defn split-at
  [n coll]
  [(take n coll) (drop n coll)])
```

 <pre>
clojurescript @ r2014
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2863-2866](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L2863-L2866)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/split-at"]))
```

```clj
{:description "Returns a vector of `[(take n coll) (drop n coll)]`.",
 :ns "cljs.core",
 :name "split-at",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/split-with" "clojure.string/split"],
 :full-name-encode "cljs.core_split-at",
 :source {:code "(defn split-at\n  [n coll]\n  [(take n coll) (drop n coll)])",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2863 2866]},
 :full-name "cljs.core/split-at",
 :clj-symbol "clojure.core/split-at",
 :docstring "Returns a vector of [(take n coll) (drop n coll)]"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_split-at.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_split-at.cljsdoc)
</pre>

