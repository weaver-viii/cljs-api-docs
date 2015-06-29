## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/\*tag-table\*

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def *tag-table* (atom {"inst"  identity
                        "uuid"  identity
                        "queue" read-queue}))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:413-415](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L413-L415)</ins>
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
 :source {:code "(def *tag-table* (atom {\"inst\"  identity\n                        \"uuid\"  identity\n                        \"queue\" read-queue}))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [413 415]},
 :full-name "cljs.reader/*tag-table*",
 :full-name-encode "cljs.reader_STARtag-tableSTAR",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc)
</pre>
