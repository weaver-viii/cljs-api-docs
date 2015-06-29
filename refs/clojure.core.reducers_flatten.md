## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/flatten

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/flatten</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/flatten)
</td>
</tr>
</table>

 <samp>
(__flatten__)<br>
</samp>
 <samp>
(__flatten__ coll)<br>
</samp>

---




Source docstring:

```
Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection.
```

Source code:

```clj
(defcurried flatten
  "Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection."
  {}
  [coll]
  (folder coll
   (fn [f1]
     (fn
       ([] (f1))
       ([ret v]
          (if (sequential? v)
            (-reduce (flatten v) f1 ret)
            (f1 ret v)))))))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:122-135](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/clojure/core/reducers.cljs#L122-L135)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/flatten"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "flatten",
 :signature ["[]" "[coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_flatten",
 :source {:code "(defcurried flatten\n  \"Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection.\"\n  {}\n  [coll]\n  (folder coll\n   (fn [f1]\n     (fn\n       ([] (f1))\n       ([ret v]\n          (if (sequential? v)\n            (-reduce (flatten v) f1 ret)\n            (f1 ret v)))))))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [122 135]},
 :full-name "clojure.core.reducers/flatten",
 :clj-symbol "clojure.core.reducers/flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_flatten.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_flatten.cljsdoc)
</pre>

