## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMap

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IMap
  #_(-assoc-ex [coll k v])
  (-dissoc [coll k]))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:252-254](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L252-L254)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMap"]))
```

```clj
{:ns "cljs.core",
 :name "IMap",
 :type "protocol",
 :full-name-encode "cljs.core_IMap",
 :source {:code "(defprotocol IMap\n  #_(-assoc-ex [coll k v])\n  (-dissoc [coll k]))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [252 254]},
 :methods [{:name "-dissoc", :signature ["[coll k]"], :docstring nil}],
 :full-name "cljs.core/IMap",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMap.cljsdoc)
</pre>

