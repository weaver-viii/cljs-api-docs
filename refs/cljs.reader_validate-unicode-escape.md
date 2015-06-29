## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/validate-unicode-escape

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__validate-unicode-escape__ unicode-pattern reader escape-char unicode-str)<br>
</samp>

---





Source code:

```clj
(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]
  (if (re-matches unicode-pattern unicode-str)
    unicode-str
    (reader-error reader "Unexpected unicode escape \\" escape-char unicode-str)))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:190-193](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/reader.cljs#L190-L193)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/validate-unicode-escape"]))
```

```clj
{:ns "cljs.reader",
 :name "validate-unicode-escape",
 :type "function",
 :signature ["[unicode-pattern reader escape-char unicode-str]"],
 :source {:code "(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]\n  (if (re-matches unicode-pattern unicode-str)\n    unicode-str\n    (reader-error reader \"Unexpected unicode escape \\\\\" escape-char unicode-str)))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [190 193]},
 :full-name "cljs.reader/validate-unicode-escape",
 :full-name-encode "cljs.reader_validate-unicode-escape",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_validate-unicode-escape.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_validate-unicode-escape.cljsdoc)
</pre>

