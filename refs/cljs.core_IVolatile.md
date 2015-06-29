## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IVolatile

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding volatile functionality.
```

Source code:

```clj
(defprotocol IVolatile
  "Protocol for adding volatile functionality."
  (-vreset! [o new-value]
    "Sets the value of volatile o to new-value without regard for the
     current value. Returns new-value."))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:627-631](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L627-L631)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IVolatile"]))
```

```clj
{:ns "cljs.core",
 :name "IVolatile",
 :history [["+" "0.0-2496"]],
 :type "protocol",
 :full-name-encode "cljs.core_IVolatile",
 :source {:code "(defprotocol IVolatile\n  \"Protocol for adding volatile functionality.\"\n  (-vreset! [o new-value]\n    \"Sets the value of volatile o to new-value without regard for the\n     current value. Returns new-value.\"))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [627 631]},
 :methods [{:name "-vreset!",
            :signature ["[o new-value]"],
            :docstring "Sets the value of volatile o to new-value without regard for the\n     current value. Returns new-value."}],
 :full-name "cljs.core/IVolatile",
 :docstring "Protocol for adding volatile functionality."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IVolatile.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IVolatile.cljsdoc)
</pre>

