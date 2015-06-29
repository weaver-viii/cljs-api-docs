## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/INext

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol INext
  (^clj-or-nil -next [coll]))
```

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:301-302](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L301-L302)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INext"]))
```

```clj
{:ns "cljs.core",
 :name "INext",
 :type "protocol",
 :full-name-encode "cljs.core_INext",
 :source {:code "(defprotocol INext\n  (^clj-or-nil -next [coll]))",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [301 302]},
 :methods [{:name "-next", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/INext",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_INext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_INext.cljsdoc)
</pre>

