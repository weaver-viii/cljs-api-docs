## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/zero?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zero?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zero?)
</td>
</tr>
</table>

 <samp>
(__zero?__ n)<br>
</samp>

---

Returns true if `n` is 0, false otherwise.

---


See Also:

[`cljs.core/pos?`](cljs.core_posQMARK.md)<br>
[`cljs.core/neg?`](cljs.core_negQMARK.md)<br>

---

Source docstring:

```
Returns true if num is zero, else false
```

Source code:

```clj
(defn ^boolean zero?
  [n]
  (cljs.core/zero? n))
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2241-2244](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L2241-L2244)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric zero? [x]
  `(== ~x 0))
```

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:473-474](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/core.clj#L473-L474)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/zero?"]))
```

```clj
{:description "Returns true if `n` is 0, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "zero?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/pos?" "cljs.core/neg?"],
 :full-name-encode "cljs.core_zeroQMARK",
 :source {:code "(defn ^boolean zero?\n  [n]\n  (cljs.core/zero? n))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2241 2244]},
 :extra-sources ({:code "(defmacro ^::ana/numeric zero? [x]\n  `(== ~x 0))",
                  :repo "clojurescript",
                  :tag "r3058",
                  :filename "src/clj/cljs/core.clj",
                  :lines [473 474]}),
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?",
 :docstring "Returns true if num is zero, else false"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_zeroQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_zeroQMARK.cljsdoc)
</pre>

