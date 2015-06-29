## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IPrintable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IPrintable
  (-pr-seq [o opts]))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:236-237](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L236-L237)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IPrintable"]))
```

```clj
{:ns "cljs.core",
 :name "IPrintable",
 :type "protocol",
 :full-name-encode "cljs.core_IPrintable",
 :source {:code "(defprotocol IPrintable\n  (-pr-seq [o opts]))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [236 237]},
 :methods [{:name "-pr-seq", :signature ["[o opts]"], :docstring nil}],
 :full-name "cljs.core/IPrintable",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IPrintable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IPrintable.cljsdoc)
</pre>

