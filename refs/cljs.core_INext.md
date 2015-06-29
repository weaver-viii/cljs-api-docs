## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/INext

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for accessing the next items of a collection.
```

Source code:

```clj
(defprotocol INext
  "Protocol for accessing the next items of a collection."
  (^clj-or-nil -next [coll]
    "Returns a new collection of coll without the first item. In contrast to
     rest, it should return nil if there are no more items, e.g.
     (next []) => nil
     (next nil) => nil"))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:383-389](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L383-L389)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INext"]))
```

```clj
{:ns "cljs.core",
 :name "INext",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core_INext",
 :source {:code "(defprotocol INext\n  \"Protocol for accessing the next items of a collection.\"\n  (^clj-or-nil -next [coll]\n    \"Returns a new collection of coll without the first item. In contrast to\n     rest, it should return nil if there are no more items, e.g.\n     (next []) => nil\n     (next nil) => nil\"))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [383 389]},
 :methods [{:name "-next",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first item. In contrast to\n     rest, it should return nil if there are no more items, e.g.\n     (next []) => nil\n     (next nil) => nil"}],
 :full-name "cljs.core/INext",
 :docstring "Protocol for accessing the next items of a collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_INext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_INext.cljsdoc)
</pre>

