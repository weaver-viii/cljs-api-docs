## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vec

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vec)
</td>
</tr>
</table>

 <samp>
(__vec__ coll)<br>
</samp>

---

Creates a new vector containing the contents of `coll`

---


See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/vector?`](cljs.core_vectorQMARK.md)<br>

---


Source code:

```clj
(defn vec [coll]
  (-persistent!
   (reduce -conj!
           (-as-transient (.-EMPTY PersistentVector))
           coll)))
```

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4393-4397](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L4393-L4397)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vec"]))
```

```clj
{:description "Creates a new vector containing the contents of `coll`",
 :ns "cljs.core",
 :name "vec",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/vector?"],
 :full-name-encode "cljs.core_vec",
 :source {:code "(defn vec [coll]\n  (-persistent!\n   (reduce -conj!\n           (-as-transient (.-EMPTY PersistentVector))\n           coll)))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4393 4397]},
 :full-name "cljs.core/vec",
 :clj-symbol "clojure.core/vec"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vec.cljsdoc)
</pre>

