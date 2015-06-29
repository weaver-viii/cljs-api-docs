## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEmptyableCollection

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEmptyableCollection
  (-empty [coll]))
```

 <pre>
clojurescript @ r2134
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:232-233](https://github.com/clojure/clojurescript/blob/r2134/src/cljs/cljs/core.cljs#L232-L233)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEmptyableCollection"]))
```

```clj
{:ns "cljs.core",
 :name "IEmptyableCollection",
 :type "protocol",
 :full-name-encode "cljs.core_IEmptyableCollection",
 :source {:code "(defprotocol IEmptyableCollection\n  (-empty [coll]))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/cljs/cljs/core.cljs",
          :lines [232 233]},
 :methods [{:name "-empty", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IEmptyableCollection",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEmptyableCollection.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEmptyableCollection.cljsdoc)
</pre>

