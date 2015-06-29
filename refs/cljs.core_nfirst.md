## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nfirst

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nfirst</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nfirst)
</td>
</tr>
</table>

 <samp>
(__nfirst__ coll)<br>
</samp>

---

Same as `(next (first coll))`.

---

Example:

```clj
(nfirst [[1 2 3] [4 5]])
;;=> (2 3)

(nfirst [[1 2] [3 4]])
;;=> (2)

(nfirst [[1] [2 3]])
;;=> nil

(nfirst [[] [1 2]])
;;=> nil
```

---

See Also:

[`cljs.core/next`](cljs.core_next.md)<br>

---

Source docstring:

```
Same as (next (first x))
```

Source code:

```clj
(defn nfirst
  [coll]
  (next (first coll)))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:786-789](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L786-L789)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nfirst"]))
```

```clj
{:description "Same as `(next (first coll))`.",
 :ns "cljs.core",
 :name "nfirst",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/next"],
 :full-name-encode "cljs.core_nfirst",
 :source {:code "(defn nfirst\n  [coll]\n  (next (first coll)))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [786 789]},
 :examples [{:id "60b8a4",
             :content "```clj\n(nfirst [[1 2 3] [4 5]])\n;;=> (2 3)\n\n(nfirst [[1 2] [3 4]])\n;;=> (2)\n\n(nfirst [[1] [2 3]])\n;;=> nil\n\n(nfirst [[] [1 2]])\n;;=> nil\n```"}],
 :full-name "cljs.core/nfirst",
 :clj-symbol "clojure.core/nfirst",
 :docstring "Same as (next (first x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_nfirst.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_nfirst.cljsdoc)
</pre>

