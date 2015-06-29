## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IReset

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding resetting functionality.
```

Source code:

```clj
(defprotocol IReset
  "Protocol for adding resetting functionality."
  (-reset! [o new-value]
    "Sets the value of o to new-value."))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:617-620](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L617-L620)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IReset"]))
```

```clj
{:ns "cljs.core",
 :name "IReset",
 :history [["+" "0.0-2173"]],
 :type "protocol",
 :full-name-encode "cljs.core_IReset",
 :source {:code "(defprotocol IReset\n  \"Protocol for adding resetting functionality.\"\n  (-reset! [o new-value]\n    \"Sets the value of o to new-value.\"))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [617 620]},
 :methods [{:name "-reset!",
            :signature ["[o new-value]"],
            :docstring "Sets the value of o to new-value."}],
 :full-name "cljs.core/IReset",
 :docstring "Protocol for adding resetting functionality."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IReset.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IReset.cljsdoc)
</pre>

