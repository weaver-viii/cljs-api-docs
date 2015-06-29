## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEmptyableCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for creating an empty collection.
```

Source code:

```clj
(defprotocol IEmptyableCollection
  "Protocol for creating an empty collection."
  (-empty [coll]
    "Returns an empty collection of the same category as coll. Used
     by cljs.core/count."))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:347-351](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L347-L351)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEmptyableCollection"]))
```

```clj
{:ns "cljs.core",
 :name "IEmptyableCollection",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IEmptyableCollection",
 :source {:code "(defprotocol IEmptyableCollection\n  \"Protocol for creating an empty collection.\"\n  (-empty [coll]\n    \"Returns an empty collection of the same category as coll. Used\n     by cljs.core/count.\"))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [347 351]},
 :methods [{:name "-empty",
            :signature ["[coll]"],
            :docstring "Returns an empty collection of the same category as coll. Used\n     by cljs.core/count."}],
 :full-name "cljs.core/IEmptyableCollection",
 :docstring "Protocol for creating an empty collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEmptyableCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEmptyableCollection.cljsdoc)
</pre>

