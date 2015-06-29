## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/branch?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/branch?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/branch?)
</td>
</tr>
</table>

 <samp>
(__branch?__ loc)<br>
</samp>

---




Source docstring:

```
Returns true if the node at loc is a branch
```

Source code:

```clj
(defn branch?
  [loc]
    ((:zip/branch? (meta loc)) (node loc)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:64-67](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L64-L67)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/branch?"]))
```

```clj
{:ns "clojure.zip",
 :name "branch?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_branchQMARK",
 :source {:code "(defn branch?\n  [loc]\n    ((:zip/branch? (meta loc)) (node loc)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [64 67]},
 :full-name "clojure.zip/branch?",
 :clj-symbol "clojure.zip/branch?",
 :docstring "Returns true if the node at loc is a branch"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_branchQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_branchQMARK.cljsdoc)
</pre>

