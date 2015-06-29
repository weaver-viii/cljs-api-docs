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
Returns a lazy seq of every nth item in coll.  Returns a stateful
transducer when no collection is provided.
```

Source code:

```clj
(defn take-nth
  ([n]
     (fn [f1]
       (let [ia (atom -1)]
         (fn
           ([] (f1))
           ([result] (f1 result))
           ([result input]
              (let [i (swap! ia inc)]
                (if (zero? (rem i n))
                  (f1 result input)
                  result)))))))
  ([n coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (cons (first s) (take-nth n (drop n s)))))))
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7505-7522](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L7505-L7522)</ins>
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
 :source {:code "(defn take-nth\n  ([n]\n     (fn [f1]\n       (let [ia (atom -1)]\n         (fn\n           ([] (f1))\n           ([result] (f1 result))\n           ([result input]\n              (let [i (swap! ia inc)]\n                (if (zero? (rem i n))\n                  (f1 result input)\n                  result)))))))\n  ([n coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (cons (first s) (take-nth n (drop n s)))))))",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7505 7522]},
 :full-name "cljs.core/take-nth",
 :clj-symbol "clojure.core/take-nth",
 :docstring "Returns a lazy seq of every nth item in coll.  Returns a stateful\ntransducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_take-nth.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_take-nth.cljsdoc)
</pre>

