## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IReversible

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Reversible</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Reversible.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for reversing a seq.
```

Source code:

```clj
(defprotocol IReversible
  "Protocol for reversing a seq."
  (^clj -rseq [coll]
    "Returns a seq of the items in coll in reversed order."))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:496-499](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L496-L499)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IReversible"]))
```

```clj
{:ns "cljs.core",
 :name "IReversible",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_IReversible",
 :source {:code "(defprotocol IReversible\n  \"Protocol for reversing a seq.\"\n  (^clj -rseq [coll]\n    \"Returns a seq of the items in coll in reversed order.\"))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [496 499]},
 :methods [{:name "-rseq",
            :signature ["[coll]"],
            :docstring "Returns a seq of the items in coll in reversed order."}],
 :full-name "cljs.core/IReversible",
 :clj-symbol "clojure.lang/Reversible",
 :docstring "Protocol for reversing a seq."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IReversible.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IReversible.cljsdoc)
</pre>

