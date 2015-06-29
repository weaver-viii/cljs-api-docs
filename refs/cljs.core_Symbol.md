## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Symbol

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Symbol</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Symbol.java)
</td>
</tr>
</table>

 <samp>
(__Symbol.__ ns name str _hash _meta)<br>
</samp>

---





Source code:

```clj
(deftype Symbol [ns name str ^:mutable _hash _meta]
  Object
  (toString [_] str)
  (equiv [this other] (-equiv this other))

  IEquiv
  (-equiv [_ other]
    (if (instance? Symbol other)
      (identical? str (.-str other))
      false))

  IFn
  (-invoke [sym coll]
    (-lookup coll sym nil))
  (-invoke [sym coll not-found]
    (-lookup coll sym not-found))

  IMeta
  (-meta [_] _meta)

  IWithMeta
  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))

  IHash
  (-hash [sym]
    (caching-hash sym hash-symbol _hash))

  INamed
  (-name [_] name)
  (-namespace [_] ns)

  IPrintWithWriter
  (-pr-writer [o writer _] (-write writer str)))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:596-628](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L596-L628)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Symbol"]))
```

```clj
{:ns "cljs.core",
 :name "Symbol",
 :signature ["[ns name str _hash _meta]"],
 :history [["+" "0.0-1798"]],
 :type "type",
 :full-name-encode "cljs.core_Symbol",
 :source {:code "(deftype Symbol [ns name str ^:mutable _hash _meta]\n  Object\n  (toString [_] str)\n  (equiv [this other] (-equiv this other))\n\n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Symbol other)\n      (identical? str (.-str other))\n      false))\n\n  IFn\n  (-invoke [sym coll]\n    (-lookup coll sym nil))\n  (-invoke [sym coll not-found]\n    (-lookup coll sym not-found))\n\n  IMeta\n  (-meta [_] _meta)\n\n  IWithMeta\n  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))\n\n  IHash\n  (-hash [sym]\n    (caching-hash sym hash-symbol _hash))\n\n  INamed\n  (-name [_] name)\n  (-namespace [_] ns)\n\n  IPrintWithWriter\n  (-pr-writer [o writer _] (-write writer str)))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [596 628]},
 :full-name "cljs.core/Symbol",
 :clj-symbol "clojure.lang/Symbol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Symbol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Symbol.cljsdoc)
</pre>

