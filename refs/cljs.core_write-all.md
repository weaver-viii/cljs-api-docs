## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/write-all

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__write-all__ writer & ss)<br>
</samp>

---





Source code:

```clj
(defn write-all [writer & ss]
  (doseq [s ss]
    (-write writer s)))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8133-8135](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L8133-L8135)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/write-all"]))
```

```clj
{:ns "cljs.core",
 :name "write-all",
 :type "function",
 :signature ["[writer & ss]"],
 :source {:code "(defn write-all [writer & ss]\n  (doseq [s ss]\n    (-write writer s)))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8133 8135]},
 :full-name "cljs.core/write-all",
 :full-name-encode "cljs.core_write-all",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_write-all.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_write-all.cljsdoc)
</pre>

