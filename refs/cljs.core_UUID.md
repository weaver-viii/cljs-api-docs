## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/UUID

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__UUID.__ uuid __hash)<br>
</samp>

---





Source code:

```clj
(deftype UUID [uuid ^:mutable __hash]
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
    (when (nil? __hash)
      (set! __hash (goog.string/hashCode uuid)))
    __hash)

  IComparable
  (-compare [_ other]
    (garray/defaultCompare uuid (.-uuid other))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9505-9527](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L9505-L9527)</ins>
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
 :signature ["[uuid __hash]"],
 :source {:code "(deftype UUID [uuid ^:mutable __hash]\n  Object\n  (toString [_] uuid)\n  (equiv [this other]\n    (-equiv this other))\n\n  IEquiv\n  (-equiv [_ other]\n    (and (instance? UUID other) (identical? uuid (.-uuid other))))\n\n  IPrintWithWriter\n  (-pr-writer [_ writer _]\n    (-write writer (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IHash\n  (-hash [this]\n    (when (nil? __hash)\n      (set! __hash (goog.string/hashCode uuid)))\n    __hash)\n\n  IComparable\n  (-compare [_ other]\n    (garray/defaultCompare uuid (.-uuid other))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9505 9527]},
 :full-name "cljs.core/UUID",
 :full-name-encode "cljs.core_UUID",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_UUID.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_UUID.cljsdoc)
</pre>

