## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rem

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rem</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rem)
</td>
</tr>
</table>

 <samp>
(__rem__ n d)<br>
</samp>

---

Returns the remainder of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).

---


See Also:

[`cljs.core/quot`](cljs.core_quot.md)<br>
[`cljs.core/mod`](cljs.core_mod.md)<br>

---

Source docstring:

```
remainder of dividing numerator by denominator.
```

Source code:

```clj
(defn rem
  [n d]
  (let [q (quot n d)]
    (- n (* d q))))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2343-2347](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L2343-L2347)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rem"]))
```

```clj
{:description "Returns the remainder of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).",
 :ns "cljs.core",
 :name "rem",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/quot" "cljs.core/mod"],
 :full-name-encode "cljs.core_rem",
 :source {:code "(defn rem\n  [n d]\n  (let [q (quot n d)]\n    (- n (* d q))))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2343 2347]},
 :full-name "cljs.core/rem",
 :clj-symbol "clojure.core/rem",
 :docstring "remainder of dividing numerator by denominator."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rem.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rem.cljsdoc)
</pre>

