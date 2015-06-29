## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/insert-child

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-child</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-child)
</td>
</tr>
</table>

 <samp>
(__insert-child__ loc item)<br>
</samp>

---




Source docstring:

```
Inserts the item as the leftmost child of the node at this loc,
without moving
```

Source code:

```clj
(defn insert-child
  [loc item]
    (replace loc (make-node loc (node loc) (cons item (children loc)))))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:194-198](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/zip.cljs#L194-L198)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/insert-child"]))
```

```clj
{:ns "clojure.zip",
 :name "insert-child",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_insert-child",
 :source {:code "(defn insert-child\n  [loc item]\n    (replace loc (make-node loc (node loc) (cons item (children loc)))))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [194 198]},
 :full-name "clojure.zip/insert-child",
 :clj-symbol "clojure.zip/insert-child",
 :docstring "Inserts the item as the leftmost child of the node at this loc,\nwithout moving"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_insert-child.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_insert-child.cljsdoc)
</pre>

