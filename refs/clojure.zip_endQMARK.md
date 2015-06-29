## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/end?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/end?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/end?)
</td>
</tr>
</table>

 <samp>
(__end?__ loc)<br>
</samp>

---




Source docstring:

```
Returns true if loc represents the end of a depth-first walk
```

Source code:

```clj
(defn end?
  [loc]
    (= :end (loc 1)))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:232-235](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/clojure/zip.cljs#L232-L235)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/end?"]))
```

```clj
{:ns "clojure.zip",
 :name "end?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_endQMARK",
 :source {:code "(defn end?\n  [loc]\n    (= :end (loc 1)))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [232 235]},
 :full-name "clojure.zip/end?",
 :clj-symbol "clojure.zip/end?",
 :docstring "Returns true if loc represents the end of a depth-first walk"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.zip_endQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip_endQMARK.cljsdoc)
</pre>

