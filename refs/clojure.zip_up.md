## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/up

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/up</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/up)
</td>
</tr>
</table>

 <samp>
(__up__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the parent of the node at this loc, or nil if at
the top
```

Source code:

```clj
(defn up
  [loc]
    (let [[node {l :l, ppath :ppath, pnodes :pnodes r :r, changed? :changed?, :as path}] loc]
      (when pnodes
        (let [pnode (peek pnodes)]
          (with-meta (if changed?
                       [(make-node loc pnode (concat l (cons node r))) 
                        (and ppath (assoc ppath :changed? true))]
                       [pnode ppath])
                     (meta loc))))))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:111-122](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/zip.cljs#L111-L122)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/up"]))
```

```clj
{:ns "clojure.zip",
 :name "up",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_up",
 :source {:code "(defn up\n  [loc]\n    (let [[node {l :l, ppath :ppath, pnodes :pnodes r :r, changed? :changed?, :as path}] loc]\n      (when pnodes\n        (let [pnode (peek pnodes)]\n          (with-meta (if changed?\n                       [(make-node loc pnode (concat l (cons node r))) \n                        (and ppath (assoc ppath :changed? true))]\n                       [pnode ppath])\n                     (meta loc))))))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [111 122]},
 :full-name "clojure.zip/up",
 :clj-symbol "clojure.zip/up",
 :docstring "Returns the loc of the parent of the node at this loc, or nil if at\nthe top"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_up.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_up.cljsdoc)
</pre>

