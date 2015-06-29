## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/escape-char-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__escape-char-map__ c)<br>
</samp>

---





Source code:

```clj
(defn escape-char-map [c]
  (case c
    \t "\t"
    \r "\r"
    \n "\n"
    \\ \\
    \" \"
    \b "\b"
    \f "\f"
    nil))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:160-169](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L160-L169)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/escape-char-map"]))
```

```clj
{:ns "cljs.reader",
 :name "escape-char-map",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn escape-char-map [c]\n  (case c\n    \\t \"\\t\"\n    \\r \"\\r\"\n    \\n \"\\n\"\n    \\\\ \\\\\n    \\\" \\\"\n    \\b \"\\b\"\n    \\f \"\\f\"\n    nil))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [160 169]},
 :full-name "cljs.reader/escape-char-map",
 :full-name-encode "cljs.reader_escape-char-map",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_escape-char-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_escape-char-map.cljsdoc)
</pre>
