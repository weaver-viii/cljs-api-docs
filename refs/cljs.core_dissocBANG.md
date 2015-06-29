## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dissoc!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc!)
</td>
</tr>
</table>

 <samp>
(__dissoc!__ tcoll key)<br>
</samp>
 <samp>
(__dissoc!__ tcoll key & ks)<br>
</samp>

---




Source docstring:

```
Returns a transient map that doesn't contain a mapping for key(s).
```

Source code:

```clj
(defn dissoc!
  ([tcoll key]
    (-dissoc! tcoll key))
  ([tcoll key & ks]
    (let [ntcoll (-dissoc! tcoll key)]
      (if ks
        (recur ntcoll (first ks) (next ks))
        ntcoll))))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3237-3245](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L3237-L3245)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dissoc!"]))
```

```clj
{:ns "cljs.core",
 :name "dissoc!",
 :signature ["[tcoll key]" "[tcoll key & ks]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_dissocBANG",
 :source {:code "(defn dissoc!\n  ([tcoll key]\n    (-dissoc! tcoll key))\n  ([tcoll key & ks]\n    (let [ntcoll (-dissoc! tcoll key)]\n      (if ks\n        (recur ntcoll (first ks) (next ks))\n        ntcoll))))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3237 3245]},
 :full-name "cljs.core/dissoc!",
 :clj-symbol "clojure.core/dissoc!",
 :docstring "Returns a transient map that doesn't contain a mapping for key(s)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dissocBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dissocBANG.cljsdoc)
</pre>

