## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/make-node

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/make-node</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/make-node)
</td>
</tr>
</table>

 <samp>
(__make-node__ loc node children)<br>
</samp>

---




Source docstring:

```
Returns a new branch node, given an existing node and new
children. The loc is only used to supply the constructor.
```

Source code:

```clj
(defn make-node
  [loc node children]
    ((:zip/make-node (meta loc)) node children))
```

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:76-80](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/clojure/zip.cljs#L76-L80)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/make-node"]))
```

```clj
{:ns "clojure.zip",
 :name "make-node",
 :signature ["[loc node children]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_make-node",
 :source {:code "(defn make-node\n  [loc node children]\n    ((:zip/make-node (meta loc)) node children))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [76 80]},
 :full-name "clojure.zip/make-node",
 :clj-symbol "clojure.zip/make-node",
 :docstring "Returns a new branch node, given an existing node and new\nchildren. The loc is only used to supply the constructor."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_make-node.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_make-node.cljsdoc)
</pre>

