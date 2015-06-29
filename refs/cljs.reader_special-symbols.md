## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/special-symbols

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def special-symbols
  {"nil" nil
   "true" true
   "false" false})
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:273-276](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L273-L276)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/special-symbols"]))
```

```clj
{:ns "cljs.reader",
 :name "special-symbols",
 :type "var",
 :source {:code "(def special-symbols\n  {\"nil\" nil\n   \"true\" true\n   \"false\" false})",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [273 276]},
 :full-name "cljs.reader/special-symbols",
 :full-name-encode "cljs.reader_special-symbols",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_special-symbols.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_special-symbols.cljsdoc)
</pre>

