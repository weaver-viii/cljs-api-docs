## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/deregister-tag-parser!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__deregister-tag-parser!__ tag)<br>
</samp>

---





Source code:

```clj
(defn deregister-tag-parser!
  [tag]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* dissoc tag)
    old-parser))
```

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:552-557](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/reader.cljs#L552-L557)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/deregister-tag-parser!"]))
```

```clj
{:ns "cljs.reader",
 :name "deregister-tag-parser!",
 :type "function",
 :signature ["[tag]"],
 :source {:code "(defn deregister-tag-parser!\n  [tag]\n  (let [tag (str tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* dissoc tag)\n    old-parser))",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [552 557]},
 :full-name "cljs.reader/deregister-tag-parser!",
 :full-name-encode "cljs.reader_deregister-tag-parserBANG",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_deregister-tag-parserBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_deregister-tag-parserBANG.cljsdoc)
</pre>

