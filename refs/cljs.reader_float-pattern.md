## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/float-pattern

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def float-pattern (re-pattern "^([-+]?[0-9]+(\\.[0-9]*)?([eE][-+]?[0-9]+)?)(M)?$"))
```

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:100](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/reader.cljs#L100)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/float-pattern"]))
```

```clj
{:ns "cljs.reader",
 :name "float-pattern",
 :type "var",
 :source {:code "(def float-pattern (re-pattern \"^([-+]?[0-9]+(\\\\.[0-9]*)?([eE][-+]?[0-9]+)?)(M)?$\"))",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [100]},
 :full-name "cljs.reader/float-pattern",
 :full-name-encode "cljs.reader_float-pattern",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_float-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_float-pattern.cljsdoc)
</pre>

