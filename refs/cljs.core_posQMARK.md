## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pos?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pos?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pos?)
</td>
</tr>
</table>

 <samp>
(__pos?__ n)<br>
</samp>

---

Returns true if `n` is greater than 0, false otherwise.

---


See Also:

[`cljs.core/neg?`](cljs.core_negQMARK.md)<br>
[`cljs.core/zero?`](cljs.core_zeroQMARK.md)<br>

---

Source docstring:

```
Returns true if num is greater than zero, else false
```

Source code:

```clj
(defn ^boolean pos?
  [n] (cljs.core/pos? n))
```

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1758-1760](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L1758-L1760)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric pos? [x]
  `(> ~x 0))
```

 <pre>
clojurescript @ r2127
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:447-448](https://github.com/clojure/clojurescript/blob/r2127/src/clj/cljs/core.clj#L447-L448)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pos?"]))
```

```clj
{:description "Returns true if `n` is greater than 0, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "pos?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/neg?" "cljs.core/zero?"],
 :full-name-encode "cljs.core_posQMARK",
 :source {:code "(defn ^boolean pos?\n  [n] (cljs.core/pos? n))",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1758 1760]},
 :extra-sources ({:code "(defmacro ^::ana/numeric pos? [x]\n  `(> ~x 0))",
                  :repo "clojurescript",
                  :tag "r2127",
                  :filename "src/clj/cljs/core.clj",
                  :lines [447 448]}),
 :full-name "cljs.core/pos?",
 :clj-symbol "clojure.core/pos?",
 :docstring "Returns true if num is greater than zero, else false"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_posQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_posQMARK.cljsdoc)
</pre>

