## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/reader-error

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reader-error__ rdr & msg)<br>
</samp>

---





Source code:

```clj
(defn reader-error
  [rdr & msg]
  (throw (js/Error. (apply str msg))))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:68-70](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/reader.cljs#L68-L70)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/reader-error"]))
```

```clj
{:ns "cljs.reader",
 :name "reader-error",
 :type "function",
 :signature ["[rdr & msg]"],
 :source {:code "(defn reader-error\n  [rdr & msg]\n  (throw (js/Error. (apply str msg))))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [68 70]},
 :full-name "cljs.reader/reader-error",
 :full-name-encode "cljs.reader_reader-error",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_reader-error.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_reader-error.cljsdoc)
</pre>

