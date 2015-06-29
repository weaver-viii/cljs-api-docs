## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-delimited-list

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-delimited-list__ delim rdr recursive?)<br>
</samp>

---





Source code:

```clj
(defn read-delimited-list
  [delim rdr recursive?]
  (loop [a []]
    (let [ch (read-past whitespace? rdr)]
      (when-not ch (reader-error rdr "EOF"))
      (if (= delim ch)
        a
        (if-let [macrofn (get macros ch)]
          (let [mret (macrofn rdr ch)]
            (recur (if (= mret rdr) a (conj a mret))))
          (do
            (unread rdr ch)
            (let [o (read rdr true nil recursive?)]
              (recur (if (= o rdr) a (conj a o))))))))))
```

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:168-181](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/reader.cljs#L168-L181)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-delimited-list"]))
```

```clj
{:ns "cljs.reader",
 :name "read-delimited-list",
 :type "function",
 :signature ["[delim rdr recursive?]"],
 :source {:code "(defn read-delimited-list\n  [delim rdr recursive?]\n  (loop [a []]\n    (let [ch (read-past whitespace? rdr)]\n      (when-not ch (reader-error rdr \"EOF\"))\n      (if (= delim ch)\n        a\n        (if-let [macrofn (get macros ch)]\n          (let [mret (macrofn rdr ch)]\n            (recur (if (= mret rdr) a (conj a mret))))\n          (do\n            (unread rdr ch)\n            (let [o (read rdr true nil recursive?)]\n              (recur (if (= o rdr) a (conj a o))))))))))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [168 181]},
 :full-name "cljs.reader/read-delimited-list",
 :full-name-encode "cljs.reader_read-delimited-list",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-delimited-list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-delimited-list.cljsdoc)
</pre>

