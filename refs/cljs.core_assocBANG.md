## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assoc!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc!)
</td>
</tr>
</table>

 <samp>
(__assoc!__ tcoll key val)<br>
</samp>
 <samp>
(__assoc!__ tcoll key val & kvs)<br>
</samp>

---

assoc(iate) on transient collection

When applied to a transient map, adds mapping of key(s) to val(s).

When applied to a transient vector, sets the val at index.  Note - index must
be <= (count vector).

Returns coll.

---

Example:

```clj
(def tcoll (transient! {}))
(assoc! tcoll :a 1)
(assoc! tcoll :b 2)

tcoll
;;=> #<[object Object]> 

(:a tcoll)
;;=> 1

(:b tcoll)
;;=> 2

(def a (persistent! tcoll))
;;=> {:a 1 :b 2}
```

---

See Also:

[`cljs.core/transient`](cljs.core_transient.md)<br>
[`cljs.core/persistent!`](cljs.core_persistentBANG.md)<br>

---

Source docstring:

```
When applied to a transient map, adds mapping of key(s) to
val(s). When applied to a transient vector, sets the val at index.
Note - index must be <= (count vector). Returns coll.
```

Source code:

```clj
(defn assoc!
  ([tcoll key val]
    (-assoc! tcoll key val))
  ([tcoll key val & kvs]
    (let [ntcoll (-assoc! tcoll key val)]
      (if kvs
        (recur ntcoll (first kvs) (second kvs) (nnext kvs))
        ntcoll))))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2865-2875](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L2865-L2875)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/assoc!"]))
```

```clj
{:description "assoc(iate) on transient collection\n\nWhen applied to a transient map, adds mapping of key(s) to val(s).\n\nWhen applied to a transient vector, sets the val at index.  Note - index must\nbe <= (count vector).\n\nReturns coll.",
 :ns "cljs.core",
 :name "assoc!",
 :signature ["[tcoll key val]" "[tcoll key val & kvs]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/transient" "cljs.core/persistent!"],
 :full-name-encode "cljs.core_assocBANG",
 :source {:code "(defn assoc!\n  ([tcoll key val]\n    (-assoc! tcoll key val))\n  ([tcoll key val & kvs]\n    (let [ntcoll (-assoc! tcoll key val)]\n      (if kvs\n        (recur ntcoll (first kvs) (second kvs) (nnext kvs))\n        ntcoll))))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2865 2875]},
 :examples [{:id "7d1e6b",
             :content "```clj\n(def tcoll (transient! {}))\n(assoc! tcoll :a 1)\n(assoc! tcoll :b 2)\n\ntcoll\n;;=> #<[object Object]> \n\n(:a tcoll)\n;;=> 1\n\n(:b tcoll)\n;;=> 2\n\n(def a (persistent! tcoll))\n;;=> {:a 1 :b 2}\n```"}],
 :full-name "cljs.core/assoc!",
 :clj-symbol "clojure.core/assoc!",
 :docstring "When applied to a transient map, adds mapping of key(s) to\nval(s). When applied to a transient vector, sets the val at index.\nNote - index must be <= (count vector). Returns coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_assocBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_assocBANG.cljsdoc)
</pre>

