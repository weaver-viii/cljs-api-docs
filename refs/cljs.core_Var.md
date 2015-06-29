## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Var

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Var</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Var.java)
</td>
</tr>
</table>

 <samp>
(__Var.__ val sym _meta)<br>
</samp>

---





Source code:

```clj
(deftype Var [val sym _meta]
  IDeref
  (-deref [_] (val))
  IMeta
  (-meta [_] _meta)
  Fn
  IFn
  (-invoke [_]
    ((val)))
  (-invoke [_ a]
    ((val) a))
  (-invoke [_ a b]
    ((val) a b))
  (-invoke [_ a b c]
    ((val) a b c))
  (-invoke [_ a b c d]
    ((val) a b c d))
  (-invoke [_ a b c d e]
    ((val) a b c d e))
  (-invoke [_ a b c d e f]
    ((val) a b c d e f))
  (-invoke [_ a b c d e f g]
    ((val) a b c d e f g))
  (-invoke [_ a b c d e f g h]
    ((val) a b c d e f g h))
  (-invoke [_ a b c d e f g h i]
    ((val) a b c d e f g h i))
  (-invoke [_ a b c d e f g h i j]
    ((val) a b c d e f g h i j))
  (-invoke [_ a b c d e f g h i j k]
    ((val) a b c d e f g h i j k))
  (-invoke [_ a b c d e f g h i j k l]
    ((val) a b c d e f g h i j k l))
  (-invoke [_ a b c d e f g h i j k l m]
    ((val) a b c d e f g h i j k l m))
  (-invoke [_ a b c d e f g h i j k l m n]
    ((val) a b c d e f g h i j k l m n))
  (-invoke [_ a b c d e f g h i j k l m n o]
    ((val) a b c d e f g h i j k l m n o))
  (-invoke [_ a b c d e f g h i j k l m n o p]
    ((val) a b c d e f g h i j k l m n o p))
  (-invoke [_ a b c d e f g h i j k l m n o p q]
    ((val) a b c d e f g h i j k l m n o p q))
  (-invoke [_ a b c d e f g h i j k l m n o p q r]
    ((val) a b c d e f g h i j k l m n o p q r))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s]
    ((val) a b c d e f g h i j k l m n o p q r s))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]
    ((val) a b c d e f g h i j k l m n o p q r s t))
  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]
    (apply (val) a b c d e f g h i j k l m n o p q r s t rest)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:859-909](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L859-L909)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Var"]))
```

```clj
{:ns "cljs.core",
 :name "Var",
 :signature ["[val sym _meta]"],
 :history [["+" "0.0-2496"]],
 :type "type",
 :full-name-encode "cljs.core_Var",
 :source {:code "(deftype Var [val sym _meta]\n  IDeref\n  (-deref [_] (val))\n  IMeta\n  (-meta [_] _meta)\n  Fn\n  IFn\n  (-invoke [_]\n    ((val)))\n  (-invoke [_ a]\n    ((val) a))\n  (-invoke [_ a b]\n    ((val) a b))\n  (-invoke [_ a b c]\n    ((val) a b c))\n  (-invoke [_ a b c d]\n    ((val) a b c d))\n  (-invoke [_ a b c d e]\n    ((val) a b c d e))\n  (-invoke [_ a b c d e f]\n    ((val) a b c d e f))\n  (-invoke [_ a b c d e f g]\n    ((val) a b c d e f g))\n  (-invoke [_ a b c d e f g h]\n    ((val) a b c d e f g h))\n  (-invoke [_ a b c d e f g h i]\n    ((val) a b c d e f g h i))\n  (-invoke [_ a b c d e f g h i j]\n    ((val) a b c d e f g h i j))\n  (-invoke [_ a b c d e f g h i j k]\n    ((val) a b c d e f g h i j k))\n  (-invoke [_ a b c d e f g h i j k l]\n    ((val) a b c d e f g h i j k l))\n  (-invoke [_ a b c d e f g h i j k l m]\n    ((val) a b c d e f g h i j k l m))\n  (-invoke [_ a b c d e f g h i j k l m n]\n    ((val) a b c d e f g h i j k l m n))\n  (-invoke [_ a b c d e f g h i j k l m n o]\n    ((val) a b c d e f g h i j k l m n o))\n  (-invoke [_ a b c d e f g h i j k l m n o p]\n    ((val) a b c d e f g h i j k l m n o p))\n  (-invoke [_ a b c d e f g h i j k l m n o p q]\n    ((val) a b c d e f g h i j k l m n o p q))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r]\n    ((val) a b c d e f g h i j k l m n o p q r))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s]\n    ((val) a b c d e f g h i j k l m n o p q r s))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t]\n    ((val) a b c d e f g h i j k l m n o p q r s t))\n  (-invoke [_ a b c d e f g h i j k l m n o p q r s t rest]\n    (apply (val) a b c d e f g h i j k l m n o p q r s t rest)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [859 909]},
 :full-name "cljs.core/Var",
 :clj-symbol "clojure.lang/Var"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Var.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Var.cljsdoc)
</pre>

