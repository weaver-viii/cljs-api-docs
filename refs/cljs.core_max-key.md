## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/max-key

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/max-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/max-key)
</td>
</tr>
</table>

 <samp>
(__max-key__ k x)<br>
</samp>
 <samp>
(__max-key__ k x y)<br>
</samp>
 <samp>
(__max-key__ k x y & more)<br>
</samp>

---

Returns the `x` for which `(k x)` is greatest.

`(k x)` should return a number.

---


See Also:

[`cljs.core/max`](cljs.core_max.md)<br>
[`cljs.core/min-key`](cljs.core_min-key.md)<br>

---

Source docstring:

```
Returns the x for which (k x), a number, is greatest.
```

Source code:

```clj
(defn max-key
  ([k x] x)
  ([k x y] (if (> (k x) (k y)) x y))
  ([k x y & more]
   (reduce #(max-key k %1 %2) (max-key k x y) more)))
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7785-7790](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L7785-L7790)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/max-key"]))
```

```clj
{:description "Returns the `x` for which `(k x)` is greatest.\n\n`(k x)` should return a number.",
 :ns "cljs.core",
 :name "max-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/max" "cljs.core/min-key"],
 :full-name-encode "cljs.core_max-key",
 :source {:code "(defn max-key\n  ([k x] x)\n  ([k x y] (if (> (k x) (k y)) x y))\n  ([k x y & more]\n   (reduce #(max-key k %1 %2) (max-key k x y) more)))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7785 7790]},
 :full-name "cljs.core/max-key",
 :clj-symbol "clojure.core/max-key",
 :docstring "Returns the x for which (k x), a number, is greatest."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_max-key.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_max-key.cljsdoc)
</pre>

