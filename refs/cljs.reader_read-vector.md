## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-vector

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-vector__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-vector
  [rdr _]
  (read-delimited-list "]" rdr true))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:270-272](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/reader.cljs#L270-L272)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-vector"]))
```

```clj
{:ns "cljs.reader",
 :name "read-vector",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-vector\n  [rdr _]\n  (read-delimited-list \"]\" rdr true))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [270 272]},
 :full-name "cljs.reader/read-vector",
 :full-name-encode "cljs.reader_read-vector",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-vector.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-vector.cljsdoc)
</pre>

