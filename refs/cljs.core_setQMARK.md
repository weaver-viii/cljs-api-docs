## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set?)
</td>
</tr>
</table>

 <samp>
(__set?__ x)<br>
</samp>

---

Returns true if `x` is a set, false otherwise.

---


See Also:

[`cljs.core/set`](cljs.core_set.md)<br>

---

Source docstring:

```
Returns true if x satisfies ISet
```

Source code:

```clj
(defn ^boolean set?
  [x]
  (if (nil? x)
    false
    (satisfies? ISet x)))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1511-1516](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L1511-L1516)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set?"]))
```

```clj
{:description "Returns true if `x` is a set, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "set?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set"],
 :full-name-encode "cljs.core_setQMARK",
 :source {:code "(defn ^boolean set?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ISet x)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1511 1516]},
 :full-name "cljs.core/set?",
 :clj-symbol "clojure.core/set?",
 :docstring "Returns true if x satisfies ISet"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_setQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_setQMARK.cljsdoc)
</pre>

