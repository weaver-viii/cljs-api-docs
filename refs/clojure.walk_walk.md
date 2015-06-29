## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/walk

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/walk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/walk)
</td>
</tr>
</table>

 <samp>
(__walk__ inner outer form)<br>
</samp>

---




Source docstring:

```
Traverses form, an arbitrary data structure.  inner and outer are
functions.  Applies inner to each element of form, building up a
data structure of the same type, then applies outer to the result.
Recognizes all Clojure data structures. Consumes seqs as with doall.
```

Source code:

```clj
(defn walk
  [inner outer form]
  (cond
   (seq? form) (outer (doall (map inner form)))
   (coll? form) (outer (into (empty form) (map inner form)))
   :else (outer form)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[walk.cljs:37-48](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/clojure/walk.cljs#L37-L48)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/walk"]))
```

```clj
{:ns "clojure.walk",
 :name "walk",
 :signature ["[inner outer form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_walk",
 :source {:code "(defn walk\n  [inner outer form]\n  (cond\n   (seq? form) (outer (doall (map inner form)))\n   (coll? form) (outer (into (empty form) (map inner form)))\n   :else (outer form)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/clojure/walk.cljs",
          :lines [37 48]},
 :full-name "clojure.walk/walk",
 :clj-symbol "clojure.walk/walk",
 :docstring "Traverses form, an arbitrary data structure.  inner and outer are\nfunctions.  Applies inner to each element of form, building up a\ndata structure of the same type, then applies outer to the result.\nRecognizes all Clojure data structures. Consumes seqs as with doall."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.walk_walk.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk_walk.cljsdoc)
</pre>

