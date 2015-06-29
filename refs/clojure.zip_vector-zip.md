## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/vector-zip

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/vector-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/vector-zip)
</td>
</tr>
</table>

 <samp>
(__vector-zip__ root)<br>
</samp>

---




Source docstring:

```
Returns a zipper for nested vectors, given a root vector
```

Source code:

```clj
(defn vector-zip
  [root]
    (zipper vector?
            seq
            (fn [node children] (with-meta (vec children) (meta node)))
            root))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:42-48](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/clojure/zip.cljs#L42-L48)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/vector-zip"]))
```

```clj
{:ns "clojure.zip",
 :name "vector-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_vector-zip",
 :source {:code "(defn vector-zip\n  [root]\n    (zipper vector?\n            seq\n            (fn [node children] (with-meta (vec children) (meta node)))\n            root))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [42 48]},
 :full-name "clojure.zip/vector-zip",
 :clj-symbol "clojure.zip/vector-zip",
 :docstring "Returns a zipper for nested vectors, given a root vector"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_vector-zip.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_vector-zip.cljsdoc)
</pre>

