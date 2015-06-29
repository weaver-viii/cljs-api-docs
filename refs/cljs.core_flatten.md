## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/flatten

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/flatten</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/flatten)
</td>
</tr>
</table>

 <samp>
(__flatten__ x)<br>
</samp>

---

Takes any nested combination of sequential things (lists, vectors, etc.) and
returns their contents as a single, flat sequence.

`(flatten nil)` returns nil.

---



Source docstring:

```
Takes any nested combination of sequential things (lists, vectors,
etc.) and returns their contents as a single, flat sequence.
(flatten nil) returns nil.
```

Source code:

```clj
(defn flatten
  [x]
  (filter #(not (sequential? %))
          (rest (tree-seq sequential? seq x))))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4013-4019](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L4013-L4019)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/flatten"]))
```

```clj
{:description "Takes any nested combination of sequential things (lists, vectors, etc.) and\nreturns their contents as a single, flat sequence.\n\n`(flatten nil)` returns nil.",
 :ns "cljs.core",
 :name "flatten",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_flatten",
 :source {:code "(defn flatten\n  [x]\n  (filter #(not (sequential? %))\n          (rest (tree-seq sequential? seq x))))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4013 4019]},
 :full-name "cljs.core/flatten",
 :clj-symbol "clojure.core/flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_flatten.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_flatten.cljsdoc)
</pre>

