## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/disj!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/disj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/disj!)
</td>
</tr>
</table>

 <samp>
(__disj!__ tcoll val)<br>
</samp>
 <samp>
(__disj!__ tcoll val & vals)<br>
</samp>

---




Source docstring:

```
disj[oin]. Returns a transient set of the same (hashed/sorted) type, that
does not contain key(s).
```

Source code:

```clj
(defn disj!
  ([tcoll val]
    (-disjoin! tcoll val))
  ([tcoll val & vals]
    (let [ntcoll (-disjoin! tcoll val)]
      (if vals
        (recur ntcoll (first vals) (next vals))
        ntcoll))))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2968-2977](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L2968-L2977)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/disj!"]))
```

```clj
{:ns "cljs.core",
 :name "disj!",
 :signature ["[tcoll val]" "[tcoll val & vals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_disjBANG",
 :source {:code "(defn disj!\n  ([tcoll val]\n    (-disjoin! tcoll val))\n  ([tcoll val & vals]\n    (let [ntcoll (-disjoin! tcoll val)]\n      (if vals\n        (recur ntcoll (first vals) (next vals))\n        ntcoll))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2968 2977]},
 :full-name "cljs.core/disj!",
 :clj-symbol "clojure.core/disj!",
 :docstring "disj[oin]. Returns a transient set of the same (hashed/sorted) type, that\ndoes not contain key(s)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_disjBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_disjBANG.cljsdoc)
</pre>

