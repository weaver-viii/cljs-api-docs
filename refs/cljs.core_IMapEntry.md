## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMapEntry

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IMapEntry</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IMapEntry.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for examining a map entry.
```

Source code:

```clj
(defprotocol IMapEntry
  "Protocol for examining a map entry."
  (-key [coll]
    "Returns the key of the map entry.")
  (-val [coll]
    "Returns the value of the map entry."))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:412-417](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L412-L417)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMapEntry"]))
```

```clj
{:ns "cljs.core",
 :name "IMapEntry",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IMapEntry",
 :source {:code "(defprotocol IMapEntry\n  \"Protocol for examining a map entry.\"\n  (-key [coll]\n    \"Returns the key of the map entry.\")\n  (-val [coll]\n    \"Returns the value of the map entry.\"))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [412 417]},
 :methods [{:name "-key",
            :signature ["[coll]"],
            :docstring "Returns the key of the map entry."}
           {:name "-val",
            :signature ["[coll]"],
            :docstring "Returns the value of the map entry."}],
 :full-name "cljs.core/IMapEntry",
 :clj-symbol "clojure.lang/IMapEntry",
 :docstring "Protocol for examining a map entry."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMapEntry.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMapEntry.cljsdoc)
</pre>

