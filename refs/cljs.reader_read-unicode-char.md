## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-unicode-char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-unicode-char__ reader initch)<br>
</samp>

---





Source code:

```clj
(defn read-unicode-char
  [reader initch]
  (reader-error reader "Unicode characters not supported by reader (yet)"))
```

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:145-147](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L145-L147)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-unicode-char"]))
```

```clj
{:ns "cljs.reader",
 :name "read-unicode-char",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-unicode-char\n  [reader initch]\n  (reader-error reader \"Unicode characters not supported by reader (yet)\"))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [145 147]},
 :full-name "cljs.reader/read-unicode-char",
 :full-name-encode "cljs.reader_read-unicode-char",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-unicode-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-unicode-char.cljsdoc)
</pre>

