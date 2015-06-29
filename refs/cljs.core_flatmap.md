## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/flatmap

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__flatmap__ f)<br>
</samp>
 <samp>
(__flatmap__ f coll)<br>
</samp>

---




Source docstring:

```
maps f over coll and concatenates the results.  Thus function f
should return a collection.  Returns a transducer when no collection
is provided.
```

Source code:

```clj
(defn flatmap
  ([f]
   (fn [f1]
     (fn
       ([] (f1))
       ([result] (f1 result))
       ([result input]
          (reduce (preserving-reduced f1) result (f input))))))
  ([f coll] (sequence (flatmap f) coll)))
```

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8139-8150](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/core.cljs#L8139-L8150)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/flatmap"]))
```

```clj
{:ns "cljs.core",
 :name "flatmap",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core_flatmap",
 :source {:code "(defn flatmap\n  ([f]\n   (fn [f1]\n     (fn\n       ([] (f1))\n       ([result] (f1 result))\n       ([result input]\n          (reduce (preserving-reduced f1) result (f input))))))\n  ([f coll] (sequence (flatmap f) coll)))",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8139 8150]},
 :full-name "cljs.core/flatmap",
 :docstring "maps f over coll and concatenates the results.  Thus function f\nshould return a collection.  Returns a transducer when no collection\nis provided."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_flatmap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_flatmap.cljsdoc)
</pre>

