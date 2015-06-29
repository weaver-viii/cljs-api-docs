## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*target\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^{:dynamic true
       :jsdoc ["@define {string}"]}
  *target* "default")
```

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:20-22](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L20-L22)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*target*"]))
```

```clj
{:ns "cljs.core",
 :name "*target*",
 :type "dynamic var",
 :source {:code "(def ^{:dynamic true\n       :jsdoc [\"@define {string}\"]}\n  *target* \"default\")",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [20 22]},
 :full-name "cljs.core/*target*",
 :full-name-encode "cljs.core_STARtargetSTAR",
 :history [["+" "0.0-2985"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARtargetSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARtargetSTAR.cljsdoc)
</pre>

