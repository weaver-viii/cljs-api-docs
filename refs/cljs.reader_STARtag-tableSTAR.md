## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/\*tag-table\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def *tag-table* (atom {"inst"  read-date
                        "uuid"  read-uuid
                        "queue" read-queue}))
```

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:535-537](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/reader.cljs#L535-L537)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/*tag-table*"]))
```

```clj
{:ns "cljs.reader",
 :name "*tag-table*",
 :type "var",
 :source {:code "(def *tag-table* (atom {\"inst\"  read-date\n                        \"uuid\"  read-uuid\n                        \"queue\" read-queue}))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [535 537]},
 :full-name "cljs.reader/*tag-table*",
 :full-name-encode "cljs.reader_STARtag-tableSTAR",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc)
</pre>

