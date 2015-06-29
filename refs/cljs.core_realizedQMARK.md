## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/realized?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/realized?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/realized?)
</td>
</tr>
</table>

 <samp>
(__realized?__ x)<br>
</samp>

---

Returns true if a value has been produced for a lazy sequence.

---


See Also:

[`cljs.core/lazy-seq`](cljs.core_lazy-seq.md)<br>

---

Source docstring:

```
Returns true if a value has been produced for a promise, delay, future or lazy sequence.
```

Source code:

```clj
(defn ^boolean realized?
  [d]
  (-realized? d))
```

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7043-7046](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L7043-L7046)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/realized?"]))
```

```clj
{:description "Returns true if a value has been produced for a lazy sequence.",
 :return-type boolean,
 :ns "cljs.core",
 :name "realized?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/lazy-seq"],
 :full-name-encode "cljs.core_realizedQMARK",
 :source {:code "(defn ^boolean realized?\n  [d]\n  (-realized? d))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7043 7046]},
 :full-name "cljs.core/realized?",
 :clj-symbol "clojure.core/realized?",
 :docstring "Returns true if a value has been produced for a promise, delay, future or lazy sequence."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_realizedQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_realizedQMARK.cljsdoc)
</pre>

