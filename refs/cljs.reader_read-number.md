## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-number

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-number__ reader initch)<br>
</samp>

---





Source code:

```clj
(defn read-number
  [reader initch]
  (loop [buffer (gstring/StringBuffer. initch)
         ch (read-char reader)]
    (if (or (nil? ch) (whitespace? ch) (macros ch))
      (do
        (unread reader ch)
        (let [s (. buffer (toString))]
          (or (match-number s)
              (reader-error reader "Invalid number format [" s "]"))))
      (recur (do (.append buffer ch) buffer) (read-char reader)))))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:289-299](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L289-L299)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-number"]))
```

```clj
{:ns "cljs.reader",
 :name "read-number",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-number\n  [reader initch]\n  (loop [buffer (gstring/StringBuffer. initch)\n         ch (read-char reader)]\n    (if (or (nil? ch) (whitespace? ch) (macros ch))\n      (do\n        (unread reader ch)\n        (let [s (. buffer (toString))]\n          (or (match-number s)\n              (reader-error reader \"Invalid number format [\" s \"]\"))))\n      (recur (do (.append buffer ch) buffer) (read-char reader)))))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [289 299]},
 :full-name "cljs.reader/read-number",
 :full-name-encode "cljs.reader_read-number",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-number.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-number.cljsdoc)
</pre>

