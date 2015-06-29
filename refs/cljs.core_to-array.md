## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/to-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/to-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array)
</td>
</tr>
</table>

 <samp>
(__to-array__ s)<br>
</samp>

---




Source docstring:

```
Naive impl of to-array as a start.
```

Source code:

```clj
(defn to-array
  [s]
  (let [ary (array)]
    (loop [s s]
      (if (seq s)
        (do (. ary push (first s))
            (recur (next s)))
        ary))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3048-3056](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3048-L3056)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/to-array"]))
```

```clj
{:ns "cljs.core",
 :name "to-array",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_to-array",
 :source {:code "(defn to-array\n  [s]\n  (let [ary (array)]\n    (loop [s s]\n      (if (seq s)\n        (do (. ary push (first s))\n            (recur (next s)))\n        ary))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3048 3056]},
 :full-name "cljs.core/to-array",
 :clj-symbol "clojure.core/to-array",
 :docstring "Naive impl of to-array as a start."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_to-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_to-array.cljsdoc)
</pre>

