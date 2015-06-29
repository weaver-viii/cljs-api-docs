## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IVolatile

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IVolatile
  (-vreset! [o new-value]))
```

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:405-406](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L405-L406)</ins>
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
 :type "protocol",
 :full-name-encode "cljs.core_IVolatile",
 :source {:code "(defprotocol IVolatile\n  (-vreset! [o new-value]))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [405 406]},
 :methods [{:name "-vreset!",
            :signature ["[o new-value]"],
            :docstring nil}],
 :full-name "cljs.core/IVolatile",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IVolatile.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IVolatile.cljsdoc)
</pre>

