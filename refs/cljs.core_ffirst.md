## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ffirst

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ffirst</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ffirst)
</td>
</tr>
</table>

 <samp>
(__ffirst__ coll)<br>
</samp>

---

Same as `(first (first coll))`.

---

Example:

```clj
(ffirst [[1 2] [3 4] [5 6]])
;;=> 1
```

---

See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/fnext`](cljs.core_fnext.md)<br>
[`cljs.core/nfirst`](cljs.core_nfirst.md)<br>

---

Source docstring:

```
Same as (first (first x))
```

Source code:

```clj
(defn ffirst
  [coll]
  (first (first coll)))
```

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:711-714](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L711-L714)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ffirst"]))
```

```clj
{:description "Same as `(first (first coll))`.",
 :ns "cljs.core",
 :name "ffirst",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first" "cljs.core/fnext" "cljs.core/nfirst"],
 :full-name-encode "cljs.core_ffirst",
 :source {:code "(defn ffirst\n  [coll]\n  (first (first coll)))",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [711 714]},
 :examples [{:id "575ba2",
             :content "```clj\n(ffirst [[1 2] [3 4] [5 6]])\n;;=> 1\n```"}],
 :full-name "cljs.core/ffirst",
 :clj-symbol "clojure.core/ffirst",
 :docstring "Same as (first (first x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ffirst.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ffirst.cljsdoc)
</pre>

