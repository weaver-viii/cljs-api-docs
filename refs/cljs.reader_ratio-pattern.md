## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/ratio-pattern

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ratio-pattern (re-pattern "^([-+]?[0-9]+)/([0-9]+)$"))
```

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:99](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/reader.cljs#L99)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/ratio-pattern"]))
```

```clj
{:ns "cljs.reader",
 :name "ratio-pattern",
 :type "var",
 :source {:code "(def ratio-pattern (re-pattern \"^([-+]?[0-9]+)/([0-9]+)$\"))",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [99]},
 :full-name "cljs.reader/ratio-pattern",
 :full-name-encode "cljs.reader_ratio-pattern",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_ratio-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_ratio-pattern.cljsdoc)
</pre>

