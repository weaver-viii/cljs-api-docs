## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IIterable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2356"><img valign="middle" alt="[+] 0.0-2356" src="https://img.shields.io/badge/+-0.0--2356-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IIterable
  (-iterator [coll]))
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:443-444](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L443-L444)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIterable"]))
```

```clj
{:ns "cljs.core",
 :name "IIterable",
 :type "protocol",
 :full-name-encode "cljs.core_IIterable",
 :source {:code "(defprotocol IIterable\n  (-iterator [coll]))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [443 444]},
 :methods [{:name "-iterator", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IIterable",
 :history [["+" "0.0-2356"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IIterable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IIterable.cljsdoc)
</pre>

