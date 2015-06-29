## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IFn

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IFn</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IFn.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol IFn
  (-invoke
    [this]
    [this a]
    [this a b]
    [this a b c]
    [this a b c d]
    [this a b c d e]
    [this a b c d e f]
    [this a b c d e f g]
    [this a b c d e f g h]
    [this a b c d e f g h i]
    [this a b c d e f g h i j]
    [this a b c d e f g h i j k]
    [this a b c d e f g h i j k l]
    [this a b c d e f g h i j k l m]
    [this a b c d e f g h i j k l m n]
    [this a b c d e f g h i j k l m n o]
    [this a b c d e f g h i j k l m n o p]
    [this a b c d e f g h i j k l m n o p q]
    [this a b c d e f g h i j k l m n o p q r]
    [this a b c d e f g h i j k l m n o p q r s]
    [this a b c d e f g h i j k l m n o p q r s t]
    [this a b c d e f g h i j k l m n o p q r s t rest]))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:217-240](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L217-L240)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IFn"]))
```

```clj
{:ns "cljs.core",
 :name "IFn",
 :history [["+" "0.0-971"]],
 :type "protocol",
 :full-name-encode "cljs.core_IFn",
 :source {:code "(defprotocol IFn\n  (-invoke\n    [this]\n    [this a]\n    [this a b]\n    [this a b c]\n    [this a b c d]\n    [this a b c d e]\n    [this a b c d e f]\n    [this a b c d e f g]\n    [this a b c d e f g h]\n    [this a b c d e f g h i]\n    [this a b c d e f g h i j]\n    [this a b c d e f g h i j k]\n    [this a b c d e f g h i j k l]\n    [this a b c d e f g h i j k l m]\n    [this a b c d e f g h i j k l m n]\n    [this a b c d e f g h i j k l m n o]\n    [this a b c d e f g h i j k l m n o p]\n    [this a b c d e f g h i j k l m n o p q]\n    [this a b c d e f g h i j k l m n o p q r]\n    [this a b c d e f g h i j k l m n o p q r s]\n    [this a b c d e f g h i j k l m n o p q r s t]\n    [this a b c d e f g h i j k l m n o p q r s t rest]))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [217 240]},
 :methods [{:name "-invoke",
            :signature ["[this]"
                        "[this a]"
                        "[this a b]"
                        "[this a b c]"
                        "[this a b c d]"
                        "[this a b c d e]"
                        "[this a b c d e f]"
                        "[this a b c d e f g]"
                        "[this a b c d e f g h]"
                        "[this a b c d e f g h i]"
                        "[this a b c d e f g h i j]"
                        "[this a b c d e f g h i j k]"
                        "[this a b c d e f g h i j k l]"
                        "[this a b c d e f g h i j k l m]"
                        "[this a b c d e f g h i j k l m n]"
                        "[this a b c d e f g h i j k l m n o]"
                        "[this a b c d e f g h i j k l m n o p]"
                        "[this a b c d e f g h i j k l m n o p q]"
                        "[this a b c d e f g h i j k l m n o p q r]"
                        "[this a b c d e f g h i j k l m n o p q r s]"
                        "[this a b c d e f g h i j k l m n o p q r s t]"
                        "[this a b c d e f g h i j k l m n o p q r s t rest]"],
            :docstring nil}],
 :full-name "cljs.core/IFn",
 :clj-symbol "clojure.lang/IFn"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IFn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IFn.cljsdoc)
</pre>

