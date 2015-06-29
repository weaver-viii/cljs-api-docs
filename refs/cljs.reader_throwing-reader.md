## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/throwing-reader

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__throwing-reader__ msg)<br>
</samp>

---





Source code:

```clj
(defn throwing-reader
  [msg]
  (fn [rdr _]
    (reader-error rdr msg)))
```

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:356-359](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/reader.cljs#L356-L359)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/throwing-reader"]))
```

```clj
{:ns "cljs.reader",
 :name "throwing-reader",
 :type "function",
 :signature ["[msg]"],
 :source {:code "(defn throwing-reader\n  [msg]\n  (fn [rdr _]\n    (reader-error rdr msg)))",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [356 359]},
 :full-name "cljs.reader/throwing-reader",
 :full-name-encode "cljs.reader_throwing-reader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_throwing-reader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_throwing-reader.cljsdoc)
</pre>

