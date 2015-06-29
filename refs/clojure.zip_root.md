## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/root

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/root</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/root)
</td>
</tr>
</table>

 <samp>
(__root__ loc)<br>
</samp>

---




Source docstring:

```
zips all the way up and returns the root node, reflecting any
changes.
```

Source code:

```clj
(defn root
  [loc]
    (if (= :end (loc 1))
      (node loc)
      (let [p (up loc)]
        (if p
          (recur p)
          (node loc)))))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:124-133](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/clojure/zip.cljs#L124-L133)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/root"]))
```

```clj
{:ns "clojure.zip",
 :name "root",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_root",
 :source {:code "(defn root\n  [loc]\n    (if (= :end (loc 1))\n      (node loc)\n      (let [p (up loc)]\n        (if p\n          (recur p)\n          (node loc)))))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [124 133]},
 :full-name "clojure.zip/root",
 :clj-symbol "clojure.zip/root",
 :docstring "zips all the way up and returns the root node, reflecting any\nchanges."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_root.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_root.cljsdoc)
</pre>

