## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/unicode-4-pattern

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def unicode-4-pattern (re-pattern "^[0-9A-Fa-f]{4}$"))
```

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:182](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/reader.cljs#L182)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/unicode-4-pattern"]))
```

```clj
{:ns "cljs.reader",
 :name "unicode-4-pattern",
 :type "var",
 :source {:code "(def unicode-4-pattern (re-pattern \"^[0-9A-Fa-f]{4}$\"))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [182]},
 :full-name "cljs.reader/unicode-4-pattern",
 :full-name-encode "cljs.reader_unicode-4-pattern",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_unicode-4-pattern.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_unicode-4-pattern.cljsdoc)
</pre>

