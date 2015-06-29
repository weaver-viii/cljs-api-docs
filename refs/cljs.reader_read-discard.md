## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-discard

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-discard__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-discard
  [rdr _]
  (read rdr true nil true)
  rdr)
```

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:389-392](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/reader.cljs#L389-L392)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-discard"]))
```

```clj
{:ns "cljs.reader",
 :name "read-discard",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-discard\n  [rdr _]\n  (read rdr true nil true)\n  rdr)",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [389 392]},
 :full-name "cljs.reader/read-discard",
 :full-name-encode "cljs.reader_read-discard",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-discard.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-discard.cljsdoc)
</pre>

