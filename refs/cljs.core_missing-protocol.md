## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/missing-protocol

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__missing-protocol__ proto obj)<br>
</samp>

---





Source code:

```clj
(defn missing-protocol [proto obj]
  (js/Error (js* "~{}+~{}+~{}+~{}+~{}+~{}"
                 "No protocol method " proto
                 " defined for type " (goog/typeOf obj) ": " obj)))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:58-61](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L58-L61)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/missing-protocol"]))
```

```clj
{:ns "cljs.core",
 :name "missing-protocol",
 :type "function",
 :signature ["[proto obj]"],
 :source {:code "(defn missing-protocol [proto obj]\n  (js/Error (js* \"~{}+~{}+~{}+~{}+~{}+~{}\"\n                 \"No protocol method \" proto\n                 \" defined for type \" (goog/typeOf obj) \": \" obj)))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [58 61]},
 :full-name "cljs.core/missing-protocol",
 :full-name-encode "cljs.core_missing-protocol",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_missing-protocol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_missing-protocol.cljsdoc)
</pre>

