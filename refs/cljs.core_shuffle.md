## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/shuffle

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/shuffle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/shuffle)
</td>
</tr>
</table>

 <samp>
(__shuffle__ coll)<br>
</samp>

---

Returns a random permutation of `coll`.

---



Source docstring:

```
Return a random permutation of coll
```

Source code:

```clj
(defn shuffle
  [coll]
  (let [a (to-array coll)]
    (garray/shuffle a)
    (vec a)))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1365-1370](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L1365-L1370)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/shuffle"]))
```

```clj
{:description "Returns a random permutation of `coll`.",
 :ns "cljs.core",
 :name "shuffle",
 :signature ["[coll]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core_shuffle",
 :source {:code "(defn shuffle\n  [coll]\n  (let [a (to-array coll)]\n    (garray/shuffle a)\n    (vec a)))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1365 1370]},
 :full-name "cljs.core/shuffle",
 :clj-symbol "clojure.core/shuffle",
 :docstring "Return a random permutation of coll"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_shuffle.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_shuffle.cljsdoc)
</pre>

