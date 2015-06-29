## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reversible?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reversible?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reversible?)
</td>
</tr>
</table>

 <samp>
(__reversible?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `IReversible` protocol, false otherwise.

Vectors, sorted maps, and sorted sets implement `IReversible`.

---




Source code:

```clj
(defn ^boolean reversible? [coll]
  (satisfies? IReversible coll))
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2223-2224](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2223-L2224)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reversible?"]))
```

```clj
{:description "Returns true if `coll` implements the `IReversible` protocol, false otherwise.\n\nVectors, sorted maps, and sorted sets implement `IReversible`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "reversible?",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reversibleQMARK",
 :source {:code "(defn ^boolean reversible? [coll]\n  (satisfies? IReversible coll))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2223 2224]},
 :full-name "cljs.core/reversible?",
 :clj-symbol "clojure.core/reversible?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reversibleQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reversibleQMARK.cljsdoc)
</pre>

