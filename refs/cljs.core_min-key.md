## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/min-key

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min-key)
</td>
</tr>
</table>

 <samp>
(__min-key__ k x)<br>
</samp>
 <samp>
(__min-key__ k x y)<br>
</samp>
 <samp>
(__min-key__ k x y & more)<br>
</samp>

---

Returns the `x` for which `(k x)` is least.

`(k x)` should return a number.

---


See Also:

[`cljs.core/min`](cljs.core_min.md)<br>
[`cljs.core/max-key`](cljs.core_max-key.md)<br>

---

Source docstring:

```
Returns the x for which (k x), a number, is least.
```

Source code:

```clj
(defn min-key
  ([k x] x)
  ([k x y] (if (< (k x) (k y)) x y))
  ([k x y & more]
     (reduce #(min-key k %1 %2) (min-key k x y) more)))
```

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5916-5921](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5916-L5921)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/min-key"]))
```

```clj
{:description "Returns the `x` for which `(k x)` is least.\n\n`(k x)` should return a number.",
 :ns "cljs.core",
 :name "min-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/min" "cljs.core/max-key"],
 :full-name-encode "cljs.core_min-key",
 :source {:code "(defn min-key\n  ([k x] x)\n  ([k x y] (if (< (k x) (k y)) x y))\n  ([k x y & more]\n     (reduce #(min-key k %1 %2) (min-key k x y) more)))",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5916 5921]},
 :full-name "cljs.core/min-key",
 :clj-symbol "clojure.core/min-key",
 :docstring "Returns the x for which (k x), a number, is least."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_min-key.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_min-key.cljsdoc)
</pre>

