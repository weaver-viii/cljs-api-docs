## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-token

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-token__ rdr initch)<br>
</samp>

---





Source code:

```clj
(defn read-token
  [rdr initch]
  (loop [sb (StringBuffer. initch)
         ch (read-char rdr)]
    (if (or (nil? ch)
            (whitespace? ch)
            (macro-terminating? ch))
      (do (unread rdr ch) (.toString sb))
      (recur (do (.append sb ch) sb) (read-char rdr)))))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:79-87](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/reader.cljs#L79-L87)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-token"]))
```

```clj
{:ns "cljs.reader",
 :name "read-token",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn read-token\n  [rdr initch]\n  (loop [sb (StringBuffer. initch)\n         ch (read-char rdr)]\n    (if (or (nil? ch)\n            (whitespace? ch)\n            (macro-terminating? ch))\n      (do (unread rdr ch) (.toString sb))\n      (recur (do (.append sb ch) sb) (read-char rdr)))))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [79 87]},
 :full-name "cljs.reader/read-token",
 :full-name-encode "cljs.reader_read-token",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-token.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-token.cljsdoc)
</pre>

