## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take-nth

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-nth)
</td>
</tr>
</table>

 <samp>
(__take-nth__ n)<br>
</samp>
 <samp>
(__take-nth__ n coll)<br>
</samp>

---

Returns a lazy seq of every `n`th item in `coll`.

Returns a stateful transducer when no collection is provided.

---



Source docstring:

```
Returns a lazy seq of every nth item in coll.
```

Source code:

```clj
(defn take-nth
  [n coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (cons (first s) (take-nth n (drop n s))))))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2704-2709](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2704-L2709)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-nth"]))
```

```clj
{:description "Returns a lazy seq of every `n`th item in `coll`.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "take-nth",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_take-nth",
 :source {:code "(defn take-nth\n  [n coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (cons (first s) (take-nth n (drop n s))))))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2704 2709]},
 :full-name "cljs.core/take-nth",
 :clj-symbol "clojure.core/take-nth",
 :docstring "Returns a lazy seq of every nth item in coll."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_take-nth.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_take-nth.cljsdoc)
</pre>

