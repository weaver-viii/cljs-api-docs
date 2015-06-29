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


Source code:

```clj
(defn ^boolean zero? [n]
  (cljs.core/zero? n))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1237-1238](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1237-L1238)</ins>
</pre>


---

```clj
(defmacro zero? [x]
  `(== ~x 0))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:169-170](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L169-L170)</ins>
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
 :source {:code "(defn ^boolean zero? [n]\n  (cljs.core/zero? n))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1237 1238]},
 :extra-sources ({:code "(defmacro zero? [x]\n  `(== ~x 0))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [169 170]}),
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_zeroQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_zeroQMARK.cljsdoc)
</pre>

