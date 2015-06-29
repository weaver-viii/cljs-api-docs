## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/TaggedLiteral

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TaggedLiteral</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/TaggedLiteral.java)
</td>
</tr>
</table>

 <samp>
(__TaggedLiteral.__ tag form)<br>
</samp>

---





Source code:

```clj
(deftype TaggedLiteral [tag form]

  IEquiv
  (-equiv [this other]
    (and (instance? TaggedLiteral other)
         (= tag (.-tag other))
         (= form (.-form other))))

  IHash
  (-hash [this]
    (+ (* 31 (hash tag))
       (hash form)))

  ILookup
  (-lookup [this v]
    (-lookup this v nil))
  (-lookup [this v not-found]
    (case v
      :tag tag
      :form form
      not-found))

  )
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9634-9656](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L9634-L9656)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TaggedLiteral"]))
```

```clj
{:ns "cljs.core",
 :name "TaggedLiteral",
 :signature ["[tag form]"],
 :history [["+" "0.0-3255"]],
 :type "type",
 :full-name-encode "cljs.core_TaggedLiteral",
 :source {:code "(deftype TaggedLiteral [tag form]\n\n  IEquiv\n  (-equiv [this other]\n    (and (instance? TaggedLiteral other)\n         (= tag (.-tag other))\n         (= form (.-form other))))\n\n  IHash\n  (-hash [this]\n    (+ (* 31 (hash tag))\n       (hash form)))\n\n  ILookup\n  (-lookup [this v]\n    (-lookup this v nil))\n  (-lookup [this v not-found]\n    (case v\n      :tag tag\n      :form form\n      not-found))\n\n  )",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9634 9656]},
 :full-name "cljs.core/TaggedLiteral",
 :clj-symbol "clojure.lang/TaggedLiteral"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_TaggedLiteral.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_TaggedLiteral.cljsdoc)
</pre>

