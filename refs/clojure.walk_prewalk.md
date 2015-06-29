## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/prewalk

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/prewalk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk)
</td>
</tr>
</table>

 <samp>
(__prewalk__ f form)<br>
</samp>

---




Source docstring:

```
Like postwalk, but does pre-order traversal.
```

Source code:

```clj
(defn prewalk
  [f form]
  (walk (partial prewalk f) identity (f form)))
```

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:58-62](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/walk.cljs#L58-L62)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/prewalk"]))
```

```clj
{:ns "clojure.walk",
 :name "prewalk",
 :signature ["[f form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_prewalk",
 :source {:code "(defn prewalk\n  [f form]\n  (walk (partial prewalk f) identity (f form)))",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [58 62]},
 :full-name "clojure.walk/prewalk",
 :clj-symbol "clojure.walk/prewalk",
 :docstring "Like postwalk, but does pre-order traversal."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.walk_prewalk.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk_prewalk.cljsdoc)
</pre>

