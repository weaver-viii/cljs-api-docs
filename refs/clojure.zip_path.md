## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/path

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/path</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/path)
</td>
</tr>
</table>

 <samp>
(__path__ loc)<br>
</samp>

---




Source docstring:

```
Returns a seq of nodes leading to this loc
```

Source code:

```clj
(defn path
  [loc]
    (:pnodes (loc 1)))
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:82-85](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/clojure/zip.cljs#L82-L85)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/path"]))
```

```clj
{:ns "clojure.zip",
 :name "path",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_path",
 :source {:code "(defn path\n  [loc]\n    (:pnodes (loc 1)))",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [82 85]},
 :full-name "clojure.zip/path",
 :clj-symbol "clojure.zip/path",
 :docstring "Returns a seq of nodes leading to this loc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_path.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_path.cljsdoc)
</pre>

