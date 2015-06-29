## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector)
</td>
</tr>
</table>

 <samp>
(__vector__ & args)<br>
</samp>

---

Creates a new vector containing `args`.

---


See Also:

[`cljs.core/vec`](cljs.core_vec.md)<br>
[`cljs.core/vector?`](cljs.core_vectorQMARK.md)<br>
[`cljs.core/pop`](cljs.core_pop.md)<br>
[`cljs.core/into`](cljs.core_into.md)<br>

---


Source code:

```clj
(defn vector [& args] (vec args))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2686](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2686)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector"]))
```

```clj
{:description "Creates a new vector containing `args`.",
 :ns "cljs.core",
 :name "vector",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vec"
           "cljs.core/vector?"
           "cljs.core/pop"
           "cljs.core/into"],
 :full-name-encode "cljs.core_vector",
 :source {:code "(defn vector [& args] (vec args))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2686]},
 :full-name "cljs.core/vector",
 :clj-symbol "clojure.core/vector"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vector.cljsdoc)
</pre>

