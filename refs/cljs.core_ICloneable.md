## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICloneable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2134"><img valign="middle" alt="[+] 0.0-2134" src="https://img.shields.io/badge/+-0.0--2134-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for cloning a value.
```

Source code:

```clj
(defprotocol ICloneable
  "Protocol for cloning a value."
  (^clj -clone [value]
    "Creates a clone of value."))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:337-340](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L337-L340)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICloneable"]))
```

```clj
{:ns "cljs.core",
 :name "ICloneable",
 :history [["+" "0.0-2134"]],
 :type "protocol",
 :full-name-encode "cljs.core_ICloneable",
 :source {:code "(defprotocol ICloneable\n  \"Protocol for cloning a value.\"\n  (^clj -clone [value]\n    \"Creates a clone of value.\"))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [337 340]},
 :methods [{:name "-clone",
            :signature ["[value]"],
            :docstring "Creates a clone of value."}],
 :full-name "cljs.core/ICloneable",
 :docstring "Protocol for cloning a value."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ICloneable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ICloneable.cljsdoc)
</pre>

