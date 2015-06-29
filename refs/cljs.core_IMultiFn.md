## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMultiFn

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IMultiFn
  (-reset [mf])
  (-add-method [mf dispatch-val method])
  (-remove-method [mf dispatch-val])
  (-prefer-method [mf dispatch-val dispatch-val-y])
  (-get-method [mf dispatch-val])
  (-methods [mf])
  (-prefers [mf])
  (-dispatch [mf args]))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7366-7374](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L7366-L7374)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMultiFn"]))
```

```clj
{:ns "cljs.core",
 :name "IMultiFn",
 :type "protocol",
 :full-name-encode "cljs.core_IMultiFn",
 :source {:code "(defprotocol IMultiFn\n  (-reset [mf])\n  (-add-method [mf dispatch-val method])\n  (-remove-method [mf dispatch-val])\n  (-prefer-method [mf dispatch-val dispatch-val-y])\n  (-get-method [mf dispatch-val])\n  (-methods [mf])\n  (-prefers [mf])\n  (-dispatch [mf args]))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7366 7374]},
 :methods [{:name "-reset", :signature ["[mf]"], :docstring nil}
           {:name "-add-method",
            :signature ["[mf dispatch-val method]"],
            :docstring nil}
           {:name "-remove-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-prefer-method",
            :signature ["[mf dispatch-val dispatch-val-y]"],
            :docstring nil}
           {:name "-get-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-methods", :signature ["[mf]"], :docstring nil}
           {:name "-prefers", :signature ["[mf]"], :docstring nil}
           {:name "-dispatch",
            :signature ["[mf args]"],
            :docstring nil}],
 :full-name "cljs.core/IMultiFn",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMultiFn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMultiFn.cljsdoc)
</pre>

