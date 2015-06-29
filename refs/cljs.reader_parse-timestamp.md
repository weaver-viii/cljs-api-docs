## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/parse-timestamp

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-timestamp__ ts)<br>
</samp>

---





Source code:

```clj
(defn parse-timestamp
  [ts]
  (if-let [[years months days hours minutes seconds ms offset]
           (parse-and-validate-timestamp ts)]
    (js/Date.
     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)
        (* offset 60 1000)))
    (reader-error nil (str "Unrecognized date/time syntax: " ts))))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:517-524](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/reader.cljs#L517-L524)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/parse-timestamp"]))
```

```clj
{:ns "cljs.reader",
 :name "parse-timestamp",
 :type "function",
 :signature ["[ts]"],
 :source {:code "(defn parse-timestamp\n  [ts]\n  (if-let [[years months days hours minutes seconds ms offset]\n           (parse-and-validate-timestamp ts)]\n    (js/Date.\n     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)\n        (* offset 60 1000)))\n    (reader-error nil (str \"Unrecognized date/time syntax: \" ts))))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [517 524]},
 :full-name "cljs.reader/parse-timestamp",
 :full-name-encode "cljs.reader_parse-timestamp",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_parse-timestamp.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_parse-timestamp.cljsdoc)
</pre>

