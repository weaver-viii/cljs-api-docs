## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/integer?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/integer?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/integer?)
</td>
</tr>
</table>

 <samp>
(__integer?__ n)<br>
</samp>

---

Returns true if `n` is an integer, false otherwise.

---


See Also:

[`cljs.core/int`](cljs.core_int.md)<br>

---

Source docstring:

```
Returns true if n is an integer.
```

Source code:

```clj
(defn ^boolean integer?
  [n]
  (and (number? n)
       (not ^boolean (js/isNaN n))
       (not (identical? n js/Infinity))
       (== (js/parseFloat n) (js/parseInt n 10))))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1867-1873](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L1867-L1873)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/integer?"]))
```

```clj
{:description "Returns true if `n` is an integer, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "integer?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/int"],
 :full-name-encode "cljs.core_integerQMARK",
 :source {:code "(defn ^boolean integer?\n  [n]\n  (and (number? n)\n       (not ^boolean (js/isNaN n))\n       (not (identical? n js/Infinity))\n       (== (js/parseFloat n) (js/parseInt n 10))))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1867 1873]},
 :full-name "cljs.core/integer?",
 :clj-symbol "clojure.core/integer?",
 :docstring "Returns true if n is an integer."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_integerQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_integerQMARK.cljsdoc)
</pre>

