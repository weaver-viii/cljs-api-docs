## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cloneable?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__cloneable?__ value)<br>
</samp>

---





Source code:

```clj
(defn cloneable? [value]
  (satisfies? ICloneable value))
```

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:593-594](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L593-L594)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cloneable?"]))
```

```clj
{:ns "cljs.core",
 :name "cloneable?",
 :type "function",
 :signature ["[value]"],
 :source {:code "(defn cloneable? [value]\n  (satisfies? ICloneable value))",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [593 594]},
 :full-name "cljs.core/cloneable?",
 :full-name-encode "cljs.core_cloneableQMARK",
 :history [["+" "0.0-2156"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_cloneableQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_cloneableQMARK.cljsdoc)
</pre>

