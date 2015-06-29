## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/distinct

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/distinct</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/distinct)
</td>
</tr>
</table>

 <samp>
(__distinct__ coll)<br>
</samp>

---

Returns a lazy sequence of the elements of `coll` with duplicates removed.

---


See Also:

[`cljs.core/distinct?`](cljs.core_distinctQMARK.md)<br>

---

Source docstring:

```
Returns a lazy sequence of the elements of coll with duplicates removed
```

Source code:

```clj
(defn distinct
  [coll]
  (let [step (fn step [xs seen]
               (lazy-seq
                ((fn [[f :as xs] seen]
                   (when-let [s (seq xs)]
                     (if (contains? seen f)
                       (recur (rest s) seen)
                       (cons f (step (rest s) (conj seen f))))))
                 xs seen)))]
    (step coll #{})))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7524-7535](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L7524-L7535)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/distinct"]))
```

```clj
{:description "Returns a lazy sequence of the elements of `coll` with duplicates removed.",
 :ns "cljs.core",
 :name "distinct",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/distinct?"],
 :full-name-encode "cljs.core_distinct",
 :source {:code "(defn distinct\n  [coll]\n  (let [step (fn step [xs seen]\n               (lazy-seq\n                ((fn [[f :as xs] seen]\n                   (when-let [s (seq xs)]\n                     (if (contains? seen f)\n                       (recur (rest s) seen)\n                       (cons f (step (rest s) (conj seen f))))))\n                 xs seen)))]\n    (step coll #{})))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7524 7535]},
 :full-name "cljs.core/distinct",
 :clj-symbol "clojure.core/distinct",
 :docstring "Returns a lazy sequence of the elements of coll with duplicates removed"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_distinct.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_distinct.cljsdoc)
</pre>

