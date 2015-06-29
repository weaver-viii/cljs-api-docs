## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/leftmost

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/leftmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/leftmost)
</td>
</tr>
</table>

 <samp>
(__leftmost__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the leftmost sibling of the node at this loc, or self
```

Source code:

```clj
(defn leftmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path (seq l))
        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))
        loc)))
```

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:157-163](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/zip.cljs#L157-L163)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/leftmost"]))
```

```clj
{:ns "clojure.zip",
 :name "leftmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_leftmost",
 :source {:code "(defn leftmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path (seq l))\n        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))\n        loc)))",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [157 163]},
 :full-name "clojure.zip/leftmost",
 :clj-symbol "clojure.zip/leftmost",
 :docstring "Returns the loc of the leftmost sibling of the node at this loc, or self"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_leftmost.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_leftmost.cljsdoc)
</pre>

