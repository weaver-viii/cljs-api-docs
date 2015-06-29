## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientAssociative

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientAssociative</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientAssociative.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding associativity to transient collections.
```

Source code:

```clj
(defprotocol ITransientAssociative
  "Protocol for adding associativity to transient collections."
  (^clj -assoc! [tcoll key val]
    "Returns a new transient collection of tcoll with a mapping from key to
     val added to it."))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:561-565](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L561-L565)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientAssociative"]))
```

```clj
{:ns "cljs.core",
 :name "ITransientAssociative",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core_ITransientAssociative",
 :source {:code "(defprotocol ITransientAssociative\n  \"Protocol for adding associativity to transient collections.\"\n  (^clj -assoc! [tcoll key val]\n    \"Returns a new transient collection of tcoll with a mapping from key to\n     val added to it.\"))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [561 565]},
 :methods [{:name "-assoc!",
            :signature ["[tcoll key val]"],
            :docstring "Returns a new transient collection of tcoll with a mapping from key to\n     val added to it."}],
 :full-name "cljs.core/ITransientAssociative",
 :clj-symbol "clojure.lang/ITransientAssociative",
 :docstring "Protocol for adding associativity to transient collections."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ITransientAssociative.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ITransientAssociative.cljsdoc)
</pre>

