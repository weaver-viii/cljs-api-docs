## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Keyword

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Keyword</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Keyword.java)
</td>
</tr>
</table>

 <samp>
(__Keyword.__ ns name fqn _hash)<br>
</samp>

---





Source code:

```clj
(deftype Keyword [ns name fqn ^:mutable _hash]
  Object
  (toString [_] (str ":" fqn))
  
  IEquiv
  (-equiv [_ other]
    (if (instance? Keyword other)
      (identical? fqn (.-fqn other))
      false))
  IFn
  (-invoke [kw coll]
    (get coll kw))
  (-invoke [kw coll not-found]
    (get coll kw not-found))

  IHash
  (-hash [_]
    ; This was checking if _hash == -1, should it stay that way?
    (if (nil? _hash)
      (do
        (set! _hash (+ (hash-combine (hash ns) (hash name))
                        0x9e3779b9))
        _hash)
      _hash))

  INamed
  (-name [_] name)
  (-namespace [_] ns)

  IPrintWithWriter
  (-pr-writer [o writer _] (-write writer (str ":" fqn))))
```

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2087-2117](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L2087-L2117)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Keyword"]))
```

```clj
{:ns "cljs.core",
 :name "Keyword",
 :signature ["[ns name fqn _hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core_Keyword",
 :source {:code "(deftype Keyword [ns name fqn ^:mutable _hash]\n  Object\n  (toString [_] (str \":\" fqn))\n  \n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Keyword other)\n      (identical? fqn (.-fqn other))\n      false))\n  IFn\n  (-invoke [kw coll]\n    (get coll kw))\n  (-invoke [kw coll not-found]\n    (get coll kw not-found))\n\n  IHash\n  (-hash [_]\n    ; This was checking if _hash == -1, should it stay that way?\n    (if (nil? _hash)\n      (do\n        (set! _hash (+ (hash-combine (hash ns) (hash name))\n                        0x9e3779b9))\n        _hash)\n      _hash))\n\n  INamed\n  (-name [_] name)\n  (-namespace [_] ns)\n\n  IPrintWithWriter\n  (-pr-writer [o writer _] (-write writer (str \":\" fqn))))",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2087 2117]},
 :full-name "cljs.core/Keyword",
 :clj-symbol "clojure.lang/Keyword"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Keyword.cljsdoc)
</pre>

