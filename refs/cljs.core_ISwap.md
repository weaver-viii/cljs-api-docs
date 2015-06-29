## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISwap

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding swapping functionality.
```

Source code:

```clj
(defprotocol ISwap
  "Protocol for adding swapping functionality."
  (-swap! [o f] [o f a] [o f a b] [o f a b xs]
    "Swaps the value of o to be (apply f current-value-of-atom args)."))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:622-625](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L622-L625)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISwap"]))
```

```clj
{:ns "cljs.core",
 :name "ISwap",
 :history [["+" "0.0-2173"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISwap",
 :source {:code "(defprotocol ISwap\n  \"Protocol for adding swapping functionality.\"\n  (-swap! [o f] [o f a] [o f a b] [o f a b xs]\n    \"Swaps the value of o to be (apply f current-value-of-atom args).\"))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [622 625]},
 :methods [{:name "-swap!",
            :signature ["[o f]" "[o f a]" "[o f a b]" "[o f a b xs]"],
            :docstring "Swaps the value of o to be (apply f current-value-of-atom args)."}],
 :full-name "cljs.core/ISwap",
 :docstring "Protocol for adding swapping functionality."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISwap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISwap.cljsdoc)
</pre>

