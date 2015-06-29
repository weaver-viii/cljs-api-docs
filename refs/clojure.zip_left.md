## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/left

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/left</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/left)
</td>
</tr>
</table>

 <samp>
(__left__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the left sibling of the node at this loc, or nil
```

Source code:

```clj
(defn left
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (when (and path (seq l))
        (with-meta [(peek l) (assoc path :l (pop l) :r (cons node r))] (meta loc)))))
```

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:150-155](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/clojure/zip.cljs#L150-L155)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/left"]))
```

```clj
{:ns "clojure.zip",
 :name "left",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_left",
 :source {:code "(defn left\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (when (and path (seq l))\n        (with-meta [(peek l) (assoc path :l (pop l) :r (cons node r))] (meta loc)))))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [150 155]},
 :full-name "clojure.zip/left",
 :clj-symbol "clojure.zip/left",
 :docstring "Returns the loc of the left sibling of the node at this loc, or nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_left.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_left.cljsdoc)
</pre>

