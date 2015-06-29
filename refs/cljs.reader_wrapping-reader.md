## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/wrapping-reader

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__wrapping-reader__ sym)<br>
</samp>

---





Source code:

```clj
(defn wrapping-reader
  [sym]
  (fn [rdr _]
    (list sym (read rdr true nil true))))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:361-364](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/reader.cljs#L361-L364)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/wrapping-reader"]))
```

```clj
{:ns "cljs.reader",
 :name "wrapping-reader",
 :type "function",
 :signature ["[sym]"],
 :source {:code "(defn wrapping-reader\n  [sym]\n  (fn [rdr _]\n    (list sym (read rdr true nil true))))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [361 364]},
 :full-name "cljs.reader/wrapping-reader",
 :full-name-encode "cljs.reader_wrapping-reader",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_wrapping-reader.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_wrapping-reader.cljsdoc)
</pre>

