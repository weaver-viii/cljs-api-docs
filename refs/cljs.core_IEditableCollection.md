## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEditableCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IEditableCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IEditableCollection.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for collections which can transformed to transients.
```

Source code:

```clj
(defprotocol IEditableCollection
  "Protocol for collections which can transformed to transients."
  (^clj -as-transient [coll]
    "Returns a new, transient version of the collection, in constant time."))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:549-552](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L549-L552)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEditableCollection"]))
```

```clj
{:ns "cljs.core",
 :name "IEditableCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IEditableCollection",
 :source {:code "(defprotocol IEditableCollection\n  \"Protocol for collections which can transformed to transients.\"\n  (^clj -as-transient [coll]\n    \"Returns a new, transient version of the collection, in constant time.\"))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [549 552]},
 :methods [{:name "-as-transient",
            :signature ["[coll]"],
            :docstring "Returns a new, transient version of the collection, in constant time."}],
 :full-name "cljs.core/IEditableCollection",
 :clj-symbol "clojure.lang/IEditableCollection",
 :docstring "Protocol for collections which can transformed to transients."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEditableCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEditableCollection.cljsdoc)
</pre>

