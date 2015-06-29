## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-4-chars

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-4-chars__ reader)<br>
</samp>

---





Source code:

```clj
(defn read-4-chars [reader]
  (.toString
    (gstring/StringBuffer.
      (read-char reader)
      (read-char reader)
      (read-char reader)
      (read-char reader))))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:171-177](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/reader.cljs#L171-L177)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-4-chars"]))
```

```clj
{:ns "cljs.reader",
 :name "read-4-chars",
 :type "function",
 :signature ["[reader]"],
 :source {:code "(defn read-4-chars [reader]\n  (.toString\n    (gstring/StringBuffer.\n      (read-char reader)\n      (read-char reader)\n      (read-char reader)\n      (read-char reader))))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [171 177]},
 :full-name "cljs.reader/read-4-chars",
 :full-name-encode "cljs.reader_read-4-chars",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-4-chars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-4-chars.cljsdoc)
</pre>

