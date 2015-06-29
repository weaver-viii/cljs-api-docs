## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/escape-char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__escape-char__ buffer reader)<br>
</samp>

---





Source code:

```clj
(defn escape-char
  [buffer reader]
  (let [ch (read-char reader)
        mapresult (escape-char-map ch)]
    (if mapresult
      mapresult
      (if (or (identical? \u ch) (numeric? ch))
        (read-unicode-char reader ch)
        (reader-error reader "Unsupported escape character: \\" ch)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:175-183](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L175-L183)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/escape-char"]))
```

```clj
{:ns "cljs.reader",
 :name "escape-char",
 :type "function",
 :signature ["[buffer reader]"],
 :source {:code "(defn escape-char\n  [buffer reader]\n  (let [ch (read-char reader)\n        mapresult (escape-char-map ch)]\n    (if mapresult\n      mapresult\n      (if (or (identical? \\u ch) (numeric? ch))\n        (read-unicode-char reader ch)\n        (reader-error reader \"Unsupported escape character: \\\\\" ch)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [175 183]},
 :full-name "cljs.reader/escape-char",
 :full-name-encode "cljs.reader_escape-char",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_escape-char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_escape-char.cljsdoc)
</pre>

