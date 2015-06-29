## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/node

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/node</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/node)
</td>
</tr>
</table>

 <samp>
(__node__ loc)<br>
</samp>

---




Source docstring:

```
Returns the node at loc
```

Source code:

```clj
(defn node
  [loc] (loc 0))
```

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:60-62](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/zip.cljs#L60-L62)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/node"]))
```

```clj
{:ns "clojure.zip",
 :name "node",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_node",
 :source {:code "(defn node\n  [loc] (loc 0))",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [60 62]},
 :full-name "clojure.zip/node",
 :clj-symbol "clojure.zip/node",
 :docstring "Returns the node at loc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_node.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_node.cljsdoc)
</pre>

