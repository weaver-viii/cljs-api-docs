## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWithMeta

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IWithMeta
  (-with-meta [o meta]))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:259-260](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L259-L260)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWithMeta"]))
```

```clj
{:ns "cljs.core",
 :name "IWithMeta",
 :type "protocol",
 :full-name-encode "cljs.core_IWithMeta",
 :source {:code "(defprotocol IWithMeta\n  (-with-meta [o meta]))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [259 260]},
 :methods [{:name "-with-meta",
            :signature ["[o meta]"],
            :docstring nil}],
 :full-name "cljs.core/IWithMeta",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IWithMeta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IWithMeta.cljsdoc)
</pre>

