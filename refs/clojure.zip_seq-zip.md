## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/seq-zip

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/seq-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/seq-zip)
</td>
</tr>
</table>

 <samp>
(__seq-zip__ root)<br>
</samp>

---




Source docstring:

```
Returns a zipper for nested sequences, given a root sequence
```

Source code:

```clj
(defn seq-zip
  [root]
    (zipper seq?
            identity
            (fn [node children] (with-meta children (meta node)))
            root))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:34-40](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/clojure/zip.cljs#L34-L40)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/seq-zip"]))
```

```clj
{:ns "clojure.zip",
 :name "seq-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_seq-zip",
 :source {:code "(defn seq-zip\n  [root]\n    (zipper seq?\n            identity\n            (fn [node children] (with-meta children (meta node)))\n            root))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [34 40]},
 :full-name "clojure.zip/seq-zip",
 :clj-symbol "clojure.zip/seq-zip",
 :docstring "Returns a zipper for nested sequences, given a root sequence"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_seq-zip.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_seq-zip.cljsdoc)
</pre>

