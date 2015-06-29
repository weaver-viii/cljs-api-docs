## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IPending

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPending</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPending.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for types which can have a deferred realization. Currently only
  implemented by Delay.
```

Source code:

```clj
(defprotocol IPending
  "Protocol for types which can have a deferred realization. Currently only
  implemented by Delay."
  (^boolean -realized? [d]
    "Returns true if a value for d has been produced, false otherwise."))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:533-537](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L533-L537)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IPending"]))
```

```clj
{:ns "cljs.core",
 :name "IPending",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IPending",
 :source {:code "(defprotocol IPending\n  \"Protocol for types which can have a deferred realization. Currently only\n  implemented by Delay.\"\n  (^boolean -realized? [d]\n    \"Returns true if a value for d has been produced, false otherwise.\"))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [533 537]},
 :methods [{:name "-realized?",
            :signature ["[d]"],
            :docstring "Returns true if a value for d has been produced, false otherwise."}],
 :full-name "cljs.core/IPending",
 :clj-symbol "clojure.lang/IPending",
 :docstring "Protocol for types which can have a deferred realization. Currently only\n  implemented by Delay."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IPending.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IPending.cljsdoc)
</pre>

