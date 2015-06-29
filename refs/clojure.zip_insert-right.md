## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/insert-right

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-right)
</td>
</tr>
</table>

 <samp>
(__insert-right__ loc item)<br>
</samp>

---




Source docstring:

```
Inserts the item as the right sibling of the node at this loc,
without moving
```

Source code:

```clj
(defn insert-right
  [loc item]
    (let [[node {r :r :as path}] loc]
      (if (nil? path)
        (throw "Insert at top")
        (with-meta [node (assoc path :r (cons item r) :changed? true)] (meta loc)))))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:174-181](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/zip.cljs#L174-L181)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/insert-right"]))
```

```clj
{:ns "clojure.zip",
 :name "insert-right",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_insert-right",
 :source {:code "(defn insert-right\n  [loc item]\n    (let [[node {r :r :as path}] loc]\n      (if (nil? path)\n        (throw \"Insert at top\")\n        (with-meta [node (assoc path :r (cons item r) :changed? true)] (meta loc)))))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [174 181]},
 :full-name "clojure.zip/insert-right",
 :clj-symbol "clojure.zip/insert-right",
 :docstring "Inserts the item as the right sibling of the node at this loc,\nwithout moving"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_insert-right.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_insert-right.cljsdoc)
</pre>

