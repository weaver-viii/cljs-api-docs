## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/remove

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/remove)
</td>
</tr>
</table>

 <samp>
(__remove__ loc)<br>
</samp>

---




Source docstring:

```
Removes the node at loc, returning the loc that would have preceded
it in a depth-first walk.
```

Source code:

```clj
(defn remove
  [loc]
    (let [[node {l :l, ppath :ppath, pnodes :pnodes, rs :r, :as path}] loc]
      (if (nil? path)
        (throw "Remove at top")
        (if (pos? (count l))
          (loop [loc (with-meta [(peek l) (assoc path :l (pop l) :changed? true)] (meta loc))]
            (if-let [child (and (branch? loc) (down loc))]
              (recur (rightmost child))
              loc))
          (with-meta [(make-node loc (peek pnodes) rs) 
                      (and ppath (assoc ppath :changed? true))]
                     (meta loc))))))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:237-251](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/clojure/zip.cljs#L237-L251)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/remove"]))
```

```clj
{:ns "clojure.zip",
 :name "remove",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_remove",
 :source {:code "(defn remove\n  [loc]\n    (let [[node {l :l, ppath :ppath, pnodes :pnodes, rs :r, :as path}] loc]\n      (if (nil? path)\n        (throw \"Remove at top\")\n        (if (pos? (count l))\n          (loop [loc (with-meta [(peek l) (assoc path :l (pop l) :changed? true)] (meta loc))]\n            (if-let [child (and (branch? loc) (down loc))]\n              (recur (rightmost child))\n              loc))\n          (with-meta [(make-node loc (peek pnodes) rs) \n                      (and ppath (assoc ppath :changed? true))]\n                     (meta loc))))))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [237 251]},
 :full-name "clojure.zip/remove",
 :clj-symbol "clojure.zip/remove",
 :docstring "Removes the node at loc, returning the loc that would have preceded\nit in a depth-first walk."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_remove.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_remove.cljsdoc)
</pre>

