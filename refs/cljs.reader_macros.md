## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macros

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def macros
     { \" read-string
       \: read-keyword
       \; not-implemented ;; never hit this
       \' (wrapping-reader 'quote)
       \@ (wrapping-reader 'deref)
       \^ read-meta
       \` not-implemented
       \~ not-implemented
       \( read-list
       \) read-unmatched-delimiter
       \[ read-vector
       \] read-unmatched-delimiter
       \{ read-map
       \} read-unmatched-delimiter
       \\ read-char
       \% not-implemented
       \# read-dispatch
       })
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:310-328](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/reader.cljs#L310-L328)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macros"]))
```

```clj
{:ns "cljs.reader",
 :name "macros",
 :type "var",
 :source {:code "(def macros\n     { \\\" read-string\n       \\: read-keyword\n       \\; not-implemented ;; never hit this\n       \\' (wrapping-reader 'quote)\n       \\@ (wrapping-reader 'deref)\n       \\^ read-meta\n       \\` not-implemented\n       \\~ not-implemented\n       \\( read-list\n       \\) read-unmatched-delimiter\n       \\[ read-vector\n       \\] read-unmatched-delimiter\n       \\{ read-map\n       \\} read-unmatched-delimiter\n       \\\\ read-char\n       \\% not-implemented\n       \\# read-dispatch\n       })",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [310 328]},
 :full-name "cljs.reader/macros",
 :full-name-encode "cljs.reader_macros",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_macros.cljsdoc)
</pre>

