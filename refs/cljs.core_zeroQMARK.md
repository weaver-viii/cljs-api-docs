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
(defn zero? [n]
  (cljs.core/zero? n))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:999-1000](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L999-L1000)</ins>
</pre>


---

```clj
(defmacro zero? [x]
  `(== ~x 0))
```

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:119-120](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/core.clj#L119-L120)</ins>
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
 :ns "cljs.core",
 :name "zero?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/pos?" "cljs.core/neg?"],
 :full-name-encode "cljs.core_zeroQMARK",
 :source {:code "(defn zero? [n]\n  (cljs.core/zero? n))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [999 1000]},
 :extra-sources ({:code "(defmacro zero? [x]\n  `(== ~x 0))",
                  :repo "clojurescript",
                  :tag "r993",
                  :filename "src/clj/cljs/core.clj",
                  :lines [119 120]}),
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_zeroQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_zeroQMARK.cljsdoc)
</pre>

