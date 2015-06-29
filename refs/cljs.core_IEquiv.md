## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEquiv

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(defprotocol IEquiv
  (^boolean -equiv [o other]))
```

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:326-327](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L326-L327)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEquiv"]))
```

```clj
{:ns "cljs.core",
 :name "IEquiv",
 :type "protocol",
 :full-name-encode "cljs.core_IEquiv",
 :source {:code "(defprotocol IEquiv\n  (^boolean -equiv [o other]))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [326 327]},
 :methods [{:name "-equiv", :signature ["[o other]"], :docstring nil}],
 :full-name "cljs.core/IEquiv",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IEquiv.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IEquiv.cljsdoc)
</pre>

