## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IIterable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2356"><img valign="middle" alt="[+] 0.0-2356" src="https://img.shields.io/badge/+-0.0--2356-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for iterating over a collection.
```

Source code:

```clj
(defprotocol IIterable
  "Protocol for iterating over a collection."
  (-iterator [coll]
    "Returns an iterator for coll."))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:633-636](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L633-L636)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIterable"]))
```

```clj
{:ns "cljs.core",
 :name "IIterable",
 :history [["+" "0.0-2356"]],
 :type "protocol",
 :full-name-encode "cljs.core_IIterable",
 :source {:code "(defprotocol IIterable\n  \"Protocol for iterating over a collection.\"\n  (-iterator [coll]\n    \"Returns an iterator for coll.\"))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [633 636]},
 :methods [{:name "-iterator",
            :signature ["[coll]"],
            :docstring "Returns an iterator for coll."}],
 :full-name "cljs.core/IIterable",
 :docstring "Protocol for iterating over a collection."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IIterable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IIterable.cljsdoc)
</pre>

