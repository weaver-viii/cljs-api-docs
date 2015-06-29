## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/Cat

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Cat.__ cnt left right)<br>
</samp>

---





Source code:

```clj
(deftype Cat [cnt left right]
  cljs.core/ICounted
  (-count [_] cnt)

  cljs.core/ISeqable
  (-seq [_] (concat (seq left) (seq right)))
  
  cljs.core/IReduce
  (-reduce [this f1] (-reduce this f1 (f1)))
  (-reduce
    [_  f1 init]
    (-reduce
     right f1
     (-reduce left f1 init)))

  #_
  CollFold
  #_
  (coll-fold
    [this n combinef reducef]
    (-reduce this reducef)))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:182-202](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L182-L202)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/Cat"]))
```

```clj
{:ns "clojure.core.reducers",
 :name "Cat",
 :type "type",
 :signature ["[cnt left right]"],
 :source {:code "(deftype Cat [cnt left right]\n  cljs.core/ICounted\n  (-count [_] cnt)\n\n  cljs.core/ISeqable\n  (-seq [_] (concat (seq left) (seq right)))\n  \n  cljs.core/IReduce\n  (-reduce [this f1] (-reduce this f1 (f1)))\n  (-reduce\n    [_  f1 init]\n    (-reduce\n     right f1\n     (-reduce left f1 init)))\n\n  #_\n  CollFold\n  #_\n  (coll-fold\n    [this n combinef reducef]\n    (-reduce this reducef)))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [182 202]},
 :full-name "clojure.core.reducers/Cat",
 :full-name-encode "clojure.core.reducers_Cat",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.core.reducers_Cat.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers_Cat.cljsdoc)
</pre>

