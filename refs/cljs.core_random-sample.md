## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/random-sample

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__random-sample__ prob)<br>
</samp>
 <samp>
(__random-sample__ prob coll)<br>
</samp>

---




Source docstring:

```
Returns items from coll with random probability of prob (0.0 -
1.0).  Returns a transducer when no collection is provided.
```

Source code:

```clj
(defn random-sample
  ([prob]
     (filter (fn [_] (< (rand) prob))))
  ([prob coll]
     (filter (fn [_] (< (rand) prob)) coll)))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8593-8599](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L8593-L8599)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/random-sample"]))
```

```clj
{:ns "cljs.core",
 :name "random-sample",
 :signature ["[prob]" "[prob coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core_random-sample",
 :source {:code "(defn random-sample\n  ([prob]\n     (filter (fn [_] (< (rand) prob))))\n  ([prob coll]\n     (filter (fn [_] (< (rand) prob)) coll)))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8593 8599]},
 :full-name "cljs.core/random-sample",
 :docstring "Returns items from coll with random probability of prob (0.0 -\n1.0).  Returns a transducer when no collection is provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_random-sample.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_random-sample.cljsdoc)
</pre>

