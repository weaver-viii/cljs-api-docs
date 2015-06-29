## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/unicode-2-pattern

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def unicode-2-pattern (re-pattern "^[0-9A-Fa-f]{2}$"))
```

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:181](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/reader.cljs#L181)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/unicode-2-pattern"]))
```

```clj
{:ns "cljs.reader",
 :name "unicode-2-pattern",
 :type "var",
 :source {:code "(def unicode-2-pattern (re-pattern \"^[0-9A-Fa-f]{2}$\"))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [181]},
 :full-name "cljs.reader/unicode-2-pattern",
 :full-name-encode "cljs.reader_unicode-2-pattern",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_unicode-2-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_unicode-2-pattern.cljsdoc)
</pre>

