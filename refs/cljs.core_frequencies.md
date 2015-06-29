## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/frequencies

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/frequencies</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/frequencies)
</td>
</tr>
</table>

 <samp>
(__frequencies__ coll)<br>
</samp>

---

Returns a map from distinct items in `coll` to the number of times they appear.

`(frequencies [:a :a :b])` => `{:a 2, :b 1}`

---


See Also:

[`cljs.core/group-by`](cljs.core_group-by.md)<br>
[`cljs.core/distinct`](cljs.core_distinct.md)<br>

---

Source docstring:

```
Returns a map from distinct items in coll to the number of times
they appear.
```

Source code:

```clj
(defn frequencies
  [coll]
  (persistent!
   (reduce (fn [counts x]
             (assoc! counts x (inc (get counts x 0))))
           (transient {}) coll)))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6448-6455](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L6448-L6455)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/frequencies"]))
```

```clj
{:description "Returns a map from distinct items in `coll` to the number of times they appear.\n\n`(frequencies [:a :a :b])` => `{:a 2, :b 1}`",
 :ns "cljs.core",
 :name "frequencies",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/group-by" "cljs.core/distinct"],
 :full-name-encode "cljs.core_frequencies",
 :source {:code "(defn frequencies\n  [coll]\n  (persistent!\n   (reduce (fn [counts x]\n             (assoc! counts x (inc (get counts x 0))))\n           (transient {}) coll)))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6448 6455]},
 :full-name "cljs.core/frequencies",
 :clj-symbol "clojure.core/frequencies",
 :docstring "Returns a map from distinct items in coll to the number of times\nthey appear."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_frequencies.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_frequencies.cljsdoc)
</pre>

