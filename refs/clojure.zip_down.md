## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/down

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/down</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/down)
</td>
</tr>
</table>

 <samp>
(__down__ loc)<br>
</samp>

---




Source docstring:

```
Returns the loc of the leftmost child of the node at this loc, or
nil if no children
```

Source code:

```clj
(defn down
  [loc]
    (when (branch? loc)
      (let [[node path] loc
            [c & cnext :as cs] (children loc)]
        (when cs
          (with-meta [c {:l [] 
                         :pnodes (if path (conj (:pnodes path) node) [node]) 
                         :ppath path 
                         :r cnext}] (meta loc))))))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:98-109](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/zip.cljs#L98-L109)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/down"]))
```

```clj
{:ns "clojure.zip",
 :name "down",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_down",
 :source {:code "(defn down\n  [loc]\n    (when (branch? loc)\n      (let [[node path] loc\n            [c & cnext :as cs] (children loc)]\n        (when cs\n          (with-meta [c {:l [] \n                         :pnodes (if path (conj (:pnodes path) node) [node]) \n                         :ppath path \n                         :r cnext}] (meta loc))))))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [98 109]},
 :full-name "clojure.zip/down",
 :clj-symbol "clojure.zip/down",
 :docstring "Returns the loc of the leftmost child of the node at this loc, or\nnil if no children"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_down.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_down.cljsdoc)
</pre>

