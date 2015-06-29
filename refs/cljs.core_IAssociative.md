## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IAssociative

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Associative</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Associative.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding associativity to collections.
```

Source code:

```clj
(defprotocol IAssociative
  "Protocol for adding associativity to collections."
  (^boolean -contains-key? [coll k]
    "Returns true if k is a key in coll.")
  #_(-entry-at [coll k])
  (^clj -assoc [coll k v]
    "Returns a new collection of coll with a mapping from key k to
     value v added to it."))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:397-404](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L397-L404)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAssociative"]))
```

```clj
{:ns "cljs.core",
 :name "IAssociative",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IAssociative",
 :source {:code "(defprotocol IAssociative\n  \"Protocol for adding associativity to collections.\"\n  (^boolean -contains-key? [coll k]\n    \"Returns true if k is a key in coll.\")\n  #_(-entry-at [coll k])\n  (^clj -assoc [coll k v]\n    \"Returns a new collection of coll with a mapping from key k to\n     value v added to it.\"))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [397 404]},
 :methods [{:name "-contains-key?",
            :signature ["[coll k]"],
            :docstring "Returns true if k is a key in coll."}
           {:name "-assoc",
            :signature ["[coll k v]"],
            :docstring "Returns a new collection of coll with a mapping from key k to\n     value v added to it."}],
 :full-name "cljs.core/IAssociative",
 :clj-symbol "clojure.lang/Associative",
 :docstring "Protocol for adding associativity to collections."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IAssociative.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IAssociative.cljsdoc)
</pre>

