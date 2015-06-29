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
  (let [ty (type obj)
        ty (if (and ty (.-cljs$lang$type ty))
             (.-cljs$lang$ctorStr ty)
             (goog/typeOf obj))]
   (js/Error.
     (.join (array "No protocol method " proto
                   " defined for type " ty ": " obj) ""))))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:141-148](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L141-L148)</ins>
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
 :source {:code "(defn missing-protocol [proto obj]\n  (let [ty (type obj)\n        ty (if (and ty (.-cljs$lang$type ty))\n             (.-cljs$lang$ctorStr ty)\n             (goog/typeOf obj))]\n   (js/Error.\n     (.join (array \"No protocol method \" proto\n                   \" defined for type \" ty \": \" obj) \"\"))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [141 148]},
 :full-name "cljs.core/missing-protocol",
 :full-name-encode "cljs.core_missing-protocol",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_missing-protocol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_missing-protocol.cljsdoc)
</pre>

