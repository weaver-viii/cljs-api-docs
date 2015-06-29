## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICounted

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Counted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Counted.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding the ability to count a collection in constant time.
```

Source code:

```clj
(defprotocol ICounted
  "Protocol for adding the ability to count a collection in constant time."
  (^number -count [coll]
    "Calculates the count of coll in constant time. Used by cljs.core/count."))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:342-345](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L342-L345)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICounted"]))
```

```clj
{:ns "cljs.core",
 :name "ICounted",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ICounted",
 :source {:code "(defprotocol ICounted\n  \"Protocol for adding the ability to count a collection in constant time.\"\n  (^number -count [coll]\n    \"Calculates the count of coll in constant time. Used by cljs.core/count.\"))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [342 345]},
 :methods [{:name "-count",
            :signature ["[coll]"],
            :docstring "Calculates the count of coll in constant time. Used by cljs.core/count."}],
 :full-name "cljs.core/ICounted",
 :clj-symbol "clojure.lang/Counted",
 :docstring "Protocol for adding the ability to count a collection in constant time."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICounted.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICounted.cljsdoc)
</pre>

