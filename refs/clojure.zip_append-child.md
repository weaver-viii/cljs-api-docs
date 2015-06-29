## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/append-child

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/append-child</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/append-child)
</td>
</tr>
</table>

 <samp>
(__append-child__ loc item)<br>
</samp>

---




Source docstring:

```
Inserts the item as the rightmost child of the node at this loc,
without moving
```

Source code:

```clj
(defn append-child
  [loc item]
    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:200-204](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/clojure/zip.cljs#L200-L204)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/append-child"]))
```

```clj
{:ns "clojure.zip",
 :name "append-child",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_append-child",
 :source {:code "(defn append-child\n  [loc item]\n    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [200 204]},
 :full-name "clojure.zip/append-child",
 :clj-symbol "clojure.zip/append-child",
 :docstring "Inserts the item as the rightmost child of the node at this loc,\nwithout moving"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_append-child.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_append-child.cljsdoc)
</pre>

