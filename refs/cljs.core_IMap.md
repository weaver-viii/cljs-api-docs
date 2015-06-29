## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMap

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding mapping functionality to collections.
```

Source code:

```clj
(defprotocol IMap
  "Protocol for adding mapping functionality to collections."
  #_(-assoc-ex [coll k v])
  (^clj -dissoc [coll k]
    "Returns a new collection of coll without the mapping for key k."))
```

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:406-410](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/core.cljs#L406-L410)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMap"]))
```

```clj
{:ns "cljs.core",
 :name "IMap",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IMap",
 :source {:code "(defprotocol IMap\n  \"Protocol for adding mapping functionality to collections.\"\n  #_(-assoc-ex [coll k v])\n  (^clj -dissoc [coll k]\n    \"Returns a new collection of coll without the mapping for key k.\"))",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/core.cljs",
          :lines [406 410]},
 :methods [{:name "-dissoc",
            :signature ["[coll k]"],
            :docstring "Returns a new collection of coll without the mapping for key k."}],
 :full-name "cljs.core/IMap",
 :docstring "Protocol for adding mapping functionality to collections."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMap.cljsdoc)
</pre>

