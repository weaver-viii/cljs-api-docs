## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/spec-sort

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def spec-sort
  {:as 0
   :refer 1
   :refer-macros 2
   :include-macros 3})
```

 <pre>
clojurescript @ r2644
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:190-194](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/repl.clj#L190-L194)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/spec-sort"]))
```

```clj
{:ns "cljs.repl",
 :name "spec-sort",
 :type "var",
 :source {:code "(def spec-sort\n  {:as 0\n   :refer 1\n   :refer-macros 2\n   :include-macros 3})",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl.clj",
          :lines [190 194]},
 :full-name "cljs.repl/spec-sort",
 :full-name-encode "cljs.repl_spec-sort",
 :history [["+" "0.0-2629"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_spec-sort.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_spec-sort.cljsdoc)
</pre>

