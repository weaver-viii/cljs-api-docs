## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-unmatched-delimiter

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-unmatched-delimiter__ rdr ch)<br>
</samp>

---





Source code:

```clj
(defn read-unmatched-delimiter
  [rdr ch]
  (reader-error rdr "Unmached delimiter " ch))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:258-260](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/reader.cljs#L258-L260)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-unmatched-delimiter"]))
```

```clj
{:ns "cljs.reader",
 :name "read-unmatched-delimiter",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-unmatched-delimiter\n  [rdr ch]\n  (reader-error rdr \"Unmached delimiter \" ch))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [258 260]},
 :full-name "cljs.reader/read-unmatched-delimiter",
 :full-name-encode "cljs.reader_read-unmatched-delimiter",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-unmatched-delimiter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-unmatched-delimiter.cljsdoc)
</pre>

