## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-mod

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-mod__ n d)<br>
</samp>

---

Returns the modulus of dividing numerator `n` by denominator `d`, with JavaScript's
original behavior for negative numbers.

Returns `NaN` when `d` is 0 (divide by 0 error).

Equivalent to `x % y` in JavaScript.

---

Example:

```clj
(js-mod -5 3)
;;=> -2

(js-mod 5 3)
;;=> 2

(js-mod 5 0)
;;=> NaN
```

---

See Also:

[`cljs.core/mod`](cljs.core_mod.md)<br>

---

Source docstring:

```
Modulus of num and div with original javascript behavior. i.e. bug for negative numbers
```

Source code:

```clj
(defn js-mod
  [n d]
  (cljs.core/js-mod n d))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2065-2068](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L2065-L2068)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric js-mod [num div]
  (core/list 'js* "(~{} % ~{})" num div))
```

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:487-488](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/core.clj#L487-L488)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-mod"]))
```

```clj
{:description "Returns the modulus of dividing numerator `n` by denominator `d`, with JavaScript's\noriginal behavior for negative numbers.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).\n\nEquivalent to `x % y` in JavaScript.",
 :ns "cljs.core",
 :name "js-mod",
 :signature ["[n d]"],
 :history [["+" "0.0-1552"]],
 :type "function",
 :related ["cljs.core/mod"],
 :full-name-encode "cljs.core_js-mod",
 :source {:code "(defn js-mod\n  [n d]\n  (cljs.core/js-mod n d))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2065 2068]},
 :extra-sources ({:code "(defmacro ^::ana/numeric js-mod [num div]\n  (core/list 'js* \"(~{} % ~{})\" num div))",
                  :repo "clojurescript",
                  :tag "r2814",
                  :filename "src/clj/cljs/core.clj",
                  :lines [487 488]}),
 :examples [{:id "75fa6d",
             :content "```clj\n(js-mod -5 3)\n;;=> -2\n\n(js-mod 5 3)\n;;=> 2\n\n(js-mod 5 0)\n;;=> NaN\n```"}],
 :full-name "cljs.core/js-mod",
 :docstring "Modulus of num and div with original javascript behavior. i.e. bug for negative numbers"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-mod.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-mod.cljsdoc)
</pre>

