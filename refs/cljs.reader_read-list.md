## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-list

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-list__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-list
  [rdr _]
  (apply list (read-delimited-list ")" rdr true)))
```

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:263-265](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/reader.cljs#L263-L265)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-list"]))
```

```clj
{:ns "cljs.reader",
 :name "read-list",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-list\n  [rdr _]\n  (apply list (read-delimited-list \")\" rdr true)))",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [263 265]},
 :full-name "cljs.reader/read-list",
 :full-name-encode "cljs.reader_read-list",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-list.cljsdoc)
</pre>

