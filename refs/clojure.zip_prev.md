## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/prev

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/prev</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/prev)
</td>
</tr>
</table>

 <samp>
(__prev__ loc)<br>
</samp>

---




Source docstring:

```
Moves to the previous loc in the hierarchy, depth-first. If already
at the root, returns nil.
```

Source code:

```clj
(defn prev
  [loc]
    (if-let [lloc (left loc)]
      (loop [loc lloc]
        (if-let [child (and (branch? loc) (down loc))]
          (recur (rightmost child))
          loc))
      (up loc)))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:221-230](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/zip.cljs#L221-L230)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/prev"]))
```

```clj
{:ns "clojure.zip",
 :name "prev",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_prev",
 :source {:code "(defn prev\n  [loc]\n    (if-let [lloc (left loc)]\n      (loop [loc lloc]\n        (if-let [child (and (branch? loc) (down loc))]\n          (recur (rightmost child))\n          loc))\n      (up loc)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [221 230]},
 :full-name "clojure.zip/prev",
 :clj-symbol "clojure.zip/prev",
 :docstring "Moves to the previous loc in the hierarchy, depth-first. If already\nat the root, returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_prev.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_prev.cljsdoc)
</pre>

