## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding to a collection.
```

Source code:

```clj
(defprotocol ICollection
  "Protocol for adding to a collection."
  (^clj -conj [coll o]
    "Returns a new collection of coll with o added to it. The new item
     should be added to the most efficient place, e.g.
     (conj [1 2 3 4] 5) => [1 2 3 4 5]
     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)"))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:353-359](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L353-L359)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICollection"]))
```

```clj
{:ns "cljs.core",
 :name "ICollection",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ICollection",
 :source {:code "(defprotocol ICollection\n  \"Protocol for adding to a collection.\"\n  (^clj -conj [coll o]\n    \"Returns a new collection of coll with o added to it. The new item\n     should be added to the most efficient place, e.g.\n     (conj [1 2 3 4] 5) => [1 2 3 4 5]\n     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)\"))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [353 359]},
 :methods [{:name "-conj",
            :signature ["[coll o]"],
            :docstring "Returns a new collection of coll with o added to it. The new item\n     should be added to the most efficient place, e.g.\n     (conj [1 2 3 4] 5) => [1 2 3 4 5]\n     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)"}],
 :full-name "cljs.core/ICollection",
 :docstring "Protocol for adding to a collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICollection.cljsdoc)
</pre>

