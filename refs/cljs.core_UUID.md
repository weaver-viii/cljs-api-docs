## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/UUID

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__UUID.__ uuid)<br>
</samp>

---





Source code:

```clj
(deftype UUID [uuid]
  Object
  (toString [this]
    (pr-str this))
    
  IEquiv
  (-equiv [_ other]
    (identical? uuid (.-uuid other)))

  IPrintable
  (-pr-seq [_ _]
    (list (str "#uuid \"" uuid "\"")))

  IHash
  (-hash [this]
    (goog.string/hashCode (pr-str this))))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6886-6901](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L6886-L6901)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/UUID"]))
```

```clj
{:ns "cljs.core",
 :name "UUID",
 :type "type",
 :signature ["[uuid]"],
 :source {:code "(deftype UUID [uuid]\n  Object\n  (toString [this]\n    (pr-str this))\n    \n  IEquiv\n  (-equiv [_ other]\n    (identical? uuid (.-uuid other)))\n\n  IPrintable\n  (-pr-seq [_ _]\n    (list (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IHash\n  (-hash [this]\n    (goog.string/hashCode (pr-str this))))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6886 6901]},
 :full-name "cljs.core/UUID",
 :full-name-encode "cljs.core_UUID",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_UUID.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_UUID.cljsdoc)
</pre>

