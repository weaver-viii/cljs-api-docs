## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/split-with

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-with)
</td>
</tr>
</table>

 <samp>
(__split-with__ pred coll)<br>
</samp>

---

Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`

---


See Also:

[`cljs.core/split-at`](cljs.core_split-at.md)<br>
[`clojure.string/split`](clojure.string_split.md)<br>
[`cljs.core/take-while`](cljs.core_take-while.md)<br>
[`cljs.core/drop-while`](cljs.core_drop-while.md)<br>

---

Source docstring:

```
Returns a vector of [(take-while pred coll) (drop-while pred coll)]
```

Source code:

```clj
(defn split-with
  [pred coll]
  [(take-while pred coll) (drop-while pred coll)])
```

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7523-7526](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L7523-L7526)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/split-with"]))
```

```clj
{:description "Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`",
 :ns "cljs.core",
 :name "split-with",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/split-at"
           "clojure.string/split"
           "cljs.core/take-while"
           "cljs.core/drop-while"],
 :full-name-encode "cljs.core_split-with",
 :source {:code "(defn split-with\n  [pred coll]\n  [(take-while pred coll) (drop-while pred coll)])",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7523 7526]},
 :full-name "cljs.core/split-with",
 :clj-symbol "clojure.core/split-with",
 :docstring "Returns a vector of [(take-while pred coll) (drop-while pred coll)]"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_split-with.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_split-with.cljsdoc)
</pre>

