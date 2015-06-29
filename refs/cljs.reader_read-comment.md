## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-comment

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def read-comment skip-line)
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:268](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/reader.cljs#L268)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-comment"]))
```

```clj
{:ns "cljs.reader",
 :name "read-comment",
 :type "var",
 :source {:code "(def read-comment skip-line)",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [268]},
 :full-name "cljs.reader/read-comment",
 :full-name-encode "cljs.reader_read-comment",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-comment.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-comment.cljsdoc)
</pre>

