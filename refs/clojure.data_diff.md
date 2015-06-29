## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.data/diff

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/diff</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/diff)
</td>
</tr>
</table>

 <samp>
(__diff__ a b)<br>
</samp>

---




Source docstring:

```
Recursively compares a and b, returning a tuple of
[things-only-in-a things-only-in-b things-in-both].
Comparison rules:

* For equal a and b, return [nil nil a].
* Maps are subdiffed where keys match and values differ.
* Sets are never subdiffed.
* All sequential things are treated as associative collections
  by their indexes, with results returned as vectors.
* Everything else (including strings!) is treated as
  an atom and compared for equality.
```

Source code:

```clj
(defn diff
  [a b]
  (if (= a b)
    [nil nil a]
    (if (= (equality-partition a) (equality-partition b))
      (diff-similar a b)
      (atom-diff a b))))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── clojure
            └── <ins>[data.cljs:144-161](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/data.cljs#L144-L161)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/diff"]))
```

```clj
{:ns "clojure.data",
 :name "diff",
 :signature ["[a b]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.data_diff",
 :source {:code "(defn diff\n  [a b]\n  (if (= a b)\n    [nil nil a]\n    (if (= (equality-partition a) (equality-partition b))\n      (diff-similar a b)\n      (atom-diff a b))))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/clojure/data.cljs",
          :lines [144 161]},
 :full-name "clojure.data/diff",
 :clj-symbol "clojure.data/diff",
 :docstring "Recursively compares a and b, returning a tuple of\n[things-only-in-a things-only-in-b things-in-both].\nComparison rules:\n\n* For equal a and b, return [nil nil a].\n* Maps are subdiffed where keys match and values differ.\n* Sets are never subdiffed.\n* All sequential things are treated as associative collections\n  by their indexes, with results returned as vectors.\n* Everything else (including strings!) is treated as\n  an atom and compared for equality."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.data_diff.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data_diff.cljsdoc)
</pre>

