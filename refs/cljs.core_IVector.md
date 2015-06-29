## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IVector

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentVector</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentVector.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IVector
  (^clj -assoc-n [coll n val]))
```

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:280-281](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L280-L281)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IVector"]))
```

```clj
{:ns "cljs.core",
 :name "IVector",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IVector",
 :source {:code "(defprotocol IVector\n  (^clj -assoc-n [coll n val]))",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [280 281]},
 :methods [{:name "-assoc-n",
            :signature ["[coll n val]"],
            :docstring nil}],
 :full-name "cljs.core/IVector",
 :clj-symbol "clojure.lang/IPersistentVector"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IVector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IVector.cljsdoc)
</pre>

