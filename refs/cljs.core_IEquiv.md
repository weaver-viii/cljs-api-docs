## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEquiv

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for adding value comparison functionality to a type.
```

Source code:

```clj
(defprotocol IEquiv
  "Protocol for adding value comparison functionality to a type."
  (^boolean -equiv [o other]
    "Returns true if o and other are equal, false otherwise."))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:472-475](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L472-L475)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEquiv"]))
```

```clj
{:ns "cljs.core",
 :name "IEquiv",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_IEquiv",
 :source {:code "(defprotocol IEquiv\n  \"Protocol for adding value comparison functionality to a type.\"\n  (^boolean -equiv [o other]\n    \"Returns true if o and other are equal, false otherwise.\"))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [472 475]},
 :methods [{:name "-equiv",
            :signature ["[o other]"],
            :docstring "Returns true if o and other are equal, false otherwise."}],
 :full-name "cljs.core/IEquiv",
 :docstring "Protocol for adding value comparison functionality to a type."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEquiv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEquiv.cljsdoc)
</pre>

