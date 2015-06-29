## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/lefts

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/lefts</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/lefts)
</td>
</tr>
</table>

 <samp>
(__lefts__ loc)<br>
</samp>

---




Source docstring:

```
Returns a seq of the left siblings of this loc
```

Source code:

```clj
(defn lefts
  [loc]
    (seq (:l (loc 1))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:87-90](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/clojure/zip.cljs#L87-L90)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/lefts"]))
```

```clj
{:ns "clojure.zip",
 :name "lefts",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_lefts",
 :source {:code "(defn lefts\n  [loc]\n    (seq (:l (loc 1))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [87 90]},
 :full-name "clojure.zip/lefts",
 :clj-symbol "clojure.zip/lefts",
 :docstring "Returns a seq of the left siblings of this loc"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_lefts.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_lefts.cljsdoc)
</pre>

