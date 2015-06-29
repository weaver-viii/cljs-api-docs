## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/zipper

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/zipper</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/zipper)
</td>
</tr>
</table>

 <samp>
(__zipper__ branch? children make-node root)<br>
</samp>

---




Source docstring:

```
Creates a new zipper structure. 

branch? is a fn that, given a node, returns true if can have
children, even if it currently doesn't.

children is a fn that, given a branch node, returns a seq of its
children.

make-node is a fn that, given an existing node and a seq of
children, returns a new branch node with the supplied children.
root is the root node.
```

Source code:

```clj
(defn zipper
  [branch? children make-node root]
    ^{:zip/branch? branch? :zip/children children :zip/make-node make-node}
    [root nil])
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:18-32](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/clojure/zip.cljs#L18-L32)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/zipper"]))
```

```clj
{:ns "clojure.zip",
 :name "zipper",
 :signature ["[branch? children make-node root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_zipper",
 :source {:code "(defn zipper\n  [branch? children make-node root]\n    ^{:zip/branch? branch? :zip/children children :zip/make-node make-node}\n    [root nil])",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [18 32]},
 :full-name "clojure.zip/zipper",
 :clj-symbol "clojure.zip/zipper",
 :docstring "Creates a new zipper structure. \n\nbranch? is a fn that, given a node, returns true if can have\nchildren, even if it currently doesn't.\n\nchildren is a fn that, given a branch node, returns a seq of its\nchildren.\n\nmake-node is a fn that, given an existing node and a seq of\nchildren, returns a new branch node with the supplied children.\nroot is the root node."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_zipper.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_zipper.cljsdoc)
</pre>

