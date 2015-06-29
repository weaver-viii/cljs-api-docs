## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/\*tag-table\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^:dynamic *tag-table*
  (atom {"inst"  read-date
         "uuid"  read-uuid
         "queue" read-queue
         "js"    read-js}))
```

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:567-571](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/reader.cljs#L567-L571)</ins>
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
 :type "dynamic var",
 :source {:code "(def ^:dynamic *tag-table*\n  (atom {\"inst\"  read-date\n         \"uuid\"  read-uuid\n         \"queue\" read-queue\n         \"js\"    read-js}))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [567 571]},
 :full-name "cljs.reader/*tag-table*",
 :full-name-encode "cljs.reader_STARtag-tableSTAR",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_STARtag-tableSTAR.cljsdoc)
</pre>

