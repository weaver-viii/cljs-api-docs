## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-regex

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-regex__ rdr ch)<br>
</samp>

---





Source code:

```clj
(defn read-regex
  [rdr ch]
  (-> (read-raw-string* rdr ch) re-pattern))
```

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:382-384](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/reader.cljs#L382-L384)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-regex"]))
```

```clj
{:ns "cljs.reader",
 :name "read-regex",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-regex\n  [rdr ch]\n  (-> (read-raw-string* rdr ch) re-pattern))",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [382 384]},
 :full-name "cljs.reader/read-regex",
 :full-name-encode "cljs.reader_read-regex",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-regex.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-regex.cljsdoc)
</pre>

