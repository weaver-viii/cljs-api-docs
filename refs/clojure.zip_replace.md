## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/replace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ loc node)<br>
</samp>

---




Source docstring:

```
Replaces the node at this loc, without moving
```

Source code:

```clj
(defn replace
  [loc node]
    (let [[_ path] loc]
      (with-meta [node (assoc path :changed? true)] (meta loc))))
```

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:183-187](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/clojure/zip.cljs#L183-L187)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/replace"]))
```

```clj
{:ns "clojure.zip",
 :name "replace",
 :signature ["[loc node]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_replace",
 :source {:code "(defn replace\n  [loc node]\n    (let [[_ path] loc]\n      (with-meta [node (assoc path :changed? true)] (meta loc))))",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [183 187]},
 :full-name "clojure.zip/replace",
 :clj-symbol "clojure.zip/replace",
 :docstring "Replaces the node at this loc, without moving"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_replace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_replace.cljsdoc)
</pre>

