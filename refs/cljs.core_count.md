## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/count

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/count</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/count)
</td>
</tr>
</table>

 <samp>
(__count__ x)<br>
</samp>

---

Returns the number of items in `x`.

`count` works on arrays, lists, maps, sets, strings, and vectors.

`(count nil)` returns 0.

---

Example:

```clj
(count [1 2 3])
;;=> 3

(count [])
;;=> 0

(count nil)
;;=> 0

(count #{:a :b})
;;=> 2

(count {:key "value" :key2 "value2"})
;;=> 2
```

---


Source docstring:

```
Returns the number of items in the collection. (count nil) returns
0.  Also works on strings, arrays, and Maps
```

Source code:

```clj
(defn count
  [coll]
  (if (counted? coll)
    (-count coll)
    (accumulating-seq-count coll)))
```

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:840-846](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L840-L846)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/count"]))
```

```clj
{:description "Returns the number of items in `x`.\n\n`count` works on arrays, lists, maps, sets, strings, and vectors.\n\n`(count nil)` returns 0.",
 :ns "cljs.core",
 :name "count",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_count",
 :source {:code "(defn count\n  [coll]\n  (if (counted? coll)\n    (-count coll)\n    (accumulating-seq-count coll)))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/cljs/core.cljs",
          :lines [840 846]},
 :examples [{:id "96e470",
             :content "```clj\n(count [1 2 3])\n;;=> 3\n\n(count [])\n;;=> 0\n\n(count nil)\n;;=> 0\n\n(count #{:a :b})\n;;=> 2\n\n(count {:key \"value\" :key2 \"value2\"})\n;;=> 2\n```"}],
 :full-name "cljs.core/count",
 :clj-symbol "clojure.core/count",
 :docstring "Returns the number of items in the collection. (count nil) returns\n0.  Also works on strings, arrays, and Maps"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_count.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_count.cljsdoc)
</pre>

