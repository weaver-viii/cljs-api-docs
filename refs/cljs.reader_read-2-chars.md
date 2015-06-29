## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-2-chars

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-2-chars__ reader)<br>
</samp>

---





Source code:

```clj
(defn read-2-chars [reader]
  (.toString
    (gstring/StringBuffer.
      (read-char reader)
      (read-char reader))))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:173-177](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/reader.cljs#L173-L177)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-2-chars"]))
```

```clj
{:ns "cljs.reader",
 :name "read-2-chars",
 :type "function",
 :signature ["[reader]"],
 :source {:code "(defn read-2-chars [reader]\n  (.toString\n    (gstring/StringBuffer.\n      (read-char reader)\n      (read-char reader))))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [173 177]},
 :full-name "cljs.reader/read-2-chars",
 :full-name-encode "cljs.reader_read-2-chars",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-2-chars.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-2-chars.cljsdoc)
</pre>

