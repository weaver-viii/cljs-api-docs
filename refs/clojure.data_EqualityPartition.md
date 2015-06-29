## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.data/EqualityPartition

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/EqualityPartition</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/EqualityPartition)
</td>
</tr>
</table>





Source docstring:

```
Implementation detail. Subject to change.
```

Source code:

```clj
(defprotocol EqualityPartition
  "Implementation detail. Subject to change."
  (equality-partition [x] "Implementation detail. Subject to change."))
```

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── clojure
            └── <ins>[data.cljs:75-77](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/clojure/data.cljs#L75-L77)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/EqualityPartition"]))
```

```clj
{:ns "clojure.data",
 :name "EqualityPartition",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "clojure.data_EqualityPartition",
 :source {:code "(defprotocol EqualityPartition\n  \"Implementation detail. Subject to change.\"\n  (equality-partition [x] \"Implementation detail. Subject to change.\"))",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/clojure/data.cljs",
          :lines [75 77]},
 :methods [{:name "equality-partition",
            :signature ["[x]"],
            :docstring "Implementation detail. Subject to change."}],
 :full-name "clojure.data/EqualityPartition",
 :clj-symbol "clojure.data/EqualityPartition",
 :docstring "Implementation detail. Subject to change."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.data_EqualityPartition.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data_EqualityPartition.cljsdoc)
</pre>

