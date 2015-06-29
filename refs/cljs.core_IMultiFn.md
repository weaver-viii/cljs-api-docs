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
  (-default-dispatch-val [mf])
  (-dispatch-fn [mf]))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9270-9279](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L9270-L9279)</ins>
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
 :source {:code "(defprotocol IMultiFn\n  (-reset [mf])\n  (-add-method [mf dispatch-val method])\n  (-remove-method [mf dispatch-val])\n  (-prefer-method [mf dispatch-val dispatch-val-y])\n  (-get-method [mf dispatch-val])\n  (-methods [mf])\n  (-prefers [mf])\n  (-default-dispatch-val [mf])\n  (-dispatch-fn [mf]))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9270 9279]},
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
           {:name "-default-dispatch-val",
            :signature ["[mf]"],
            :docstring nil}
           {:name "-dispatch-fn", :signature ["[mf]"], :docstring nil}],
 :full-name "cljs.core/IMultiFn",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IMultiFn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IMultiFn.cljsdoc)
</pre>

