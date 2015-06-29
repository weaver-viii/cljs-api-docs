## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/children

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/children</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/children)
</td>
</tr>
</table>

 <samp>
(__children__ loc)<br>
</samp>

---




Source docstring:

```
Returns a seq of the children of node at loc, which must be a branch
```

Source code:

```clj
(defn children
  [loc]
    (if (branch? loc)
      ((:zip/children (meta loc)) (node loc))
      (throw "called children on a leaf node")))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:69-74](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/clojure/zip.cljs#L69-L74)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/children"]))
```

```clj
{:ns "clojure.zip",
 :name "children",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_children",
 :source {:code "(defn children\n  [loc]\n    (if (branch? loc)\n      ((:zip/children (meta loc)) (node loc))\n      (throw \"called children on a leaf node\")))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [69 74]},
 :full-name "clojure.zip/children",
 :clj-symbol "clojure.zip/children",
 :docstring "Returns a seq of the children of node at loc, which must be a branch"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_children.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_children.cljsdoc)
</pre>

