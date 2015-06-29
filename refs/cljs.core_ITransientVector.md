## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientVector

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientVector</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientVector.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding vector functionality to transient collections.
```

Source code:

```clj
(defprotocol ITransientVector
  "Protocol for adding vector functionality to transient collections."
  (^clj -assoc-n! [tcoll n val]
    "Returns tcoll with value val added at position n.")
  (^clj -pop! [tcoll]
    "Returns tcoll with the last item removed from it."))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:572-577](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L572-L577)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientVector"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientVector",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientVector",
 :source {:code "(defprotocol ITransientVector\n  \"Protocol for adding vector functionality to transient collections.\"\n  (^clj -assoc-n! [tcoll n val]\n    \"Returns tcoll with value val added at position n.\")\n  (^clj -pop! [tcoll]\n    \"Returns tcoll with the last item removed from it.\"))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [572 577]},
 :methods [{:name "-assoc-n!",
            :signature ["[tcoll n val]"],
            :docstring "Returns tcoll with value val added at position n."}
           {:name "-pop!",
            :signature ["[tcoll]"],
            :docstring "Returns tcoll with the last item removed from it."}],
 :full-name "cljs.core/ITransientVector",
 :clj-symbol "clojure.lang/ITransientVector",
 :docstring "Protocol for adding vector functionality to transient collections."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientVector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientVector.cljsdoc)
</pre>

