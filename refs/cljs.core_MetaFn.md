## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/MetaFn

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2234"><img valign="middle" alt="[+] 0.0-2234" src="https://img.shields.io/badge/+-0.0--2234-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__MetaFn.__ afn meta)<br>
</samp>

---





Source code:

```clj
(deftype MetaFn [afn meta]
  IMeta
  (-meta [_] meta)
  IWithMeta
  (-with-meta [_ new-meta]
    (MetaFn. afn new-meta))
  Fn
  IFn
  (-invoke [_]
    (afn))
  (-invoke [_ a]
    (afn a))
  (-invoke [_ a b]
    (afn a b))
  (-invoke [_ a b c]
    (afn a b c))
  (-invoke [_ a b c d]
    (afn a b c d))
  (-invoke [_ a b c d e]
    (afn a b c d e))
  (-invoke [_ a b c d e f]
    (afn a b c d e f))
  (-invoke [_ a b c d e f g]
    (afn a b c d e f g))
  (-invoke [_ a b c d e f g h]
    (afn a b c d e f g h))
  (-invoke [_ a b c d e f g h i]
    (afn a b c d e f g h i))
  (-invoke [_ a b c d e f g h i j]
    (afn a b c d e f g h i j))
  (-invoke [_ a b c d e f g h i j k]
    (afn a b c d e f g h i j k))
  (-invoke [_ a b c d e f g h i j k l]
    (afn a b c d e f g h i j k l))
  (-invoke [_ a b c d e f g h i j k l m]
    (afn a b c d e f g h i j k l m))
  (-invoke [_ a b c d e f g h i j k l m n]
    (afn a b c d e f g h i j k l m n))
  (-invoke [_ a b c d e f g h i j k l m n o]
    (afn a b c d e f g h i j k l m n o))
  (-invoke [_ a b c d e f g h i j k l m n o p]
    (afn a b c d e f g h i j k l m n o p))
  (-invoke [_ a b c d e f g h i j k l m n o p q]
    (afn a b c d e f g h i j k l m n o p q))
  (-invoke [_ a b c d e f g h i j k l m n o p q r]
    (afn a b c d e f g h i j k l m n o p q r))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s]
    (afn a b c d e f g h i j k l m n o p q r s))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]
    (afn a b c d e f g h i j k l m n o p q r s t))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]
    (apply afn a b c d e f g h i j k l m n o p q r s t rest)))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1640-1691](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L1640-L1691)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/MetaFn"]))
```

```clj
{:ns "cljs.core",
 :name "MetaFn",
 :type "type",
 :signature ["[afn meta]"],
 :source {:code "(deftype MetaFn [afn meta]\n  IMeta\n  (-meta [_] meta)\n  IWithMeta\n  (-with-meta [_ new-meta]\n    (MetaFn. afn new-meta))\n  Fn\n  IFn\n  (-invoke [_]\n    (afn))\n  (-invoke [_ a]\n    (afn a))\n  (-invoke [_ a b]\n    (afn a b))\n  (-invoke [_ a b c]\n    (afn a b c))\n  (-invoke [_ a b c d]\n    (afn a b c d))\n  (-invoke [_ a b c d e]\n    (afn a b c d e))\n  (-invoke [_ a b c d e f]\n    (afn a b c d e f))\n  (-invoke [_ a b c d e f g]\n    (afn a b c d e f g))\n  (-invoke [_ a b c d e f g h]\n    (afn a b c d e f g h))\n  (-invoke [_ a b c d e f g h i]\n    (afn a b c d e f g h i))\n  (-invoke [_ a b c d e f g h i j]\n    (afn a b c d e f g h i j))\n  (-invoke [_ a b c d e f g h i j k]\n    (afn a b c d e f g h i j k))\n  (-invoke [_ a b c d e f g h i j k l]\n    (afn a b c d e f g h i j k l))\n  (-invoke [_ a b c d e f g h i j k l m]\n    (afn a b c d e f g h i j k l m))\n  (-invoke [_ a b c d e f g h i j k l m n]\n    (afn a b c d e f g h i j k l m n))\n  (-invoke [_ a b c d e f g h i j k l m n o]\n    (afn a b c d e f g h i j k l m n o))\n  (-invoke [_ a b c d e f g h i j k l m n o p]\n    (afn a b c d e f g h i j k l m n o p))\n  (-invoke [_ a b c d e f g h i j k l m n o p q]\n    (afn a b c d e f g h i j k l m n o p q))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r]\n    (afn a b c d e f g h i j k l m n o p q r))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s]\n    (afn a b c d e f g h i j k l m n o p q r s))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]\n    (afn a b c d e f g h i j k l m n o p q r s t))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]\n    (apply afn a b c d e f g h i j k l m n o p q r s t rest)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1640 1691]},
 :full-name "cljs.core/MetaFn",
 :full-name-encode "cljs.core_MetaFn",
 :history [["+" "0.0-2234"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_MetaFn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_MetaFn.cljsdoc)
</pre>

