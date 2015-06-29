## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/superset?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/superset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/superset?)
</td>
</tr>
</table>

 <samp>
(__superset?__ a b)<br>
</samp>

---

Returns true if `a` is a superset of `b`, false otherwise.

In other words, returns true if `a` contains all the elements of `b`.

---


See Also:

[`cljs.core/set`](cljs.core_set.md)<br>
[`cljs.core/set?`](cljs.core_setQMARK.md)<br>
[`clojure.set/subset?`](clojure.set_subsetQMARK.md)<br>

---

Source docstring:

```
Is set1 a superset of set2?
```

Source code:

```clj
(defn superset? 
  [set1 set2]
  (and (>= (count set1) (count set2))
       (every? #(contains? set1 %) set2)))
```

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:138-142](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/clojure/set.cljs#L138-L142)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/superset?"]))
```

```clj
{:description "Returns true if `a` is a superset of `b`, false otherwise.\n\nIn other words, returns true if `a` contains all the elements of `b`.",
 :ns "clojure.set",
 :name "superset?",
 :signature ["[a b]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/set?" "clojure.set/subset?"],
 :full-name-encode "clojure.set_supersetQMARK",
 :source {:code "(defn superset? \n  [set1 set2]\n  (and (>= (count set1) (count set2))\n       (every? #(contains? set1 %) set2)))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/clojure/set.cljs",
          :lines [138 142]},
 :full-name "clojure.set/superset?",
 :clj-symbol "clojure.set/superset?",
 :docstring "Is set1 a superset of set2?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_supersetQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_supersetQMARK.cljsdoc)
</pre>

