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
   (fn [rf]
     (let [pa (volatile! ::none)]
       (fn
         ([] (rf))
         ([result] (rf result))
         ([result input]
            (let [prior @pa]
              (vreset! pa input)
              (if (= prior input)
                result
                (rf result input))))))))
  ([coll] (sequence (dedupe) coll)))
```

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8580-8595](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L8580-L8595)</ins>
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
 :source {:code "(defn dedupe\n  ([]\n   (fn [rf]\n     (let [pa (volatile! ::none)]\n       (fn\n         ([] (rf))\n         ([result] (rf result))\n         ([result input]\n            (let [prior @pa]\n              (vreset! pa input)\n              (if (= prior input)\n                result\n                (rf result input))))))))\n  ([coll] (sequence (dedupe) coll)))",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8580 8595]},
 :full-name "cljs.core/dedupe",
 :docstring "Returns a lazy sequence removing consecutive duplicates in coll.\nReturns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dedupe.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dedupe.cljsdoc)
</pre>

