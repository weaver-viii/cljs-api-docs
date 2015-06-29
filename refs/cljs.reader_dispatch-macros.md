## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/dispatch-macros

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def dispatch-macros
  {"{" read-set
   "<" (throwing-reader "Unreadable form")
   "\"" read-regex
   "!" read-comment
   "_" read-discard})
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:331-336](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/reader.cljs#L331-L336)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/dispatch-macros"]))
```

```clj
{:ns "cljs.reader",
 :name "dispatch-macros",
 :type "var",
 :source {:code "(def dispatch-macros\n  {\"{\" read-set\n   \"<\" (throwing-reader \"Unreadable form\")\n   \"\\\"\" read-regex\n   \"!\" read-comment\n   \"_\" read-discard})",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [331 336]},
 :full-name "cljs.reader/dispatch-macros",
 :full-name-encode "cljs.reader_dispatch-macros",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_dispatch-macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_dispatch-macros.cljsdoc)
</pre>

