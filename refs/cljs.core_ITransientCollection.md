## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientCollection.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding basic functionality to transient collections.
```

Source code:

```clj
(defprotocol ITransientCollection
  "Protocol for adding basic functionality to transient collections."
  (^clj -conj! [tcoll val]
    "Adds value val to tcoll and returns tcoll.")
  (^clj -persistent! [tcoll]
    "Creates a persistent data structure from tcoll and returns it."))
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:554-559](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L554-L559)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientCollection"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientCollection",
 :source {:code "(defprotocol ITransientCollection\n  \"Protocol for adding basic functionality to transient collections.\"\n  (^clj -conj! [tcoll val]\n    \"Adds value val to tcoll and returns tcoll.\")\n  (^clj -persistent! [tcoll]\n    \"Creates a persistent data structure from tcoll and returns it.\"))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [554 559]},
 :methods [{:name "-conj!",
            :signature ["[tcoll val]"],
            :docstring "Adds value val to tcoll and returns tcoll."}
           {:name "-persistent!",
            :signature ["[tcoll]"],
            :docstring "Creates a persistent data structure from tcoll and returns it."}],
 :full-name "cljs.core/ITransientCollection",
 :clj-symbol "clojure.lang/ITransientCollection",
 :docstring "Protocol for adding basic functionality to transient collections."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientCollection.cljsdoc)
</pre>

