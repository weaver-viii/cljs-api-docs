## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/Set.EMPTY~~

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[×] 0.0-1211" src="https://img.shields.io/badge/×-0.0--1211-red.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(set! cljs.core.Set/EMPTY (Set. nil (hash-map)))
```

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2708](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2708)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Set.EMPTY"]))
```

```clj
{:ns "cljs.core",
 :name "Set.EMPTY",
 :history [["+" "0.0-927"] ["-" "0.0-1211"]],
 :parent-type "Set",
 :type "var",
 :full-name-encode "cljs.core_SetDOTEMPTY",
 :source {:code "(set! cljs.core.Set/EMPTY (Set. nil (hash-map)))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2708]},
 :full-name "cljs.core/Set.EMPTY",
 :removed {:in "0.0-1211", :last-seen "0.0-1011"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_SetDOTEMPTY.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_SetDOTEMPTY.cljsdoc)
</pre>

