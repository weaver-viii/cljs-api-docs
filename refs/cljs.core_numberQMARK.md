## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/number?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/number?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/number?)
</td>
</tr>
</table>

 <samp>
(__number?__ n)<br>
</samp>

---

Returns true if `n` is a number, false otherwise.

---


See Also:

[`cljs.core/integer?`](cljs.core_integerQMARK.md)<br>

---


Source code:

```clj
(defn ^boolean number? [n]
  (cljs.core/number? n))
```

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:93-94](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L93-L94)</ins>
</pre>


---

```clj
(defmacro number? [x]
  (bool-expr (core/list 'js* "typeof ~{} === 'number'" x)))
```

 <pre>
clojurescript @ r2657
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:330-331](https://github.com/clojure/clojurescript/blob/r2657/src/clj/cljs/core.clj#L330-L331)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/number?"]))
```

```clj
{:description "Returns true if `n` is a number, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "number?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/integer?"],
 :full-name-encode "cljs.core_numberQMARK",
 :source {:code "(defn ^boolean number? [n]\n  (cljs.core/number? n))",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [93 94]},
 :extra-sources ({:code "(defmacro number? [x]\n  (bool-expr (core/list 'js* \"typeof ~{} === 'number'\" x)))",
                  :repo "clojurescript",
                  :tag "r2657",
                  :filename "src/clj/cljs/core.clj",
                  :lines [330 331]}),
 :full-name "cljs.core/number?",
 :clj-symbol "clojure.core/number?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_numberQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_numberQMARK.cljsdoc)
</pre>

