## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/maybe-read-tagged-type

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__maybe-read-tagged-type__ rdr initch)<br>
</samp>

---





Source code:

```clj
(defn maybe-read-tagged-type
  [rdr initch]
  (let [tag  (read-symbol rdr initch)]
    (if-let [pfn (get @*tag-table* (name tag))]
      (pfn (read rdr true nil false))
      (reader-error rdr
                    "Could not find tag parser for " (name tag)
                    " in " (pr-str (keys @*tag-table*))))))
```

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:530-537](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/reader.cljs#L530-L537)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/maybe-read-tagged-type"]))
```

```clj
{:ns "cljs.reader",
 :name "maybe-read-tagged-type",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn maybe-read-tagged-type\n  [rdr initch]\n  (let [tag  (read-symbol rdr initch)]\n    (if-let [pfn (get @*tag-table* (name tag))]\n      (pfn (read rdr true nil false))\n      (reader-error rdr\n                    \"Could not find tag parser for \" (name tag)\n                    \" in \" (pr-str (keys @*tag-table*))))))",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [530 537]},
 :full-name "cljs.reader/maybe-read-tagged-type",
 :full-name-encode "cljs.reader_maybe-read-tagged-type",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_maybe-read-tagged-type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_maybe-read-tagged-type.cljsdoc)
</pre>

