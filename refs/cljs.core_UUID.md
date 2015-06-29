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
  (toString [_] uuid)
  (equiv [this other]
    (-equiv this other))

  IEquiv
  (-equiv [_ other]
    (and (instance? UUID other) (identical? uuid (.-uuid other))))

  IPrintWithWriter
  (-pr-writer [_ writer _]
    (-write writer (str "#uuid \"" uuid "\"")))

  IHash
  (-hash [this]
    (goog.string/hashCode (pr-str this))))
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9038-9054](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L9038-L9054)</ins>
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
 :source {:code "(deftype UUID [uuid]\n  Object\n  (toString [_] uuid)\n  (equiv [this other]\n    (-equiv this other))\n\n  IEquiv\n  (-equiv [_ other]\n    (and (instance? UUID other) (identical? uuid (.-uuid other))))\n\n  IPrintWithWriter\n  (-pr-writer [_ writer _]\n    (-write writer (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IHash\n  (-hash [this]\n    (goog.string/hashCode (pr-str this))))",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9038 9054]},
 :full-name "cljs.core/UUID",
 :full-name-encode "cljs.core_UUID",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_UUID.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_UUID.cljsdoc)
</pre>

