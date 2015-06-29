## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/\*default-data-reader-fn\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def *default-data-reader-fn*
  (atom nil))
```

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:530-531](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L530-L531)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/*default-data-reader-fn*"]))
```

```clj
{:ns "cljs.reader",
 :name "*default-data-reader-fn*",
 :type "var",
 :source {:code "(def *default-data-reader-fn*\n  (atom nil))",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [530 531]},
 :full-name "cljs.reader/*default-data-reader-fn*",
 :full-name-encode "cljs.reader_STARdefault-data-reader-fnSTAR",
 :history [["+" "0.0-1576"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_STARdefault-data-reader-fnSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_STARdefault-data-reader-fnSTAR.cljsdoc)
</pre>

