## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/right

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/right</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/right)
</td>
</tr>
</table>

 <samp>
(__right__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the right sibling of the node at this loc, or nil
```

Source code:

```clj
(defn right
  [loc]
    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]
      (when (and path rs)
        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:135-140](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/zip.cljs#L135-L140)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/right"]))
```

```clj
{:ns "clojure.zip",
 :name "right",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_right",
 :source {:code "(defn right\n  [loc]\n    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]\n      (when (and path rs)\n        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [135 140]},
 :full-name "clojure.zip/right",
 :clj-symbol "clojure.zip/right",
 :docstring "Returns the loc of the right sibling of the node at this loc, or nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_right.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_right.cljsdoc)
</pre>

