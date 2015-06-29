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
  (let [tag  (read-symbol rdr initch)
        form (read rdr true nil false)
        pfn  (get @*tag-table* (name tag))]
    (if pfn
      (pfn form)
      (reader-error rdr "Could not find tag parser for " (name tag) (pr-str @*tag-table*)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:417-424](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L417-L424)</ins>
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
 :source {:code "(defn maybe-read-tagged-type\n  [rdr initch]\n  (let [tag  (read-symbol rdr initch)\n        form (read rdr true nil false)\n        pfn  (get @*tag-table* (name tag))]\n    (if pfn\n      (pfn form)\n      (reader-error rdr \"Could not find tag parser for \" (name tag) (pr-str @*tag-table*)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [417 424]},
 :full-name "cljs.reader/maybe-read-tagged-type",
 :full-name-encode "cljs.reader_maybe-read-tagged-type",
 :history [["+" "0.0-1236"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_maybe-read-tagged-type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_maybe-read-tagged-type.cljsdoc)
</pre>
