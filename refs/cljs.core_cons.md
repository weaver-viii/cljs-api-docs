## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cons

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cons</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cons)
</td>
</tr>
</table>

 <samp>
(__cons__ x coll)<br>
</samp>

---

Returns a new sequence where `x` is the first element and `coll` is the rest.

---


See Also:

[`cljs.core/conj`](cljs.core_conj.md)<br>

---

Source docstring:

```
Returns a new seq where x is the first element and seq is the rest.
```

Source code:

```clj
(defn cons
  [x coll]
  (if (or (nil? coll)
          (implements? ISeq coll))
    (Cons. nil x coll nil)
    (Cons. nil x (seq coll) nil)))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2408-2414](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L2408-L2414)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cons"]))
```

```clj
{:description "Returns a new sequence where `x` is the first element and `coll` is the rest.",
 :ns "cljs.core",
 :name "cons",
 :signature ["[x coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj"],
 :full-name-encode "cljs.core_cons",
 :source {:code "(defn cons\n  [x coll]\n  (if (or (nil? coll)\n          (implements? ISeq coll))\n    (Cons. nil x coll nil)\n    (Cons. nil x (seq coll) nil)))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2408 2414]},
 :full-name "cljs.core/cons",
 :clj-symbol "clojure.core/cons",
 :docstring "Returns a new seq where x is the first element and seq is the rest."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cons.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cons.cljsdoc)
</pre>

