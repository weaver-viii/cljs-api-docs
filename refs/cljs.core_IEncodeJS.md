## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEncodeJS

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEncodeJS
  (-clj->js [x] "Recursively transforms clj values to JavaScript")
  (-key->js [x] "Transforms map keys to valid JavaScript keys. Arbitrary keys are
  encoded to their string representation via (pr-str x)"))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8941-8944](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L8941-L8944)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEncodeJS"]))
```

```clj
{:ns "cljs.core",
 :name "IEncodeJS",
 :type "protocol",
 :full-name-encode "cljs.core_IEncodeJS",
 :source {:code "(defprotocol IEncodeJS\n  (-clj->js [x] \"Recursively transforms clj values to JavaScript\")\n  (-key->js [x] \"Transforms map keys to valid JavaScript keys. Arbitrary keys are\n  encoded to their string representation via (pr-str x)\"))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8941 8944]},
 :methods [{:name "-clj->js",
            :signature ["[x]"],
            :docstring "Recursively transforms clj values to JavaScript"}
           {:name "-key->js",
            :signature ["[x]"],
            :docstring "Transforms map keys to valid JavaScript keys. Arbitrary keys are\n  encoded to their string representation via (pr-str x)"}],
 :full-name "cljs.core/IEncodeJS",
 :history [["+" "0.0-1552"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEncodeJS.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEncodeJS.cljsdoc)
</pre>

