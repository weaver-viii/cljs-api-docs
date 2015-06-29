## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IIndexed

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Indexed</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Indexed.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for collections to provide idexed-based access to their items.
```

Source code:

```clj
(defprotocol IIndexed
  "Protocol for collections to provide idexed-based access to their items."
  (-nth [coll n] [coll n not-found]
    "Returns the value at the index n in the collection coll.
     Returns not-found if index n is out of bounds and not-found is supplied."))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:364-368](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L364-L368)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIndexed"]))
```

```clj
{:ns "cljs.core",
 :name "IIndexed",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IIndexed",
 :source {:code "(defprotocol IIndexed\n  \"Protocol for collections to provide idexed-based access to their items.\"\n  (-nth [coll n] [coll n not-found]\n    \"Returns the value at the index n in the collection coll.\n     Returns not-found if index n is out of bounds and not-found is supplied.\"))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [364 368]},
 :methods [{:name "-nth",
            :signature ["[coll n]" "[coll n not-found]"],
            :docstring "Returns the value at the index n in the collection coll.\n     Returns not-found if index n is out of bounds and not-found is supplied."}],
 :full-name "cljs.core/IIndexed",
 :clj-symbol "clojure.lang/Indexed",
 :docstring "Protocol for collections to provide idexed-based access to their items."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IIndexed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IIndexed.cljsdoc)
</pre>

