## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dedupe

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dedupe__)<br>
</samp>
 <samp>
(__dedupe__ coll)<br>
</samp>

---




Source docstring:

```
Returns a lazy sequence removing consecutive duplicates in coll.
Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn dedupe
  ([]
   (fn [f1]
     (let [pa (atom ::none)]
       (fn
         ([] (f1))
         ([result] (f1 result))
         ([result input]
            (let [prior @pa]
              (reset! pa input)
              (if (= prior input)
                result
                (f1 result input))))))))
  ([coll] (sequence (dedupe) coll)))
```

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8152-8167](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/core.cljs#L8152-L8167)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dedupe"]))
```

```clj
{:ns "cljs.core",
 :name "dedupe",
 :signature ["[]" "[coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core_dedupe",
 :source {:code "(defn dedupe\n  ([]\n   (fn [f1]\n     (let [pa (atom ::none)]\n       (fn\n         ([] (f1))\n         ([result] (f1 result))\n         ([result input]\n            (let [prior @pa]\n              (reset! pa input)\n              (if (= prior input)\n                result\n                (f1 result input))))))))\n  ([coll] (sequence (dedupe) coll)))",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8152 8167]},
 :full-name "cljs.core/dedupe",
 :docstring "Returns a lazy sequence removing consecutive duplicates in coll.\nReturns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dedupe.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dedupe.cljsdoc)
</pre>

