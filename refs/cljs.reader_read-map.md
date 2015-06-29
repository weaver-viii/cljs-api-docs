## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-map__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-map
  [rdr _]
  (let [l (read-delimited-list "}" rdr true)]
    (when (odd? (count l))
      (reader-error rdr "Map literal must contain an even number of forms"))
    (apply hash-map l)))
```

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:282-287](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L282-L287)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-map"]))
```

```clj
{:ns "cljs.reader",
 :name "read-map",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-map\n  [rdr _]\n  (let [l (read-delimited-list \"}\" rdr true)]\n    (when (odd? (count l))\n      (reader-error rdr \"Map literal must contain an even number of forms\"))\n    (apply hash-map l)))",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [282 287]},
 :full-name "cljs.reader/read-map",
 :full-name-encode "cljs.reader_read-map",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-map.cljsdoc)
</pre>

