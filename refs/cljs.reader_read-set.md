## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-set

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-set__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-set
  [rdr _]
  (set (read-delimited-list "}" rdr true)))
```

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:297-299](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L297-L299)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-set"]))
```

```clj
{:ns "cljs.reader",
 :name "read-set",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-set\n  [rdr _]\n  (set (read-delimited-list \"}\" rdr true)))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [297 299]},
 :full-name "cljs.reader/read-set",
 :full-name-encode "cljs.reader_read-set",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-set.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-set.cljsdoc)
</pre>

