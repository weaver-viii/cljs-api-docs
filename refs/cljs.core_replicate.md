## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/replicate

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replicate)
</td>
</tr>
</table>

 <samp>
(__replicate__ n x)<br>
</samp>

---




Source docstring:

```
Returns a lazy seq of n xs.
```

Source code:

```clj
(defn replicate
  [n x] (take n (repeat x)))
```

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4171-4173](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L4171-L4173)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/replicate"]))
```

```clj
{:ns "cljs.core",
 :name "replicate",
 :signature ["[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_replicate",
 :source {:code "(defn replicate\n  [n x] (take n (repeat x)))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4171 4173]},
 :full-name "cljs.core/replicate",
 :clj-symbol "clojure.core/replicate",
 :docstring "Returns a lazy seq of n xs."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_replicate.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_replicate.cljsdoc)
</pre>

