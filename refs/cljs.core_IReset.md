## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IReset

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IReset
  (-reset! [o new-value]))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:412-413](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L412-L413)</ins>
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
 :type "protocol",
 :full-name-encode "cljs.core_IReset",
 :source {:code "(defprotocol IReset\n  (-reset! [o new-value]))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [412 413]},
 :methods [{:name "-reset!",
            :signature ["[o new-value]"],
            :docstring nil}],
 :full-name "cljs.core/IReset",
 :history [["+" "0.0-2173"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IReset.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IReset.cljsdoc)
</pre>

