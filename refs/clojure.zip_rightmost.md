## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/rightmost

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rightmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rightmost)
</td>
</tr>
</table>

 <samp>
(__rightmost__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the rightmost sibling of the node at this loc, or self
```

Source code:

```clj
(defn rightmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path r)
        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))
        loc)))
```

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:142-148](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/zip.cljs#L142-L148)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/rightmost"]))
```

```clj
{:ns "clojure.zip",
 :name "rightmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_rightmost",
 :source {:code "(defn rightmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path r)\n        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))\n        loc)))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [142 148]},
 :full-name "clojure.zip/rightmost",
 :clj-symbol "clojure.zip/rightmost",
 :docstring "Returns the loc of the rightmost sibling of the node at this loc, or self"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_rightmost.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_rightmost.cljsdoc)
</pre>

