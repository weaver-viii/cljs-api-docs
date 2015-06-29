## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/quot

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quot</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quot)
</td>
</tr>
</table>

 <samp>
(__quot__ n d)<br>
</samp>

---

Returns the quotient of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).

---


See Also:

[`cljs.core/rem`](cljs.core_rem.md)<br>
[`cljs.core/mod`](cljs.core_mod.md)<br>

---

Source docstring:

```
quot[ient] of dividing numerator by denominator.
```

Source code:

```clj
(defn quot
  [n d]
  (let [rem (js-mod n d)]
    (fix (/ (- n rem) d))))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2071-2075](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L2071-L2075)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/quot"]))
```

```clj
{:description "Returns the quotient of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).",
 :ns "cljs.core",
 :name "quot",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rem" "cljs.core/mod"],
 :full-name-encode "cljs.core_quot",
 :source {:code "(defn quot\n  [n d]\n  (let [rem (js-mod n d)]\n    (fix (/ (- n rem) d))))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2071 2075]},
 :full-name "cljs.core/quot",
 :clj-symbol "clojure.core/quot",
 :docstring "quot[ient] of dividing numerator by denominator."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_quot.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_quot.cljsdoc)
</pre>

