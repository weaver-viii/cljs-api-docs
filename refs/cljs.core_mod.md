## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mod

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mod)
</td>
</tr>
</table>

 <samp>
(__mod__ n d)<br>
</samp>

---

Returns the modulus of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).

Truncates toward negative infinity.

---

Example:

```clj
(mod -5 3)
;;=> 1

(mod 5 3)
;;=> 2

(mod 5 0)
;;=> NaN
```

---

See Also:

[`cljs.core/rem`](cljs.core_rem.md)<br>

---

Source docstring:

```
Modulus of num and div. Truncates toward negative infinity.
```

Source code:

```clj
(defn mod
  [n d]
  (cljs.core/mod n d))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1134-1137](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1134-L1137)</ins>
</pre>


---

```clj
(defmacro mod [num div]
  (list 'js* "(~{} % ~{})" num div))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:188-189](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L188-L189)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mod"]))
```

```clj
{:description "Returns the modulus of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).\n\nTruncates toward negative infinity.",
 :ns "cljs.core",
 :name "mod",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rem"],
 :full-name-encode "cljs.core_mod",
 :source {:code "(defn mod\n  [n d]\n  (cljs.core/mod n d))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1134 1137]},
 :extra-sources ({:code "(defmacro mod [num div]\n  (list 'js* \"(~{} % ~{})\" num div))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [188 189]}),
 :examples [{:id "8165e8",
             :content "```clj\n(mod -5 3)\n;;=> 1\n\n(mod 5 3)\n;;=> 2\n\n(mod 5 0)\n;;=> NaN\n```"}],
 :full-name "cljs.core/mod",
 :clj-symbol "clojure.core/mod",
 :docstring "Modulus of num and div. Truncates toward negative infinity."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_mod.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_mod.cljsdoc)
</pre>
