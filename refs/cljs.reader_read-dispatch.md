## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-dispatch

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-dispatch__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-dispatch
  [rdr _]
  (let [ch (read-char rdr)
        dm (dispatch-macros ch)]
    (if dm
      (dm rdr _)
      (if-let [obj (maybe-read-tagged-type rdr ch)]
        obj
        (reader-error rdr "No dispatch macro for " ch)))))
```

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:256-264](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/reader.cljs#L256-L264)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-dispatch"]))
```

```clj
{:ns "cljs.reader",
 :name "read-dispatch",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-dispatch\n  [rdr _]\n  (let [ch (read-char rdr)\n        dm (dispatch-macros ch)]\n    (if dm\n      (dm rdr _)\n      (if-let [obj (maybe-read-tagged-type rdr ch)]\n        obj\n        (reader-error rdr \"No dispatch macro for \" ch)))))",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [256 264]},
 :full-name "cljs.reader/read-dispatch",
 :full-name-encode "cljs.reader_read-dispatch",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-dispatch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-dispatch.cljsdoc)
</pre>

